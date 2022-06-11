package com.f19.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import java.util.*;


import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
public class fifthactivity extends AppCompatActivity {

    TextView v1, v2;
    String a;
    ArrayList<Button> btn = new ArrayList<Button>();
    Button next, submit;
    String ans, selectedans;
    ImageView v;
    Random rand = new Random();
    ArrayList<Integer> alphagenerated = new ArrayList<Integer>();
    ArrayList<Integer> generated = new ArrayList<Integer>();
    ArrayList<String> options = new ArrayList<String>();
    int[] images = new int[]{R.drawable.aa, R.drawable.bb, R.drawable.cc, R.drawable.dd, R.drawable.ee, R.drawable.ff, R.drawable.gg, R.drawable.hh, R.drawable.ii, R.drawable.jj, R.drawable.kk, R.drawable.ll, R.drawable.mm, R.drawable.nn, R.drawable.oo, R.drawable.pp, R.drawable.qq, R.drawable.rr, R.drawable.ss, R.drawable.tt, R.drawable.uu, R.drawable.vv, R.drawable.ww, R.drawable.xx, R.drawable.yy, R.drawable.zz};
    /*ArrayList<String> q1=new ArrayList<String>();
    ArrayList<String> q2=new ArrayList<String>();
    ArrayList<String> q3=new ArrayList<String>();
    ArrayList<String> q4=new ArrayList<String>();
    ArrayList<String> q5=new ArrayList<String>();
    ArrayList<String> q6=new ArrayList<String>();
    ArrayList<String> q7=new ArrayList<String>();
    ArrayList<String> q8=new ArrayList<String>();
    ArrayList<String> q9=new ArrayList<String>();
    ArrayList<String> q10=new ArrayList<String>();*/

    HashMap<Integer, String> map = new HashMap<>();
    HashMap<Integer, Integer> question = new HashMap<>();


