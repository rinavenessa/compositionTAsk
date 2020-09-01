package com.rinavenessa.room;

public class Door {
    private int width;
    private int height;
    private String material;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    public Door(int width, int height, String material) {
        this.width = width;
        this.height = height;
        this.material = material;
    }
    public void doorFunction(){
        System.out.println("the door opens and closes");
    }
}
