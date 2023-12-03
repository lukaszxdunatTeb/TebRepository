/*
*   Główne ciało programu
*
*   Tutaj będą się pojawiać zmienne i funkcje bezpośrednio wpływające na działanie programu
*
* */


package Seweryn_Malisz_Zaliczenie;
    public class Main {
        public static void main(String[] args) {

            globalStringVariablesPL text = new globalStringVariablesPL();

            boolean czyKoniecProgramu = false;

            //do{
                System.out.println(text.globalHello);

                System.out.println(text.mainMenuHeader);
                System.out.println(text.mainMenuEntry[0]);
                System.out.println(text.mainMenuEntry[1]);
                System.out.println(text.mainMenuEntry[2]);
                System.out.println(text.mainMenuEntry[3]);

                System.out.println(text.mainMenuEntry[text.mainMenuEntry.length-1]);
                System.out.print("> ");

            //} while (czyKoniecProgramu);
            System.out.println(text.globallGoodBye);
        }
    }
