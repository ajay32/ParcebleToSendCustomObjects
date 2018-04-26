package com.example.macmine.openhabdemo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    //******************
    // Intent is a parchable object to send primitive kind of data ...strings, int etc
    //you can also implement parcable interface to send custom object data to different activites and classes

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void gonext(View view) {

        Intent i = new Intent(this, Main2Activity.class);
        i.putExtra("student", new Student(101,"Ajay The BodyBuilder",32));
        startActivity(i);
    }
}
