package com.example.ashish.whatsappui;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ViewHolder extends RecyclerView.ViewHolder {

    CircleImageView img;
    TextView message;
    TextView time;
    TextView name;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.imageView);
        message = itemView.findViewById(R.id.message);
        time = itemView.findViewById(R.id.time);
        name = itemView.findViewById(R.id.name);

    }



}
