package com.f19.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class fourthactivity extends AppCompatActivity {
String toss;

private ImageView v;


    String[] alpha={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    int[] images =  new int[]{R.drawable.a,R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j, R.drawable.k , R.drawable.l , R.drawable.m , R.drawable.n, R.drawable.o , R.drawable.p, R.drawable.q , R.drawable.r , R.drawable.s, R.drawable.t , R.drawable.u , R.drawable.v , R.drawable.w , R.drawable.x, R.drawable.y, R.drawable.z };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthactivity);

        v = (ImageView)findViewById(R.id.iv);

        toss = getIntent() != null ? getIntent().getExtras().getString("bv",""):"";


           if (toss.equals("A")){
               v.setImageResource(images[0]);
           }else if(toss.equals("B"))
           {  v.setImageResource(images[1]);
           }else if(toss.equals("C"))
           {
               v.setImageResource(images[2]);
           }else if(toss.equals("D"))
           {
               v.setImageResource(images[3]);
           }else if(toss.equals("E"))
           {
               v.setImageResource(images[4]);
           }else if(toss.equals("F"))
           {
               v.setImageResource(images[5]);
           }else if(toss.equals("G"))
           {
               v.setImageResource(images[6]);
           }else if(toss.equals("H"))
           {
               v.setImageResource(images[7]);
           }else if(toss.equals("I"))
           {
               v.setImageResource(images[8]);
           }else if(toss.equals("J"))
           {
               v.setImageResource(images[9]);
           }else if(toss.equals("K"))
           {
               v.setImageResource(images[10]);
           }else if(toss.equals("L"))
           {
               v.setImageResource(images[11]);
           }else if(toss.equals("M"))
           {
               v.setImageResource(images[12]);
           }else if(toss.equals("N"))
           {
               v.setImageResource(images[13]);
           }else if(toss.equals("O"))
           {
               v.setImageResource(images[14]);
           }else if(toss.equals("P"))
           {
               v.setImageResource(images[15]);
           }else if(toss.equals("Q"))
           {
               v.setImageResource(images[16]);
           }else if(toss.equals("R"))
           {
               v.setImageResource(images[17]);
           }else if(toss.equals("S"))
           {
               v.setImageResource(images[18]);
           }else if(toss.equals("T"))
           {
               v.setImageResource(images[19]);
           }else if(toss.equals("U"))
           {
               v.setImageResource(images[20]);
           }else if(toss.equals("V"))
           {
               v.setImageResource(images[21]);
           }else if(toss.equals("W"))
           {
               v.setImageResource(images[22]);
           }else if(toss.equals("X"))
           {
               v.setImageResource(images[23]);
           }else if(toss.equals("Y"))
           {
               v.setImageResource(images[24]);
           }else if(toss.equals("Z"))
           {
               v.setImageResource(images[25]);
           }






    }



}