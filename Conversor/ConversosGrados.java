
package Conversor;
import java.util.Scanner;
public class ConversosGrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        while (true) {
            // Mostrar opciones de conversión al usuario
            System.out.println("Seleccione el tipo de conversión:");
            System.out.println("1. Convertir de Celsius a Fahrenheit");
            System.out.println("2. Convertir de Fahrenheit a Celsius");
            System.out.print("Ingrese su opción (1 o 2): ");
            opcion = scanner.nextInt();

            if (opcion == 1 || opcion == 2) {
                break; // Salir del bucle si la opción es válida
            } else {
                System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
            }
        }

        // Variables para las temperaturas
        double temperaturaInicial;
        double temperaturaConvertida;

        // Realizar la conversión según la opción seleccionada
        if (opcion == 1) {
            // Convertir de Celsius a Fahrenheit
            System.out.print("Ingrese la temperatura en Celsius: ");
            temperaturaInicial = scanner.nextDouble();
            temperaturaConvertida = celsiusAFahrenheit(temperaturaInicial);
            System.out.printf("%.2f grados Celsius son %.2f grados Fahrenheit.%n", temperaturaInicial, temperaturaConvertida);
        } else {
            // Convertir de Fahrenheit a Celsius
            System.out.print("Ingrese la temperatura en Fahrenheit: ");
            temperaturaInicial = scanner.nextDouble();
            temperaturaConvertida = fahrenheitACelsius(temperaturaInicial);
            System.out.printf("%.2f grados Fahrenheit son %.2f grados Celsius.%n", temperaturaInicial, temperaturaConvertida);
        }
    }

    // Método para convertir de Celsius a Fahrenheit
    public static double celsiusAFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Método para convertir de Fahrenheit a Celsius
    public static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void conversorGrados() {

    }
}