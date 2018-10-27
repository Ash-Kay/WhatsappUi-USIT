package com.example.ashish.whatsappui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    public ArrayList<Profile> arrayList;
    private Context context;

    public RecyclerAdapter(Context context, ArrayList<Profile> newsArticleArrayList) {
        this.arrayList = newsArticleArrayList;
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.custom_row,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        final Profile array=arrayList.get(i);
        viewHolder.message.setText(array.getMessage());
        viewHolder.time.setText(array.getTime());
        viewHolder.name.setText(array.getName());
        //viewHolder.img.setBackgroundResource(array.getImage());
        viewHolder.img.setImageResource(array.getImage());

    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }


}
