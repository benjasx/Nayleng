package com.example.nayleng;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void clase (View view){
        Intent otro = new Intent(this,clases.class);
        startActivity(otro);
    }
    public  void home (View view){
        Intent otro = new Intent(this,MainActivity.class);
        startActivity(otro);
    }
    public  void cultu (View view){
        Intent otro = new Intent(this,como_estan.class);
        startActivity(otro);
    }
}