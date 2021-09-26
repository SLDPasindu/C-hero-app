package com.techyfighters.chero;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private Context context;
    private ArrayList tutorial_id, tutorial_title, tutorial_data;

    CustomAdapter(Context context, ArrayList tutorial_id, ArrayList tutorial_title, ArrayList tutorial_data){

        this.context = context;
        this.tutorial_id = tutorial_id;
        this.tutorial_title = tutorial_title;
        this.tutorial_data = tutorial_data;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tutorial_id_text.setText(String.valueOf(tutorial_id.get(position)));
        holder.tutorial_title_text.setText(String.valueOf(tutorial_title.get(position)));

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tutorial_id_text, tutorial_title_text;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tutorial_id_text = itemView.findViewById((R.id.tutorial_id_text));
            tutorial_title_text = itemView.findViewById(R.id.tutorial_title_text);

        }
    }
}
