package org.example;

public class Circle implements GeometricFigure {
    public int radius;
    public String backgroundColor;
    public String borderColor;
    public int[] array = new int[1];

    public Circle(int radius, String backgroundColor, String borderColor) {
        this.radius = radius;
        this.backgroundColor = backgroundColor;
        this.borderColor = borderColor;
        this.array[0] = radius;
    }

    @Override
    public double perimeter(int[] array) {
        return (2 * array[0] * Math.PI);
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void print() {
        System.out.println("Площядь круга: " + area() + ", периментр: " + perimeter(array) + ", цвет заливки: " + backgroundColor + ", цвет границы: " + borderColor + ".");
    }
}
