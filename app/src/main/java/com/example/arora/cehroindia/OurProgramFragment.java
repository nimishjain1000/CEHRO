package com.example.arora.cehroindia;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by mac on 27/07/16.
 */

public class OurProgramFragment extends Fragment {
    private ArrayList<Program> programs = new ArrayList<Program>();
    private RecyclerAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.program_list, null);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.programList);

        programs.add(new Program(R.drawable.educat_final, "Educating India", "Teaching according to NCERT syllabi and providing academic help."));
        programs.add(new Program(R.drawable.pado_final, "Padho-Padhao Programme", "Encouraging volunteerism and improving teaching skills by letting senior students teach the junior ones."));
        programs.add(new Program(R.drawable.live_final, "Livelihood Programme", "Increasing employability by teaching spoken English and basic computers."));
        programs.add(new Program(R.drawable.health_final, "Health And Hygeine Programme", "Educating slum children about health and promoting hygienic practices."));
        programs.add(new Program(R.drawable.tar_final, "Target Twenty 20", "Providing basic knowledge of computers."));
        programs.add(new Program(R.drawable.art_final, "Artistic India", "Honing various skills such as dancing, painting etc."));

        adapter = new RecyclerAdapter(getActivity().getApplicationContext(), programs);
        recyclerView.setAdapter(adapter);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

}
