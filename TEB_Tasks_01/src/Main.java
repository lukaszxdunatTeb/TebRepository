import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Obliczanie wskaźnika masy ciała");
        double weight;
        double height;
        Scanner scanner = new Scanner(System.in);

    do {
        System.out.println("Podaj wagę w kilogramach: ");
        weight = scanner.nextDouble();

        System.out.println("Podaj wysokość w centymetrach");
        height = scanner.nextDouble()/100;
        if (weight <= 0 || height <= 0)  System.out.println("błąd danych, ponownie wpisz dane");
        } while (weight <= 0 || height <= 0);


        double resultBMI = calculation_BMI(weight,height);
        System.out.println(resultBMI);
        if (resultBMI < 18.5) {
            System.out.println("Niedowaga");
        } else if (resultBMI >= 18.5 && resultBMI <= 24.9) {
            System.out.println("Normalna waga");
        } else if (resultBMI >= 25 && resultBMI <= 29.9) {
            System.out.println("Nadwaga");
        } else {
            System.out.println("Otyłość");
        }
        System.out.println("koniec");
    }
    private static double calculation_BMI(double valueWeight, double valueHeight) {

        double valueResult =  valueWeight / (valueHeight * valueHeight);
        valueResult = (double) Math.round(valueResult * 10) /10;
        return valueResult;
    }
}