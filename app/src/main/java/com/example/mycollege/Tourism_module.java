package com.example.mycollege;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Tourism_module extends AppCompatActivity {


    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tourism_module);

        @SuppressLint("WrongViewCast")
        ImageView iv1 = findViewById(R.id.ImageView1);
        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Sri_Balaji_temple.class));
            }
        });

        tv1 = findViewById(R.id.Textview1);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Sri_Balaji_temple.class));

            }
        });
        ImageView iv2 =findViewById(R.id.ImageView2);
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Kapila_Theertham.class));
            }
        });
        tv2 =findViewById(R.id.textview2);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Kapila_Theertham.class));
            }
        });
        ImageView iv3 = findViewById(R.id.ImageView3);
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Zoological_park.class));
            }
        });

        tv3=findViewById(R.id.Textview3);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Zoological_park.class));

            }
        });
        ImageView iv4=findViewById(R.id.ImageView4);
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Sri_Padmavathi_Temple.class));
            }
        });
        tv4=findViewById(R.id.Textview4);
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Sri_Padmavathi_Temple.class));
            }
        });
        ImageView iv5=findViewById(R.id.ImageView5);
        iv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Govinda_Raja_Temple.class));
            }
        });
        tv5=findViewById(R.id.Textview5);
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Govinda_Raja_Temple.class));
            }
        });
        ImageView iv6=findViewById(R.id.ImageView6);
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Iskon_Temple.class));

            }
        });
        tv6=findViewById(R.id.Textview6);
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Iskon_Temple.class));
            }
        });
        ImageView iv7=findViewById(R.id.ImageView7);
        iv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Tiruchanur_temple.class));
            }
        });
        tv7=findViewById(R.id.Textview7);
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Tiruchanur_temple.class));
            }
        });
        ImageView iv8=findViewById(R.id.ImageView8);
        iv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Sri_kalahasti.class));
            }
        });
        tv8=findViewById(R.id.Textview8);
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Tourism_module.this,Sri_kalahasti.class));
            }
        });
    }
}

