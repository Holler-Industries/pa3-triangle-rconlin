package com.example.project;
import java.lang.Math;

public class Triangle {
    private double x0;
    private double y0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    /*  declares 6 instance variables, respective to the three end points of a triangle
    (x0, y0), (x1, y1) and (x2, y2) */

    public Triangle() {
        x0 = 0;
        y0 = 0;
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
    } // constructor for a triangle with no parameters

    public Triangle(double x0, double y0, double x1, double y1, double x2, double y2) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    // constructor for a triangle with six double parameters
    }

    public double perimeter() {
        double distance1 = Math.pow(x1-x0,2)+Math.pow(y1-y0,2);
        distance1 = Math.sqrt(distance1);

        double distance2 = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        distance2 = Math.sqrt(distance2);

        double distance3 = Math.pow(x2-x0,2)+Math.pow(y2-y0,2);
        distance3 = Math.sqrt(distance3);

        double p = distance1 + distance2 + distance3;
        return p;
    }

    public double area() {
        double distance1 = Math.pow(x1-x0,2)+Math.pow(y1-y0,2);
        distance1 = Math.sqrt(distance1);

        double distance2 = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        distance2 = Math.sqrt(distance2);

        double distance3 = Math.pow(x2-x0,2)+Math.pow(y2-y0,2);
        distance3 = Math.sqrt(distance3);
        // calculating distance.. again

        double s = (distance1 + distance2 + distance3)/2; // semi-perimeter calculation
        double a = (s * (s - distance1)) * (s - distance2) * (s - distance3);
        a = Math.sqrt(a); // end heron's formula, calculated area
        return a;
    }

    public void translateX(double hozTrans) {
        x0 = x0 + hozTrans;
        x1 = x1 + hozTrans;
        x2 = x2 + hozTrans;
        // horizontal transformation affects only the x values of this triangle
    }

    public void translateY(double vertTrans) {
        y0 = y0 + vertTrans;
        y1 = y1 + vertTrans;
        y2 = y2 + vertTrans;
    } // vertical transformation affects only the y values of this triangle

    // DO NOT DELETE THESE!
    // R: ok :D
    public double getx0() {
        return x0;
    }
    public double gety0() {
        return y0;
    }
    public double getx1() {
        return x1;
    }
    public double gety1() {
        return y1;
    }
    public double getx2() {
        return x2;
    }
    public double gety2() {
        return y2;
    }
}
