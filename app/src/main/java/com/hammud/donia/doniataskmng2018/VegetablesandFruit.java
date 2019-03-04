package com.hammud.donia.doniataskmng2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class VegetablesandFruit extends AppCompatActivity
{
    private Button btnApple,btnAporicot,btnBanana,btnCherry,btnCelementine,btnFannel,btnGrape,btnGuava;
    private Button btnMango,btnOrange,btnStrawberry,btnAubergine,btnAvocado,btnCarrot,btnEndive,btnLemon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetablesand_fruit);
      btnApple=findViewById(R.id.btnApple);
       btnAporicot=findViewById(R.id.btnAporicot);
       btnBanana =findViewById(R.id.btnBanana);
       btnCherry =findViewById(R.id.btnCherry);
        btnCelementine=findViewById(R.id.btnCelementine);
         btnFannel=findViewById(R.id.btnFannel);
          btnGrape=findViewById(R.id.btnGrape);
          btnGuava =findViewById(R.id.btnGuava);
          btnMango=findViewById(R.id.btnMango);
          btnOrange =findViewById(R.id.btnOrange);
          btnStrawberry =findViewById(R.id.btnStrawberry);
          btnAubergine =findViewById(R.id.btnAubergine);
           btnAvocado=findViewById(R.id.btnAvocado);
           btnCarrot =findViewById(R.id.btnCarrot);
           btnEndive =findViewById(R.id.btnEndive);
           btnLemon =findViewById(R.id.btnLemon);
    }

}
