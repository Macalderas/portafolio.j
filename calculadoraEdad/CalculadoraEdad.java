package calculadoraEdad;

import java.util.Scanner;

public class CalculadoraEdad {
    public void iniciar() {
        int[] fechaNacimiento = solicitarFechaNacimiento();
        int[] fechaActual = solicitarFechaActual();

        int edad = calcularEdad(fechaNacimiento, fechaActual);
        System.out.println("Su edad es: " + edad + " años.");
    }
    // Método que solicita la fecha de nacimiento al usuario
    public int[] solicitarFechaNacimiento() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Año (AAAA): ");
        int year = scanner.nextInt();
        System.out.print("Mes (MM): ");
        int month = scanner.nextInt();
        System.out.print("Día (DD): ");
        int day = scanner.nextInt();

        return new int[] { year, month, day };
    }

    // Método que solicita la fecha actual al usuario
    public int[] solicitarFechaActual() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la fecha actual:");
        System.out.print("Año (AAAA): ");
        int year = scanner.nextInt();
        System.out.print("Mes (MM): ");
        int month = scanner.nextInt();
        System.out.print("Día (DD): ");
        int day = scanner.nextInt();

        return new int[] { year, month, day };
    }

    // Método que calcula la edad
    public int calcularEdad(int[] fechaNacimiento, int[] fechaActual) {
        int edad = fechaActual[0] - fechaNacimiento[0];

        // Ajustar la edad si el cumpleaños no ha ocurrido en el año actual
        if (fechaActual[1] < fechaNacimiento[1] ||
                (fechaActual[1] == fechaNacimiento[1] && fechaActual[2] < fechaNacimiento[2])) {
            edad--;
        }

        return edad;
    }

}