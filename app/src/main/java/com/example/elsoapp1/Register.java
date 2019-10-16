package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void goProfile(View view)
    {
        Intent profintent=new Intent(this,Profile.class);
        EditText firstName=findViewById(R.id.firstName);
        String first_name=firstName.getText().toString();
        profintent.putExtra("FIRST_NAME",first_name);
        EditText lastName=findViewById(R.id.lastName);
        String last_name=lastName.getText().toString();
        profintent.putExtra("LAST_NAME",last_name);
        EditText department=findViewById(R.id.department);
        String departmen_t=department.getText().toString();
        profintent.putExtra("DEPARTMENT",departmen_t);
        startActivityForResult(profintent,1);
    }
}
