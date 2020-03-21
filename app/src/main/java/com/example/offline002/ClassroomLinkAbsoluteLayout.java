package com.example.offline002;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

public class ClassroomLinkAbsoluteLayout extends AppCompatActivity implements View.OnClickListener {
Button gmail,clas,aust,iums,next,pre;
private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classroom_link_absolute_layout);
        this.setTitle("Important links");
        Toast.makeText(ClassroomLinkAbsoluteLayout.this,"This is Absolute Layout",Toast.LENGTH_SHORT).show();
        gmail=findViewById(R.id.GmailID);
        clas=findViewById(R.id.classroomID);
        aust=findViewById(R.id.austID);
        iums=findViewById(R.id.iumsID);


        next=findViewById(R.id.NextID);
        pre=findViewById(R.id.PreviousID);


        webView=findViewById(R.id.webviewID);
        gmail.setOnClickListener(this);
        clas.setOnClickListener(this);
        aust.setOnClickListener(this);
        iums.setOnClickListener(this);

        next.setOnClickListener(this);
        pre.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.NextID:
                Intent intent1=new Intent(getApplicationContext(),CrSrContactNoFrameLayout.class);
                startActivity(intent1);
            break;
            case R.id.PreviousID:
                Intent intent2=new Intent(getApplicationContext(),FacultyContactRelativeLayout.class);
                startActivity(intent2);
                break;
            case R.id.GmailID:
                webView.loadUrl("https://mail.google.com/");
                WebSettings webSettings=webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient());
                gmail.setVisibility(View.GONE);
                clas.setVisibility(View.GONE);
                aust.setVisibility(View.GONE);
                iums.setVisibility(View.GONE);

                next.setVisibility(View.GONE);
                pre.setVisibility(View.GONE);
                break;
                case R.id.classroomID:
                webView.loadUrl("https://classroom.google.com/");
                    WebSettings webSettings5=webView.getSettings();
                    webSettings5.setJavaScriptEnabled(true);
                    webView.setWebViewClient(new WebViewClient());
                    gmail.setVisibility(View.GONE);
                    clas.setVisibility(View.GONE);
                    aust.setVisibility(View.GONE);
                    iums.setVisibility(View.GONE);

                    next.setVisibility(View.GONE);
                    pre.setVisibility(View.GONE);
                break;
                case R.id.austID:
                webView.loadUrl("http://www.aust.edu/");
                    WebSettings webSettings2=webView.getSettings();
                    webSettings2.setJavaScriptEnabled(true);
                    webView.setWebViewClient(new WebViewClient());
                    gmail.setVisibility(View.GONE);
                    clas.setVisibility(View.GONE);
                    aust.setVisibility(View.GONE);
                    iums.setVisibility(View.GONE);

                    next.setVisibility(View.GONE);
                    pre.setVisibility(View.GONE);
                break;
                case R.id.iumsID:
                webView.loadUrl("https://iums.aust.edu/ums-web/login/");
                    WebSettings webSettings3=webView.getSettings();
                    webSettings3.setJavaScriptEnabled(true);
                    webView.setWebViewClient(new WebViewClient());
                    webView.setWebViewClient(new WebViewClient());
                    gmail.setVisibility(View.GONE);
                    clas.setVisibility(View.GONE);
                    aust.setVisibility(View.GONE);
                    iums.setVisibility(View.GONE);

                    next.setVisibility(View.GONE);
                    pre.setVisibility(View.GONE);
                break;

        }

    }
}
