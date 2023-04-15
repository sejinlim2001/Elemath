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

public class ProblemkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_problemk, container, false);

        SoundSet.initSounds(getActivity());

        SharedPreferences pref1 = getActivity().getSharedPreferences("pref1", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref1.edit();

        MathProblemFragment mathProblemFragment = new MathProblemFragment();
        ElementMathFragment elementMathFragment = new ElementMathFragment();
        ElementGameFragment elementGameFragment = new ElementGameFragment();
        EditText answerEditTextk = rootView.findViewById(R.id.answerEditTextk);
        MathSuccessFragment successFragment = new MathSuccessFragment();

        Button confirmButtonk = rootView.findViewById(R.id.confirmButtonk);
        confirmButtonk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!("".equals(answerEditTextk.getText().toString())) && Integer.parseInt(answerEditTextk.getText().toString()) == 85) {
                    getParentFragmentManager().beginTransaction().replace(R.id.container, successFragment).commit();
                    SoundSet.play(SoundSet.successSound);
                    if (mathProblemFragment.getSelectGame()) {
                        editor.putBoolean("ProblemK", true);
                        editor.commit();
                    }
                } else {
                    Toast.makeText(getActivity(), "Try again!", Toast.LENGTH_LONG).show();
                    SoundSet.play(SoundSet.failSound);
                }
            }
        });

        HintkFragment hintkFragment = new HintkFragment();
        Button hintButtonk = rootView.findViewById(R.id.hintButtonk);
        hintButtonk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, hintkFragment).commit();
            }
        });

        Button backButtonk = rootView.findViewById(R.id.backButtonk);
        backButtonk.setOnClickListener(new View.OnClickListener() {
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