package com.example.nayleng;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class otro_basura extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otro_basura);
        mp=(MediaPlayer)MediaPlayer.create(this,R.raw.s2);
    }
    public  void next (View view){
        Intent otro = new Intent(this,otro_trabajo.class);
        startActivity(otro);
    }
    public  void volver (View view){
        Intent otro = new Intent(this,otro_silla.class);
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