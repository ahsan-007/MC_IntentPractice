 package com.example.mc_intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener {

     EditText phoneNo;
     Button dial;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phoneNo = findViewById(R.id.editTextPhone);
        dial = findViewById(R.id.dial);
        dial.setOnClickListener(this);
    }
     @Override
     public void onClick(View v) {
         if(v.getId()==R.id.dial){
             Uri uri = Uri.parse(("tel:"+phoneNo.getText().toString()));
             Intent dialerIntent = new Intent(Intent.ACTION_DIAL,uri);
             startActivity(dialerIntent);
         }
     }

 }