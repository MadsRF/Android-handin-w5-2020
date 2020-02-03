package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
    }

    //create handler for the page 2 button
    public void goToPage1(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
