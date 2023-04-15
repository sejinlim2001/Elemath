package org.techtown.elemath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.Random;

public class MathSuccessFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_math_success, container, false);

        SoundSet.initSounds(getActivity());

        Animation animation = AnimationUtils.loadAnimation(getActivity(), R.anim.clickanswer);
        rootView.startAnimation(animation);

        ElementGameFragment elementGameFragment = new ElementGameFragment();
        ElementMathFragment elementMathFragment = new ElementMathFragment();
        MathProblemFragment mathProblemFragment = new MathProblemFragment();
        Random random = new Random();

        Button checkButton = rootView.findViewById(R.id.checkButton);
        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                if (!mathProblemFragment.getSelectGame()) {
                    if (mathProblemFragment.getCountMathProblemNumber() >= 3) {
                        getParentFragmentManager().beginTransaction().replace(R.id.container, elementGameFragment).commit();
                    } else {
                        getParentFragmentManager().beginTransaction().replace(R.id.container, mathProblemFragment.selectMathProblemFragment(random.nextInt(25))).commit();
                        mathProblemFragment.increaseCountMathProblemNumber();
                    }
                } else {
                    getParentFragmentManager().beginTransaction().replace(R.id.container, elementMathFragment).commit();
                }
            }
        });

        return rootView;
    }
}