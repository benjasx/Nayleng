package com.example.nayleng;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class como_estan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_estan);
    }
    public  void next (View view){
        Intent otro = new Intent(this,culturas.class);
        startActivity(otro);
    }
}