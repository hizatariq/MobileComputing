package com.f19.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buttonAdd,buttonDelete,buttonUpdate,buttonViewAll;
    EditText editName, editRollNumber;
    Switch switchIsActive;
    ListView listViewStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonViewAll = findViewById(R.id.buttonViewAll);
        editName = findViewById(R.id.editTextName);
        editRollNumber = findViewById(R.id.editTextRollNumber);
        switchIsActive = findViewById(R.id.switchStudent);
        listViewStudent = findViewById(R.id.listViewStudent);
        buttonDelete=findViewById(R.id.buttonDel);
        buttonUpdate=findViewById(R.id.buttonupdate);
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper  = new DBHelper(MainActivity.this);
                dbHelper.deleteStudent(editName.getText().toString());


            }
        });
        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBHelper dbHelper  = new DBHelper(MainActivity.this);

                dbHelper.update(editName.getText().toString(),Integer.parseInt(editRollNumber.getText().toString()), switchIsActive.isChecked());
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            StudentModel studentModel;

            @Override
            public void onClick(View v) {
                try {
                    studentModel = new StudentModel(editName.getText().toString(), Integer.parseInt(editRollNumber.getText().toString()), switchIsActive.isChecked());
                    //Toast.makeText(MainActivity.this, studentModel.toString(), Toast.LENGTH_SHORT).show();
                }
                catch (Exception e){
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
                DBHelper dbHelper  = new DBHelper(MainActivity.this);
                dbHelper.addStudent(studentModel);
            }
        });

        buttonViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DBHelper dbHelper = new DBHelper(MainActivity.this);
                ArrayList<StudentModel> list = dbHelper.getAllStudents();
                /*ArrayAdapter arrayAdapter = new ArrayAdapter<StudentModel>//using list instead of array and storing all enteries(obtained from dbHelper) in that list

                        (MainActivity.this, android.R.layout.simple_list_item_1,list);*/

                CustomAdapter arrayAdapter=new CustomAdapter(MainActivity.this,list);
                listViewStudent.setAdapter(arrayAdapter);

            }
        });

    }
}