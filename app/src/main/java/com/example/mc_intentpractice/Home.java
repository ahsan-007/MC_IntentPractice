package com.example.mc_intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener {
    Button repositoryBtn;
    Button launchAppBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        repositoryBtn =findViewById(R.id.repositoryBtn);
        repositoryBtn.setOnClickListener(this);

        launchAppBtn = findViewById(R.id.launchAppBtn);
        launchAppBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()){
            case R.id.launchAppBtn:
                intent = new Intent(Home.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.repositoryBtn: 
                Uri webpage = Uri.parse("https://github.com/ahsan-007/MC_IntentPractice");
                intent = new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(intent);
                break;

        }
        if(v.getId()==R.id.launchAppBtn){

        }else if(v.getId()==R.id.launchAppBtn){

        }
    }
}