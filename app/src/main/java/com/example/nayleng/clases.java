package com.example.nayleng;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class clases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clases);
    }

    public  void home (View view){
        Intent otro = new Intent(this,MainActivity.class);
        startActivity(otro);
    }
    public  void clase (View view){
        Intent otro = new Intent(this,clases.class);
        startActivity(otro);
    }
    public  void cultu (View view){
        Intent otro = new Intent(this,culturas.class);
        startActivity(otro);
    }
    public void Conversa(View v){
        Intent con = new Intent(this,como_estan.class);
        startActivity(con);
    }
    public void fam(View v){
        Intent fam = new Intent(this,familia.class);
        startActivity(fam);
    }
    public void otros(View v){
        Intent otros = new Intent(this,otro_come.class);
        startActivity(otros);
    }
}