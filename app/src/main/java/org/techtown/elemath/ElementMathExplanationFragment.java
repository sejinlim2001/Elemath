package org.techtown.elemath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.techtown.elemath.R;

import java.util.Random;

public class ElementMathExplanationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_element_math_explanation, container, false);

        Random mathRandom = new Random();
        MathProblemFragment mathProblemFragment = new MathProblemFragment(0);

        Button problemStartButton = rootView.findViewById(R.id.problemStartButton);
        problemStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParentFragmentManager().beginTransaction().replace(R.id.container, mathProblemFragment.selectMathProblemFragment(mathRandom.nextInt(25))).commit();
                mathProblemFragment.increaseCountMathProblemNumber();
                mathProblemFragment.RandomGame();
            }
        });

        return rootView;
    }
}