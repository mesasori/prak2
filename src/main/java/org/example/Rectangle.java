package org.example;

public class Rectangle {
    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public int getPerimeter() {
        return sideA + sideB + sideC + sideD;
    }

    public int getSquare() {
        return Math.min(sideA, Math.min(sideB, Math.min(sideC, sideD))) *
                Math.max(sideA, Math.max(sideB, Math.max(sideC, sideD)));
    }
}
