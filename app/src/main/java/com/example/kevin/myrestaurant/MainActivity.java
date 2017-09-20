package com.example.kevin.myrestaurant;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.start;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    private Button mfindRestaurantsButton;
    private EditText mLocationTextEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // This defines the button view as a button
        mfindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);

        // This gets the zipcode
        mLocationTextEdit = (EditText) findViewById(R.id.LocationTextEdit);

        // Waiting for the user to click the screen and execute this task
        mfindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Returns a editable data type so we must convert to a string
                String locataion = mLocationTextEdit.getText().toString();

                // When the button I want you to execute this
                Intent intent = new Intent(MainActivity.this, RestaurantActivity.class);

                // Store the value you would like to pass to another view
                intent.putExtra("location",locataion);

                // Goes to a new view
                startActivity(intent);
            }
        });
    }
}
