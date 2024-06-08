package org.example;

public class SquarerCalculator extends RectangleCalculator {

    public Double calculateArea(Double param) {
        return super.calculateArea(param, param);
    }

    public Double calculatePerimeter(Double param){
        return super.calculatePerimeter(param, param);
    }
}
