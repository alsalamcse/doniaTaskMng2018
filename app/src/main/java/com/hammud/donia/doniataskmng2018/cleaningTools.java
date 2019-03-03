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
    }
}
