package com.hammud.donia.doniataskmng2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class cleaningToolsOwner extends AppCompatActivity implements View.OnClickListener
{
    private Button btnToiletTissus,btnKitchenRoll,btnFacialTissus, btnFabricConditioner,btnDetergentCapsules,btnLiquindDetergent;
    private Button btnDishwashing,btnMatches,btnPaper,btnMops,btnCarpetCleaners,btnToiletCleaners,btnAirFresheners,btnFeatherDuesters;
    private ImageButton add;
    public static int value ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning_tools_Owner);
        btnToiletTissus = findViewById(R.id.btnToiletTissus);
        btnKitchenRoll= findViewById(R.id.btnKitchenRoll);
        btnFacialTissus= findViewById(R.id.btnFacialTissus);
        btnFabricConditioner = findViewById(R.id.btnFabricConditioner);
        btnDetergentCapsules = findViewById(R.id.btnDetergentCapsules);
         btnLiquindDetergent= findViewById(R.id.btnLiquindDetergent);
           btnDishwashing = findViewById(R.id.btnDishwashing);
           btnMatches = findViewById(R.id.btnMatches);
           btnPaper = findViewById(R.id.btnPaper);
           btnMops = findViewById(R.id.btnMops);
           btnCarpetCleaners = findViewById(R.id.btnCarpetCleaners);
            btnToiletCleaners= findViewById(R.id.btnToiletCleaners);
            btnAirFresheners = findViewById(R.id.btnAirFresheners);
            btnFeatherDuesters= findViewById(R.id.btnFeatherDuesters);

        btnToiletTissus.setOnClickListener(this);
        btnKitchenRoll.setOnClickListener(this);
        btnFacialTissus.setOnClickListener(this);
        btnFabricConditioner.setOnClickListener(this);
        btnDetergentCapsules.setOnClickListener(this);
        btnLiquindDetergent.setOnClickListener(this);
        btnDishwashing.setOnClickListener(this);
        btnMatches.setOnClickListener(this);
        btnPaper.setOnClickListener(this);
        btnMops.setOnClickListener(this);
        btnCarpetCleaners.setOnClickListener(this);
        btnToiletCleaners.setOnClickListener(this);
        btnAirFresheners.setOnClickListener(this);
        btnFeatherDuesters .setOnClickListener(this);



    }
    Intent i = new Intent(getApplicationContext() ,UpdatecleaningToolsOwner.class);

    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id. btnToiletTissus :
                startActivity(i);
                value = 10;
                break;
            case R.id. btnKitchenRoll :
            startActivity(i);
            value = 10;
            break;
            case R.id.btnFacialTissus :
                startActivity(i);
                value = 10;
                break;
            case R.id. btnFabricConditioner :
                startActivity(i);
                value = 10;
                break;
            case R.id.btnDetergentCapsules :
                startActivity(i);
                value =10;
                break;
            case R.id. btnLiquindDetergent :
                startActivity(i);
                value = 10;
                break;
            case R.id. btnDishwashing :
                startActivity(i);
                value = 10;
                break;
            case R.id.btnMatches :
                startActivity(i);
                value =10;
                break;
            case R.id. btnPaper :
                startActivity(i);
                value = 10;
                break;
            case R.id. btnMops :
                startActivity(i);
                value = 10;
                break;
            case R.id. btnCarpetCleaners :
                startActivity(i);
                value = 10;
                break;
            case R.id. btnToiletCleaners :
                startActivity(i);
                value = 10;
                break;
            case R.id. btnAirFresheners :
                startActivity(i);
                value = 10;
                break;
            case R.id. btnFeatherDuesters :
                startActivity(i);
                value = 10;
                break;




    }
}}
