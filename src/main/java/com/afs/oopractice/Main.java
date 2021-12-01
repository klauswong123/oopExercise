package com.afs.oopractice;

public class Main {
    public static void main(String[] args) {
        GasolineEngine gasolineEngine = new GasolineEngine();
        Car car = new Car("BMW", gasolineEngine);
        car.speedUp();
        EletricEngine eletricEngine = new EletricEngine();
        Car car1 = new Car("BMW", eletricEngine);
        car1.speedUp();
    }
}
