package lists.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stackOfCards = new Stack<>();

        stackOfCards.push("Marek");
        stackOfCards.push("Daniel");
        stackOfCards.push("Kasia");
        stackOfCards.push("Magda");

        System.out.println(stackOfCards);

        String topCard = stackOfCards.pop();
        System.out.println("Stack.pop()  => : " + topCard);

        System.out.println(stackOfCards);

        topCard = stackOfCards.peek();

        System.out.println("Stack.peek()  => : " + topCard);
        System.out.println(stackOfCards);

        int position = stackOfCards.search("Daniel");

        System.out.println(position);
    }
}
