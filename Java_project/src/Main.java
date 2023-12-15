
import Interface.Trójkąt;
import Interface.Okrąg;
import java.util.Scanner;
import Interface.Prostokąt;

public class Main {
    public static void main(String[] args) {
        Okrąg nowyokrąg = new Okrąg(10);
        Trójkąt nowytrójkąt = new Trójkąt(3,4,5);
        Prostokąt nowyProstokąt = new Prostokąt(4,5);

        System.out.println("### OKRĄG ###");
        System.out.println("Obwód okręgu to :" + nowyokrąg.Obwód());
        System.out.println("Pole powierzchni to :" + nowyokrąg.PolePowierzchni());
        System.out.println("### TRÓJKĄT ###");
        System.out.println("Obwód Trójkąta  to" + nowytrójkąt.Obwód());
        System.out.println("Pole powierzchni Trójkąta  to :"+ nowytrójkąt.PolePowierzchni());
        System.out.println("### PROSTOKĄT ###");
        System.out.println("Obwód Prostokąta  to" + nowyProstokąt.Obwód());
        System.out.println(" Pole powierzchni Prostokąta  to" + nowyProstokąt.PolePowierzchni());

            }

}