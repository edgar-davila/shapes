package com.test.shapes.model;

/**
 * Created by Edgar on 6/22/2016.
 */
public class Triangle extends Shape {

    private double height;
    private double base;

    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public Double getSurface() {
        return (height * base) / 2;
    }

    public Double getBase() {
        return base;
    }

    public Double getHeight() {
        return height;
    }
}
