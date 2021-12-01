package com.afs.oopractice;

public class Car {

    private String name;
    private Integer speed;

    public Car(String name, Integer speed){
        this.name = name;
        this.speed = speed;
    }
    public void speedUp(){
        System.out.printf("%s: speed up %d km/h%n",this.name,this.speed);
    }
}
