package org.example;

public class Pair <F, S>{
    private F first;
    private S second;
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
    public void setFirst(F first, S second) {
        this.first = first;
        this.second = second;
    }
    public F getFirst() { return first; }
    public S getSecond() { return second; }


    @Override
    public String toString(){
        return "([" + String.valueOf(first) + "] [" + String.valueOf(second) + "])";
    }


}
