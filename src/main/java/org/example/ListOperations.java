package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListOperations <T>{
    private List<T> elements;

    public ListOperations() {
        this.elements = new ArrayList<>();
    }
    public List<T> getElements() { return elements; }

    public void addElement(T element){
        elements.add(element);
    }

    public void removeElement(int index){
        if (index < 0 || elements == null || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        elements.remove(index);
    }

    public void printElements(){
        for(T item: elements){
            System.out.println(item);
        }
    }

}
