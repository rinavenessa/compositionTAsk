package com.rinavenessa.car;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int doors;

    public Car(String name,int cylinders, int doors) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.doors = doors;
    }
    public String getName(){
        return  name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getDoors() {
        return doors;
    }

    public String startEngine() {
        return "start ignition ";
    }

    public String accelerate() {
        return "change gear";
    }

    public String brake() {
        return "push the brake pedal";
    }
}
    class Bugatti extends Car{
           public Bugatti(String name, int cylinders, int doors) {
            super(name,  cylinders, doors);
        }
        @Override
        public String accelerate() {
            return "its the fastest car known @ 380 km/hr";
        }
    }
    class Maserati extends Car {
        public Maserati(String name, int cylinders, int doors) {
            super(name,  cylinders, doors);
        }
    }
    class Mustang extends Car{
        public Mustang(String name, int cylinders, int doors) {
            super(name,  cylinders, doors);
            }
}

public class Main {
    public static void main(String[] args) {
        Bugatti bugatti = new Bugatti("Divo",6,2);
        Maserati maserati = new Maserati("levante",4,4);
        System.out.println("Car model: "+bugatti.getName());
        System.out.println("Number of cylinders: "+bugatti.getCylinders());
        System.out.println("Number of doors: "+bugatti.getDoors());
        System.out.println(bugatti.accelerate());
        System.out.println(maserati.accelerate());

    }

}
