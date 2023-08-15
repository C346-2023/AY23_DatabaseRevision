package com.myapplicationdev.databaserevision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btnInsertRecord, btnRetrieveRecordsTV, btnRetrieveRecordsLV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInsertRecord = findViewById(R.id.btnInsertRecord);
        btnRetrieveRecordsTV = findViewById(R.id.btnGetRecordTV);
        btnRetrieveRecordsLV = findViewById(R.id.btnGetRecordLV);

        btnInsertRecord.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, InsertActivity.class);
                startActivity(i);
            }
        });

        //Option: Implement dialog to insert record

        btnRetrieveRecordsTV.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RetrieveActivityTextView.class);
                startActivity(i);
            }
        });

        btnRetrieveRecordsLV.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RetrieveActivityListView.class);
                startActivity(i);
            }
        });

    }
}