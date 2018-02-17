package com.example.uplabdhisingh.t95;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class EmployeeWorklogDetails extends AppCompatActivity {

    EditText employeeNameEditText,pincodeEditText;
    Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_worklog_details);

        employeeNameEditText = (EditText) findViewById(R.id.edt_employee_name);
        pincodeEditText = (EditText) findViewById(R.id.edt_pincode);
        continueButton = (Button) findViewById(R.id.btn_continue);


    }
}
