package lists.hash;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEntryKeySetValuesExample {
    public static void main(String[] args) {
        HashMap<String, String> miejscowoscKodPanstwa = new HashMap<>();

        miejscowoscKodPanstwa.put("India", "IN");
        miejscowoscKodPanstwa.put("United States of Amercia", "US");
        miejscowoscKodPanstwa.put("Poland", "PL");
        miejscowoscKodPanstwa.put("Japan", "JP");
        miejscowoscKodPanstwa.put("China", "CN");

        Set<Map.Entry<String, String>> miejscowoscKodPanstwaEntries = miejscowoscKodPanstwa.entrySet();
        System.out.println("Entries: " + miejscowoscKodPanstwaEntries);

        Set<String> kraje = miejscowoscKodPanstwa.keySet();
        System.out.println("kraje: " + kraje);

        Collection<String> kodKraju = miejscowoscKodPanstwa.values();
        System.out.println(kodKraju);
    }
}
