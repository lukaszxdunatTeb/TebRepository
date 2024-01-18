package lists.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListColectionsSortExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(232);
        numbers.add(212);
        numbers.add(2213);
        numbers.add(12);

        System.out.println("Przed: " + numbers);

//        Collections.sort(numbers);

//
//        numbers.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer number1, Integer number2) {
//                return number1.compareTo(number2);
//            }
//        });

        numbers.sort(Integer::compareTo);

        System.out.println("Po sortowaniu: " + numbers);
    }
}
