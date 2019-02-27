package com.hammud.donia.doniataskmng2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SearchView;

public class SearchBuyer extends AppCompatActivity
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
    }

}
