package org.techtown.elemath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HintaFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_hinta, container, false);

        SoundSet.initSounds(getActivity());

        ProblemaFragment problemaFragment = new ProblemaFragment();
        Button backButtonHinta = rootView.findViewById(R.id.backButtonHinta);
        backButtonHinta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, problemaFragment).commit();
            }
        });

        return rootView;
    }
}