package com.test.shapes.model;

/**
 * Created by Edgar on 6/22/2016.
 */
public class Square extends Shape {

    private double height;

    Square(double height) {
        this.height = height;
    }

    public Double getSurface() {
        return height * height;
    }

    public Double getBase() {
        return height;
    }

    public Double getHeight() {
        return height;
    }
}
