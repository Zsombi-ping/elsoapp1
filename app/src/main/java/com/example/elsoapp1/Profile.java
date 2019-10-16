
package com.example.a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Intent intent=getIntent();
        String first_name=intent.getStringExtra("FIRST_NAME");
        TextView firstName=findViewById(R.id.firstName);
        firstName.setText(first_name);
        String last_name=intent.getStringExtra("LAST_NAME");
        TextView lastName=findViewById(R.id.lastName);
        lastName.setText(last_name);
        String departmen_t=intent.getStringExtra("DEPARTMENT");
        TextView department=findViewById(R.id.department);
        department.setText(departmen_t);

    }

    public void goSignIn(View view)
    {
        Intent mainintent=new Intent(this,MainActivity.class);
        startActivity(mainintent);
    }
}
