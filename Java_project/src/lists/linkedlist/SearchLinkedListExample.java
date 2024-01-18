package lists.linkedlist;

import java.util.LinkedList;

public class SearchLinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> pracownicy = new LinkedList<>();

        pracownicy.add("Marek");
        pracownicy.add("Kasia");
        pracownicy.add("Daniel");
        pracownicy.add("Ola");
        pracownicy.add("Kasia");
        pracownicy.add("Natalka");

        System.out.println("Czy lista zawiera Natalka: " + pracownicy.contains("Natalka"));
        System.out.println("index of  pierwsza Kasia: " + pracownicy.indexOf("Kasia"));
        System.out.println("index of ostatnia Kasia: " + pracownicy.lastIndexOf("Kasia"));
    }

}
