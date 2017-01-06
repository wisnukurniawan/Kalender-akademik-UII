package com.wisnukrn_.kalenderakademikuii;

/**
 * Created by private on 21/12/2016.
 */

public class Fakultas {
    private String name;
    private int image;

    public Fakultas(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
