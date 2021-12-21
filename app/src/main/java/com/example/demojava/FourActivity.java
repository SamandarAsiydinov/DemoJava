package com.example.demojava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        Button btn = findViewById(R.id.four_btn);
        btn.setOnClickListener(v -> init());

    }
    void init() {
        Intent i = new Intent(this,DetailsActivity.class);
        startActivity(i);
    }
}