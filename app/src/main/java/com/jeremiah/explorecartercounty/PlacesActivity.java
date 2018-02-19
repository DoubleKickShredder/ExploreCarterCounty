package com.jeremiah.explorecartercounty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlacesActivity extends AppCompatActivity {
    Button parksRec;
    Button waterWays;
    Button history;

    public void goTo(View view){
        int tag = Integer.parseInt(view.getTag().toString());

        switch (tag){
            case 1:
                Intent parksIntent = new Intent(this, RecreationActivity.class);
                startActivity(parksIntent); break;
            case 2:
                Intent historyIntent = new Intent(this, HistoryActivity.class);
                startActivity(historyIntent);break;
            case 3:
                Intent waterWaysIntent = new Intent(this, WaterWaysActivity.class);
                startActivity(waterWaysIntent);break;

              }



    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);

        parksRec = findViewById(R.id.parksRec);
        waterWays = findViewById(R.id.waterWays);
        history = findViewById(R.id.historicSites);


    }
}
