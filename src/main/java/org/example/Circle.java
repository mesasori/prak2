package org.example;

public class Circle {
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getSquare() {
        return Math.PI * radius * radius;
    }
}
