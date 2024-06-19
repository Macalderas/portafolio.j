package Conversor.Monedas;

import java.util.Scanner;

public class ConversorDeMonedas {
    static final double QUETZALES_A_DOLARES = 0.13;
    static final double DOLARES_A_QUETZALES = 7.75;
    static final double QUETZALES_A_PESOS_MEXICANOS = 2.60;
    static final double PESOS_MEXICANOS_A_QUETZALES = 0.38;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        while (true) {
            System.out.println("Opciones");
            System.out.println("1. Quetzales a Dolares");
            System.out.println("2. Dolares a Quetzales");
            System.out.println("3. Quetzales a Pesos Mexicanos");
            System.out.println("4. Pesos Mexicanos a Quetzales");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                break;
            }

            System.out.print("Ingrese la cantidad: ");
            double cantidad = scanner.nextDouble();
            double resultado = 0;

            switch (opcion) {
                case 1:
                    resultado = cantidad * QUETZALES_A_DOLARES;
                    System.out.printf("%.2f Quetzales son %.2f Dólares%n", cantidad, resultado);
                    break;
                case 2:
                    resultado = cantidad * DOLARES_A_QUETZALES;
                    System.out.printf("%.2f Dólares son %.2f Quetzales%n", cantidad, resultado);
                    break;
                case 3:
                    resultado = cantidad * QUETZALES_A_PESOS_MEXICANOS;
                    System.out.printf("%.2f Quetzales son %.2f Pesos Mexicanos%n", cantidad, resultado);
                    break;
                case 4:
                    resultado = cantidad * PESOS_MEXICANOS_A_QUETZALES;
                    System.out.printf("%.2f Pesos Mexicanos son %.2f Quetzales%n", cantidad, resultado);
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }

        scanner.close();
    }

    public static void conversor() {
    }
}



