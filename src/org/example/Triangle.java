package org.example;

public class Triangle implements GeometricFigure {
    public String backgroundColor;
    public String borderColor;
    public int a;
    public int b;
    public int c;
    public int[] array = new int[3];

    public Triangle(int sideA, int sideB, int sideC, String backgroundColor, String borderColor) {
        this.a = sideA;
        this.b = sideB;
        this.c = sideC;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.array[0] = sideA;
        this.array[1] = sideB;
        this.array[2] = sideC;
    }

    @Override
    public double area() {
        double p = perimeter(array) / 2;
        return Math.pow((p*(p-a)*(p-b)*(p-c)), 0.5);
    }

    @Override
    public void print() {
        System.out.println("Площядь треугольника: " + area() + ", периментр: " + perimeter(array) + ", цвет заливки: " + backgroundColor + ", цвет границы: " + borderColor + ".");
    };

}
