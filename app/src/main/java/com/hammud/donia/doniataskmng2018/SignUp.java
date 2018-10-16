package com.hammud.donia.doniataskmng2018;

import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUp extends AppCompatActivity
{
    FirebaseAuth auth;// to establish sign in sign up
    FirebaseUser user;// user

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        auth=FirebaseAuth.getInstance();
        user=auth.getCurrentUser();//
    }
}

