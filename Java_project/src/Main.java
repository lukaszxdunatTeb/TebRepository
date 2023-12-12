
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("### witam w liście zakupów ###");
        System.out.println("Aktualna lista zakupów: ");
        String[] lista = {"mleko", "kawa", "cukier "};
        wyświetlanieznumeracją(lista);

        boolean działanieprogramu = true;
        while (działanieprogramu) {

            System.out.println("Wybierz opcję która cię interesuje. ");
            System.out.println("1.Dodawanie produktów do listy. ");
            System.out.println("2.Usuwanie produktów z listy.   ");                    /// menu
            System.out.println("3.Wyświetlanie listy zakupów.   ");
            System.out.println("4.Sprawdzanie czy produkt jest na liście.  ");
            System.out.println("5.Zakończenie działania programu:    ");
            int wybór = scanner.nextInt();
            switch (wybór) {

                case 1: {
                    //// dodawanie produktu
                    System.out.println("Nazwa produktów które już są na liście :");
                    for (int i = 0; i < lista.length; i++) {
                        System.out.println((i + 1) + ". " + lista[i]);
                    }
                    int length_Var = lista.length;                                                //dodawanie produktu
                    System.out.println("Nazwa produktu który chcesz dodać :");
                    String nowyprodukt = scanner.next();
                    String[] listaz = new String[length_Var + 1];
                    for (int i = 0; i < lista.length; i++) {
                        listaz[i] = lista[i];
                    }
                    listaz[listaz.length - 1] = nowyprodukt;
                    lista = listaz;
                    continue;
                }

                case 2:                                                     ////Usuwanie produktów
                    // Usuwanie elementu
                    System.out.print("Podaj indeks do usunięcia: ");
                    int indexdousunięcia = scanner.nextInt();
                    // Sprawdzenie poprawności indeksu
                    if (indexdousunięcia < 0 || indexdousunięcia >= lista.length) {
                        System.out.println("Nieprawidłowy indeks.");
                    } else {
                        String[] listaz;
                        String[] tablicazusuniętymprzedmiotem = usunięcieproduktu(lista, indexdousunięcia);
                        System.out.print("Nowa lista zakupów :\n");
                        wyświetlanieznumeracją(tablicazusuniętymprzedmiotem);
                    }
                    continue;


                case 3:                                                     ///// wyświetlanie
                    System.out.println("aktualna lista zakupów :");
                    wyświetlanieznumeracją(lista);
                    break;

                case 4:                                                    //// sprawdzenie
                    System.out.println("Nazwa produktu do sprawdzenia :");
                    for (int i = 0; i < lista.length - 1; i++) {
                        String produktdospr;
                        produktdospr = scanner.nextLine();
                        if (lista[i].equals(produktdospr)) {
                            System.out.println("Produkt znajduje się na liście.");

                        }
                    }
                    System.out.println("Produktu nie ma na liście.");
                    break;


                case 5:
                    System.out.println(" Dziekuję za skorzystanie z  listy zakupów");
                    działanieprogramu = false;
                    break;

                default:
                    System.out.println("Nie wybrałeś opcji ,prosze wybierz opcję ponownie !");
                    break;


            }
        }

    }

    private static  String[] usunięcieproduktu(String[] listaus, int indexdousunięcia) {
        String[] listabezproduktu = new String[listaus.length - 1];

        for (int i = 0, k = 0; i <listaus.length; i++) {
            if (i == indexdousunięcia) {
                continue;
            }
            listabezproduktu[k++] = listaus[i];
        }

        return listabezproduktu;
    }

    // Metoda do wyświetlania zawartości tablicy stringów z numerami
    private static void wyświetlanieznumeracją(String[] lista) {
        for (int i = 0; i < lista.length; i++) {
            System.out.println((i + 1) + ". " + lista[i]);
        }
    }
}