package com.hammud.donia.doniataskmng2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UpdateFreezerOwnerActivity extends AppCompatActivity
{
    private EditText Value , Weight , Amount;
    private Button Save;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_freezer_owner);
        Value = (EditText) findViewById(R.id.Value_ID);
        Weight = (EditText) findViewById(R.id.Wieght_ID);
        Amount = (EditText) findViewById(R.id.Amount_ID);
        Save = (Button) findViewById(R.id.Save_ID);
        Save.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (Value.getText().length() != 0 && Weight.getText().length() != 0 && Amount.getText().length() != 0)
                {
                    String newVal=Value.getText().toString();
                    Value.setText(newVal);


                }
            }
        });

    }

}
