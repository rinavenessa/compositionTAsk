package com.rinavenessa.room;

public class Walls {
    private int length;
    private int width;
    private int height;

    public Walls(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public void floor(){
        System.out.println("the floor is made of wooden tiles");
    }

    public void paint() {
        System.out.println("the walls are colored grey");
    }
}
