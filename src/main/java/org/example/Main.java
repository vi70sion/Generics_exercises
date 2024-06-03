package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        1.1 Uzduotis: Pair
//                * sukurti Pair generic klase su dviem misriais tipais
//                * du fildai pavadinimais first ir second, kuriems paduodami misrus tipai
//                * per konstruktoriaus parametrus paduodamos reiksmes klases fieldams
//    * vienas set metodas su dievm paramerais paduoti reiksmes klases fieldams
//    * du get metodai kiekvienam fieldui atskirai
//    * toString metodas grazina reiksmes formatu ([first], [second])
//    * main metode sukuriamas Pair klases instancas su reiksmemis
//    * atspausdinamas auksciau sukurtas instancas
//    * per set metoda paduodamos naujos reiksmes ir instancas atspausdinamas
//                * atskirai atspausdinamos first ir second atributu reiksmes.

        Pair<String, String> pair;
        pair = new Pair<>("String1", "String2");
        System.out.println(pair);
        pair.setFirst("String3", "String4");
        System.out.println(pair.getFirst() + " " + pair.getSecond());
        System.out.println();

        Pair<String, Integer> pair1;
        pair1 = new Pair<>("String1", 5);
        System.out.println(pair);
        pair1.setFirst("String2", 10);
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());
        System.out.println();


//        1.2 Uzduotis: ListOperations
//                * sukurti ListOperations generic klase, paduodamas vienas misrus tipas
//                * privatus klases fieldas elements su ArrayList instancu
//    * metodas addElement su misraus tipo elementu, kuris idedamas i
//        sarasa elements
//    * metodas removeElement su parametru index, kuris parodo kuri elementa
//        istrinti. Jei sarasas tuscias arba tokio indekso nera, tada ismeta
//        klaida-isimti: IndexOutOfBoundsException("Index out of bounds")
//                * metodas getelements, kuris grazina sarasa elements
//                * main metode sukurti ListObperations objekta, paduoti dvi reiksmes,
//        atspausdinti visas pridetas reiksmes, isimti reiksme indekse 0,
//                vel atspausdinti visas reiksmes ir isimti reiksme indekse 6 (turi
//        ismesti klaidos(exception) pranesima).


        ListOperations<Integer> integerListOperations = new ListOperations<>();
        integerListOperations.addElement(5);
        integerListOperations.addElement(1);
        integerListOperations.addElement(15);
        integerListOperations.printElements();
        try {
            integerListOperations.removeElement(6); // neegzistuojntis indeksas
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // išmeta klaidą: Index out of bounds
        }
        try {
            integerListOperations.removeElement(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // išmeta klaidą: Index out of bounds
        }
        integerListOperations.printElements();
        System.out.println();


//        1.3 Uzduotis: PairList
//    * sukurti PairList generic klase, paduodame du misrius tipus
//    * privatus klases fieldas pairs su ArrayList instancu, elementu tipas Pair<T,U>
//    * metodas addPair su parametrais first ir second, sukuriamas Pair
//      instancas ir pridedamas i sarasa pairs
//    * metodas getPair su parametru index, kuris tame indekse grazina esancia
//      reiksme arba ismeta kalida-isimti jei tokio indekso nera:
//      ndexOutOfBoundsException("Index out of bounds")
//    * metodas getPairs grazina visas reiksmes
//    * metodas removePair su parametru index, kuris parodo kuri elementa
//      istrinti. Jei sarase tokio indekso nera, tada ismeta laida-isimti:
//      IndexOutOfBoundsException("Index out of bounds")
//    * main metode atlikti sekancius veiksmus:
//    * sukurti PairList objekta ir paduoti tris reiksmes
//    * atspausdinti visas pridetas reiksmes su metodu getPair
//    * isimti reiksme indekse 1 ir iskivesti getPairs. Gal reiketu
//      perrasyti metoda toString, kad matyti visas reiksmes.
//    * iskviesti metoda getPair ir nurodyti indeksa 4, kad ismestu
//      klaida (exception).

        PairList<Integer, Integer> pairList = new PairList<>();
        pairList.addPair(5,10);
        pairList.addPair(18,7);
        pairList.addPair(2,9);
        for(Pair item: pairList.getPairs()){
            System.out.println(item);
        }
        System.out.println();
        pairList.removePair(1);
        for(Pair item: pairList.getPairs()){
            System.out.println(item);
        }
        System.out.println();
        try {
            pairList.removePair(4); // neegzistuojntis indeksas
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // išmeta klaidą: Index out of bounds
        }
        System.out.println();

//        2.GENERIC METHODS
//        Sukuriam klase ExercisesGenericMethods, kurioje atliekame
//        visas uzduotis.
//
//        2.1 Uzduotis: printArray
//    * Sukurti metoda printArray
//    * metodo parametruose nurodome T[] array
//    * atspausdinam visas reiksmes formatu, pvz: [45,2,78,9,123]
//    * paduodam String reiksmiu masyva ir atspausdinam
//    * paduodam Integer reiksmiu masyva ir atspausdinam
//    * sugeneruojam atsitiktinio dydzio masyva su atsitiktinemis Integer
//      reiksmemis ir atspausdinam
//    * sugeneruojam atsitiktinio dydzio masyva su atsitiktinemis Characer
//      reiksmemis ir atspausdinam
//    * paduodam atskirai null ir tucia masyvo instanca, turi atspaudsidnti: []

        ExercisesGenericMethods exMethods = new ExercisesGenericMethods();
        Integer[] intMasyvas = new Integer[]{45,2,78,9,123};
        exMethods.printArray(intMasyvas);
        String[] stringMasyvas = new String[] {"Pirmas", "Antras", "Trečias", "Ketvirtas", "Penktas"};
        exMethods.printArray(stringMasyvas);




    }
}