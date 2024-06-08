package org.example;

import java.util.*;

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

    public static <T extends Number> Map<String, Double> sumEvenAndOdd(List<T> list){
        Map<String, Double> result = new HashMap<>();
        result.put("Lyginių suma", 0.0);
        result.put("Nelyginių suma", 0.0);
        for(Number item: list){
            if (item.doubleValue() % 2 == 0) result.put("Lyginių suma", result.get("Lyginių suma") + item.doubleValue());
                else result.put("Nelyginių suma", result.get("Nelyginių suma") + item.doubleValue());
        }
        return result;
    }

    public static <T extends CharSequence> int findIndex(List<T> stringList, String index){
        int indexNo = -1;
        for(CharSequence item: stringList){
            indexNo++;
            if(item.equals(index)) return indexNo;
        }
        return -1;
    }

    public static <T extends CharSequence> List<T> reverseList(List<T> list){
        List<T> newList = new ArrayList<>();
        for(int i = list.size()-1; i >=0; i--){
            newList.add(list.get(i));
        }
        return newList;
    }

    public static <T> List<T> mergeEverySecondElement(List<T> list1, List<T> list2){
        List<T> list = new ArrayList<>();
        int length = Math.max(list1.size(), list2.size());
        for (int i = 0; i < length; i++){
            if(i < list1.size()) list.add(list1.get(i));
            if(i < list2.size()) list.add(list2.get(i));
        }
        return list;
    }

    public static <T extends Number> Map<String, Double> sumEvenAndOdd01(List<? extends Number> list){
        Map<String, Double> result = new HashMap<>();
        result.put("Lyginių suma", 0.0);
        result.put("Nelyginių suma", 0.0);
        for(Number item: list){
            if (item.doubleValue() % 2 == 0) result.put("Lyginių suma", result.get("Lyginių suma") + item.doubleValue());
            else result.put("Nelyginių suma", result.get("Nelyginių suma") + item.doubleValue());
        }
        return result;
    }


    public static <T extends Number> Map<String, Double> sumEvenAndOdd02(List<? super Number> list){
        Map<String, Double> result = new HashMap<>();
        result.put("Lyginių suma", 0.0);
        result.put("Nelyginių suma", 0.0);
        for(Object item: list){
            if (((Number)item).doubleValue() % 2 == 0) result.put("Lyginių suma", result.get("Lyginių suma") + ((Number)item).doubleValue());
            else result.put("Nelyginių suma", result.get("Nelyginių suma") + ((Number)item).doubleValue());
        }
        return result;
    }


    public static <T extends Number> Map<String, Double> sumEvenAndOdd03(List<?> list){
        Map<String, Double> result = new HashMap<>();
        result.put("Lyginių suma", 0.0);
        result.put("Nelyginių suma", 0.0);
        for(Object item: list){
            if (((Number)item).doubleValue() % 2 == 0) result.put("Lyginių suma", result.get("Lyginių suma") + ((Number)item).doubleValue());
            else result.put("Nelyginių suma", result.get("Nelyginių suma") + ((Number)item).doubleValue());
        }
        return result;
    }

}
