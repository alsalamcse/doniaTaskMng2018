package com.hammud.donia.doniataskmng2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class cleaningTools extends AppCompatActivity
{
    private Button btnToiletTissus,btnKitchenRoll,btnFacialTissus, btnFabricConditioner,btnDetergentCapsules,btnLiquindDetergent;
    private Button btnDishwashing,btnMatches,btnPaper,btnMops,btnCarpetCleaners,btnToiletCleaners,btnAirFresheners,btnFeatherDuesters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning_tools);
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
    }
}
