package org.example;

public interface ShapeCalculator <T extends Number>{

    T calculateArea (T param1, T param2);
    T calculatePerimeter(T param1, T param2);

}
