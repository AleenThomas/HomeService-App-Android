package com.example.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    private int[] serviceImages = {
            R.drawable.plumbing,
            R.drawable.electrician,
            R.drawable.carpentry,
            R.drawable.car,
            R.drawable.gardening,
            R.drawable.painting,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        GridView servicesGrid = findViewById(R.id.services_grid);
        ServiceImageAdapter adapter = new ServiceImageAdapter(this, serviceImages);
        servicesGrid.setAdapter(adapter);

        servicesGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent intent = new Intent(Home.this, Details.class);
                intent.putExtra("image_id", serviceImages[position]);
                startActivity(intent);
            }
        });
    }
}
