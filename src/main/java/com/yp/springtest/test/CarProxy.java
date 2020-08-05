package com.yp.springtest.test;

public class CarProxy implements Car {
    private Car car;

    public CarProxy(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        System.out.println("starting......");
        this.car.drive();
        System.out.println("stop......");
    }
}
