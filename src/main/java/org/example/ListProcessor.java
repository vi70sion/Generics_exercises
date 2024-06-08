package org.example;

public interface ListProcessor <T> {

    void addElement(T element);
    void removeElement(T element);
    boolean isEmpty();


}
