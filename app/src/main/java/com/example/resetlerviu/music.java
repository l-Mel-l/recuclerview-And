package com.example.resetlerviu;

public class music {
    private String name;
    private String singer;
    private int image;

    public music(String name, String singer, int image) {
        this.name = name;
        this.singer = singer;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
