package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    String getnum1,getnum2,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.use);
        e2=(EditText) findViewById(R.id.pas);
        b1=(Button) findViewById(R.id.sub);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            getnum1=e1.getText().toString();
            getnum2=e2.getText().toString();
            if(getnum1.equals("theatre"))
            {
                if(getnum2.equals("12345"))
                {
                    Intent oz=new Intent(getApplicationContext(), Dashboard.class);
                    startActivity(oz);
                }

                else
                {
                     result="Invalid";
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
                }
            }
            else
            {
                result="Invalid";
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
            }
        });

    }
}