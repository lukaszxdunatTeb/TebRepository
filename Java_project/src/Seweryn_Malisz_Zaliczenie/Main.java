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

            boolean programExecution = true;

            do{
                System.out.println(text.globalHello);

                System.out.println(text.mainMenuHeader);
                System.out.println(text.mainMenuEntry[0]);
                System.out.println(text.mainMenuEntry[1]);
                System.out.println(text.mainMenuEntry[2]);
                System.out.println(text.mainMenuEntry[3]);

                System.out.println(text.mainMenuEntry[text.mainMenuEntry.length-1]);
                System.out.print("> ");

                switch (inputDataClass.get_Value_Int()){
                    case 1:

                        break;
                        
                    default:
                        programExecution = false;
                        break;
                }

            } while (programExecution);
            System.out.println(text.globallGoodBye);
        }
    }
