package lists.hash;

import java.util.HashMap;
import java.util.Map;

public class AccessKeysFromHashMapExample {
    public static void main(String[] args) {

        Map<String, String> userCityMap = new HashMap<>();

        System.out.println("Czy HashMapa jest pusta? : " + userCityMap.isEmpty());

        userCityMap.put("John", "New York");
        userCityMap.put("Marek", "Polska");
        userCityMap.put("Steve", "London");

        System.out.println(userCityMap);
        System.out.println("Rozmiar HashMapy to: " + userCityMap.size());

        if (userCityMap.containsValue("New York")) {
            System.out.println("Tak");
        } else {
            System.out.println("Nie");
        }

        if (userCityMap.containsKey("John")) {
            System.out.println("Tak ma klucz");
        } else {
            System.out.println("Brak klucza");
        }

        String userName = "John";
        userCityMap.put(userName, "California");

        System.out.println(userCityMap);
        System.out.println(userCityMap.get("John"));
    }
}
