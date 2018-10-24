package com.hammud.donia.doniataskmng2018;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class addTaskActivity extends AppCompatActivity
{
    private EditText etTitle,etTask,etDueData;
    private SeekBar tvImportant,tvNecessery;
    private Button BtnSave,btnDataPicker;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        etTitle=findViewById(R.id.etTitle);
        etTask=findViewById(R.id.etTask);
        etDueData=findViewById(R.id.etDueDate);
        tvNecessery=findViewById(R.id.tvNeseccery);
        tvImportant=findViewById(R.id.tvImportant);
        BtnSave=findViewById(R.id.btnsave);
        btnDataPicker=findViewById(R.id.btnDataPicker);

        BtnSave.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

            }
        });
        btnDataPicker.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

            }
        });


    }
}
