package com.example.fortunetellerapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView girlDisplay = (ImageView) findViewById(R.id.imageView); // Grab the ballDisplay from the xml by the id

        final int[] girlArray = { // The ballArray holds the 5 ball drawables
                 R.id.msg1, // ball1 sits at index 0
//               R.id.msg2, // ball2 sits at index 1
//               R.id.msg3, // ball3 sits at index 2
//               R.id.msg4, // ball4 sits at index 3
//               R.id.msg5, // ball5 sits at index 4
        };


        Button myButton = (Button) findViewById(R.id.button2); // Grab the myButton from the xml by the id

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // Set onClickListener for myButton
                Random randomNumberGenerator = new Random(); // Create a randomNumberGenerator object

                int number = randomNumberGenerator.nextInt(5); // Create a variable that stores a random number between 0 and 4

                girlDisplay.setImageResource(girlArray[number]); // Set the image of the ballDisplay to a random number in the ballArray
            }
        });
    }
}
