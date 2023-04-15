package org.techtown.elemath;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SoundSet.initSounds(this);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        PeriodicTableFragment periodicTableFragment = new PeriodicTableFragment();
        ElementGameFragment elementGameFragment = new ElementGameFragment();
        AppInformationFragment appInformationFragment = new AppInformationFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, periodicTableFragment).commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavigationView navigationView = findViewById(R.id.navigationView);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.tab1:
                        SoundSet.play(SoundSet.buttonSound);
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, periodicTableFragment).commit();
                        navigationView.setCheckedItem(R.id.table);
                        return true;
                    case R.id.tab2:
                        SoundSet.play(SoundSet.buttonSound);
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, elementGameFragment).commit();
                        navigationView.setCheckedItem(R.id.game);
                        return true;
                    case R.id.tab3:
                        SoundSet.play(SoundSet.buttonSound);
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, appInformationFragment).commit();
                        navigationView.setCheckedItem(R.id.information);
                        return true;
                }
                return false;
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.table:
                        SoundSet.play(SoundSet.buttonSound);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        bottomNavigationView.setSelectedItemId(R.id.tab1);
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, periodicTableFragment).commit();
                        return true;
                    case R.id.game:
                        SoundSet.play(SoundSet.buttonSound);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        bottomNavigationView.setSelectedItemId(R.id.tab2);
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, elementGameFragment).commit();
                        return true;
                    case R.id.information:
                        SoundSet.play(SoundSet.buttonSound);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        bottomNavigationView.setSelectedItemId(R.id.tab3);
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, appInformationFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }

}