public class Main {
    public static void main(String[] args) {
        String owoc = "jabłko";

        switch (owoc) {
            case "jabłko":
                System.out.println("Jabłko jest czerwone i smaczne.");
                break;
            case "banan":
                System.out.println("Banan jest żółty i słodki.");
                break;
            case "gruszka":
                System.out.println("Gruszka jest soczysta i aromatyczna.");
                break;
            case "kiwi":
                System.out.println("Kiwi jest zielone i pełne witamin.");
                break;
            default:
                System.out.println("Nieznany owoc.");
                break;
        }
    }
}