package com.udacity.jokesandroidlib;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container,new JokesActivityFragment()).commit();
        }
    }
}
