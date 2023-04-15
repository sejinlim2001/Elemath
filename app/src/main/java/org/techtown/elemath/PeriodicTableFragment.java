package org.techtown.elemath;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class PeriodicTableFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_periodic_table, container, false);

        ViewPager2 pager = rootView.findViewById(R.id.pager);

        HydrogenFragment hydrogenFragment = new HydrogenFragment();
        HeliumFragment heliumFragment = new HeliumFragment();
        LithiumFragment lithiumFragment = new LithiumFragment();
        BerylliumFragment berylliumFragment = new BerylliumFragment();
        BoronFragment boronFragment = new BoronFragment();
        CarbonFragment carbonFragment = new CarbonFragment();
        NitrogenFragment nitrogenFragment = new NitrogenFragment();
        OxygenFragment oxygenFragment = new OxygenFragment();
        FluorineFragment fluorineFragment = new FluorineFragment();
        NeonFragment neonFragment = new NeonFragment();
        SodiumFragment sodiumFragment = new SodiumFragment();
        MagnesiumFragment magnesiumFragment = new MagnesiumFragment();
        AluminumFragment aluminumFragment = new AluminumFragment();
        SiliconFragment siliconFragment = new SiliconFragment();
        PhosphorusFragment phosphorusFragment = new PhosphorusFragment();
        SulfurFragment sulfurFragment = new SulfurFragment();
        ChlorineFragment chlorineFragment = new ChlorineFragment();
        ArgonFragment argonFragment = new ArgonFragment();
        PotassiumFragment potassiumFragment = new PotassiumFragment();
        CalciumFragment calciumFragment = new CalciumFragment();

        MyPagerAdapter adapter = new MyPagerAdapter(getActivity());

        adapter.addItems(hydrogenFragment);
        adapter.addItems(heliumFragment);
        adapter.addItems(lithiumFragment);
        adapter.addItems(berylliumFragment);
        adapter.addItems(boronFragment);
        adapter.addItems(carbonFragment);
        adapter.addItems(nitrogenFragment);
        adapter.addItems(oxygenFragment);
        adapter.addItems(fluorineFragment);
        adapter.addItems(neonFragment);
        adapter.addItems(sodiumFragment);
        adapter.addItems(magnesiumFragment);
        adapter.addItems(aluminumFragment);
        adapter.addItems(siliconFragment);
        adapter.addItems(phosphorusFragment);
        adapter.addItems(sulfurFragment);
        adapter.addItems(chlorineFragment);
        adapter.addItems(argonFragment);
        adapter.addItems(potassiumFragment);
        adapter.addItems(calciumFragment);

        pager.setAdapter(adapter);

        SoundSet.initSounds(getActivity());

        LinearLayout hydrogen = rootView.findViewById(R.id.hydrogen);
        hydrogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(0);
            }
        });

        LinearLayout helium = rootView.findViewById(R.id.helium);
        helium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(1);
            }
        });

        LinearLayout lithium = rootView.findViewById(R.id.lithium);
        lithium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(2);
            }
        });

        LinearLayout beryllium = rootView.findViewById(R.id.beryllium);
        beryllium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(3);
            }
        });

        LinearLayout boron = rootView.findViewById(R.id.boron);
        boron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(4);
            }
        });

        LinearLayout carbon = rootView.findViewById(R.id.carbon);
        carbon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(5);
            }
        });

        LinearLayout nitrogen = rootView.findViewById(R.id.nitrogen);
        nitrogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(6);
            }
        });

        LinearLayout oxygen = rootView.findViewById(R.id.oxygen);
        oxygen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(7);
            }
        });

        LinearLayout fluorine = rootView.findViewById(R.id.fluorine);
        fluorine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(8);
            }
        });

        LinearLayout neon = rootView.findViewById(R.id.neon);
        neon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(9);
            }
        });

        LinearLayout sodium = rootView.findViewById(R.id.sodium);
        sodium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(10);
            }
        });

        LinearLayout magnesium = rootView.findViewById(R.id.magnesium);
        magnesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(11);
            }
        });

        LinearLayout aluminum = rootView.findViewById(R.id.aluminum);
        aluminum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(12);
            }
        });

        LinearLayout silicon = rootView.findViewById(R.id.silicon);
        silicon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(13);
            }
        });

        LinearLayout phosphorus = rootView.findViewById(R.id.phosphorus);
        phosphorus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(14);
            }
        });

        LinearLayout sulfur = rootView.findViewById(R.id.sulfur);
        sulfur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(15);
            }
        });

        LinearLayout chlorine = rootView.findViewById(R.id.chlorine);
        chlorine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(16);
            }
        });

        LinearLayout argon = rootView.findViewById(R.id.argon);
        argon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(17);
            }
        });

        LinearLayout potassium = rootView.findViewById(R.id.potassium);
        potassium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(18);
            }
        });

        LinearLayout calcium = rootView.findViewById(R.id.calcium);
        calcium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundSet.play(SoundSet.buttonSound);
                pager.setCurrentItem(19);
            }
        });


        return rootView;
    }

    class MyPagerAdapter extends FragmentStateAdapter {
        ArrayList<Fragment> items = new ArrayList<Fragment>();
        public MyPagerAdapter(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        public void addItems(Fragment item) {
            items.add(item);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            return items.get(position);
        }

        @Override
        public int getItemCount() {
            return items.size();
        }
    }
}