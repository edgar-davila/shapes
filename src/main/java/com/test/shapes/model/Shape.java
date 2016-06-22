package com.test.shapes.model;

/**
 * Created by Edgar on 6/22/2016.
 */
public abstract class Shape implements Measurable {
    public Double getBase() {
        return null;
    }

    public Double getDiameter() {
        return null;
    }

    public Double getHeight() {
        return null;
    }

    public Double getSurface() {
        return null;
    }

    @Override
    public String toString() {
        return "-----------------------\n" +
                "Diameter: " + getDiameter() + "\n" +
                "Height: " + getHeight() + "\n" +
                "Base: " + getBase() + "\n" +
                "Surface: " + getSurface() + "\n";
    }
}
