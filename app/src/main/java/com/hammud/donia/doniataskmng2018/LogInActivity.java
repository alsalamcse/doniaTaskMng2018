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

public class LogInActivity extends AppCompatActivity {
    private EditText etEmail, etPassword;
    private Button btnSignUp, btnSignIn;
    private FirebaseAuth auth;
    private FirebaseUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnSignIn = findViewById(R.id.btnSignIn);
        btnSignUp = findViewById(R.id.btnSignUp);
        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();


        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataHundler();
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LogInActivity.this, SignUp.class);
                startActivity(intent);
            }
        });

    }

    private void dataHundler() {
        boolean isok = true;
        String Email = etEmail.getText().toString();
        String Password = etPassword.getText().toString();

        if (Email.length() < 4 || Email.indexOf('@') < 0 || Email.indexOf('.') < 0) {
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
            signIn(Email, Password);
        }


    }

    private void signIn(String email, String password) {

        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(LogInActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(LogInActivity.this, "LogIn Successful", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(LogInActivity.this, MainTabsActivity.class);
                    startActivity(i);
                    finish();

                } else {
                    Toast.makeText(LogInActivity.this, "SignIn failed.", Toast.LENGTH_SHORT).show();
                  //  Intent intent = new Intent(LogInActivity.this, MainTabsActivity.class);
                   // startActivity(intent);
                  //  finish();

                }
//                      else
//                       {
//                           Toast.makeText(LogInActivity.this,"sign failed "+ task.getException().getMessage(),Toast.LENGTH_SHORT).show();
//                           task.getException().printStackTrace();
//                       }


            }
        });
    }
}
     //  });
//        btnSignIn.setOnClickListener(new View.OnClickListener()
//       {
//           @Override
//           public void onClick(View view)
//           {
//               Intent intent= new Intent(LogInActivity.this,SignUp.class);
//               startActivity(intent);
//           }

//       });

 //   }
//}
