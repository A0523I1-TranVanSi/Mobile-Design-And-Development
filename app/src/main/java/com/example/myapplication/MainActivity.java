package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private TextView tvCount ;
    private FloatingActionButton btnAdd;
    private FloatingActionButton countDown ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tv_count);
        btnAdd = findViewById(R.id.btn_add);
        countDown = findViewById(R.id.count_down);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = Integer.parseInt(tvCount.getText().toString());
                tvCount.setText(""+ ++count);
            }
        });

        countDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int countDown = Integer.parseInt(tvCount.getText().toString());
                tvCount.setText("" + --countDown);
            }
        });
    }
}