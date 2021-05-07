package com.example.smartbustrackingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {
    EditText studentname,studentparentname,mobilenumber,studentaddress;
Button btt1;
FirebaseDatabase rootnode;
DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btt1=findViewById(R.id.save);
        studentname=findViewById(R.id.username);
        studentparentname=findViewById(R.id.parentname);
        mobilenumber=findViewById(R.id.MobileNumber);
        studentaddress=findViewById(R.id.address);
        btt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Registration Successfull", Toast.LENGTH_SHORT).show();
                Intent i1 = new Intent(getApplicationContext(),
                        MainActivity.class);

                startActivity(i1);
                rootnode=FirebaseDatabase.getInstance();
                reference=rootnode.getReference("users");
                reference.setValue("Firebase");
                String name=studentname.getEditableText().toString();
                String parentname=studentparentname.getEditableText().toString();
                String number=mobilenumber.getEditableText().toString();
                String address=studentaddress.getEditableText().toString();
                UserHelper userHelper=new UserHelper(name,parentname,number,address);
                reference.setValue(userHelper);

            }
        });

    }
}