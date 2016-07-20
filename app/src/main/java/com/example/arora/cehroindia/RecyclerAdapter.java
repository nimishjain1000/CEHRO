package com.example.arora.cehroindia;

import android.content.ClipData;
import android.content.Context;
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

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mac on 20/07/16.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private static final String TAG = "ContactsRecyclerAdapter";

    private ArrayList<Program> mPrograms = new ArrayList<Program>();
    private String[] eventName;
    private String[] eventBrief;
    private OnItemClickListener listener;

    public RecyclerAdapter(ArrayList<Program> programs) {
        mPrograms = programs;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
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

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView titleTextView;
        public TextView descriptionTextView;
        public ImageView imageView;
        public Program currentProgram;
        public CardView cardView;
        private OnItemClickListener listener;

        public ViewHolder(final View itemView) {
            super(itemView);

            titleTextView = (TextView) itemView.findViewById(R.id.program_title);
            imageView = (ImageView) itemView.findViewById(R.id.program_image);
            descriptionTextView = (TextView) itemView.findViewById(R.id.program_description);
            cardView  = (CardView) itemView.findViewById(R.id.programItem) ;

            cardView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Toast.makeText(itemView.getContext(),currentProgram.getTitle(),Toast.LENGTH_LONG).show();
                    if(listener!=null)
                        listener.onItemClick(titleTextView.getText().toString(),descriptionTextView.getText().toString());

                }
            });
        }


}    public RecyclerAdapter(String[] eventName, String[] eventBrief) {
        this.eventName = eventName;
        this.eventBrief = eventBrief;

    }


    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener = listener;
    }

    public interface OnItemClickListener{
        public void onItemClick(String textName, String textViewBrief);
    }
}
