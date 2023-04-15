package org.techtown.elemath;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class ElementGameFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_element_game, container, false);

        SoundSet.initSounds(getActivity());

        ElementMathFragment elementMathFragment = new ElementMathFragment();
        ElementQuizFragment elementQuizFragment = new ElementQuizFragment();

        Random random = new Random();
        MathProblemFragment mathProblemFragment = new MathProblemFragment(0);
        QuizProblemFragment quizProblemFragment = new QuizProblemFragment(0);


        Button randomElementQuizButton = rootView.findViewById(R.id.randomElementQuizButton);
        randomElementQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, quizProblemFragment.selectQuizProblemFragment(random.nextInt(19))).commit();
                quizProblemFragment.increaseCountQuizProblemNumber();
                quizProblemFragment.RandomGame();
            }
        });

        Button randomElementMathButton = rootView.findViewById(R.id.randomElementMathButton);
        randomElementMathButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, mathProblemFragment.selectMathProblemFragment(random.nextInt(25))).commit();
                mathProblemFragment.increaseCountMathProblemNumber();
                mathProblemFragment.RandomGame();
            }
        });

        Button selectElementMathButton = rootView.findViewById(R.id.selectElementMathButton);
        selectElementMathButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, elementMathFragment).commit();
                mathProblemFragment.SelectGame();
            }
        });

        Button selectElementQuizButton = rootView.findViewById(R.id.selectElementQuizButton);
        selectElementQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, elementQuizFragment).commit();
                quizProblemFragment.SelectGame();
            }
        });

        Button resetButton1 = rootView.findViewById(R.id.resetButton1);
        resetButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundSet.play(SoundSet.alertSound);
                SharedPreferences pref1 = getActivity().getSharedPreferences("pref1", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref1.edit();
                editor.clear();
                editor.commit();
                Toast.makeText(getActivity(), "규칙 유추하기 진행 단계가 리셋되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        Button resetButton2 = rootView.findViewById(R.id.resetButton2);
        resetButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SoundSet.play(SoundSet.alertSound);
                SharedPreferences pref2 = getActivity().getSharedPreferences("pref2", Activity.MODE_PRIVATE);
                SharedPreferences.Editor editor = pref2.edit();
                editor.clear();
                editor.commit();
                Toast.makeText(getActivity(), "원소 맞추기 진행 단계가 리셋되었습니다.", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}