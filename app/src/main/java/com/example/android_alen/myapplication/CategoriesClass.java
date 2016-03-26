package com.example.android_alen.myapplication;

/**
 * Created by Android-Alen on 25-Mar-16.
 */
public class CategoriesClass {

    String title;
    String description;
    String feed_url;
    String sd_img;
    String feed_type;

    public String getFeed_type() {
        return feed_type;
    }

    public void setFeed_type(String feed_type) {
        this.feed_type = feed_type;
    }

    public String getSd_img() {
        return sd_img;
    }

    public void setSd_img(String sd_img) {
        this.sd_img = sd_img;
    }

    public String getFeed_url() {
        return feed_url;
    }

    public void setFeed_url(String feed_url) {
        this.feed_url = feed_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


 }
