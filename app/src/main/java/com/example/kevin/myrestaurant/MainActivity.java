package com.example.kevin.myrestaurant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mfindRestaurantsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // This defines the button view as a button
        mfindRestaurantsButton = (Button) findViewById(R.id.findRestaurantsButton);

        // Waiting for the user to click the screen and execute this task
        mfindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast pops message  on screen
                // Takes in 3 param

                // A context, A message, and a length of time
                Toast.makeText(MainActivity.this, "Hello lets find a place to eat!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
