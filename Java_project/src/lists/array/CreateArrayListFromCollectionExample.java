package lists.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(4);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(6);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(10);
        nextFivePrimeNumbers.add(11);
        nextFivePrimeNumbers.add(12);
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(14);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);

        // Tworzenie LinkedList i dodawanie elementów
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        // Konwersja LinkedList do ArrayList
        ArrayList<String> arrayListFromLinkedList = new ArrayList<>(linkedList);

        // Wyświetlenie ArrayList
        System.out.println("ArrayList z LinkedList:");
        for (String element : arrayListFromLinkedList) {
            System.out.println(element);
        }
    }
}
