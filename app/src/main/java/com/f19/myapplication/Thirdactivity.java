package com.f19.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Thirdactivity extends AppCompatActivity {
    Button l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        l1 = findViewById(R.id.start);

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Thirdactivity.this, fifthactivity.class);
                startActivity(i);
            }

        });

    }
}

