package com.hammud.donia.doniataskmng2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class  FreezerOwnerActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button btnMilk,btnEggs,btnCheese,btnButter,btnLabna,btnHummus,btnIceCream;
    private Button btnHotdogs,btnPastrami,btnSalmon,btnFillet,btnChicken,btnMeat;
    private ImageButton add;
    public static int value;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freezer_owner);
        btnMilk = findViewById(R.id.btnMilk);
        btnEggs = findViewById(R.id.btnEggs);
        btnCheese= findViewById(R.id.btnCheese);
        btnButter= findViewById(R.id.btnButter);
        btnLabna= findViewById(R.id.btnLabna);
        btnHummus = findViewById(R.id.btnHummus);
        btnIceCream= findViewById(R.id.btnIceCream);
        btnHotdogs = findViewById(R.id.btnHotdogs);
        btnPastrami= findViewById(R.id.btnPastrami);
        btnSalmon = findViewById(R.id.btnSalmon);
        btnFillet = findViewById(R.id.btnFillet);
        btnChicken= findViewById(R.id.btnChicken);
        btnMeat = findViewById(R.id.btnMeat);

        btnMilk .setOnClickListener(this);
        btnEggs .setOnClickListener(this);
        btnCheese.setOnClickListener(this);
        btnButter.setOnClickListener(this);
        btnLabna.setOnClickListener(this);
        btnHummus.setOnClickListener(this);
        btnIceCream .setOnClickListener(this);
        btnHotdogs.setOnClickListener(this);
        btnPastrami.setOnClickListener(this);
        btnSalmon .setOnClickListener(this);
        btnFillet .setOnClickListener(this);
        btnChicken .setOnClickListener(this);
        btnMeat.setOnClickListener(this);

    }

    Intent i = new Intent(getApplicationContext() ,UpdateFreezerOwnerActivity.class);
    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id. btnMilk  :
                startActivity(i);
                value = 30;
                break;
            case R.id. btnEggs :
                startActivity(i);
                value = 30;
                break;
            case R.id. btnCheese :
                startActivity(i);
                value = 30;
                break;
            case R.id. btnButter :
                startActivity(i);
                value = 30;
                break;
            case R.id. btnLabna :
                startActivity(i);
                value = 30;
                break;
            case R.id.btnHummus :
                startActivity(i);
                value = 30;
                break;
            case R.id.btnIceCream :
                startActivity(i);
                value = 30;
                break;
            case R.id. btnHotdogs :
                startActivity(i);
                value = 30;
                break;
            case R.id.btnPastrami :
                startActivity(i);
                value = 30;
                break;
            case R.id. btnSalmon :
                startActivity(i);
                value = 30;
                break;
            case R.id.btnFillet :
                startActivity(i);
                value = 30;
                break;
            case R.id. btnChicken  :
                startActivity(i);
                value = 30;
                break;
            case R.id. btnMeat :
                startActivity(i);
                value = 30;
                break;



        }
}}
