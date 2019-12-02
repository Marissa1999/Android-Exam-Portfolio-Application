package com.example.portfolioapplication;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;

public class CVActivity extends AppCompatActivity
{
    private final Fragment profileFragment = new ProfileFragment();
    private final Fragment educationFragment = new EducationFragment();
    private final Fragment experienceFragment = new ExperienceFragment();
    private final FragmentManager fragmentManager = getSupportFragmentManager();
    Fragment active = profileFragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_profile:
                    fragmentManager.beginTransaction().hide(active).show(profileFragment).commit();
                    active = profileFragment;
                    return true;
                case R.id.navigation_education:
                    fragmentManager.beginTransaction().hide(active).show(educationFragment).commit();
                    active = profileFragment;
                    return true;
                case R.id.navigation_experience:
                    fragmentManager.beginTransaction().hide(active).show(experienceFragment).commit();
                    active = profileFragment;
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cv);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        fragmentManager.beginTransaction().add(R.id.cv_container, profileFragment, "1").commit();
        fragmentManager.beginTransaction().add(R.id.cv_container, educationFragment, "2").hide(educationFragment).commit();
        fragmentManager.beginTransaction().add(R.id.cv_container, experienceFragment, "3").hide(experienceFragment).commit();


    }

}
