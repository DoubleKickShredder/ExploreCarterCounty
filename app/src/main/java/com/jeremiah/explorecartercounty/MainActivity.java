package com.jeremiah.explorecartercounty;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button events;
    Button places;
    Button lodging;
    Button passport;

    public void goToPage (View view){

        int tag = Integer.parseInt(view.getTag().toString());
        switch(tag){
            case 1 :
                Intent eventIntent = new Intent(this, EventsActivity.class);
                startActivity(eventIntent);break;

            case 2:
                Intent placesIntent = new Intent(this, PlacesActivity.class);
                startActivity(placesIntent);break;
            case 3:
                Intent lodgingIntent = new Intent(this, LodgingActivity.class);
                startActivity(lodgingIntent);break;
            case 4:
                Intent passportIntent = new Intent(this, PassportActivity.class);
                startActivity(passportIntent);break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        events = (Button)findViewById(R.id.events);
        places = (Button) findViewById(R.id.places);
        lodging = (Button) findViewById(R.id.lodging);
        passport = (Button) findViewById(R.id.passport);
    }
}
