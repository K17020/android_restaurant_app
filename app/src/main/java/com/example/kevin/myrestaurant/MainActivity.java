package com.example.kevin.myrestaurant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.R.attr.start;

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

                // When the button I want you to execute this
                Intent intent = new Intent(MainActivity.this, RestaurantActivity.class);

                // Goes to a new view
                startActivity(intent);
            }
        });
    }
}
