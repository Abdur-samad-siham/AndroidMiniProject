package com.example.offline002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FacultyContactRelativeLayout extends AppCompatActivity implements View.OnClickListener {
Button NClass,PRoutine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_contact_relative_layout);
        this.setTitle("Faculty");
        Toast.makeText(FacultyContactRelativeLayout.this,"This is Relative Layout",Toast.LENGTH_SHORT).show();

        NClass=findViewById(R.id.ButID2);
        PRoutine=findViewById(R.id.ButID);
        NClass.setOnClickListener(this);
        PRoutine.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() ==R.id.ButID)
        {
            Intent intent=new Intent(getApplicationContext(),ClassRoutineTableLayout.class);
            startActivity(intent);

        }
        else if(v.getId() ==R.id.ButID2)
        {
            Intent intent=new Intent(getApplicationContext(),ClassroomLinkAbsoluteLayout.class);
            startActivity(intent);

        }
    }
}
