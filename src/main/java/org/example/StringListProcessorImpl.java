package org.example;

import java.util.ArrayList;
import java.util.List;

public class StringListProcessorImpl <T> implements ListProcessor{

    private final List<String> list;

    public StringListProcessorImpl() {
        this.list = new ArrayList<>();
    }

    @Override
    public void addElement(Object element) {
        list.add((String) element);
    }

    @Override
    public void removeElement(Object element) {
        list.remove(element);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "List: " + list;
    }

}
