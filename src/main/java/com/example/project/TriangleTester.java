package com.example.project;

public class TriangleTester {
    public static void main(String[] args) {

        Triangle testTri = new Triangle(0, 0, 2, 4, 6, 2);
        // side lengths, just so i can go and predict perimeter, area..
        // a: 4.4, b: 4.47, c: 6.3
        System.out.println("1. Perimeter: " + testTri.perimeter());
        System.out.println("Expected: 15");

        System.out.println("2. Area: " + testTri.area());
        System.out.println("Expected: 10");

        System.out.println("3.");
        testTri.translateX(4);
        testTri.translateY(7);
        System.out.println("x: " + testTri.getx0());
        System.out.println("y: " + testTri.gety0());
        System.out.println("Expected: (4,7) since x and y were translated.");

        testTri.translateX(-3);
        testTri.translateY(-6);
        System.out.println("x: " + testTri.getx0());
        System.out.println("y: " + testTri.gety0());
        System.out.println("Expected: (1,1), this tests that the translate methods can take negative values");
        // Not much else I think I need to test.. go hog wild!

    }
}