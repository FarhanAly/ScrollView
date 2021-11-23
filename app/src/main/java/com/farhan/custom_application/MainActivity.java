package com.farhan.custom_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.lists);
        String[]name={"Farhan aly","Naeem ullah","Faheem aly","Faiizan Aly",};
        String[]subtitle={"#Born_To_Express_Not_To_Impress#","No love No crime","User is death","Typing....",};
        int[]image={R.drawable.farri,R.drawable.naeem,R.drawable.faheem,R.drawable.faizzan};

        custom_Activity adapter=new custom_Activity(this,name,subtitle,image);
        listView.setAdapter(adapter);

    }
}