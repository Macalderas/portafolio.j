package Conversor;

public class Longitudes {
    public static void ConversorLongitudes() {
    }

    // Enum para representar las diferentes unidades de longitud
    public enum Unidad {
        METROS,
        KILOMETROS,
        MILLAS,
        PIES
    }

    // Método para convertir entre diferentes unidades de longitud
    public static double convertir(double valor, Unidad desde, Unidad hacia) {
        // Primero convertimos el valor a metros
        double valorEnMetros = 0;

        switch (desde) {
            case METROS:
                valorEnMetros = valor;
                break;
            case KILOMETROS:
                valorEnMetros = valor * 1000;
                break;
            case MILLAS:
                valorEnMetros = valor * 1609.34;
                break;
            case PIES:
                valorEnMetros = valor * 0.3048;
                break;
        }

        // Luego convertimos de metros a la unidad deseada
        double resultado = 0;

        switch (hacia) {
            case METROS:
                resultado = valorEnMetros;
                break;
            case KILOMETROS:
                resultado = valorEnMetros / 1000;
                break;
            case MILLAS:
                resultado = valorEnMetros / 1609.34;
                break;
            case PIES:
                resultado = valorEnMetros / 0.3048;
                break;
        }

        return resultado;
    }

    // Método principal para probar el conversor
    public static void main(String[] args) {
        double valor = 10; // Valor a convertir
        Unidad desde = Unidad.METROS; // Unidad original
        Unidad hacia = Unidad.MILLAS; // Unidad deseada

        double resultado = convertir(valor, desde, hacia);
        System.out.println(valor + " " + desde + " son " + resultado + " " + hacia);
    }
}