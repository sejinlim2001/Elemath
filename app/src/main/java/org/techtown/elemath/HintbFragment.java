package org.techtown.elemath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HintbFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_hintb, container, false);

        SoundSet.initSounds(getActivity());

        ProblembFragment problembFragment = new ProblembFragment();
        Button backButtonHintb = rootView.findViewById(R.id.backButtonHintb);
        backButtonHintb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, problembFragment).commit();
            }
        });

        return rootView;
    }
}