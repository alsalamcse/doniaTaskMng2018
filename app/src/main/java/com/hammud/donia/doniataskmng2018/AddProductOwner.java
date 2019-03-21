package com.hammud.donia.doniataskmng2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.Iterator;

public class AddProductOwner extends AppCompatActivity
{
    private EditText Value , Weight , Amount;
    private Button Save;
    private DatabaseReference databaseReference;
    private Spinner SpnTools;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_product_owner);
        Value = (EditText) findViewById(R.id.Value_ID);
        Weight = (EditText) findViewById(R.id.Wieght_ID);
        Amount = (EditText) findViewById(R.id.Amount_ID);
        Save = (Button) findViewById(R.id.Save_ID);

        SpnTools=(Spinner)findViewById(R.id.SpnTools);

        ArrayAdapter<String> adp1 = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1);
        adp1.add("Freezer");
        adp1.add("CleaningTools");
        adp1.add("Sweets" );
        adp1.add("VegetablesAndFruits");
        adp1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpnTools.setAdapter(adp1);

    }
}
