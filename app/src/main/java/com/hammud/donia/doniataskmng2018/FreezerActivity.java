package com.hammud.donia.doniataskmng2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class FreezerActivity extends AppCompatActivity
{
    private Button btnMilk,btnEggs,btnCheese,btnButter,btnLabna,btnHummus,btnIceCream;
    private Button btnHotdogs,btnPastrami,btnSalmon,btnFillet,btnChicken,btnMeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freezer);
    }
}
