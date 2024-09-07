package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    Button BtnSubmit;
    TextView TvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et_Name);
        BtnSubmit = findViewById(R.id.submit_btn);
        TvOutput = findViewById(R.id.output);

        BtnSubmit.setOnClickListener(v -> {

            String name = etName.getText().toString();
            TvOutput.setText("hello " + name);
        });
    }
}