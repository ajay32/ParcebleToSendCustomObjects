package com.example.macmine.openhabdemo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle data = getIntent().getExtras();
        Student student = (Student) data.getParcelable("student");

        Toast.makeText(this, ""+ student.getName()+" --"+student.getRollno(),Toast.LENGTH_SHORT).show();

        Toast.makeText(this, ""+ student.toString(),Toast.LENGTH_SHORT).show();
    }
}
