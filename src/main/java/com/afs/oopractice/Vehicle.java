package com.afs.oopractice;

public class Vehicle {
    private final String name;
    private final Integer speed;
    public Vehicle(String name, Integer speed){
        this.name = name;
        this.speed = speed;
    }
    public void speedUp(){
        System.out.printf("%s: speed up %d km/h%n",this.name,this.speed);
    }
}
