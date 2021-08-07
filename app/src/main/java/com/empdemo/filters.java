package com.empdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class filters extends AppCompatActivity {

    Button age,salary,exp,timing,work;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filters);

        age = findViewById(R.id.age);
        salary = findViewById(R.id.salary);
        exp = findViewById(R.id.experience);
        work = findViewById(R.id.work);
        timing = findViewById(R.id.timing);

        Fragment selectedFragment = null;
        selectedFragment = new exp();
        getSupportFragmentManager().beginTransaction().replace(R.id.framelaoutfilter,selectedFragment).commit();


        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment selectedFragment = null;
                selectedFragment = new age();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelaoutfilter,selectedFragment).commit();
            }
        });
        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment selectedFragment = null;
                selectedFragment = new work();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelaoutfilter,selectedFragment).commit();
            }
        });
        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment selectedFragment = null;
                selectedFragment = new exp();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelaoutfilter,selectedFragment).commit();
            }
        });
        timing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment selectedFragment = null;
                selectedFragment = new timing();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelaoutfilter,selectedFragment).commit();
            }
        });
        salary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment selectedFragment = null;
                selectedFragment = new salary();
                getSupportFragmentManager().beginTransaction().replace(R.id.framelaoutfilter,selectedFragment).commit();
            }
        });
    }
}