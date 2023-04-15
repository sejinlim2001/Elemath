package org.techtown.elemath;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProblemmFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_problemm, container, false);

        SoundSet.initSounds(getActivity());

        SharedPreferences pref1 = getActivity().getSharedPreferences("pref1", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref1.edit();

        MathProblemFragment mathProblemFragment = new MathProblemFragment();
        ElementMathFragment elementMathFragment = new ElementMathFragment();
        ElementGameFragment elementGameFragment = new ElementGameFragment();
        EditText answerEditTextm = rootView.findViewById(R.id.answerEditTextm);
        MathSuccessFragment successFragment = new MathSuccessFragment();

        Button confirmButtonm = rootView.findViewById(R.id.confirmButtonm);
        confirmButtonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!("".equals(answerEditTextm.getText().toString())) && Integer.parseInt(answerEditTextm.getText().toString()) == 529) {
                    getParentFragmentManager().beginTransaction().replace(R.id.container, successFragment).commit();
                    SoundSet.play(SoundSet.successSound);
                    if (mathProblemFragment.getSelectGame()) {
                        editor.putBoolean("ProblemM", true);
                        editor.commit();
                    }
                } else {
                    Toast.makeText(getActivity(), "Try again!", Toast.LENGTH_LONG).show();
                    SoundSet.play(SoundSet.failSound);
                }
            }
        });

        HintmFragment hintmFragment = new HintmFragment();
        Button hintButtonm = rootView.findViewById(R.id.hintButtonm);
        hintButtonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, hintmFragment).commit();
            }
        });

        Button backButtonm = rootView.findViewById(R.id.backButtonm);
        backButtonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                if (mathProblemFragment.getSelectGame()) {
                    getParentFragmentManager().beginTransaction().replace(R.id.container, elementMathFragment).commit();
                } else {
                    getParentFragmentManager().beginTransaction().replace(R.id.container, elementGameFragment).commit();
                }
            }
        });

        return rootView;
    }
}