    int score = 0, attemptedquestion = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthactivity);
        btn.add(0, findViewById(R.id.b1));
        btn.add(1, findViewById(R.id.b2));
        btn.add(2, findViewById(R.id.b3));
        btn.add(3, findViewById(R.id.b4));
        next = findViewById(R.id.next);
        v1 = findViewById(R.id.noofquestions);
        v2 = findViewById(R.id.attemptedquestions);
        v = findViewById(R.id.image);
        Intent mIntent = getIntent();
        score = mIntent.getIntExtra("bv", 0);
        attemptedquestion = mIntent.getIntExtra("bv", 0);
        v1.setText("Total Questions :  10");

        options.add("Apple");
        options.add("Bee");
        options.add("Cupcake");
        options.add("Dinosaur");
        options.add("Elephant");
        options.add("Flower");
        options.add("Giraffe");
        options.add("Hamster");
        options.add("Igloo");
        options.add("Jug");
        options.add("Kite");
        options.add("Lion");
        options.add("Monkey");
        options.add("Nurse");
        options.add("Orange");
        options.add("Penguine");
        options.add("Queen");
        options.add("Rabbit");
        options.add("Strawberry");
        options.add("Tiger");
        options.add("Umbrella");
        options.add("Volcano");
        options.add("Watermelon");
        options.add("Xylophone");
        options.add("Yo-yo");
        options.add("Zebra");
        map.put(R.drawable.aa, "Apple");
        map.put(R.drawable.bb, "Bee");
        map.put(R.drawable.cc, "Cupcake");
        map.put(R.drawable.dd, "Dinosaur");
        map.put(R.drawable.ee, "Elephant");
        map.put(R.drawable.ff, "Flower");
        map.put(R.drawable.gg, "Giraffe");
        map.put(R.drawable.hh, "Hamster");
        map.put(R.drawable.ii, "Igloo");
        map.put(R.drawable.jj, "Jug");
        map.put(R.drawable.kk, "Kite");
        map.put(R.drawable.ll, "Lion");
        map.put(R.drawable.mm, "Monkey");
        map.put(R.drawable.nn, "Nurse");
        map.put(R.drawable.oo, "Orange");
        map.put(R.drawable.pp, "Penguine");
        map.put(R.drawable.qq, "Queen");
        map.put(R.drawable.rr, "Rabbit");
        map.put(R.drawable.ss, "Strawberry");
        map.put(R.drawable.tt, "Tiger");
        map.put(R.drawable.uu, "Umbrella");
        map.put(R.drawable.vv, "Volcano");
        map.put(R.drawable.ww, "Watermelon");
        map.put(R.drawable.xx, "Xylophone");
        map.put(R.drawable.yy, "Yo-yo");
        map.put(R.drawable.zz, "Zebra");
        question.put(0, R.drawable.ll);
        question.put(1, R.drawable.oo);
        question.put(2, R.drawable.zz);
        question.put(3, R.drawable.yy);
        question.put(4, R.drawable.cc);
        question.put(5, R.drawable.kk);
        question.put(6, R.drawable.rr);
        question.put(7, R.drawable.aa);
        question.put(8, R.drawable.dd);
        question.put(9, R.drawable.ii);



        for (int i = 0; i < 26; i++) {
            while (true) {
                int random = rand.nextInt(26);
                if (!alphagenerated.contains(random)) {

                    alphagenerated.add(random);
                    break;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            while (true) {
                int randomNum
                        = rand.nextInt(4);
                if (!generated.contains(randomNum)) {

                    generated.add(randomNum);
                    break;
                }
            }
        }

        setdata();



        btn.get(0).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){
           // btn.get(0).setBackgroundColor(Color.WHITE);
            if (btn.get(0).getText() == ans) {
                score = score + 1;
                //btn.get(0).setBackgroundColor(Color.BLUE);
            }

        }
    });
        btn.get(1).

    setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){
           // btn.get(1).setBackgroundColor(Color.WHITE);

            if (btn.get(1).getText() == ans) {
                score = score + 1;
               // btn.get(1).setBackgroundColor(Color.BLUE);
            }

        }
    });
        btn.get(2).

    setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){
            //btn.get(2).setBackgroundColor(Color.WHITE);
            if (btn.get(2).getText() == ans) {
                score = score + 1;
                //btn.get(2).setBackgroundColor(Color.BLUE);
            }

        }
    });
        btn.get(3).

    setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick (View view){
           // btn.get(3).setBackgroundColor(Color.WHITE);
            if (btn.get(3).getText() == ans) {
                score = score + 1;
                //btn.get(3).setBackgroundColor(Color.BLUE);
            }


        }
    });
        next.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){

        setdata();
            if(attemptedquestion==10){
                new AlertDialog.Builder(fifthactivity.this)
                        .setTitle("Submit Quiz")
                        .setPositiveButton("submit" ,((dialogInterface, i) -> submit()))
                        .setCancelable(false).show();

            }
    }

    });

    }

    @Override
    protected void onSaveInstanceState (Bundle outState) {
        super.onSaveInstanceState(outState);
        CharSequence userText = v2.getText();
        outState.putCharSequence("savedText", userText);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);


        CharSequence userText =
                savedInstanceState.getCharSequence("savedText");

        v2.setText(userText);
    }
     void setdata(){


  if(question.get(attemptedquestion)!=null){
       v.setImageResource(question.get(attemptedquestion));}
         a="Attempted Questions  " + attemptedquestion + "/10";
         v2.setText(a);



       ans=map.get(question.get(attemptedquestion));


            //answer should not be equal to any of the other options
            //shuffling evertime will cause to have different options with every question

        //b1==ans

                    btn.get(generated.get(0)).setText(ans);

                //b2
        if (!options.get(alphagenerated.get(1)).equals(ans)) {
            btn.get(generated.get(1)).setText(options.get(alphagenerated.get(1)));

        }
        else{
            Collections.shuffle(options);
            btn.get(generated.get(1)).setText(options.get(alphagenerated.get(1)));
        }

        //b3
        if (!options.get(alphagenerated.get(2)).equals(ans)){
            btn.get(generated.get(2)).setText(options.get(alphagenerated.get(2)));

        }
        else{
            Collections.shuffle(options);
            btn.get(generated.get(2)).setText(options.get(alphagenerated.get(2)));
        }

        //b4
        if (!options.get(alphagenerated.get(3)).equals(ans)) {
            btn.get(generated.get(3)).setText(options.get(alphagenerated.get(3)));

        }
        else{
            Collections.shuffle(options);
            btn.get(generated.get(3)).setText(options.get(alphagenerated.get(3)));
        }

         Collections.shuffle(generated);
         Collections.shuffle(alphagenerated);

       attemptedquestion++;
    }
    void submit() {


        Intent i = new Intent(fifthactivity.this, sixthactivity.class);
        i.putExtra("bv", score);
        startActivity(i);
    }

}