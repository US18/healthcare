package com.example.uplabdhisingh.t95;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EmployeeWorklogActivity extends AppCompatActivity {

    ImageView worklogImageView;
    Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_worklog);

        worklogImageView = (ImageView) findViewById(R.id.iv_employee_worklog);
        btnNext = (Button) findViewById(R.id.btn_next);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToViewRecords = new Intent(EmployeeWorklogActivity.this,LodgeComplaintActivity.class);
                startActivity(intentToViewRecords);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
    });

        worklogImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToWorklogDetails = new Intent(EmployeeWorklogActivity.this,EmployeeWorklogDetails.class);
                startActivity(intentToWorklogDetails);
            }
        });

    }
}

