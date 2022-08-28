package com.f19.crud;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import java.lang.*;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter{
    Context context;
    ArrayList<StudentModel> sm;

    public CustomAdapter(Context context, ArrayList<StudentModel> StudentArrayList){
        this.context=context;
      sm=StudentArrayList;

    }




    @Override
    public int getCount() {
        return this.sm.size();
    }
   public Object getItem(int position){
        return sm.get(position);
   }



    @Override
    public long getItemId(int i) {
        return i;
    }

    @NonNull
    @Override
    public View getView(int i, @Nullable View v, @NonNull ViewGroup parent) {



        if (v == null) {

           // LayoutInflater inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            //v=inflater.inflate(R.layout.list_items,null);
            v=LayoutInflater.from(context).inflate(R.layout.list_items,parent,false);

        }

        TextView name =(TextView) v.findViewById(R.id.studentname);
        TextView roll =(TextView) v.findViewById(R.id.studentroll);

        TextView enroll =(TextView) (v.findViewById(R.id.studentenroll));
        StudentModel student=sm.get(i);

       name.setText(student.getName());
        roll.setText(String.valueOf(student.getRollNmber()));
        enroll.setText(String.valueOf(student.isEnroll()));

        return v;
    }
}










