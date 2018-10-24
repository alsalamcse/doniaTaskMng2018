package com.hammud.donia.doniataskmng2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

public class addTaskActivity extends AppCompatActivity
{
    private EditText etTitle,etTask,etDueData;
    private SeekBar tvImportant,tvNecessery;
    private Button BtnSave,btnDataPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        etTitle=findViewById(R.id.etTitle);
        etTask=findViewById(R.id.etTask);
        etDueData=findViewById(R.id.etDueDate);
        
    }
}
