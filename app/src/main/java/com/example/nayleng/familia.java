package com.example.nayleng;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class familia extends AppCompatActivity {
    MediaPlayer audio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia);
        audio=(MediaPlayer)MediaPlayer.create(this,R.raw.au11);
    }

    public  void next (View view){
        Intent otro = new Intent(this,fam_abuelo.class);
        startActivity(otro);
    }
    public void play(View v){
        audio.start();
    }
}