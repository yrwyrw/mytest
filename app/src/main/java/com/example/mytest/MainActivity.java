package com.example.mytest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //4
        //3
        //2
        //1
        //Hello
        //Toast
        Toast.makeText(this, "Hello", Toast.LENGTH_LONG).show();
    }
}
