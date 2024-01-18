package lists.hash;

import java.util.*;

public class HashMapUserDefinedObjectExample {
    public static void main(String[] args) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        LinkedList<Employee> linekdmap = new LinkedList<>();
        linekdmap.add(new Employee(1001, "Łukasz", "Dunat", 15));
        System.out.println(linekdmap);


        employeeMap.put(1001, new Employee(1001, "Jan", "Kowalski", 20));
        employeeMap.put(1002, new Employee(1002, "John", "Baildon", 25));
        employeeMap.put(1003, new Employee(1003, "Adam", "Małysz", 10));

        System.out.println(employeeMap);

        Set<Map.Entry<Integer, Employee>> employeeSalaryEntries = employeeMap.entrySet();
        Iterator<Map.Entry<Integer, Employee>> employeeSalaryIterator =
                employeeSalaryEntries.iterator(); //!!! Clue calej petli - iteracji

        while (employeeSalaryIterator.hasNext()) {
            Map.Entry<Integer, Employee> entry = employeeSalaryIterator.next();

            if (entry.getValue().getAge() > 18) {
                System.out.println(entry.getValue().getFirstName() + " ma więcej niż 18 lat");
            } else {
                System.out.println(entry.getValue().getFirstName() + " ma mniej niż 18 lat");
                System.out.println(entry.getValue().getFirstName() + " usunięty z list");
                employeeSalaryIterator.remove();
            }
        }
        System.out.println(employeeMap);
    }
}
