package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExercisesGenericMethods <T>{


    public void printArray(T[] array){
        if(array == null || array.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length -1; i++){
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length-1]);
        System.out.println("]");
    }

    public List<T> arrayToList(T[] array){
        List<T> arrayList = new ArrayList<T>();
        if (array == null) return arrayList;
        for(int i = 0; i < array.length; i++){
            arrayList.add(array[i]);
        }
        return arrayList;
    }

    public T[] swap(T[] array, int indexFirst, int indexSecond){
        if (array == null)
            throw new NullPointerException("NullPointerException");
        if(indexSecond >= array.length)
            throw new IndexOutOfBoundsException("Please check an instance of array or indices");
        T tempFirst = array[indexFirst];
        T tempSecond = array[indexSecond];
        array[indexFirst] = tempSecond;
        array[indexSecond] = tempFirst;
        return array;
    }

}
