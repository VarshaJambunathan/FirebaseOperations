package com.example.varsha.databasequeries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.firebase.client.*;

public class MainActivity extends AppCompatActivity {

    TextView person;
    EditText mTitle , mDescription;
    Button mSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting the context
        Firebase.setAndroidContext(this);

        person = (TextView) findViewById(R.id.persons);
        mTitle = (EditText) findViewById(R.id.title);
        mDescription = (EditText) findViewById(R.id.description);
        mSave = (Button) findViewById(R.id.savebutton);

        //Listener for button
        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creating a Firebase object
                Firebase fire = new Firebase(Config.FIREBASE_URL);

                //Getting values to store
                String title = mTitle.getText().toString();
                String description = mDescription.getText().toString();

                Person person = new Person();

                //Adding values
                person.setTitle(title);
                person.setDescription(description);

                //Saving to Firebase
                fire.child("Person").setValue(person);
            }
        });

    }
}
