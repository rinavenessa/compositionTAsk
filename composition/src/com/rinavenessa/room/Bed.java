package com.rinavenessa.room;

public class Bed {

    private String size;
    private int height;

    public Bed(String size, int height) {
        this.size = size;
        this.height = height;
    }

    public String getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }

    public void pillows(){
        System.out.println("there are 8 pillows on the bed ");
    }

}
