package com.hammud.donia.doniataskmng2018;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Date;

public class addTaskActivity extends AppCompatActivity
{
    private EditText etTitle,etTask,etDueData;
    private TextView tvImportant,tvNecessery;
    private Button BtnSave ,btnDataPicker;
    private int mYear,mMonth,mDay;

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

                dataHandler();
            }
        });
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void onClick(View view)
    {
        if (view==btnDataPicker)
        {
            final Calendar c=Calendar.getInstance();
            mYear=c.get(Calendar.YEAR);
            mMonth=c.get(Calendar.MONTH);
            mDay=c.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datePicker=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener()
            {
                @Override
                public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth)
                {
                    etDueData.setText(dayOfMonth + "-" + monthOfYear + "-" + year);

                }
            },mYear,mMonth,mDay);
            datePicker.show();

        }
    }

    private void dataHandler()
    {

        boolean isk = true;
        String title = etTitle.getText().toString();
        String task = etTask.getText().toString();
        String Date = etDueData.getText().toString();
        String important = tvImportant.getText().toString();
        String necessery = tvNecessery.getText().toString();
        boolean isok = false;
        if (title.length()==0)
        {
           etTitle.setError("wrong Email");
            isok = false;
        }
        if (etTask.length() ==0)
        {
            etTask.setError("have to be at least 8 char");
            isok = false;
        }
        if (isok)
        {
            MyTask Task= new MyTask();
            Task.setCreatedA(new Date());
            Task.getDueDate(new Date(Date));
            Task.setText(task);
            Task.setTitle(title);
            Task.setImportant(important);
            Task.getNecessary(necessery);

            FirebaseAuth auth=FirebaseAuth.getInstance();
            Task.setOwner(auth.getCurrentUser().getEmail());
            DatabaseReference reference= FirebaseDatabase.getInstance().getReference();
            String key=reference.child("MyTask").push().getKey();
            Task.setKey(key);
            reference.child("MyTask").child(key).setValue(Task).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull com.google.android.gms.tasks.Task<Void> task) {
                    if (task.isSuccessful())
                    {
                        Toast.makeText(addTaskActivity.this, "add successful", Toast.LENGTH_SHORT).show();
                    }
                        else{
                        Toast.makeText(addTaskActivity.this, "add failed", Toast.LENGTH_SHORT).show();

                    }
                }
            });










        }
    }
}
