import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witam w liście zakupów!");
        System.out.println("Aby zakończyć działanie programu napisz 'koniec' ");
        String[] Tablicazakupów;
        Tablicazakupów = new String[10];
        Tablicazakupów[0] = "Mleko";
        Tablicazakupów[1] = "Chleb";
        Tablicazakupów[2] = "Masło";             ////tablica produktów
        Tablicazakupów[3] = "Zgrzewka wody ";
        Tablicazakupów[4] = "Makaron";
        Tablicazakupów[5] = "Pomidory";
        System.out.println("Aktualna Lista zakupów :");
        for (int i = 0; i < Tablicazakupów.length; i++) {
            System.out.println(Tablicazakupów[i]);
        }
        while (true) {
            System.out.println("Proszę podaj produkt nowy produkt ?");/////Dodawanie nowycch produktów
            String produkt = scanner.next();

            if (produkt.equalsIgnoreCase("koniec")) {
                System.out.println("program zosta zakończony");
                return;
            }


            System.out.println("czy chcesz usunąć produkt z listy ?");



        }
    }
}

    ////// git commit-m "opis zmian" = To kolejny commit który posiada nowa wersję  kodu który pisaliśmy .
    ///// git clone<adress repo> =  używamy go gdy chcemy pobrać projekt/zadanie ze zdalnego repozytorium które eznajduję się np na githubie.
    /////   git checkout <nazwa_gałęzi> = używamy ją gdy chcemy przejśc na nowy/inny brunch