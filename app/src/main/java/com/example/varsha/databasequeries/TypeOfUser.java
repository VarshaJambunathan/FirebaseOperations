package com.example.varsha.databasequeries;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TypeOfUser extends AppCompatActivity {

    Button mVictim , mAmbulance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_of_user);

        mVictim = (Button) findViewById(R.id.victim);
        mAmbulance = (Button) findViewById(R.id.amb);

        mVictim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main = new Intent(TypeOfUser.this, MainActivity.class);
                startActivity(main);

            }
        });

        mAmbulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Loading Ambulance Interface..", Toast.LENGTH_SHORT).show();

            }
        });
    }
}
