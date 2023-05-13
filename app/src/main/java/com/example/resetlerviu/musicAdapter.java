package com.example.resetlerviu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class musicAdapter extends RecyclerView.Adapter<musicAdapter.ViewHolder> {
    private final List<music> listOfMusic;
    private final Context context;

    public musicAdapter(Context context,List<music> listOfMusic) {
        this.context = context;
        this.listOfMusic = listOfMusic;
    }

    @NonNull
    @Override
    public musicAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = (LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent, false));
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull musicAdapter.ViewHolder holder, int position) {
        music music = listOfMusic.get(position);
        holder.name.setText(music.getName());
        holder.singer.setText(music.getSinger());
        holder.image.setImageResource(music.getImage());
    }

    @Override
    public int getItemCount() {

        return listOfMusic.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView image;
        final TextView name,singer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            singer = itemView.findViewById(R.id.singer);
        }
    }
}

