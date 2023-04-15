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

public class Problem6Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_problem6, container, false);

        SoundSet.initSounds(getActivity());

        SharedPreferences pref2 = getActivity().getSharedPreferences("pref2", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref2.edit();

        QuizProblemFragment quizProblemFragment = new QuizProblemFragment();
        ElementQuizFragment elementQuizFragment = new ElementQuizFragment();
        QuizSuccessFragment quizSuccessFragment = new QuizSuccessFragment();
        ElementGameFragment elementGameFragment = new ElementGameFragment();

        Button failureButtonH = rootView.findViewById(R.id.problem6FailureButtonH);
        failureButtonH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(),R.anim.clickwronganswer);
                view.startAnimation(animation);
                Toast.makeText(getActivity(), "Try again!", Toast.LENGTH_SHORT).show();
                failureButtonH.setVisibility(View.INVISIBLE);
                SoundSet.play(SoundSet.failSound);
            }
        });

        Button failureButtonO = rootView.findViewById(R.id.problem6FailureButtonO);
        failureButtonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(),R.anim.clickwronganswer);
                view.startAnimation(animation);
                Toast.makeText(getActivity(), "Try again!", Toast.LENGTH_SHORT).show();
                failureButtonO.setVisibility(View.INVISIBLE);
                SoundSet.play(SoundSet.failSound);
            }
        });

        Button failureButtonN = rootView.findViewById(R.id.problem6FailureButtonN);
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

        Button successButtonC = rootView.findViewById(R.id.problem6SuccessButtonC);
        successButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParentFragmentManager().beginTransaction().replace(R.id.container, quizSuccessFragment).commit();
                SoundSet.play(SoundSet.successSound);
                if (quizProblemFragment.getSelectGame()) {
                    editor.putBoolean("Problem6", true);
                    editor.commit();
                }
            }
        });

        Button backButton6 = rootView.findViewById(R.id.backButton6);
        backButton6.setOnClickListener(new View.OnClickListener() {
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