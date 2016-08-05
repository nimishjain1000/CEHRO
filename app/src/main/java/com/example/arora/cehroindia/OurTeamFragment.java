package com.example.arora.cehroindia;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class OurTeamFragment extends Fragment {

    private ArrayList<Program> members = new ArrayList<Program>();
    private RecyclerAdapter adapter;

    public OurTeamFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.program_list, null);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.programList);

        members.add(new Program(R.drawable.cehro2,"MR SURJEET SINGH","Founder, CEHRO INDIA","Ever since the inception of CEHRO in 2012, there has been an exponential growth in the number of slum children who joined our centre as well as in the count"));
        members.add(new Program(R.drawable.cehro2,"MOD. MUSTAQUE SIDDIQUI","Co-Founder, CEHRO INDIA","Mod. Mustaque Siddiqui has a P.G. Diploma (Broadcast Technology) JMI and currently works as the Treasurers of CEHRO INDIA. He comes to CEHRO INDIA with 3 years experience."));
        members.add(new Program(R.drawable.cehro2,"PRADEEP KUMAR","Co-Founder","Pradeep currently serves as the Program manager of CEHRO INDIA. He is currently working at Samsung India as a Software Engineer for last 1.5 years. Pradeep is graduated from Netaji Subhash Institute of Technology"));
        members.add(new Program(R.drawable.cehro2,"SAKET KUMAR","Co-Founder","Saket kumar currently serves as secretary in CEHRO INDIA. He is graduated from MMEC with the degree in electrical engineering. He works 2 years as a project co-ordinator of S"));
        members.add(new Program(R.drawable.cehro2,"DEEPAK IYER","Marketing Head","Deepak Iyer is a business graduate and has over 10 years of work experience. He has been associated with top MNCs during this journey and currently serves as the marketing"));
        members.add(new Program(R.drawable.cehro2,"AMAY SINGH","Center Co-ordinator","Amay currently serves as the Center Co-ordinator for CEHRO INDIA. He is currently working with Jabong.com as a software development Engineer. He is graduated from Netaji Subhas Institute of Technology"));

        adapter = new RecyclerAdapter(getActivity().getApplicationContext(), members);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }




}
