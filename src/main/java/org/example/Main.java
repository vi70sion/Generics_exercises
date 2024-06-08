package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
        System.out.println(pair1);
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

        Random random = new Random();
        int randomSize = random.nextInt(11);
        intMasyvas = new Integer[randomSize];
        for (int i = 0; i < randomSize; i++){
            intMasyvas[i] = random.nextInt(100);
        }
        exMethods.printArray(intMasyvas);

        Character[] charMasyvas = new Character[randomSize];
        for (int i = 0; i < randomSize; i++){
            charMasyvas[i] = (char) (random.nextInt(26) + 'a');
        }
        exMethods.printArray(charMasyvas);
        exMethods.printArray(null);
        Character[] emptyMasyvas = new Character[0];
        exMethods.printArray(emptyMasyvas);

//        2.2 Uzduotis: arrayToList
//    * sukurti metoda pavadinimu arrayToList
//    * i metodo parametrus paduodame: T[] array
//    * metodas sukuria ArrayList instanca, iteruoja per array masyva ir
//      prideda visas reiksmias i ArrayList, grazina ArrayList su reiksmemis
//    * Jei array yra null tada grazina tuscia ArrayList instanca.
//    * Paduoti Character masyva su reiksmemis, atspausdinti gauta rezultata
//    * Paduoti tuscia Character masyva su reiksmemis, atspausdinti gauta rezultata
//    * Paduoti Character masyvo referencija, atspausdinti gauta rezultata

        List<Character> charList = new ArrayList<>();
        charList = exMethods.arrayToList(charMasyvas);
        System.out.println(charList);
        charList = exMethods.arrayToList(emptyMasyvas);
        System.out.println(charList);

