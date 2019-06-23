package com.androidsingh.notesyanimaal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
    }
    public void androidQuestions(View view){
            startActivity(new Intent(Options.this, AndroidQuestions.class));

    }public void javaQuestions(View view){
            startActivity(new Intent(Options.this, JavaQuestions.class));

    }public void cQuestions(View view){
            startActivity(new Intent(Options.this, CQuestions.class));

    }
}
