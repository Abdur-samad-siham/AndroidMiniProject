package com.example.offline002;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CrSrContactNoFrameLayout extends AppCompatActivity implements View.OnClickListener {
    private ImageView c1,c2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cr_sr_contact_no_frame_layout);
        this.setTitle("Cr Contact");
        Toast.makeText(CrSrContactNoFrameLayout.this,"This is Frame Layout",Toast.LENGTH_SHORT).show();
        c1=findViewById(R.id.c1ID);
        c2=findViewById(R.id.c2ID);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.c1ID)
        {
            c1.setVisibility(View.GONE);
            c2.setVisibility(View.VISIBLE);

        }
        else if(v.getId()==R.id.c1ID)
        {
            c2.setVisibility(View.GONE);
            c1.setVisibility(View.VISIBLE);
        }

    }
}
