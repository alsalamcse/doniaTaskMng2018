package com.hammud.donia.doniataskmng2018;

import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUp extends AppCompatActivity
{
    private EditText etfirst, etlast, phone,etEmail,etPassword;
    private Button btnSave;
    private FirebaseUser user;
    private  FirebaseAuth auth;

    // to establish sign in sign up
    // user

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etfirst=findViewById(R.id.etfirst);
        etlast=findViewById(R.id.etlast);
        phone=findViewById(R.id.phone);
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.edPassWord2);
        btnSave=findViewById(R.id.btnsave);
        btnSave.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                dataHandler();

            }
        });
        auth=FirebaseAuth.getInstance();
        user=auth.getCurrentUser();

         }
         private void dataHandler()
         {
             boolean isk = true;
             String email = etEmail.getText().toString();
             String Password = etPassword.getText().toString();
             String fName = etfirst.getText().toString();
             String LName = etlast.getText().toString();
             String Phone = phone.getText().toString();
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
             if (isok)
             {
                 creatAcount(email,Password);
             }
         }



    private void creatAcount(String Email, String password){
        auth.createUserWithEmailAndPassword(Email,password).addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>()
        {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task)
            {
                if (task.isSuccessful())
                {
                    Toast.makeText(SignUp.this,"Authemtication successful",Toast.LENGTH_SHORT).show();
                    finish();
                }
                else
                {
                    Toast.makeText(SignUp.this,"Authemtication failed."+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}

