package org.example;

public class TriangleCalculator implements ShapeCalculator <Double>{


    @Override
    public Double calculateArea(Double param1, Double param2) {
        return 0.5 * param1 * param2;
    }

    @Override
    public Double calculatePerimeter(Double param1, Double param2) {
        return 2 * param1 + param2;
    }
}
