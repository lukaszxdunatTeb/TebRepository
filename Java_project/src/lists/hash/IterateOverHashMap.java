package lists.hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IterateOverHashMap {
    public static void main(String[] args) {
        Map<String, Integer> employeeSalary = new HashMap<>();

        employeeSalary.put("David", 10);
        employeeSalary.put("John", 19);
        employeeSalary.put("Marek", 34);
        employeeSalary.put("Steve", 15);

        System.out.println(employeeSalary);

        Set<Map.Entry<String, Integer>> employeeSalaryEntries = employeeSalary.entrySet();
        Iterator<Map.Entry<String, Integer>> employeeSalaryIterator =
                employeeSalaryEntries.iterator(); //!!! Clue calej petli - iteracji
        System.out.println(employeeSalaryEntries);

        while (employeeSalaryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = employeeSalaryIterator.next();

            if (entry.getValue() > 18.0) {
                System.out.println(entry.getKey() + " ma więcej niż 18 lat");
            } else {
                System.out.println(entry.getKey() + " ma mniej niż 18 lat");
                employeeSalaryIterator.remove();
            }
        }
        System.out.println("Osoby pełnoletnie to: " + employeeSalary);


    }

}
