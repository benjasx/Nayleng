package com.example.nayleng;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class fam_parientes extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fam_parientes);
        mp=(MediaPlayer)MediaPlayer.create(this,R.raw.au9);
    }

    public  void volver (View view){
        Intent otro = new Intent(this,fam_mama.class);
        startActivity(otro);
    }
    public void play(View v){
        mp.start();
    }
    public  void home (View view){
        Intent otro = new Intent(this,MainActivity.class);
        startActivity(otro);

    }
    public  void next (View view){
        Intent otro = new Intent(this,fam_tio.class);
        startActivity(otro);
    }
}