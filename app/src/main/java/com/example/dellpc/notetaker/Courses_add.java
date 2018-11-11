package com.example.dellpc.notetaker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Courses_add extends AppCompatActivity {


    String coursesname;
    EditText coursesInput;
    Button coursesButton;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre__dashboard);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        coursesInput = (EditText) findViewById(R.id.coursesInput);
        coursesButton = (Button) findViewById(R.id.coursesButton);
        addButton = (Button) findViewById(R.id.addButton);

        coursesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextact1 = new Intent(Courses_add.this, Dashboard.class);
                startActivity(nextact1);
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                coursesname = coursesInput.getText().toString();
                coursesInput.getText().clear();

        }});
}
}

