package org.techtown.elemath;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.prefs.BackingStoreException;
import java.util.prefs.NodeChangeListener;
import java.util.prefs.PreferenceChangeListener;
import java.util.prefs.Preferences;

public class ElementQuizExplanationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_element_quiz_explanation, container, false);

        Random random = new Random();
        QuizProblemFragment quizProblemFragment = new QuizProblemFragment(0);

        Button problemStartButton = rootView.findViewById(R.id.problemStartButton);
        problemStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParentFragmentManager().beginTransaction().replace(R.id.container, quizProblemFragment.selectQuizProblemFragment(random.nextInt(19))).commit();
                quizProblemFragment.increaseCountQuizProblemNumber();
            }
        });

        return rootView;
    }


}