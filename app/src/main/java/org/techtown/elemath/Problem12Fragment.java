package org.techtown.elemath;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

public class Problem12Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_problem12, container, false);

        SoundSet.initSounds(getActivity());

        SharedPreferences pref2 = getActivity().getSharedPreferences("pref2", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref2.edit();

        QuizProblemFragment quizProblemFragment = new QuizProblemFragment();
        ElementQuizFragment elementQuizFragment = new ElementQuizFragment();
        QuizSuccessFragment quizSuccessFragment = new QuizSuccessFragment();
        ElementGameFragment elementGameFragment = new ElementGameFragment();

        Button failureButtonN = rootView.findViewById(R.id.problem12FailureButtonN);
        failureButtonN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(),R.anim.clickwronganswer);
                view.startAnimation(animation);
                Toast.makeText(getActivity(), "Try again!", Toast.LENGTH_SHORT).show();
                failureButtonN.setVisibility(View.INVISIBLE);
                SoundSet.play(SoundSet.failSound);
            }
        });

        Button failureButtonSi = rootView.findViewById(R.id.problem12FailureButtonSi);
        failureButtonSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(),R.anim.clickwronganswer);
                view.startAnimation(animation);
                Toast.makeText(getActivity(), "Try again!", Toast.LENGTH_SHORT).show();
                failureButtonSi.setVisibility(View.INVISIBLE);
                SoundSet.play(SoundSet.failSound);
            }
        });

        Button failureButtonF = rootView.findViewById(R.id.problem12FailureButtonF);
        failureButtonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(),R.anim.clickwronganswer);
                view.startAnimation(animation);
                Toast.makeText(getActivity(), "Try again!", Toast.LENGTH_SHORT).show();
                failureButtonF.setVisibility(View.INVISIBLE);
                SoundSet.play(SoundSet.failSound);
            }
        });

        Button successButtonMg = rootView.findViewById(R.id.problem12SuccessButtonMg);
        successButtonMg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParentFragmentManager().beginTransaction().replace(R.id.container, quizSuccessFragment).commit();
                SoundSet.play(SoundSet.successSound);
                if (quizProblemFragment.getSelectGame()) {
                    editor.putBoolean("Problem12", true);
                    editor.commit();
                }
            }
        });

        Button backButton12 = rootView.findViewById(R.id.backButton12);
        backButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                if (quizProblemFragment.getSelectGame()) {
                    getParentFragmentManager().beginTransaction().replace(R.id.container, elementQuizFragment).commit();
                } else {
                    getParentFragmentManager().beginTransaction().replace(R.id.container, elementGameFragment).commit();
                }
            }
        });
        return rootView;
    }
}