package com.myapplicationdev.databaserevision;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RetrieveActivityListView extends AppCompatActivity {

    Button btnGetNotes;

    ListView lv;
    ArrayAdapter<Note> aa;
    ArrayList<Note> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve_lv);

        btnGetNotes = findViewById(R.id.btnGetTasks);
        lv = findViewById(R.id.lv);

        al = new ArrayList<>();
        aa = new ArrayAdapter<Note>(RetrieveActivityListView.this, android.R.layout.simple_list_item_1, al);
        lv.setAdapter(aa);

        btnGetNotes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Create the DBHelper object, passing in the activity's Context
                DBHelper db = new DBHelper(RetrieveActivityListView.this);

                //Retrieve notes records in Note objects, to be displayed in ListView
                DBHelper db2 = new DBHelper(RetrieveActivityListView.this);
                db2.close();

                al.clear();
                al.addAll(db2.getNotesInObjects());
                aa.notifyDataSetChanged();
            }
        });


        //Option: Implement dialog to edit a record

    }
}