package org.example;

public class ExercisesGenericMethods <T>{


    public void printArray(T[] array){
        System.out.print("[");
        for (int i = 0; i < array.length -1; i++){
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length-1]);
        System.out.println("]");
    }



}
