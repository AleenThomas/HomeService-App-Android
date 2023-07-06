package com.example.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.home.R;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        ImageView serviceImage = findViewById(R.id.service_image);
        TextView serviceName = findViewById(R.id.service_name);
        TextView serviceDetails = findViewById(R.id.service_details);
        Button bookNowButton = findViewById(R.id.book_button);
        bookNowButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create a new intent to start the next activity
                Intent intent = new Intent(Details.this, DateTime.class);

                // Add any extra data that you want to pass to the next activity
                intent.putExtra("service_name", serviceName.getText().toString());

                // Start the next activity
                startActivity(intent);
            }
        });

        // Get the image ID from the intent
        int imageId = getIntent().getIntExtra("image_id", 0);

        // Set the image for the service
        serviceImage.setImageResource(imageId);

        // Set the name and details for the service
        switch (imageId) {
            case R.drawable.plumbing:
                serviceName.setText(R.string.plumbing_service);
                serviceDetails.setText(R.string.plumbing_service_details);
                break;
            case R.drawable.electrician:
                serviceName.setText(R.string.electrician_service);
                serviceDetails.setText(R.string.electrician_service_details);
                break;
            case R.drawable.carpentry:
                serviceName.setText(R.string.carpentry_service);
                serviceDetails.setText(R.string.carpentry_service_details);
                break;
            case R.drawable.car:
                serviceName.setText(R.string.car_service);
                serviceDetails.setText(R.string.car_service_details);
                break;
            case R.drawable.gardening:
                serviceName.setText(R.string.gardening_service);
                serviceDetails.setText(R.string.gardening_service_details);
                break;
            case R.drawable.painting:
                serviceName.setText(R.string.painting_service);
                serviceDetails.setText(R.string.painting_service_details);
                break;
        }
    }
}
