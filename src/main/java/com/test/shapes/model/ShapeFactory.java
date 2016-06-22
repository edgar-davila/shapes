package com.test.shapes.model;

/**
 * Created by Edgar on 6/22/2016.
 */
public class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) return null;

        switch (type.toUpperCase()) {
            case "TRIANGLE":
                return new Triangle();
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            default:
                return null;
        }
    }
}
