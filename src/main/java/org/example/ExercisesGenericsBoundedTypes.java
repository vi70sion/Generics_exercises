package org.example;

import java.util.Arrays;

public class ExercisesGenericsBoundedTypes {

    public static <T extends Number> T[] compareArrays(T[] array1, T[] array2){
        //T[] sumArray = (T[]) new Number[array1.length];
        int length;
        T[] sumArray, secondArray;
        if(array1.length >= array2.length){
            sumArray = Arrays.copyOf(array1, array1.length);
            length = array2.length;
            secondArray = Arrays.copyOf(array2, array2.length);
        } else {
            sumArray = Arrays.copyOf(array2, array2.length);
            length = array1.length;
            secondArray = Arrays.copyOf(array1, array1.length);
        }
        for(int i = 0; i < length; i++){
            if (array1[i] instanceof Integer) {
                sumArray[i] = (T) Integer.valueOf(((Integer) sumArray[i]) + ((Integer) secondArray[i]));
            } else if (array1[i] instanceof Double) {
                sumArray[i] = (T) Double.valueOf(((Double) sumArray[i]) + ((Double) secondArray[i]));
            }
        }
        return sumArray;
    }

    public static <T extends Number> void prnArray(T[] array) {
        for (Number n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

}
