package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
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

        Button askButton;
        askButton = findViewById(R.id.btn_ask);

        final ImageView magicBall = findViewById(R.id.img_magicBall);

        final int[] answerArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };


        askButton.setOnClickListener(new View.OnClickListener() {
            int number=1;
            int newNumber;
            @Override
            public void onClick(View v) {

                Random randomNumberGenerator = new Random();

                newNumber = randomNumberGenerator.nextInt(5);

                if (newNumber==number)
                {
                    if (number==1)
                        newNumber++;
                    else if  (number==5)
                        newNumber--;
                    else
                        newNumber++;
                }
                number = newNumber;

                magicBall.setImageResource(answerArray[newNumber]);
            }
        });



    }
}
