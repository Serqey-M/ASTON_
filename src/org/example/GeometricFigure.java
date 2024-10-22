package org.example;

public interface GeometricFigure {

    default double perimeter(int[] array) {
        int perimeter = 0;
        for (int j : array) {
            perimeter += j;
        }
        return perimeter;
    }

    double area();

    void print();

}