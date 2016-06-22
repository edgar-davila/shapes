package com.test.shapes;

import com.test.shapes.model.*;

import java.util.ArrayList;

/**
 * Created by Edgar on 6/22/2016.
 */
public class App {
    public static void main(String[] args) throws Exception {
        ShapeFactory factory = new ShapeFactory();
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Shape s1 = factory.getShape("ciRCle");
        if (s1 instanceof Circle) {
            Circle c = (Circle) s1;
            c.setRadius(5);
        }
        shapes.add(s1);

        Shape s2 = factory.getShape("triangle");
        if (s2 instanceof Triangle) {
            Triangle t = (Triangle) s2;
            t.setBase(3);
            t.setHeight(5);
        }
        shapes.add(s2);

        Shape s3 = factory.getShape("SQUARE");
        if (s3 instanceof Square) {
            Square sq = (Square) s3;
            sq.setHeight(4);
        }
        shapes.add(s3);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
