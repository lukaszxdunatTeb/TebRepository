package lists.linkedlist;

import java.util.LinkedList;

public class RetrieveLinkedListElementsExample {
    public static void main(String[] args) {

        LinkedList<Double> stockPrices = new LinkedList<>();

        stockPrices.add(45.00);
        stockPrices.add(45.60);
        stockPrices.add(30.50);
        stockPrices.add(18.78);
        stockPrices.add(25.74);

        Double firstElement = stockPrices.getFirst();
        Double lastElement = stockPrices.getLast();

        System.out.println("Wszystko: " + stockPrices);
        System.out.println("Pierwszy element: " + firstElement);
        System.out.println("Ostatni element: " + lastElement);

        Double stockIndexElement = stockPrices.get(2);
        System.out.println("Index 2: " + stockIndexElement);
    }

}
