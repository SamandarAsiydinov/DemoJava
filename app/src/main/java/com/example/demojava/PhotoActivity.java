package com.example.demojava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class PhotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);

        Button btn = findViewById(R.id.btn_photo);
        btn.setOnClickListener(v -> intent());

    }
    void intent() {
        Intent i = new Intent(this,FourActivity.class);
        startActivity(i);
    }
}