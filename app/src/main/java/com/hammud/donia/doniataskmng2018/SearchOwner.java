package com.hammud.donia.doniataskmng2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

public class SearchOwner extends AppCompatActivity
{
    private SearchView searchView;
    private Button btnFreezer,btnVegetablesAndFruit ,btnSweets, btnHouseHold;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_buyer);
        btnFreezer = findViewById(R.id.btnFreezer);
        btnVegetablesAndFruit = findViewById(R.id.btnVegetablesAndFruit);
        btnSweets = findViewById(R.id.btnSweets);
        btnHouseHold = findViewById(R.id.btnHouseHold);
        searchView= findViewById(R.id.searchView);



        btnFreezer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchOwner.this, FreezerActivity.class);
                startActivity(intent);
            }
        });
       btnVegetablesAndFruit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchOwner.this,VegetablesandFruit.class);
                startActivity(intent);
            }
        });
        btnHouseHold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchOwner.this,cleaningTools.class);
                startActivity(intent);
            }
        });
       btnSweets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SearchOwner.this,Sweets.class);
                startActivity(intent);
            }
        });
    }

}
