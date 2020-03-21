package com.example.offline002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ClassRoutineTableLayout extends AppCompatActivity implements View.OnClickListener {
Button Fac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_routine_table_layout);
        this.setTitle("Class Routine");
        Toast.makeText(ClassRoutineTableLayout.this,"This is Table Layout",Toast.LENGTH_SHORT).show();
        Fac=findViewById(R.id.FacID);

        Fac.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() ==R.id.FacID)
        {
            Intent intent=new Intent(getApplicationContext(),FacultyContactRelativeLayout.class);
            startActivity(intent);

        }

    }
}
