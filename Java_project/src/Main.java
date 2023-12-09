import java.util.Scanner;
import javax.swing.*:
import java.util.Scanner;


        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                /// zmienna do pętli while
                boolean działanieprogramu = true;
                String[] lista = new String[5];                        // DEKLARACJA TABLICY
                while (działanieprogramu) {
                    System.out.println("### witam w liście zakupów ###");
                    System.out.println("Wybierz opcję która cię interesuje. ");
                    System.out.println("1.Dodawanie produktów do listy. ");
                    System.out.println("2.Usuwanie produktów z listy.   ");                    /// menu
                    System.out.println("3.Wyświetlanie listy zakupów.   ");
                    System.out.println("4.Sprawdzanie czy produkt jest na liście.  ");
                    System.out.println("5.Zakończenie działania programu:    ");
                    int wybór = scanner.nextInt();
                    switch (wybór) {

                        case 1:                                                      /// Dodawanie produktu
                            System.out.println("Nazwa produktu który chcesz dodać :");
                            String nowyprodukt;
                            nowyprodukt= scanner.next();

                            break;

                        case 2:                                                     ////Usuwanie produktów




                            break;

                        case 3:                                                     ///// wyświetlanie
                            for(int i = 0; i < lista.length; i++ ) {
                                System.out.println(lista[i]);

                            }
                            break;
                        case 4 :                                                    ///// Sprawdzanie




                            break;
                        case 5:
                            System.out.println(" Dziekuję za skorzystanie z  listy zakupów");  //// zakońćzenie
                            return;


                        default:
                            System.out.println("Nie wybrałeś opcji ,prosze wybierz opcję ponownie !");
                            break;






                    }
                }

            }
        }



