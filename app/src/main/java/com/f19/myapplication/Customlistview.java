package com.f19.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

    public class Customlistview extends BaseAdapter {
        Context context;
        String names[];
        String alphabets[];
        int pictures[];
        LayoutInflater inf;
        public Customlistview(Context application,String[] n,String[] a,int[] f)
        {   this.context=application;
            this.names=n;
            this.alphabets=a;
            this.pictures=f;
            inf=(LayoutInflater.from(application)) ;

        }
        public int getCount(){
            return names.length;
        }
        public Object getItem(int i){
            return null;
        }
        public long getItemId(int i){
            return 0;
        }
        public View getView(int i, View v, ViewGroup vg){
            v=inf.inflate(R.layout.listview,null);
            TextView text =v.findViewById(R.id.text);
            TextView alpha=v.findViewById(R.id.alpha);
            ImageView pic=v.findViewById(R.id.image);
            pic.setImageResource(pictures[i]);
            text.setText(names[i]);
            alpha.setText(alphabets[i]);
            return v;
        }
    }

