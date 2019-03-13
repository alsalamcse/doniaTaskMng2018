package com.hammud.donia.doniataskmng2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class VegetablesandFruitOwner extends AppCompatActivity implements View.OnClickListener
{
    private Button btnApple,btnAporicot,btnBanana,btnCherry,btnCelementine,btnFannel,btnGrape,btnGuava;
    private Button btnMango,btnOrange,btnStrawberry,btnAubergine,btnAvocado,btnCarrot,btnEndive,btnLemon;
    private ImageButton add;
    public static int value ;
    public static int amount;
    public static int  Weight;
    private DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetablesand_fruit_owner);
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

        databaseReference=FirebaseDatabase.getInstance().getReference();

        btnApple.setOnClickListener(this);
        btnAporicot.setOnClickListener(this);
        btnBanana.setOnClickListener(this);
        btnCherry.setOnClickListener(this);
        btnCelementine.setOnClickListener(this);
        btnFannel.setOnClickListener(this);
        btnGrape.setOnClickListener(this);
        btnGuava.setOnClickListener(this);
        btnMango.setOnClickListener(this);
        btnOrange.setOnClickListener(this);
        btnStrawberry.setOnClickListener(this);
        btnAubergine.setOnClickListener(this);
        btnAvocado.setOnClickListener(this);
        btnCarrot.setOnClickListener(this);
        btnEndive.setOnClickListener(this);
        btnLemon.setOnClickListener(this);


        //add = (ImageButton) findViewById(R.id.addID);
       // add.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View v) {
         //       Intent i = new Intent(getApplicationContext() , )
         //   }
       // }//);
    }
    public void addItemsToDatabase() {
        databaseReference.child("Shopping Items").child("Apple").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Aporicot").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Banana").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Cherry").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Celementine").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Fannel").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Grape").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Guava").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Mango").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Orange").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Strawberry").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Aubergine").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Avocado").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Carrot").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Endive").setValue(value, amount);
        databaseReference.child("Shopping Items").child("Lemon").setValue(value, amount);
    }
    Intent i = new Intent(getApplicationContext() , UpdateVegetablesOwner.class);

    @Override
    public void onClick(View v)
    {
        switch (v.getId()){
            case R.id.btnApple :
                startActivity(i);
                value = 5;
                break;
            case R.id.btnAporicot :
                startActivity(i);
                value =5;
                break;
            case R.id. btnBanana:
             startActivity(i);
             value=5;
             break;
            case R.id.btnCherry :
                startActivity(i);
                value=5;
                break;
            case R.id. btnCelementine :
                startActivity(i);
                value=5;
                break;
            case R.id. btnFannel :
                startActivity(i);
                value=5;
                break;
            case R.id. btnGrape :
                startActivity(i);
                value=5;
                break;
            case R.id. btnGuava :
                startActivity(i);
                value=5;
                break;
            case R.id.btnMango :
                startActivity(i);
                value=5;
                break;
            case R.id. btnOrange :
                startActivity(i);
                value=5;
                break;
            case R.id. btnStrawberry :
                startActivity(i);
                value=5;
                break;
            case R.id.btnAubergine :
                startActivity(i);
                value=5;
                break;
            case R.id. btnAvocado :
                startActivity(i);
                value=5;
                break;
            case R.id. btnCarrot :
                startActivity(i);
                value=5;
                break;
            case R.id. btnEndive :
                startActivity(i);
                value=5;
                break;
            case R.id. btnLemon:
                startActivity(i);
                value=5;
                break;



        }
    }
}
