package com.example.arora.cehroindia;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
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

    private ArrayList<Program> programs = new ArrayList<Program>();
   private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.program_list);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.programList);



        programs.add(new Program(R.drawable.cehro2,"Educating India","Teaching according to NCERT syllabi and providing academic help."));
        programs.add(new Program(R.drawable.cehro2,"Padho-Padhao Programme","Encouraging volunteerism and improving teaching skills by letting senior students teach the junior ones."));
        programs.add(new Program(R.drawable.cehro2,"Livelihood Programme","Increasing employability by teaching spoken English and basic computers."));
        programs.add(new Program(R.drawable.cehro2,"Health And Hygeine Programme","Educating slum children about health and promoting hygienic practices."));
        programs.add(new Program(R.drawable.cehro2,"Target Twenty 20","Providing basic knowledge of computers."));
        programs.add(new Program(R.drawable.cehro2,"Artistic India","Honing various skills such as dancing, painting etc."));

        adapter = new RecyclerAdapter(getApplicationContext(),programs);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));









}
}
