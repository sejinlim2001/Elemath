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

public class ProblemgFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_problemg, container, false);

        SoundSet.initSounds(getActivity());

        SharedPreferences pref1 = getActivity().getSharedPreferences("pref1", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref1.edit();

        MathProblemFragment mathProblemFragment = new MathProblemFragment();
        ElementMathFragment elementMathFragment = new ElementMathFragment();
        ElementGameFragment elementGameFragment = new ElementGameFragment();
        EditText answerEditTextg = rootView.findViewById(R.id.answerEditTextg);
        MathSuccessFragment successFragment = new MathSuccessFragment();

        Button confirmButtong = rootView.findViewById(R.id.confirmButtong);
        confirmButtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!("".equals(answerEditTextg.getText().toString())) && Integer.parseInt(answerEditTextg.getText().toString()) == 56) {
                    getParentFragmentManager().beginTransaction().replace(R.id.container, successFragment).commit();
                    SoundSet.play(SoundSet.successSound);
                    if (mathProblemFragment.getSelectGame()) {
                        editor.putBoolean("ProblemG", true);
                        editor.commit();
                    }
                } else {
                    Toast.makeText(getActivity(), "Wrong! Try again!", Toast.LENGTH_LONG).show();
                    SoundSet.play(SoundSet.failSound);
                }
            }
        });

        HintgFragment hintgFragment = new HintgFragment();
        Button hintButtong = rootView.findViewById(R.id.hintButtong);
        hintButtong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, hintgFragment).commit();
            }
        });

        Button backButtong = rootView.findViewById(R.id.backButtong);
        backButtong.setOnClickListener(new View.OnClickListener() {
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