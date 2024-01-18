package lists.array;

import java.util.ArrayList;
import java.util.List;

public class AccesElementsFromArrayExample {
    public static void main(String[] args) {
        List<String> topCopmanies = new ArrayList<>();

        System.out.println("Czy lista jest pusta? : " + topCopmanies.isEmpty());

        topCopmanies.add("Google");
        topCopmanies.add("Apple");
        topCopmanies.add("Microsoft");
        topCopmanies.add("Amazon");
        topCopmanies.add("Facebook");

        System.out.println("Liczba najlepszych firm " + topCopmanies.size());

        String bestCompany = topCopmanies.get(0);
        String secondBestCompany = topCopmanies.get(1);
        String lastCompany = topCopmanies.get(topCopmanies.size() - 1);

        System.out.println(bestCompany);
        System.out.println(secondBestCompany);
        System.out.println(lastCompany);

        topCopmanies.set(4, "Tesla");

        System.out.println("Po modyfikacji listy " + topCopmanies);
    }
}
