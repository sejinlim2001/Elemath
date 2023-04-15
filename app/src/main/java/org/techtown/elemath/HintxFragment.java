package org.techtown.elemath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HintxFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_hintx, container, false);

        SoundSet.initSounds(getActivity());

        ProblemxFragment problemxFragment = new ProblemxFragment();
        Button backButtonHintx = rootView.findViewById(R.id.backButtonHintx);
        backButtonHintx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, problemxFragment).commit();
            }
        });

        return rootView;
    }
}