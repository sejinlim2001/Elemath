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

public class ProblemdFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_problemd, container, false);

        SoundSet.initSounds(getActivity());

        SharedPreferences pref1 = getActivity().getSharedPreferences("pref1", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref1.edit();

        MathProblemFragment mathProblemFragment = new MathProblemFragment();
        ElementMathFragment elementMathFragment = new ElementMathFragment();
        ElementGameFragment elementGameFragment = new ElementGameFragment();
        EditText answerEditTextd = rootView.findViewById(R.id.answerEditTextd);
        MathSuccessFragment successFragment = new MathSuccessFragment();

        Button confirmButtond = rootView.findViewById(R.id.confirmButtond);
        confirmButtond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!("".equals(answerEditTextd.getText().toString())) && Integer.parseInt(answerEditTextd.getText().toString()) == 8) {
                    getParentFragmentManager().beginTransaction().replace(R.id.container, successFragment).commit();
                    SoundSet.play(SoundSet.successSound);
                    if (mathProblemFragment.getSelectGame()) {
                        editor.putBoolean("ProblemD", true);
                        editor.commit();
                    }
                } else {
                    Toast.makeText(getActivity(), "Try again!", Toast.LENGTH_LONG).show();
                    SoundSet.play(SoundSet.failSound);
                }
            }
        });

        HintdFragment hintdFragment = new HintdFragment();
        Button hintButtond = rootView.findViewById(R.id.hintButtond);
        hintButtond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, hintdFragment).commit();
            }
        });

        Button backButtond = rootView.findViewById(R.id.backButtond);
        backButtond.setOnClickListener(new View.OnClickListener() {
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