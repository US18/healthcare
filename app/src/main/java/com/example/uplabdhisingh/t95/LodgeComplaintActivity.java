package com.example.uplabdhisingh.t95;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LodgeComplaintActivity extends AppCompatActivity {

    ImageView lodgeComplaintImageView;
    Button btnPre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lodge_complaint);

        btnPre = (Button) findViewById(R.id.btn_pre);
        lodgeComplaintImageView = (ImageView) findViewById(R.id.iv_lodge_complaint);

        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        lodgeComplaintImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToLodgeComplaint = new Intent(LodgeComplaintActivity.this,LodgeComplaintDetails.class);
                startActivity(intentToLodgeComplaint);
            }
        });
    }
}
