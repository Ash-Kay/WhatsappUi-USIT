package com.example.ashish.whatsappui;

import android.widget.ImageView;
import android.widget.TextView;

public class Profile {

    String name;
    String time;
    String message;
    int image;

    public Profile(String name, String time, String message, int image) {
        this.name = name;
        this.time = time;
        this.message = message;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
