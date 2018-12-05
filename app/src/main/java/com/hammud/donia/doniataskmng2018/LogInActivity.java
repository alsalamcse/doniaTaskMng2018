package com.hammud.donia.doniataskmng2018;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity
{
    private EditText etEmail,etPassword;
    private Button btnSignUp,btnSignIn;
    private FirebaseAuth auth;
    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etEmail=findViewById(R.id.etEmail);
       etPassword=findViewById(R.id.etPassword);
        btnSignIn=findViewById(R.id.btn1);
        btnSignUp=findViewById(R.id.btn2);
        btnSignIn.setOnClickListener(new View.OnClickListener()
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
           private void signIn(String email,String password){
               auth.signInWithEmailAndPassword(email,password).addOnCompleteListener(LogInActivity.this, new OnCompleteListener<AuthResult>()
               {
                   @Override
                   public void onComplete(@NonNull Task<AuthResult> task)
                   {
                       if (task.isSuccessful()){
                           Toast.makeText(LogInActivity.this,"LogIn Successful",Toast.LENGTH_SHORT).show();
                           Intent i= new Intent(LogInActivity.this, MainTabsActivity.class);

                       }

                   }
               })
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
