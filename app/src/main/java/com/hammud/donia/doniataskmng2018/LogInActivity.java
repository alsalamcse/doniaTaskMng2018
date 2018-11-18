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
               dataHandler();

           }

           private void dataHandler()
           {
               boolean isk = true;
               String email = etEmail.getText().toString();
               String Password = etPassword.getText().toString();
              
               boolean isok = false;
               if (email.length() < 4 || email.indexOf('8') < 0 || email.indexOf('.') < 0)
               {
                   etEmail.setError("wrong Email");
                   isok = false;
               }
               if (etPassword.length() < 8) ;
               {
                   etPassword.setError("have to be at least 8 char");
                   isok = false;
               }
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
