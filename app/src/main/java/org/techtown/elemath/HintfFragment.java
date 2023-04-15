package org.techtown.elemath;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HintfFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_hintb, container, false);

        SoundSet.initSounds(getActivity());

        ProblemfFragment problemfFragment = new ProblemfFragment();
        Button backButtonHintf = rootView.findViewById(R.id.backButtonHintf);
        backButtonHintf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                getParentFragmentManager().beginTransaction().replace(R.id.container, problemfFragment).commit();
            }
        });

        return rootView;
    }
}