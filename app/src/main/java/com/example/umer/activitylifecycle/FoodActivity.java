package com.example.umer.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOODNO = "foodno";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodno = (int) getIntent().getExtras().get(EXTRA_FOODNO);

        food Food = food.foods[foodno];

        TextView name = findViewById(R.id.name);
        TextView desc = findViewById(R.id.desc);
        ImageView foodImage = findViewById(R.id.foodimage);

        name.setText(Food.getName());
        desc.setText(Food.getDescription());
        foodImage.setImageResource(Food.getImageID());

    }
}
