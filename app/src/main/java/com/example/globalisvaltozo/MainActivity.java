package com.example.globalisvaltozo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button button1;
    public EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Globális változó
                //file létrehozás
                SharedPreferences sharedPreferences = getSharedPreferences("Adatok", Context.MODE_PRIVATE);
                //megnyitás és beleírás
                SharedPreferences.Editor editor=sharedPreferences.edit();
                //Adatok.xml fájlban van egy 'nev' nevű string változó
                editor.putString("nev",edit.getText().toString());
                editor.apply();  // véglegesítés/végrehajtás művelet



                Intent masodik_activityre= new Intent(MainActivity.this,Main2Activity.class);
                startActivity( masodik_activityre);   // elinditja az Intent változót
                finish();
            }
        });






    }
    public void init()
    {
        button1=findViewById(R.id.button1);
        edit=findViewById(R.id.edit);
    }
}
