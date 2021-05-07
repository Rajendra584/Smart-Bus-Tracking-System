package com.example.smartbustrackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText id1, id2, id3, id4;
    Button bt1, bt2, bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        id1=findViewById(R.id.name);
        id2=findViewById(R.id.password);
        bt1= findViewById(R.id.login);
        bt2 = findViewById(R.id.forgot);
        bt3= findViewById(R.id.Register);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(MainActivity.this,
                        Homepage.class);

                startActivity(i1);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(MainActivity.this,
                        MainActivity3.class);

                startActivity(i1);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(MainActivity.this,
                        MainActivity2.class);

                startActivity(i1);
            }
        });






    }
}
