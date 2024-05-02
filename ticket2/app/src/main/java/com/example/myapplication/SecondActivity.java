package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Get the result data from the intent
        Intent intent = getIntent();
        String gender = intent.getStringExtra("gender");
        String ticket = intent.getStringExtra("ticket");
        double total = intent.getDoubleExtra("total", 0.0);
        int quantity = intent.getIntExtra("quantity", 0); // New line to get quantity

        // Display the result in TextViews
        TextView genderTextView = findViewById(R.id.genderTextView);
        genderTextView.setText(getResources().getString(R.string.gender) + gender);

        TextView ticketTextView = findViewById(R.id.ticketTextView);
        ticketTextView.setText(getResources().getString(R.string.ticketTYpe) + ticket);

        TextView quantityTextView = findViewById(R.id.quantityTextView); // New TextView for quantity
        quantityTextView.setText(getResources().getString(R.string.numberOfTickets) + quantity); // Display quantity

        TextView totalTextView = findViewById(R.id.totalTextView);
        totalTextView.setText(getResources().getString(R.string.total) + total);
    }
}
