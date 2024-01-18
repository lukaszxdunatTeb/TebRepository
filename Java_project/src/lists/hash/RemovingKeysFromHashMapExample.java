package lists.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemovingKeysFromHashMapExample {
    public static void main(String[] args) throws InterruptedException {

        HashMap<String, Integer> colors = new HashMap<String, Integer>();

        colors.put("Red", 1);
        colors.put("White", 4);
        colors.put("Blue", 5);
        colors.put("Black", 3);
        colors.put("Green", 2);

        System.out.println(colors);

        for (Map.Entry<String, Integer> set : colors.entrySet()) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Color: ");
            String color = sc.nextLine();

            if (colors.containsKey(color)) {
                System.out.println("Yes! -" + set.getValue());
            } else {
                System.out.println("No!");
            }
            System.out.println("Color: " + set.getKey());
        }
    }
}
