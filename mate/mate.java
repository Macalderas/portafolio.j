package mate;

public class mate {
    public static void programaCalcurar() {
    }

    // Método para sumar dos números
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dos números
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return Double.NaN; // Devuelve NaN (Not a Number) en caso de división por cero
        }
        return a / b;
    }
}

