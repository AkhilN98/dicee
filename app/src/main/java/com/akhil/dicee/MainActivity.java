package com.akhil.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);

        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceImg = {R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("Dicee","This is a app");

                Random rng = new Random();

                int randNum = rng.nextInt(6);

                int randNum2 = rng.nextInt(6);

                Log.d("Dicee", "Random number is "+ randNum);

                Log.d("Dicee", "Random number 2 is "+ randNum2);

                leftDice.setImageResource(diceImg[randNum]);

                rightDice.setImageResource(diceImg[randNum2]);

            }
        });
    }
}
