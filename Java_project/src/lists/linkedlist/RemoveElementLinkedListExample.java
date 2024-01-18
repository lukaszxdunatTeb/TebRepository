package lists.linkedlist;

import java.util.LinkedList;

public class RemoveElementLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> programmingLanguages = new LinkedList<>();

        programmingLanguages.add("Java");
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Python");
        programmingLanguages.add("JS");

        System.out.println(programmingLanguages);

        String elementFirst = programmingLanguages.removeFirst();
        System.out.println("Usunięto: " + elementFirst + " teraz lista wyglada tak: " + programmingLanguages);

        String elementLast = programmingLanguages.removeLast();
        System.out.println("Usunięto: " + elementLast + " teraz lista wyglada tak: " + programmingLanguages);

        programmingLanguages.clear();

        System.out.println(programmingLanguages);
    }

}
