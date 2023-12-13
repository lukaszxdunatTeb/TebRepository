import Geometria.Circle;
import Geometria.Rectangle;
import Geometria.Triangle;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10,5);
        Circle circle = new Circle(20);
        Triangle triangle = new Triangle(10,5,15);


        System.out.println("Area of a rectangle: " + round(rectangle.Area()));
        System.out.println("Obwod of a rectangle: " + round(rectangle.Obwod()));

        System.out.println("Area of a circle: " + round(circle.Area()));
        System.out.println("Obwod of a circle: " + round(circle.Obwod()));

        System.out.println("Area of a triangle: " + round(triangle.Area()));
        System.out.println("Obwod of a triangle: " + round(triangle.Obwod()));


    }
    static double round(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}

////body mass index calculation
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Obliczanie wskaźnika masy ciała");
//        double weight;
//        double height;
//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            System.out.println("Podaj wagę w kilogramach: ");
//            weight = scanner.nextDouble();
//
//            System.out.println("Podaj wysokość w centymetrach");
//            height = scanner.nextDouble()/100;
//            if (weight <= 0 || height <= 0)  System.out.println("błąd danych, ponownie wpisz dane");
//        } while (weight <= 0 || height <= 0);
//        scanner.close();
//
//        double resultBMI = calculation_BMI(weight,height);
//        System.out.println("wskaźnik masy ciała - " + resultBMI);
//        if (resultBMI < 18.5) {
//            System.out.println("odpowiada niedowaga");
//        } else if (resultBMI >= 18.5 && resultBMI <= 24.9) {
//            System.out.println("odpowiada normalna waga");
//        } else if (resultBMI >= 25 && resultBMI <= 29.9) {
//            System.out.println("odpowiada nadwaga");
//        } else {
//            System.out.println("odpowiada otyłości");
//        }
//        System.out.println("koniec");
//    }
//    private static double calculation_BMI(double valueWeight, double valueHeight) {
//
//        double valueResult =  valueWeight / (valueHeight * valueHeight);
//        valueResult = (double) Math.round(valueResult * 10) /10;
//        return valueResult;
//    }
//}
// Calculator


//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Podaj pierwszą liczbę: ");
//        double number1 = scanner.nextDouble();
//
//        System.out.println("Podaj drugą liczbę");
//        double number2 = scanner.nextDouble();
//
//        System.out.println("Wybierz operacje (1 - dodawanie, 2 - odejmowanie, 3 - mnożenie, 4 - dzielenie): ");
//        int operation = scanner.nextInt();
//
//        double result = 0;
//
//        switch (operation) {
//            case 1:
//                result = addition(number1, number2);
//                break;
//            case 2:
//                result = subtraction(number1, number2);
//                break;
//            case 3:
//                result = multiplication(number1, number2);
//                break;
//            case 4:
//                result = division(number1, number2);
//                break;
//            default:
//                System.out.println("Nieprawidłowy wybór operacji.");
//                break;
//        }
//
//        System.out.println("Wynik: " + result);
//    }
//
//    private static double addition(double a, double b) {
//        return a + b;
//    }
//
//    private static double subtraction(double a, double b) {
//        return a - b;
//    }
//
//    private static double multiplication(double a, double b) {
//        return a * b;
//    }
//
//    private static double division(double a, double b) {
//        if (b != 0) {
//            return a / b;
//        } else {
//            System.out.println("Nie można dzielić przez zero.");
//            return 0;
//        }
//    }
//}