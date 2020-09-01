package com.rinavenessa.room;

public class Room {
    private Walls walls;
    private Door door;
    private Windows windows;
    private Bed bed;

    public Room(Walls walls, Door door, Windows windows, Bed bed) {
        this.walls = walls;
        this.door = door;
        this.windows = windows;
        this.bed = bed;
    }

    public Walls getWalls() {
        return walls;
    }

    public Door getDoor() {
        return door;
    }

    public Windows getWindows() {
        return windows;
    }

    public Bed getBed() {
        return bed;
    }

    public static void main(String[] args){
        Walls walls = new Walls(700,700,350);
        Door door =new Door(70,200,"mahogany wood");
        Panels panels =new Panels(100,50);
        Windows windows= new Windows(panels,4);
        Bed bed= new Bed("queen size bed",50);
        Room room = new Room(walls,door,windows,bed);

        bed.pillows();
        System.out.println(bed.getSize());
        walls.floor();
        walls.paint();
    }
}
