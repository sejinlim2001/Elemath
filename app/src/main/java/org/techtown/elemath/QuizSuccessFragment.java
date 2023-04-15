package org.techtown.elemath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;

public class QuizSuccessFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_quiz_success, container, false);

        SoundSet.initSounds(getActivity());

        Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.clickanswer);
        rootView.startAnimation(animation);

        ElementQuizFragment elementQuizFragment = new ElementQuizFragment();
        ElementGameFragment elementGameFragment = new ElementGameFragment();
        QuizProblemFragment quizProblemFragment = new QuizProblemFragment();
        Random random = new Random();

        Button checkButton = rootView.findViewById(R.id.checkButton);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                if (!quizProblemFragment.getSelectGame()) {
                    if (quizProblemFragment.getCountQuizProblemNumber() >= 5) {
                        getParentFragmentManager().beginTransaction().replace(R.id.container, elementGameFragment).commit();
                    } else {
                        getParentFragmentManager().beginTransaction().replace(R.id.container, quizProblemFragment.selectQuizProblemFragment(random.nextInt(19))).commit();
                        quizProblemFragment.increaseCountQuizProblemNumber();
                    }
                } else {
                    getParentFragmentManager().beginTransaction().replace(R.id.container, elementQuizFragment).commit();
                }
            }
        });

        return rootView;
    }
}