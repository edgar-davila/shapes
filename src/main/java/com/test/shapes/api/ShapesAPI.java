package com.test.shapes.api;

import com.test.shapes.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Edgar on 6/22/2016.
 */
@Controller
public class ShapesAPI {
    private ShapeFactory factory = new ShapeFactory();

    @ResponseBody
    @RequestMapping(value = "/shape", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Shape> getShape(@RequestBody String type) {
        return ResponseEntity.ok(factory.getShape(type));
    }

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Shape>> runTest() {
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

        return new ResponseEntity<List<Shape>>(shapes, HttpStatus.OK);
    }
}
