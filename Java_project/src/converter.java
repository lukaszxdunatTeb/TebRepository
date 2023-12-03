import java.util.Scanner;
public class converter {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose conversion direction:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");

            int choice = scanner.nextInt();

            if (choice == 1) {
               System.out.print("Enter temperature in degrees Celsius: ");
                double celsius = scanner.nextDouble();
                int fahrenheit = (int) Math.round(celsiusToFahrenheit(celsius));
                System.out.println("Temperature in degrees Fahrenheit: " + fahrenheit);
            } else if (choice == 2) {
               System.out.print("Enter temperature in degrees Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                int celsius = (int) Math.round(fahrenheitToCelsius(fahrenheit));
                System.out.println("Temperature in degrees Celsius: " + celsius);
            } else {
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }

            scanner.close();
            System.out.println("The END");
        }

        // Method for converting from Celsius to Fahrenheit
        private static double celsiusToFahrenheit(double celsius) {
            return (celsius * 9 / 5) + 32;
        }

        // Method for converting from Fahrenheit to Celsius
        private static double fahrenheitToCelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5 / 9;
        }
    }