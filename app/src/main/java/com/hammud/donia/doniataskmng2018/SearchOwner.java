package com.hammud.donia.doniataskmng2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;

public class SearchOwner extends AppCompatActivity
{
   private TextView tvFreezer,tvSweets,tbVegetablesAndFruit,tvCleaningTools;
    int list = 0;
    private SearchView searchView;
    private Button btnFreezer,btnVegetablesAndFruit ,btnSweets, btnHouseHold;
    private Spinner spinCleaningTools,spinVegetablesAndFruit,spinSweets,spinFreezer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_owner);
        btnFreezer = findViewById(R.id.btnFreezer);
        btnVegetablesAndFruit = findViewById(R.id.btnVegetablesAndFruit);
        btnSweets = findViewById(R.id.btnSweets);
        btnHouseHold = findViewById(R.id.btnHouseHold);
        searchView= findViewById(R.id.searchView);
        tvFreezer = findViewById(R.id.tvFreezer);
        tvSweets = findViewById(R.id.tvSweets);
        tbVegetablesAndFruit = findViewById(R.id.tbVegetablesAndFruit);
        tvCleaningTools = findViewById(R.id.tvCleaningTools);
        spinCleaningTools= findViewById(R.id.spinCleaningTools);
        spinVegetablesAndFruit= findViewById(R.id.spinVegetablesAndFruit);
        spinSweets= findViewById(R.id.spinSweets);
        spinFreezer= findViewById(R.id.spinFreezer);



//        tvFreezer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchOwner.this, FreezerActivity.class);
//                startActivity(intent);
//            }
//        });
//        tvSweets.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchOwner.this, FreezerActivity.class);
//                startActivity(intent);
//            }
//        });
//        tbVegetablesAndFruit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchOwner.this, FreezerActivity.class);
//                startActivity(intent);
//            }
//        });
//        tvCleaningTools.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchOwner.this, FreezerActivity.class);
//                startActivity(intent);
//            }
//        });
//        spinCleaningTools.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchOwner.this, FreezerActivity.class);
//                startActivity(intent);
//            }
//        });
//        spinVegetablesAndFruit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchOwner.this, FreezerActivity.class);
//                startActivity(intent);
//            }
//        });
//        spinSweets.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchOwner.this, FreezerActivity.class);
//                startActivity(intent);
//            }
//        });
//        spinFreezer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchOwner.this, FreezerActivity.class);
//                startActivity(intent);
//            }
//        });

        spinCleaningTools=(Spinner)findViewById(R.id.SpnTools);


        ArrayAdapter<String> adp1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list);
        adp1.add("ToiletTissus");
        adp1.add("KitchenRoll");
        adp1.add("FacialTissus");
        adp1.add("FabricConditioner");
        adp1.add("DetergentCapsules");
        adp1.add("LiquindDetergent");
        adp1.add("Dishwashing");
        adp1.add("Matches");
        adp1.add("Paper");
        adp1.add("Mops");
        adp1.add("CarpetCleaners");
        adp1.add("ToiletCleaners");
        adp1.add("AirFresheners");
        adp1.add("FeatherDuesters");


        adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinCleaningTools.setAdapter(adp1);








//        btnFreezer.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchOwner.this, FreezerActivity.class);
//                startActivity(intent);
//            }
//        });
//       btnVegetablesAndFruit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchOwner.this,VegetablesandFruit.class);
//                startActivity(intent);
//            }
//        });
//        btnHouseHold.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchOwner.this,MainToolsOwner.class);
//                startActivity(intent);
//            }
//        });
//       btnSweets.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(SearchOwner.this,Sweets.class);
//                startActivity(intent);
//            }
//        });
    }

}
