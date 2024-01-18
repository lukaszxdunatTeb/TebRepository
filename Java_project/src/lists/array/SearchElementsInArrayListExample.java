package lists.array;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Łukasz");
        names.add("Maria");
        names.add("Kamil");
        names.add("Krzysztof");
        names.add("Maria");

        System.out.println("Czy lista posiada imie Łukasz?: " + names.contains("Łukasz"));

        System.out.println("First indexOf Marii: " + names.indexOf("Maria"));

        System.out.println("Last indexOd Maria: " + names.lastIndexOf("Maria"));
    }
}
