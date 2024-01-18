package lists.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateOverLinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> friends = new LinkedList<>();

        friends.add("Marek");
        friends.add("Kasia");
        friends.add("Natalka");
        friends.add("Marcin");

        System.out.println("--- Iterate za pomoca iterator() --- ");

        Iterator<String> friendsIterator = friends.iterator();

        while (friendsIterator.hasNext()) {
            String friendName = friendsIterator.next();
            System.out.println(friendName);
        }

        System.out.println("--- Iterate za pomoca descIteratora---");

        Iterator<String> friendsIteratorDesc = friends.descendingIterator();

        while (friendsIteratorDesc.hasNext()) {
            String friendNameDesc = friendsIteratorDesc.next();
            System.out.println(friendNameDesc);
        }
    }
}
