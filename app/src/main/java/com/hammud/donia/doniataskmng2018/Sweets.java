package com.hammud.donia.doniataskmng2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Sweets extends AppCompatActivity
{
    private Button btnCake,btnCookies, btnCandy, btnSweetSnacks,btnChocolateAdits, btnSnack,btnHilwah, btnPopcorn, btnBiscuit, btnBagel, btnFries,btnCracker, btnIceCreamCons;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweets);
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

    }
}
