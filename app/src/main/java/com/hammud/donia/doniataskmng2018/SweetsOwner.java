package com.hammud.donia.doniataskmng2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SweetsOwner extends AppCompatActivity implements View.OnClickListener
{
    private Button btnCake,btnCookies, btnCandy, btnSweetSnacks,btnChocolateAdits, btnSnack,btnHilwah, btnPopcorn, btnBiscuit, btnBagel, btnFries,btnCracker, btnIceCreamCons;
    private ImageButton addID;
    public static int value ;
    public static int amount;
    public static int  Weight;
    private DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweets_owner);
        btnCake = findViewById(R.id.btnCake);
        btnCookies = findViewById(R.id.btnCookies);
        btnCandy = findViewById(R.id.btnCandy);
        btnSweetSnacks = findViewById(R.id.btnSweetSnacks);
        btnChocolateAdits = findViewById(R.id.btnChocolateAdits);
        btnSnack = findViewById(R.id.btnSnack);
        btnHilwah = findViewById(R.id.btnHilwah);
        btnPopcorn = findViewById(R.id.btnPopcorn);
        btnBiscuit = findViewById(R.id.btnBiscuit);
        btnBagel = findViewById(R.id.btnBagel);
        btnFries = findViewById(R.id.btnFries);
        btnCracker = findViewById(R.id.btnCracker);
        btnIceCreamCons = findViewById(R.id.btnIceCreamCons);

        databaseReference = FirebaseDatabase.getInstance().getReference();

        btnCake.setOnClickListener(this);
        btnCookies.setOnClickListener(this);
        btnCandy.setOnClickListener(this);
        btnSweetSnacks.setOnClickListener(this);
        btnChocolateAdits.setOnClickListener(this);
        btnSnack.setOnClickListener(this);
        btnHilwah.setOnClickListener(this);
        btnPopcorn.setOnClickListener(this);
        btnBiscuit.setOnClickListener(this);
        btnBagel.setOnClickListener(this);
        btnFries.setOnClickListener(this);
        btnCracker.setOnClickListener(this);
        btnIceCreamCons.setOnClickListener(this);
    }
        public void addItemsToDatabase()
        {
            databaseReference.child("Shopping Items").child("Cake").setValue(value,amount);
            databaseReference.child("Shopping Items").child("Cookies").setValue(value,amount);
            databaseReference.child("Shopping Items").child("Candy").setValue(value,amount);
            databaseReference.child("Shopping Items").child("SweetSnacks").setValue(value,amount);
            databaseReference.child("Shopping Items").child("ChocolateAdits").setValue(value,amount);
            databaseReference.child("Shopping Items").child("Snack").setValue(value,amount);
            databaseReference.child("Shopping Items").child("Hilwah").setValue(value,amount);
            databaseReference.child("Shopping Items").child("Popcorn").setValue(value,amount);
            databaseReference.child("Shopping Items").child("Biscuit").setValue(value,amount);
            databaseReference.child("Shopping Items").child("Bagel").setValue(value,amount);
            databaseReference.child("Shopping Items").child("Fries").setValue(value,amount);
            databaseReference.child("Shopping Items").child("Cracker").setValue(value,amount);
            databaseReference.child("Shopping Items").child("IceCreamCons").setValue(value,amount);


        }

    Intent i = new Intent(getApplicationContext() ,UpdateSweetsOwner.class);

    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id. btnCake  :
                String btnName1=btnCake.getText().toString();
                UpdateMethod(btnName1);
               // startActivity(i);
                value = 20;
                break;
            case R.id. btnCookies :
                String btnName2=btnCookies.getText().toString();
                UpdateMethod(btnName2);
               // startActivity(i);
                value = 20;
                break;
            case R.id.  btnCandy:
                String btnName3=btnCandy.getText().toString();
                UpdateMethod(btnName3);
              //  startActivity(i);
                value = 20;
                break;
            case R.id. btnSweetSnacks :
                String btnName4=btnSweetSnacks.getText().toString();
                UpdateMethod(btnName4);
              //  startActivity(i);
                value = 20;
                break;
            case R.id.  btnChocolateAdits:
                String btnName5=btnChocolateAdits.getText().toString();
                UpdateMethod(btnName5);
              //  startActivity(i);
                value = 20;
                break;
            case R.id.btnSnack  :
                String btnName6=btnSnack.getText().toString();
                UpdateMethod(btnName6);
                //startActivity(i);
                value = 20;
                break;
            case R.id. btnHilwah :
                String btnName7=btnHilwah.getText().toString();
                UpdateMethod(btnName7);
               // startActivity(i);
                value = 20;
                break;
            case R.id. btnPopcorn :
                String btnName8=btnPopcorn.getText().toString();
                UpdateMethod(btnName8);
               // startActivity(i);
                value = 20;
                break;
            case R.id.  btnBiscuit:
                String btnName9=btnBiscuit.getText().toString();
                UpdateMethod(btnName9);
              //  startActivity(i);
                value = 20;
                break;
            case R.id. btnBagel :
                String btnName10=btnBagel.getText().toString();
                UpdateMethod(btnName10);
               // startActivity(i);
                value = 20;
                break;
            case R.id. btnFries :
                String btnName11=btnBagel.getText().toString();
                UpdateMethod(btnName11);

               // startActivity(i);
                value = 20;
                break;
            case R.id. btnCracker :
               // startActivity(i);
                value = 20;
                break;
            case R.id.btnIceCreamCons :
               // startActivity(i);
                value = 20;
                break;



        }
}
    public void UpdateMethod(String btnName){
        Intent intent=new Intent(SweetsOwner.this,AddProductOwner.class);
        intent.putExtra(btnName,5);
        startActivity(intent);

    }
}
