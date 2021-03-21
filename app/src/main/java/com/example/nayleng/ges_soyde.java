package com.example.nayleng;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ges_soyde extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ges_soyde);
        mp=(MediaPlayer)MediaPlayer.create(this, R.raw.au4);
    }
    public  void next (View view){
        Intent otro = new Intent(this,ges_nosvemos.class);
        startActivity(otro);
    }
    public  void volver (View view){
        Intent otro = new Intent(this,ges_yomellamo.class);
        startActivity(otro);
    }
    public void play(View v){
        mp.start();
    }
    public  void home (View view){
        Intent otro = new Intent(this,MainActivity.class);
        startActivity(otro);
    }
}