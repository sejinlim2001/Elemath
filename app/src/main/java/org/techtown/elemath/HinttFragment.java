package org.techtown.elemath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.techtown.elemath.R;

import java.lang.reflect.GenericArrayType;

public class HinttFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_hintt, container, false);

        SoundSet.initSounds(getActivity());

        ProblemtFragment problemtFragment = new ProblemtFragment();
        Button backButtonHintt = rootView.findViewById(R.id.backButtonHintt);
        backButtonHintt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, problemtFragment).commit();
            }
        });

        return rootView;
    }
}