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

            //klasaTypuZmiennejListyZakupów listaZakupów = new klasaTypuZmiennejListyZakupów(); - mniej wiecej coś takiego

            boolean programExecution = true;

            System.out.println(text.globalHello);

            do{

                System.out.println(text.mainMenuHeader);

                System.out.println(text.mainMenuEntry[0]);
                System.out.println(text.mainMenuEntry[1]);
                System.out.println(text.mainMenuEntry[2]);
                System.out.println(text.mainMenuEntry[3]);

                System.out.println(text.mainMenuEntry[text.mainMenuEntry.length-1]);
                System.out.print("> ");

                switch (inputDataClass.get_Value_Int()){
                    case 1:                 //Dodaj nowy wpis

                        break;

                    case 2:                 //Usuń wpis

                        break;

                    case 3:                 //Wyświetl wszystkie wpisy

                        break;

                    case 4:                 //Wyszukaj i wyświetl wpis wpis

                        break;

                    default:                 //Zakończ program
                        programExecution = false;
                        break;
                }

            } while (programExecution);
            System.out.println(text.globallGoodBye);
        }
    }
