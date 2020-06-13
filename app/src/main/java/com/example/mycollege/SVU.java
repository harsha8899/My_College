package com.example.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SVU extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_v_u);
    }
    public void svu_official_web_site(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://svuce.edu.in/"));
        startActivity(browserIntent);
    }
    public void svu_Directions(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/hG2Pr2sH6LXwNumt8"));
        startActivity(browserIntent);
    }
}
