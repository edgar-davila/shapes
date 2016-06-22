package com.test.shapes.model;

/**
 * Created by Edgar on 6/22/2016.
 */
public class Square extends Shape {

    private double height;

    Square() {
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

    public void setHeight(double height) {
        this.height = height;
    }
}
