package org.example;

public class Rectangle implements GeometricFigure {
    public String backgroundColor;
    public String borderColor;
    public int a;
    public int b;
    public int[] array = new int[4];

    public Rectangle(int sideA, int sideB, String backgroundColor, String borderColor) {
        this.a = sideA;
        this.b = sideB;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.array[0] = sideA;
        this.array[1] = sideB;
        this.array[2] = sideA;
        this.array[3] = sideB;
    }


    @Override
    public double area() {
        return a * b;
    }

    @Override
    public void print() {
        System.out.println("Площядь прямоугольника: " + area() + ", периментр: " + perimeter(array) + ", цвет заливки: " + backgroundColor + ", цвет границы: " + borderColor + ".");
    }

}
