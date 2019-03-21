package com.hammud.donia.doniataskmng2018;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.List;


public class MainToolsOwner extends AppCompatActivity
{
    private Button btnToiletTissus,btnKitchenRoll,btnFacialTissus, btnFabricConditioner,btnDetergentCapsules,btnLiquindDetergent;
    private Button btnDishwashing,btnMatches,btnPaper,btnMops,btnCarpetCleaners,btnToiletCleaners,btnAirFresheners,btnFeatherDuesters;
    private ImageButton addID;
    public static int value ;
    public static int amount;
    public static int  Weight;
    private DatabaseReference databaseReference;
    private Spinner SpnTools;


    final List<String> list = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tools_owner);
        FloatingActionButton fabadd=findViewById(R.id.fabAdd);
        fabadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        SpnTools=(Spinner)findViewById(R.id.SpnTools);

        ArrayAdapter<String> adp1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list);
        adp1.add("Freezer");
        adp1.add("CleaningTools");
        adp1.add("Sweets" );
        adp1.add("VegetablesAndFruits");




        adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpnTools.setAdapter(adp1);





    }

}


