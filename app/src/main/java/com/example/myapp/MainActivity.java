package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
private Button musicbutton1,musicbutton2,musicbutton3,musicbutton4,musicbutton5,musicbutton6,musicbutton7,musicbutton8,musicbutton9,musicbutton10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.turmpetc);
        MediaPlayer mp2 = MediaPlayer.create(this, R.raw.turmpetd);
        MediaPlayer mp3 = MediaPlayer.create(this, R.raw.turmpete);
        MediaPlayer mp4 = MediaPlayer.create(this, R.raw.turmpetf);
        MediaPlayer mp5 = MediaPlayer.create(this, R.raw.turmpetg);
        MediaPlayer mp6 = MediaPlayer.create(this, R.raw.turmpeta);
        MediaPlayer mp7 = MediaPlayer.create(this, R.raw.turmpetb);
        MediaPlayer mp8 = MediaPlayer.create(this, R.raw.turmpet0c);
        MediaPlayer mp9 = MediaPlayer.create(this, R.raw.turmpet0d);
        MediaPlayer mp10 = MediaPlayer.create(this, R.raw.turmpet0e);



        musicbutton1 =(Button) findViewById(R.id.musicbutton1);
        musicbutton2 =(Button) findViewById(R.id.musicbutton2);
        musicbutton3 =(Button) findViewById(R.id.musicbutton3);
        musicbutton4 =(Button) findViewById(R.id.musicbutton4);
        musicbutton5 =(Button) findViewById(R.id.musicbutton5);
        musicbutton6 =(Button) findViewById(R.id.musicbutton6);
        musicbutton7 =(Button) findViewById(R.id.musicbutton7);
        musicbutton8 =(Button) findViewById(R.id.musicbutton8);
        musicbutton9 =(Button) findViewById(R.id.musicbutton9);
        musicbutton10 =(Button) findViewById(R.id.musicbutton10);




        musicbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp1.start();
            }
        });

        musicbutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp2.start();
            }
        });

        musicbutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp3.start();
            }
        });

        musicbutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp4.start();
            }
        });

        musicbutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp5.start();
            }
        });

        musicbutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp6.start();
            }
        });

        musicbutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp7.start();
            }
        });

        musicbutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp8.start();
            }
        });

        musicbutton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp9.start();
            }
        });

        musicbutton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp10.start();
            }
        });








    }

}