package org.example;

import java.util.HashSet;

public class Triangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        if (!figureExistence()) throw new NullPointerException("Figure can't be created");
    }

    public int getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getSquare() {
        double p = getPerimeter() / 2.0;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    private boolean figureExistence() {
        return sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA;
    }
}
