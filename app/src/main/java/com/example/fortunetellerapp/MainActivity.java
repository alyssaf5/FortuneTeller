package com.example.fortunetellerapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    MediaPlayer magic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView msg1 = findViewById(R.id.msg1);
        msg1.setVisibility(View.INVISIBLE);
        magic = MediaPlayer.create(MainActivity.this, R.raw.magic);
/*        final TextView msg2 = findViewById(R.id.msg2);
        msg2.setVisibility(View.INVISIBLE);

        final TextView msg3 = findViewById(R.id.msg3);
        msg3.setVisibility(View.INVISIBLE);*/

        //final ImageView girlDisplay = (ImageView) findViewById(R.id.imageView); // Grab the ballDisplay from the xml by the id

//        final int[] girlArray = { // The ballArray holds the 5 ball drawables
//                 R.id.msg1, // ball1 sits at index
////               R.id.msg2, // ball2 sits at index 1
////               R.id.msg3, // ball3 sits at index 2
////               R.id.msg4, // ball4 sits at index 3
////               R.id.msg5, // ball5 sits at index 4
//        };


        Button myButton = (Button) findViewById(R.id.button2); // Grab the myButton from the xml by the id

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { // Set onClickListener for myButton
                Random randomNumberGenerator = new Random(); // Create a randomNumberGenerator object
                int number = randomNumberGenerator.nextInt(10); // Create a variable that stores a random number between 0 and 4

                //girlDisplay.setImageResource(girlArray[number]); // Set the image of the ballDisplay to a random number in the ballArray
                magic.start();
                if (number == 0) {
                    msg1.setVisibility(View.VISIBLE);
                    msg1.setText("Never in a million years");
                }
                if (number == 1) {
                    msg1.setVisibility(View.VISIBLE);
                    msg1.setText("Definitely");
                }
                if (number == 2) {
                    msg1.setVisibility(View.VISIBLE);
                    msg1.setText("Ask again later");
                }
                if (number == 3) {
                    msg1.setVisibility(View.VISIBLE);
                    msg1.setText("Forget about it");
                }
                if (number == 4) {
                    msg1.setVisibility(View.VISIBLE);
                    msg1.setText("In your dreams");
                }
                if (number == 5) {
                    msg1.setVisibility(View.VISIBLE);
                    msg1.setText("Without a doubt");
                }
                if (number == 6) {
                    msg1.setVisibility(View.VISIBLE);
                    msg1.setText("Probably");
                }
                if (number == 7) {
                    msg1.setVisibility(View.VISIBLE);
                    msg1.setText("You’re kidding right?");
                }
                if (number == 8) {
                    msg1.setVisibility(View.VISIBLE);
                    msg1.setText("It is certain");
                }
                if (number == 9) {
                    msg1.setVisibility(View.VISIBLE);
                    msg1.setText("Odds are in your favor");
                }
            }
        });
    }
}
