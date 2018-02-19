package com.jeremiah.explorecartercounty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecreationActivity extends AppCompatActivity {
    ListView recListview;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recreation);
        final Intent carterIntent = new Intent(this, CarterCavesActivity.class);

        recListview = findViewById(R.id.recParksList);

        ArrayList<String> parksList = new ArrayList<>();
        parksList.add("Carter Caves State Resort Park");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, parksList);
        recListview.setAdapter(arrayAdapter);

        recListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(RecreationActivity.this, "Carter Caves", Toast.LENGTH_SHORT).show();

                startActivity(carterIntent);
            }
        });







    }
}
