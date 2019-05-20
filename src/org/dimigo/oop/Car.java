package org.dimigo.oop;

import java.util.*;

public class Car {

    private Car() {
    }

    private int horsePower;
    private int maxSpeed;
    private long price;
    private double fuelEfficiency;
    private String company;

    public void forward() {
        System.out.println("전진");
    }

    public void backward() {
        System.out.println("후진");
    }

    public boolean stop() {
        System.out.println("정지");
        return false;
    }

    public void turnRight(int angle) {
        System.out.println("왼쪽으로");
    }

    public void turnLeft(int angle) {
        System.out.println("오른쪽으로");
    }

}