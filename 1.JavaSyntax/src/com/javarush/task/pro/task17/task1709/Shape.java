package com.javarush.task.pro.task17.task1709;

/* 
Абстрактные фигуры
*/

public abstract class Shape {
    private double perimeter;
    private double area;

    abstract double getPerimeter();
    abstract double getArea();
}