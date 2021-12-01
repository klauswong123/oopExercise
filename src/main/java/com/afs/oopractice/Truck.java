package com.afs.oopractice;

public class Truck {
    private final String name;
    private final Integer speed;

    public Truck(String name, Integer speed){
        this.name = name;
        this.speed = speed;
    }
    public void speedUp(){
        System.out.printf("%s: speed up %d km/h%n",this.name,this.speed);
    }
}