//        2.3 Uzduotis: swap indexes
//    * sukurti metoda pavadinimu swap
//    * i metodo parametrus paduodame: T[] array, int indexFirst, int indexSecond
//    * metodas paima elementu reiksmes ideksuose (indexFirst, indexSecond),
//      sukeicia vietomis ir grazina modifikuota masyva.
//    * iskviesti metoda swap(), paduoti Charracter masyva su reiksmemis, kad
//      sukeistu pirma elementa su paskutiniu ir atspausdinti su metodo
//      printArray() pagalba
//    * iskviesti metoda swap(), tas pats Charracter masyvas, indexFirst =0 ir
//      indexSecond yra didesnis nei masyvo ilgis, tikimes gauti pranesima
//      konsoleje:
//      "Please check an instance of array or indices"
//    * iskviesti metoda swap(), paduoti tuscia Charracter masyva, ideksuose 0 ir 1,
//      tikimes gauti pranesima konsoleje:
//      "Please check an instance of array or indices"
//    * iskviesti metoda swap(), paduoti masyvo referencija, ideksuose 0 ir 1,
//      metodas ismeta klaida: NullPointerException

        Character[] chMasyvas = new Character[] {'k', 'q', 'c', 'w', 'a', 'n', 't', 'n', 'f'};
        exMethods.printArray(chMasyvas);
        Character[] swapMasyvas = (Character[]) exMethods.swap(chMasyvas, 1, 2);
        exMethods.printArray(swapMasyvas);
        swapMasyvas = (Character[]) exMethods.swap(chMasyvas, 0, chMasyvas.length-1);
        exMethods.printArray(swapMasyvas);
        try{
            swapMasyvas = (Character[]) exMethods.swap(chMasyvas, 0, chMasyvas.length+1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try{
            swapMasyvas = (Character[]) exMethods.swap(emptyMasyvas, 0, 1);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try{
            swapMasyvas = (Character[]) exMethods.swap(null, 0, 1);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

//        3.BOUNDED TYPES
//        Sukuriam klase ExercisesGenericsBoundedTypes, kurioje atliekame
//        visas uzduotis.
//        3.1 Uzduotis: compareArrays
//        Parasyti generic metoda, kuris paima to paties tipo du masyvus, patikrina ar
//        elementu reiksmes yra tos pacios ir sudeti vienoda eiles tvarka. Uztikrinti,
//        kad masyvas talpina tik skaicius.

        System.out.println();
        Integer[] arrayInt01 = {1,2,3,4};
        Integer[] arrayInt02 = {1,2,3,4};
        Integer[] arrayInt03 = {1,2,3,3};
        Integer[] arrayInt04 = {1,2,3};

        ExercisesGenericsBoundedTypes.prnArray((Number[]) ExercisesGenericsBoundedTypes.compareArrays(arrayInt01,arrayInt02));
        ExercisesGenericsBoundedTypes.prnArray((Number[]) ExercisesGenericsBoundedTypes.compareArrays(arrayInt01,arrayInt03));
        ExercisesGenericsBoundedTypes.prnArray((Number[]) ExercisesGenericsBoundedTypes.compareArrays(arrayInt01,arrayInt04));
        ExercisesGenericsBoundedTypes.prnArray((Number[]) ExercisesGenericsBoundedTypes.compareArrays(arrayInt04,arrayInt01));
        System.out.println("-".repeat(25));

        Double[] arrayDbl01 = {1.0,2.0,3.0,4.0};
        Double[] arrayDbl02 = {1.0,2.0,3.0,4.0};
        Double[] arrayDbl03 = {1.0,2.0,3.0,3.0};
        Double[] arrayDbl04 = {1.0,2.0,3.0};

        ExercisesGenericsBoundedTypes.prnArray((Number[]) ExercisesGenericsBoundedTypes.compareArrays(arrayDbl01,arrayDbl02));
        ExercisesGenericsBoundedTypes.prnArray((Number[]) ExercisesGenericsBoundedTypes.compareArrays(arrayDbl01,arrayDbl03));
        ExercisesGenericsBoundedTypes.prnArray((Number[]) ExercisesGenericsBoundedTypes.compareArrays(arrayDbl01,arrayDbl04));
        ExercisesGenericsBoundedTypes.prnArray((Number[]) ExercisesGenericsBoundedTypes.compareArrays(arrayDbl04,arrayDbl01));
        System.out.println("-".repeat(25));

//        3.2 Uzduotis:: sumEvenAndOdd
//        Parasyti generic metoda, kuris paima sarasa (List), atskirai susumuoja visus
//        lyginius ir nelyginius skaicius, rezultata grazina Map<String, Double>.
//        Uztikrinti, kad sarasas talpina tik skaicius.

        List<Integer> listInt01 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Double> listDbl01 = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd(listInt01));
        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd(listDbl01));
        System.out.println("-".repeat(25));

//        3.3 Uzduotis: findIndex
//        Parasyti generic metoda, kuriam paduodame sarasa ir simboli, kuri norime surasti
//        tame sarase. Grazina indekso numeri, kuriame yra ieskomas simbolis, o jei neranda
//        tada grazina -1.
//        Uztikrinti, kad sarasas talpina tik simboliu eilute(CharSequence).

        List<String> stringList = List.of("apple", "banana", "cherry", "orange");
        List<Integer> listInt02 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(ExercisesGenericsBoundedTypes.findIndex(stringList, "cherry"));
        System.out.println(ExercisesGenericsBoundedTypes.findIndex(stringList, "kiwi"));
        //System.out.println(ExercisesGenericsBoundedTypes.findIndex(listInt02, 2)); // compile error
        System.out.println("-".repeat(25));

//        3.4 Uzduotis: reversList
//        Parasyti generic metoda, kuris paima sarasa, sudelioja atvirkstine tvarka ir
//        grazina pakeista sarasa.
//        Uztikrinti, kad sarasas talpina tik simboliu eilute(CharSequence).

        List<String> stringList02 = List.of("apple", "banana", "cherry", "orange");
        List<Integer> listInt03 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(ExercisesGenericsBoundedTypes.reverseList(stringList02));
        //System.out.println(ExercisesGenericsBoundedTypes.reverseList(listInt03)); // compile erro
        System.out.println("-".repeat(25));

//        3.5 Uzduotis: mergeEverySecondElement
//        Parasyti generic metoda, kuris paima du sarasus ir sujungia visus elementus nuosekliai
//        kas antra.

        List<String> stringList03 = List.of("apple", "banana", "cherry", "orange");
        List<String> stringList04 = List.of("kiwi", "fig", "melon", "mango", "mandarin","grapes" );
        System.out.println(ExercisesGenericsBoundedTypes.mergeEverySecondElement(stringList03,stringList04));
        System.out.println("-".repeat(25));

//    4.GENERIC INTERFACES
//    4.1 Uzduotis: ListProcessor
//    * Sukurti ListProcessor interface, kuris priima <T>
//    * Interface turi sekancius abstrakcius metodus su default prieeigos modifikatorium:
//    * addElement, parametruose T element, metodas nieko negrazina
//    * removeElement, parametruose T element, metodas nieko negrazina
//    * isEmpty, metodas brazina boolean tipa
//
//    * Sukurti StringListProcessorImpl klase, kuri implementuoja ListProcessor interface
//    * klase turi viena field: modifikatoriai private ir final tipas List<String>
//    * Default kostrukturius kuris sukuria klases kintamajam instance ArrayList
//    * Overide visus implementuojamus metodus
//    * Overid metoda toString, kad atspausdinti visas saugomas reiksmes

//        5. WILDCARDS
//        5.1 Uzduotis: wildcards to sumEvenAndOdd
//        Perdaryti auskciau sukurta metoda sumEvenAndOdd:
//        * sumEvenAndOdd01 parametruose paduodam Upper Bounded Wildecard
//        * sumEvenAndOdd02 parametruose paduodam Lower Bounded Wildecard
//        * sumEvenAndOdd03 parametruose paduodam Unbounded Wildecard

        //List<Integer> listInt01 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        //List<Double> listDbl01 = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0);
        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd01(listInt01));
        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd01(listDbl01));
        System.out.println("-".repeat(25));

        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd03(listInt01));
        System.out.println(ExercisesGenericsBoundedTypes.sumEvenAndOdd03(listDbl01));
        System.out.println("-".repeat(25));


    }



}