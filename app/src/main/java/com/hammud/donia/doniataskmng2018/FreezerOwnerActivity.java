package com.hammud.donia.doniataskmng2018;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class  FreezerOwnerActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button btnMilk,btnEggs,btnCheese,btnButter,btnLabna,btnHummus,btnIceCream;
    private Button btnHotdogs,btnPastrami,btnSalmon,btnFillet,btnChicken,btnMeat;
    private ImageButton addID;
    public static int value;
    public static int amount;
    public static int  Weight;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freezer_owner);
        btnMilk = findViewById(R.id.btnMilk);
        btnEggs = findViewById(R.id.btnEggs);
        btnCheese= findViewById(R.id.btnCheese);
        btnButter= findViewById(R.id.btnButter);
        btnLabna= findViewById(R.id.btnLabna);
        btnHummus = findViewById(R.id.btnHummus);
        btnIceCream= findViewById(R.id.btnIceCream);
        btnHotdogs = findViewById(R.id.btnHotdogs);
        btnPastrami= findViewById(R.id.btnPastrami);
        btnSalmon = findViewById(R.id.btnSalmon);
        btnFillet = findViewById(R.id.btnFillet);
        btnChicken= findViewById(R.id.btnChicken);
        btnMeat = findViewById(R.id.btnMeat);

        databaseReference=FirebaseDatabase.getInstance().getReference();

        btnMilk .setOnClickListener(this);
        btnEggs .setOnClickListener(this);
        btnCheese.setOnClickListener(this);
        btnButter.setOnClickListener(this);
        btnLabna.setOnClickListener(this);
        btnHummus.setOnClickListener(this);
        btnIceCream .setOnClickListener(this);
        btnHotdogs.setOnClickListener(this);
        btnPastrami.setOnClickListener(this);
        btnSalmon .setOnClickListener(this);
        btnFillet .setOnClickListener(this);
        btnChicken .setOnClickListener(this);
        btnMeat.setOnClickListener(this);


    }


    public void addItemsToDatabase(){
        databaseReference.child("Shopping Items").child("Milk").setValue(value,amount);
        databaseReference.child("Shopping Items").child("Eggs").setValue(value,amount);
        databaseReference.child("Shopping Items").child("Cheese").setValue(value,amount);
        databaseReference.child("Shopping Items").child("Butter").setValue(value,amount);
        databaseReference.child("Shopping Items").child("Labna").setValue(value,amount);
        databaseReference.child("Shopping Items").child("Hummus").setValue(value,amount);
        databaseReference.child("Shopping Items").child("IceCream").setValue(value,amount);
        databaseReference.child("Shopping Items").child("Hotdogs").setValue(value,amount);
        databaseReference.child("Shopping Items").child("Pastrami").setValue(value,amount);
        databaseReference.child("Shopping Items").child("Salmon").setValue(value,amount);
        databaseReference.child("Shopping Items").child("Fillet").setValue(value,amount);
        databaseReference.child("Shopping Items").child("Chicken").setValue(value,amount);
        databaseReference.child("Shopping Items").child("Meat").setValue(value,amount);

    }



    Intent i = new Intent(getApplicationContext() ,UpdateCleaningToolsOwner.class);
    @Override
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id. btnMilk  :
                String btnName1=btnMilk.getText().toString();
                UpdateMethod(btnName1);

//                startActivity(i);
                value = 30;
//                int amount=45;
//               int  Weight=45;


                break;
            case R.id. btnEggs :
                String btnName2=btnEggs.getText().toString();
                UpdateMethod(btnName2);
                //startActivity(i);
                value = 30;
                break;
            case R.id. btnCheese :
                String btnName3=btnCheese.getText().toString();
                UpdateMethod(btnName3);
               // startActivity(i);
                value = 30;
                break;
            case R.id. btnButter :
                String btnName4=btnButter.getText().toString();
                UpdateMethod(btnName4);
                //startActivity(i);
                value = 30;
                break;
            case R.id. btnLabna :
                String btnName5=btnLabna.getText().toString();
                UpdateMethod(btnName5);
               // startActivity(i);
                value = 30;
                break;
            case R.id.btnHummus :
                String btnName6=btnHummus.getText().toString();
                UpdateMethod(btnName6);
               // startActivity(i);
                value = 30;
                break;
            case R.id.btnIceCream :
                String btnName7=btnIceCream.getText().toString();
                UpdateMethod(btnName7);
//                startActivity(i);
                value = 30;
                break;
            case R.id. btnHotdogs :
                String btnName8=btnHotdogs.getText().toString();
                UpdateMethod(btnName8);
               // startActivity(i);
                value = 30;
                break;
            case R.id.btnPastrami :
                String btnName9=btnPastrami.getText().toString();
                UpdateMethod(btnName9);
               // startActivity(i);
                value = 30;
                break;
            case R.id. btnSalmon :
                String btnName10=btnSalmon.getText().toString();
                UpdateMethod(btnName10);
               // startActivity(i);
                value = 30;
                break;
            case R.id.btnFillet :
                String btnName11=btnFillet.getText().toString();
                UpdateMethod(btnName11);
               // startActivity(i);
                value = 30;
                break;
            case R.id. btnChicken  :
                String btnName12=btnChicken.getText().toString();
                UpdateMethod(btnName12);
               // startActivity(i);
                value = 30;
                break;
            case R.id. btnMeat :
                String btnName13=btnMeat.getText().toString();
                UpdateMethod(btnName13);
               // startActivity(i);
                value = 30;
                break;



        }
}
    public void UpdateMethod(String btnName){
        Intent intent=new Intent(FreezerOwnerActivity.this,AddProductOwner.class);
        intent.putExtra(btnName,5);
        startActivity(intent);

    }
}
