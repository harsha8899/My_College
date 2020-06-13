package com.example.mycollege;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Sri_Balaji_temple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sri__balaji_temple);
    }

        public void Tirumala_official_web_site(View view){
            Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tirumala.org/"));
            startActivity(browserIntent);
        }

        public void Tirumala_Direction(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://goo.gl/maps/RD85Y8BKvqFY3USu9"));
        startActivity(browserIntent);
        }
    }

