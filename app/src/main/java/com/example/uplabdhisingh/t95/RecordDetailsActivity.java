package com.example.uplabdhisingh.t95;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.time.Clock;
import java.util.Calendar;

public class RecordDetailsActivity extends AppCompatActivity implements View.OnClickListener {

    EditText edtDate;
    EditText edtTime;
    DatePickerDialog datePickerDialog;
    TimePickerDialog timePickerDialog;
    CheckBox cbFood, cbClothes, cbVaccinations, cbOthers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record_details);

        edtDate = (EditText) findViewById(R.id.edt_date);
        edtTime = (EditText) findViewById(R.id.edt_time);
        cbFood = (CheckBox) findViewById(R.id.cb_food);
        cbFood.setOnClickListener(this);
        cbClothes = (CheckBox) findViewById(R.id.cb_clothes);
        cbClothes.setOnClickListener(this);
        cbVaccinations = (CheckBox) findViewById(R.id.cb_vaccine);
        cbVaccinations.setOnClickListener(this);
        cbOthers = (CheckBox) findViewById(R.id.cb_other);
        cbOthers.setOnClickListener(this);

        edtDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR);
                int mMonth = c.get(Calendar.MONTH);
                int mDay = c.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(RecordDetailsActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        edtDate.setText(dayOfMonth + "/"
                                        + month + "/" + year);
                    }
                },mYear,mMonth,mDay);
                datePickerDialog.show();
            }
        });
        edtTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar time = Calendar.getInstance();
                int hour = time.get(Calendar.HOUR_OF_DAY);
                int minutes = time.get(Calendar.MINUTE);

                timePickerDialog = new TimePickerDialog(RecordDetailsActivity.this,
                        new TimePickerDialog.OnTimeSetListener() {
                            @Override
                            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                                edtTime.setText(hourOfDay + ":" + minute);
                            }
                        },hour,minutes,true);
                timePickerDialog.show();
            }
        });
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.cb_food:
                if (cbFood.isChecked())
                    Toast.makeText(getApplicationContext(), "Marked Food", Toast.LENGTH_LONG).show();
                break;
            case R.id.cb_clothes:
                if (cbClothes.isChecked())
                    Toast.makeText(getApplicationContext(), "Marked Clothes", Toast.LENGTH_LONG).show();
                break;
            case R.id.cb_vaccine:
                if (cbVaccinations.isChecked())
                    Toast.makeText(getApplicationContext(), "Marked Vaccinations", Toast.LENGTH_LONG).show();
                break;
            case R.id.cb_other:
                if (cbOthers.isChecked())
                    Toast.makeText(getApplicationContext(), "Edited Others", Toast.LENGTH_LONG).show();
                break;
        }

    }
}
