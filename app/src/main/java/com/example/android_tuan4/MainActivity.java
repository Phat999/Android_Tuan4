package com.example.android_tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements SendingData {
    TextView tvThanhTienMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvThanhTienMain = findViewById(R.id.tvThanhTienMain);
    }

    @Override
    public void sendData(String data) {
        tvThanhTienMain.setText(data);
    }
}