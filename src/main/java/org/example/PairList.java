package org.example;
import java.util.ArrayList;
import java.util.List;

public class PairList <T, U>{

    private List<Pair<T, U>> pairs;
    public PairList() {
        this.pairs = new ArrayList<>();
    }
    public List<Pair<T, U>> getPairs() { return pairs; }


    public void addPair(T first, U second){
        Pair pair = new Pair<>(first, second);
        pairs.add(pair);
    }

    public Pair getPair(int index){
        if (index < 0 || pairs == null || index >= pairs.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return pairs.get(index);
    }

    public void removePair(int index){
        if (index < 0 || pairs == null || index >= pairs.size()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        pairs.remove(index);
    }



}
