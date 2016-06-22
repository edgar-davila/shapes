package com.test.shapes.model;

/**
 * Created by Edgar on 6/22/2016.
 */
public class Triangle extends Shape {

    private double height;
    private double base;

    Triangle() {
    }

    public Double getSurface() {
        return (height * base) / 2;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
