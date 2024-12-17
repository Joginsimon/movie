package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Dashboard extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);
        b1=(Button) findViewById(R.id.addm);
        b2=(Button) findViewById(R.id.srch);
        b3=(Button) findViewById(R.id.view);
        b4=(Button) findViewById(R.id.exit);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oz=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(oz);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ol=new Intent(getApplicationContext(), ViewActivity.class);
                startActivity(ol);
            }
        });

    }
}