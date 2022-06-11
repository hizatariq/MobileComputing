package com.f19.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class seventhactivity extends AppCompatActivity {
    ListView ls;
    String alphabets[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    String names[]={"Apple","Bee","Cupcake","Dinosaur","Elephant","Flower","Giraffe","Hamster","Igloo","Jug","Kite","Lion","Monkey","Nurse","Orange","Penguine","Queen","Rabbit","Strawberry","Tiger","Umbrella","Volcano","Watermelon","Xylophone","Yo-yo","Zebra"};
    int drawables[]={R.drawable.aa,R.drawable.bb,R.drawable.cc,R.drawable.dd,R.drawable.ee,R.drawable.ff,R.drawable.gg,R.drawable.hh,R.drawable.ii,R.drawable.jj,R.drawable.kk,R.drawable.ll,R.drawable.mm,R.drawable.nn,R.drawable.oo,R.drawable.pp,R.drawable.qq,R.drawable.rr,R.drawable.ss,R.drawable.tt,R.drawable.uu,R.drawable.vv,R.drawable.ww,R.drawable.xx,R.drawable.yy,R.drawable.zz};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventhactivity);
        ls=findViewById(R.id.listview);
        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.listview,R.id.text,array);
        //

        Customlistview adapter=new Customlistview(getApplicationContext(),names,alphabets,drawables);
        ls.setAdapter(adapter);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Clicked on " +alphabets[i],Toast.LENGTH_LONG).show();

            }
        });
    }
}