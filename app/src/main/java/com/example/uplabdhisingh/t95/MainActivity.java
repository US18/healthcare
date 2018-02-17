package com.example.uplabdhisingh.t95;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    Button employeeButton;
    Button supervisorButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        employeeButton = (Button) findViewById(R.id.btn_employee);
        supervisorButton = (Button) findViewById(R.id.btn_supervisor);

        employeeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToEnterRecords = new Intent(getApplicationContext(),EnterRecordsActivity.class);
                startActivity(intentToEnterRecords);
            }
        });

        supervisorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToEmployeeWorklog = new Intent(getApplicationContext(),EmployeeWorklogActivity.class);
                startActivity(intentToEmployeeWorklog);
            }
        });

    }
}
