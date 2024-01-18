package lists.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        friends.add("Lukasz");
        friends.add("Marek");
        friends.add("Kasia");
        friends.add("Kamil");

        System.out.println("Lista: " + friends);

        friends.add(3, "Max");

        System.out.println("Po dodaniu Maksa: " + friends);

        friends.addLast("Karolina");

        System.out.println(friends);

        List<String> familyFriends = new ArrayList<>();
        familyFriends.add("Zosia");
        familyFriends.add("Agnieszka");

        friends.addAll(familyFriends);

        System.out.println("Wszystko " + friends);

    }
}
