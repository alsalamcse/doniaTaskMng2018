package com.hammud.donia.doniataskmng2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity
{
    private EditText etEmail,etPassword;
    private Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etEmail=findViewById(R.id.etEmail);
       etPassword=findViewById(R.id.etPassword);

       btn1=findViewById(R.id.btn1);
       btn2=findViewById(R.id.btn2);
       btn1.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View view)
           {
               Intent i=new Intent( LogInActivity.this,MainTabsActivity.class);
               startActivity(i);

           }
       });
       btn2.setOnClickListener(new View.OnClickListener()
       {
           @Override
           public void onClick(View view)
           {
               Intent intent= new Intent(LogInActivity.this,SignUp.class);
               startActivity(intent);
           }
       });

    }
}
