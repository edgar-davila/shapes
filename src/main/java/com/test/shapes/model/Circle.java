package com.test.shapes.model;

/**
 * Created by Edgar on 6/22/2016.
 */
public class Circle extends Shape {

    private double radius;

    Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Double getSurface() {
        return radius * radius * Math.PI;
    }

    public Double getDiameter() {
        return radius * 2;
    }
}
