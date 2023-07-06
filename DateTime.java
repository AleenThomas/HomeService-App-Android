package com.example.home;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DateTime extends AppCompatActivity {

    private Button bookButton;
    private EditText dateEditText;
    private EditText timeEditText;
    private EditText locationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_time);

        // Get references to UI elements
        bookButton = findViewById(R.id.book_button);
        dateEditText = findViewById(R.id.date_edittext);
        timeEditText = findViewById(R.id.time_edittext);
        locationEditText = findViewById(R.id.location_edittext);

        // Set default values for the time picker
        timeEditText.setText("09:00");

        // Set listener for the book button
        bookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the selected date, time, and location
                String selectedDate = dateEditText.getText().toString();
                String selectedTime = timeEditText.getText().toString();
                String selectedLocation = locationEditText.getText().toString();

                // Display a toast message with the selected date, time, and location
                String message = "Booking confirmed for " + selectedDate + " at " + selectedTime + " in " + selectedLocation;
                Toast.makeText(DateTime.this, message, Toast.LENGTH_LONG).show();
            }
        });
    }
}
