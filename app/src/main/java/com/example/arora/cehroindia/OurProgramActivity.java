package com.example.arora.cehroindia;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class OurProgramActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.program_list);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.programList);
         ArrayList<Program> programs = new ArrayList<Program>();


        programs.add(new Program(R.drawable.cehro2,"prog1","ghkjh"));
        programs.add(new Program(R.drawable.cehro2,"prog2","jbsjdbvdj"));
        programs.add(new Program(R.drawable.cehro2,"prog3","hjfhjhgg"));
        programs.add(new Program(R.drawable.cehro2,"prog4","hdhfhvdj"));
        programs.add(new Program(R.drawable.cehro2,"prog5","hdshfhfhf"));
        programs.add(new Program(R.drawable.cehro2,"prog6","hchfhgdjhgjn"));

       RecyclerAdapter adapter = new RecyclerAdapter(programs);
        recyclerView.setAdapter(adapter);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));









    }






}
