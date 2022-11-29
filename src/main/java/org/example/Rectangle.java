package org.example;

import java.util.HashSet;
import java.util.Set;

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
        if (!figureExistence()) throw new NullPointerException("Rectangle can't be created");
    }

    public int getPerimeter() {
        return sideA + sideB + sideC + sideD;
    }

    public int getSquare() {
        return Math.min(sideA, Math.min(sideB, Math.min(sideC, sideD))) *
                Math.max(sideA, Math.max(sideB, Math.max(sideC, sideD)));
    }

    private boolean figureExistence() {
        HashSet <Integer> set = new HashSet<>();
        set.add(sideA);
        set.add(sideB);
        set.add(sideC);
        set.add(sideD);
        return set.size() == 1 || set.size() == 2;
    }
}
