package com.example.nayleng;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ges_nosvemos extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fam_abuelo);
        mp=(MediaPlayer)MediaPlayer.create(this,R.raw.au5);
    }
    public  void next (View view){
        Intent otro = new Intent(this,fam_abuela.class);
        startActivity(otro);
    }
    public  void volver (View view){
        Intent otro = new Intent(this,como_estan.class);
        startActivity(otro);
    }
    public void play(View v){
        mp.start();
    }
}