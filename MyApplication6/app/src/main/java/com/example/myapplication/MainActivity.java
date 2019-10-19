package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static String tag0 = " oncreate";
    private static String tag = " onstart";
    private static String tag2= "stop";
    private static String tag3= "resume";
    private static String tag4= "pause";
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(tag0,"oncreate");
    b1= findViewById(R.id.bt);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(i);
        }
    });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag,"onstart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag2,"stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag4,"pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag3, "resume");


    }
}
