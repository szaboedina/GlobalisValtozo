package com.example.globalisvaltozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView text2;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        SharedPreferences sharedPreferences = getSharedPreferences("Adatok", Context.MODE_PRIVATE);
        String seged="";
        //adat leszedés
        seged= sharedPreferences.getString("nev","Nincs elmentve a neved!");
        text2.setText(seged);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent elso_activityre= new Intent(Main2Activity.this,MainActivity.class);
                startActivity( elso_activityre);
                finish();
            }
        });
    }
    public void  init(){
        text2=findViewById(R.id.text2);
        button2=findViewById(R.id.button2);
    }

}
