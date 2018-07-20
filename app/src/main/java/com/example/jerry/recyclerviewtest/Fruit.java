package com.example.jerry.recyclerviewtest;

import android.os.FileUriExposedException;

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
;