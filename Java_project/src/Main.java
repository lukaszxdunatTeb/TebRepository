
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /// zmienna do pętli while
        boolean działanieprogramu = true;

        while (działanieprogramu) {
            System.out.println("### witam w liście zakupów ###");
            System.out.println("Wybierz opcję która cię interesuje. ");
            System.out.println("1.Dodawanie produktów do listy. ");
            System.out.println("2.Usuwanie produktów z listy.   ");                    /// menu
            System.out.println("3.Wyświetlanie listy zakupów.   ");
            System.out.println("4.Sprawdzanie czy produkt jest na liście.  ");
            System.out.println("5.Zakończenie działania programu:    ");
            int wybór = scanner.nextInt();
            String[]lista =new String[3];
            switch (wybór) {

                case 1: {
                    //// dodawaniue produktu
                    System.out.println("Nazwa produktów które już są na liście :");
                    System.out.println(Arrays.toString(lista));
                    int length_Var = lista.length;
                    System.out.println("Nazwa produktu który chcesz dodać :");
                    String nowyprodukt ;
                    nowyprodukt= scanner.next();
                    String[] listaz = new String[length_Var + 1];
                    for (int i = 0; i < lista.length; i++) {
                        listaz[i] = lista[i];
                    }
                    listaz[listaz.length - 1] = nowyprodukt;
                    lista=listaz;

                    break;
                }

                case 2:                                                     ////Usuwanie produktów




                   break;

                case 3:                                                     ///// wyświetlanie

                    break;

                case 4 :                                                    //// sprawdzenie
                    System.out.println("Nazwa produktu do sprawdzenia :");
                    for (int i=0; i < lista.length-1; i++){
                        String produktdospr;
                        produktdospr=scanner.nextLine();
                        if (lista[i].equals(produktdospr)){
                            System.out.println("Produkt znajduje się na liście.");
                            return;
                        }
                    }
                    System.out.println("Produktu nie ma na liście.");



                    break;
                case 5:
                    System.out.println(" Dziekuję za skorzystanie z  listy zakupów");
                    return;


                default:
                    System.out.println("Nie wybrałeś opcji ,prosze wybierz opcję ponownie !");
                    break;





            }
        }

    }
}