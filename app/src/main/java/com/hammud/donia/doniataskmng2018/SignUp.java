package com.hammud.donia.doniataskmng2018;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUp extends AppCompatActivity
{
    // 1. add auth to project
    //2.
    FirebaseAuth auth;// to establish sign in sign up
    FirebaseUser user;// user

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //3.
        auth=FirebaseAuth.getInstance();
        user=auth.getCurrentUser();//
    }
    //4.
    private void creatAcount(String Email,String passw){
        auth.createUserWithEmailAndPassword(Email,passw).addOnCompleteListener(SignUp.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task)
            {
                if (task.isSuccessful())
                {
                    Toast.makeText(SignUp.this,"Authemtication successful",Toast)
                }

            }
        });
    }
}

