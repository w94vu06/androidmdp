package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {
private Button mb1,mb2,mb3,stopbutton,pausebutton,pausebutton2,pausebutton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.mei);
        MediaPlayer mp2 = MediaPlayer.create(this, R.raw.spacedout);
        MediaPlayer mp3 = MediaPlayer.create(this, R.raw.runningintherooftop);



        mb1 =(Button) findViewById(R.id.musicbutton1);
        mb2 =(Button) findViewById(R.id.musicbutton2);
        mb3 =(Button) findViewById(R.id.musicbutton3);

        stopbutton =(Button) findViewById(R.id.stopbutton);
        pausebutton =(Button) findViewById(R.id.pausebutton);
        pausebutton2 =(Button) findViewById(R.id.pausebutton2);
        pausebutton3 =(Button) findViewById(R.id.pausebutton3);


        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp1.start();
            }
        });

        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp2.start();
            }
        });

        mb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp3.start();
            }
        });



        pausebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.pause();



            }
        });

        pausebutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.pause();



            }
        });

        pausebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.pause();



            }
        });

        stopbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp1 != null){
                    mp1.stop();
                    mp1.release();
                }








            }
        });




    }

}