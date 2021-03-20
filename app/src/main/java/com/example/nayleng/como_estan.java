package com.example.nayleng;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class como_estan extends AppCompatActivity {
    MediaPlayer au1dio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_estan);
        au1dio=(MediaPlayer)MediaPlayer.create(this,R.raw.au1);

    }
    public  void next (View view){
        Intent otro = new Intent(this,culturas.class);
        startActivity(otro);
    }
    public void play(View v){
        au1dio.start();
    }
}