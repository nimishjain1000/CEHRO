package com.example.arora.cehroindia;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.media.tv.TvContract;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.arora.cehroindia.EducatingIndiaProg;
import com.example.arora.cehroindia.PadhoPadhaoProgramActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 20/07/16.
 */

public class
RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private static final String TAG = "ContactsRecyclerAdapter";

    private ArrayList<Program> mPrograms = new ArrayList<Program>();
    private Context mContext;
    public static CardView cardView;
    public static int position;
    public String currentTitle;


    public RecyclerAdapter(Context context, ArrayList<Program> programs) {
        this.mContext = context;
        mPrograms = programs;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View programView = inflater.inflate(R.layout.program_item, parent, false);
        return new ViewHolder(programView);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Program program = mPrograms.get(position);

        TextView title = holder.titleTextView;
        ImageView programImage = holder.imageView;
        TextView description = holder.descriptionTextView;
        holder.currentProgram = program;

        currentTitle = program.getTitle();
        title.setText(program.getTitle());
        description.setText(program.getDescription());
        Glide.with(programImage.getContext())
                .load(program.getimageResourceId())
                .fitCenter()
                .into(programImage);


    }

    @Override
    public int getItemCount() {
        return mPrograms.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView titleTextView;
        public TextView descriptionTextView;
        public ImageView imageView;
        public Program currentProgram;


        public ViewHolder(final View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.programItem);
            titleTextView = (TextView) itemView.findViewById(R.id.program_title);
            imageView = (ImageView) itemView.findViewById(R.id.program_image);
            descriptionTextView = (TextView) itemView.findViewById(R.id.program_description);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   final  Intent intent;



                    switch (currentProgram.getTitle()) {
                        case "Educating India":
                            intent = new Intent(v.getContext(), EducatingIndiaProg.class);
                            v.getContext().startActivity(intent);
                            break;

                        case "Padho-Padhao Programme":
                           intent = new Intent(v.getContext(), PadhoPadhaoProgramActivity.class);
                            v.getContext().startActivity(intent);
                            break;

                        case "Livelihood Programme":
                            intent = new Intent(v.getContext(), LivelihoodProgActivity.class);
                            v.getContext().startActivity(intent);
                            break;

                        case "Health And Hygeine Programme":
                            intent = new Intent(v.getContext(), TargetTwentyProgActivity.class);
                            v.getContext().startActivity(intent);
                            break;

                        case "Target Twenty 20":
                            intent = new Intent(v.getContext(), HealthProgActivity.class);
                            v.getContext().startActivity(intent);
                            break;

                        case "Artistic India":
                            intent = new Intent(v.getContext(), ArtisticIndiaActivity.class);
                            v.getContext().startActivity(intent);
                            break;



                    }
                }
            });

        }


    }


}
