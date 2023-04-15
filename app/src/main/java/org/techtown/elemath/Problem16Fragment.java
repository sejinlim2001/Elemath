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

public class Problem16Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_problem16, container, false);

        SoundSet.initSounds(getActivity());

        SharedPreferences pref2 = getActivity().getSharedPreferences("pref2", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref2.edit();

        QuizProblemFragment quizProblemFragment = new QuizProblemFragment();
        ElementQuizFragment elementQuizFragment = new ElementQuizFragment();
        QuizSuccessFragment quizSuccessFragment = new QuizSuccessFragment();
        ElementGameFragment elementGameFragment = new ElementGameFragment();

        Button failureButtonAl = rootView.findViewById(R.id.problem16FailureButtonAl);
        failureButtonAl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(),R.anim.clickwronganswer);
                view.startAnimation(animation);
                Toast.makeText(getActivity(), "Try again!", Toast.LENGTH_SHORT).show();
                failureButtonAl.setVisibility(View.INVISIBLE);
                SoundSet.play(SoundSet.failSound);
            }
        });

        Button failureButtonK = rootView.findViewById(R.id.problem16FailureButtonK);
        failureButtonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(),R.anim.clickwronganswer);
                view.startAnimation(animation);
                Toast.makeText(getActivity(), "Try again!", Toast.LENGTH_SHORT).show();
                failureButtonK.setVisibility(View.INVISIBLE);
                SoundSet.play(SoundSet.failSound);
            }
        });

        Button failureButtonCl = rootView.findViewById(R.id.problem16FailureButtonCl);
        failureButtonCl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getActivity(),R.anim.clickwronganswer);
                view.startAnimation(animation);
                Toast.makeText(getActivity(), "Try again!", Toast.LENGTH_SHORT).show();
                failureButtonCl.setVisibility(View.INVISIBLE);
                SoundSet.play(SoundSet.failSound);
            }
        });

        Button successButtonS = rootView.findViewById(R.id.problem16SuccessButtonS);
        successButtonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParentFragmentManager().beginTransaction().replace(R.id.container, quizSuccessFragment).commit();
                SoundSet.play(SoundSet.successSound);
                if (quizProblemFragment.getSelectGame()) {
                    editor.putBoolean("Problem16", true);
                    editor.commit();
                }
            }
        });

        Button backButton16 = rootView.findViewById(R.id.backButton16);
        backButton16.setOnClickListener(new View.OnClickListener() {
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