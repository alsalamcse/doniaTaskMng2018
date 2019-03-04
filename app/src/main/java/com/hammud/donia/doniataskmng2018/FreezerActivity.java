package com.hammud.donia.doniataskmng2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class FreezerActivity extends AppCompatActivity
{
    private Button btnMilk,btnEggs,btnCheese,btnButter,btnLabna,btnHummus,btnIceCream;
    private Button btnHotdogs,btnPastrami,btnSalmon,btnFillet,btnChicken,btnMeat;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freezer);
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

    }
}
