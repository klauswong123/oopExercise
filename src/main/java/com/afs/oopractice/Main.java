package com.afs.oopractice;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW",30);
        car.speedUp();
        Truck truck = new Truck("Benz", 10);
        truck.speedUp();
    }
}
