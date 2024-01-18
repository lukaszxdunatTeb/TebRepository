package lists.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> programmingLanguages = new ArrayList<>();

        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("JavaScript");
        programmingLanguages.add("Python");
        programmingLanguages.add("Python");

        System.out.println("Początkowa lista: " + programmingLanguages);

        programmingLanguages.remove(3);

        System.out.println("Lista po usunieciu indexu 3: " + programmingLanguages);

        boolean isRemoved = programmingLanguages.remove("Python");
        System.out.println("After remove Python" + programmingLanguages);

        List<String> scriptingLanguages = new ArrayList<>();

        scriptingLanguages.add("C");
        scriptingLanguages.add("Java");
        scriptingLanguages.add("Perl");

        System.out.println(scriptingLanguages);

        //programmingLanguages.removeAll("C");

        System.out.println("Po removeAll(): " + programmingLanguages);

        programmingLanguages.clear();

        System.out.println("Po clear() " + programmingLanguages);

    }
}
