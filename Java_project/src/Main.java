public class Main {
    public static void main(String[] args) {
        int rok = 2023;

        if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
            System.out.println("Rok jest przestępny.");
        } else {
            System.out.println("Rok nie jest przestępny.");
        }
    }
}