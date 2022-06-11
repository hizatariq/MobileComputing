package com.f19.myapplication;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class sixthactivity extends AppCompatActivity {
int toss;


Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixthactivity);
        b1 = findViewById(R.id.score);//viewscore
        b2 = findViewById(R.id.back);//home
        b3 = findViewById(R.id.restart);//restart quiz
        Intent mIntent = getIntent();
        toss = mIntent.getIntExtra("bv", 0);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setText(Integer.toString(toss));


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(sixthactivity.this, mainactivity.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restart();
            }
        });

        if (savedInstanceState != null) {
            CharSequence savedText = savedInstanceState.getCharSequence(Integer.toString(toss));
            b1.setText(savedText);
        }
    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putCharSequence(Integer.toString(toss), b1.getText());
    }
        void restart(){

            Intent i = new Intent(sixthactivity.this, fifthactivity.class);
            i.putExtra("bv", 0);
            startActivity(i);
        }

}