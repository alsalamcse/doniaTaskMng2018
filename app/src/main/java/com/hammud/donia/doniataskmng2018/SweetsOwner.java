package com.hammud.donia.doniataskmng2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class SweetsOwner extends AppCompatActivity implements View.OnClickListener
{
    private Button btnCake,btnCookies, btnCandy, btnSweetSnacks,btnChocolateAdits, btnSnack,btnHilwah, btnPopcorn, btnBiscuit, btnBagel, btnFries,btnCracker, btnIceCreamCons;
    private ImageButton add;
    public static int value;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweets_owner);
        btnCake = findViewById(R.id.btnCake);
        btnCookies = findViewById(R.id.btnCookies);
        btnCandy= findViewById(R.id.btnCandy);
        btnSweetSnacks= findViewById(R.id.btnSweetSnacks);
        btnChocolateAdits=findViewById(R.id.btnChocolateAdits);
        btnSnack=findViewById(R.id.btnSnack);
        btnHilwah=findViewById(R.id.btnHilwah);
        btnPopcorn=findViewById(R.id.btnPopcorn);
        btnBiscuit=findViewById(R.id. btnBiscuit);
        btnBagel=findViewById(R.id.btnBagel);
        btnFries=findViewById(R.id.btnFries);
        btnCracker=findViewById(R.id.btnCracker);
        btnIceCreamCons=findViewById(R.id.btnIceCreamCons);

       btnCake .setOnClickListener(this);
        btnCookies .setOnClickListener(this);
        btnCandy.setOnClickListener(this);
        btnSweetSnacks.setOnClickListener(this);
        btnChocolateAdits.setOnClickListener(this);
        btnSnack .setOnClickListener(this);
        btnHilwah .setOnClickListener(this);
        btnPopcorn.setOnClickListener(this);
        btnBiscuit .setOnClickListener(this);
        btnBagel.setOnClickListener(this);
        btnFries.setOnClickListener(this);
        btnCracker.setOnClickListener(this);
        btnIceCreamCons .setOnClickListener(this);


    }
    Intent i = new Intent(getApplicationContext() ,UptadeSweetsOwner.class);

    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id. btnCake  :
                startActivity(i);
                value = 20;
                break;
            case R.id. btnCookies :
                startActivity(i);
                value = 20;
                break;
            case R.id.  btnCandy:
                startActivity(i);
                value = 20;
                break;
            case R.id. btnSweetSnacks :
                startActivity(i);
                value = 20;
                break;
            case R.id.  btnChocolateAdits:
                startActivity(i);
                value = 20;
                break;
            case R.id.btnSnack  :
                startActivity(i);
                value = 20;
                break;
            case R.id. btnHilwah :
                startActivity(i);
                value = 20;
                break;
            case R.id. btnPopcorn :
                startActivity(i);
                value = 20;
                break;
            case R.id.  btnBiscuit:
                startActivity(i);
                value = 20;
                break;
            case R.id. btnBagel :
                startActivity(i);
                value = 20;
                break;
            case R.id. btnFries :
                startActivity(i);
                value = 20;
                break;
            case R.id. btnCracker :
                startActivity(i);
                value = 20;
                break;
            case R.id.btnIceCreamCons :
                startActivity(i);
                value = 20;
                break;



        }
}}
