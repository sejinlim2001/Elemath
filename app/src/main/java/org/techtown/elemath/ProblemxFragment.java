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

public class ProblemxFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_problemx, container, false);

        SoundSet.initSounds(getActivity());

        SharedPreferences pref1 = getActivity().getSharedPreferences("pref1", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref1.edit();

        MathProblemFragment mathProblemFragment = new MathProblemFragment();
        ElementMathFragment elementMathFragment = new ElementMathFragment();
        ElementGameFragment elementGameFragment = new ElementGameFragment();
        EditText answerEditTextx = rootView.findViewById(R.id.answerEditTextx);
        MathSuccessFragment successFragment = new MathSuccessFragment();

        Button confirmButtonx = rootView.findViewById(R.id.confirmButtonx);
        confirmButtonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!("".equals(answerEditTextx.getText().toString())) && Integer.parseInt(answerEditTextx.getText().toString()) == 6) {
                    getParentFragmentManager().beginTransaction().replace(R.id.container, successFragment).commit();
                    SoundSet.play(SoundSet.successSound);
                    if (mathProblemFragment.getSelectGame()) {
                        editor.putBoolean("ProblemX", true);
                        editor.commit();
                    }
                } else {
                    Toast.makeText(getActivity(), "Try again!", Toast.LENGTH_LONG).show();
                    SoundSet.play(SoundSet.failSound);
                }
            }
        });

        HintxFragment hintxFragment = new HintxFragment();
        Button hintButtonx = rootView.findViewById(R.id.hintButtonx);
        hintButtonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, hintxFragment).commit();
            }
        });

        Button backButtonx = rootView.findViewById(R.id.backButtonx);
        backButtonx.setOnClickListener(new View.OnClickListener() {
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