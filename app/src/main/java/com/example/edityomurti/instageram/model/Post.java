package com.example.edityomurti.instageram.model;

import android.graphics.drawable.Drawable;

/**
 * Created by edityomurti on 19/04/18.
 */

public class Post {
    private int avatar;
    private String username;
    private int image;
    private int likes;
    private String desc;

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
