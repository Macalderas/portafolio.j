package IMC;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su peso en kilogramos
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        // Solicitar al usuario que ingrese su altura en metros
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = calcularIMC(peso, altura);

        // Mostrar el resultado
        System.out.printf("Su IMC es: %.2f%n", imc);
        // Evaluar y mostrar la categoría del IMC
        System.out.println("Categoría: " + evaluarIMC(imc));
    }

    // Método para calcular el IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para evaluar la categoría del IMC
    public static String evaluarIMC(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    public static void metodoIMC() {
    }
}