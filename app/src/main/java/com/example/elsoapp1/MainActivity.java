package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        startActivityForResult(profintent,1);


    }

    public void goRegister(View view)
    {
        Intent registerintent=new Intent(this,Register.class);
        startActivity(registerintent);
    }

}
