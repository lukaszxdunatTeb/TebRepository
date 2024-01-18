package lists.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//To jest zadanie dla grupy
public class ArrayListIteratorRemoveExcercise {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(18);
        numbers.add(15);
        numbers.add(40);
        numbers.add(65);
        numbers.add(70);

        System.out.println("Pierwotna lista: " + numbers);

        // Roznica pomiedzy iteratortem a listiteratiorem jest taka ze listiteratio mozemy sprawdzic co jest wstecz
//        Iterator<Integer> numbersIterator = numbers.iterator();
//        while (numbersIterator.hasNext()) {
//            Integer num = numbersIterator.next();
//            if (num % 2 != 0) {
//                numbersIterator.remove();
//            }
//        }

        // w parametrze dajem od ktorego elemntu ma zaczac iteracje
        ListIterator<Integer> numbersIterator = numbers.listIterator(numbers.size());
        while (numbersIterator.hasPrevious()) {
            Integer num = numbersIterator.previous();

            if (num % 2 != 0) {
                numbersIterator.remove();
            }
            System.out.println(num);
        }
        System.out.println("Po usunieciu: " + numbers);
    }
}
