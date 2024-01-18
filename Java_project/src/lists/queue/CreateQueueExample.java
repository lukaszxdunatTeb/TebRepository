package lists.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class CreateQueueExample {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(40);
        numbers.add(4);
        numbers.add(11);

        System.out.println(numbers);

        if (numbers.isEmpty() == false) {
            numbers.poll();
            System.out.println("Rozmiar po usunieciu: " + numbers.size());
            System.out.println(numbers);
        }

        Iterator<Integer> numbersIterator = numbers.iterator();

        while (numbersIterator.hasNext()) {
            Integer num = numbersIterator.next();
            if (num < 10) {
                numbersIterator.remove();
            }
        }
        System.out.println(numbers);
    }

}
