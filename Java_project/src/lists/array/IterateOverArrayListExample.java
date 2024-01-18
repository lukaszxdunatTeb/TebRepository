package lists.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayListExample {
    public static void main(String[] args) {

        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game of Thrones");
        tvShows.add("Friends");
        tvShows.add("Miodowe lata");

        System.out.println("---- Iteracja za pomoca iteratora ----");

        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
            String tvShow = tvShowIterator.next();
            System.out.println(tvShow);
        }

        System.out.println();
        System.out.println("--- Iteracja za pomoca ListInteger() ---");

        // w parametrze dajemy index od ktorego ma zaczac iteracje
        ListIterator<String> tvShowListInterator = tvShows.listIterator(tvShows.size());
        while (tvShowListInterator.hasPrevious()) {
            String tvShow = tvShowListInterator.previous();
            System.out.println(tvShow);
        }

        System.out.println();
        System.out.println("--- Iteracja za pomoca for-each ---");

        for (String tvShow : tvShows) {
            System.out.println("Film: " + tvShow);
        }

        System.out.println();
        System.out.println("---  Iteracja na podstawie indexu ---");

        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
        // Metoda iterator() i ListIterator() korzystamy, gdy chcemy zmodyfikować tablu
    }
}
