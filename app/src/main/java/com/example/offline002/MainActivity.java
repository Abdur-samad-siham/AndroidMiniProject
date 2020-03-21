package com.example.offline002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button ClassRoutine,Faculty,Links,CrNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"This is Linear LayOut",Toast.LENGTH_SHORT).show();

        ClassRoutine=findViewById(R.id.ClassRoutineID);
        Faculty=findViewById(R.id.FacultyDetailsID);
        Links=findViewById(R.id.CrSrContactNoID);
        CrNum=findViewById(R.id.GoogleClassroomID);

        ClassRoutine.setOnClickListener(this);
        Faculty.setOnClickListener(this);
        Links.setOnClickListener(this);
        CrNum.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.ClassRoutineID :
                Intent intent1=new Intent(getApplicationContext(),ClassRoutineTableLayout.class);
                startActivity(intent1);
                break;
            case R.id.FacultyDetailsID :
                Intent intent2=new Intent(getApplicationContext(),FacultyContactRelativeLayout.class);
                startActivity(intent2);
                break;
            case R.id.CrSrContactNoID :
                Intent intent3=new Intent(getApplicationContext(),CrSrContactNoFrameLayout.class);
                startActivity(intent3);
                break;
            case R.id.GoogleClassroomID:
                Intent intent4=new Intent(getApplicationContext(),ClassroomLinkAbsoluteLayout.class);
                startActivity(intent4);
                break;
        }

    }
}
