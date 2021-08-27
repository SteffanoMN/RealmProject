package com.androidrion.realmproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button insert = findViewById(R.id.insert);
        Button update = findViewById(R.id.update);
        Button read = findViewById(R.id.read);
        Button delete = findViewById(R.id.delete);
        TextView output = findViewById(R.id.show_data);
    }
}