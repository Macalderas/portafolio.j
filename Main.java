import InterfazGrafica.Banner;
import InterfazGrafica.ListaOpciones;
import Lista.ListaDeCompras;
import programas.IMC;
import java.util.Scanner;
import calculadoraEdad.CalculadoraEdad;
import mate.mate;

public class Main {
    // Método main
    public static void main(String[] args) {
        // Invocar a la clase Banner y a su método mensaje()
        Banner.mensaje();

        // Cargar opciones
        ListaOpciones opciones = new ListaOpciones();
        opciones.cargarOpciones();

        /*
         * Crear un objeto Scanner para leer la entrada del usuario.
         * Imprimir en consola un mensaje para solicitar una opción.
         * Almacenar el valor del scanner (intoOpcion) en formato int (número entero).
         */
        Scanner intoOpcion = new Scanner(System.in);
        System.out.println("[?]:");
        int opcion = intoOpcion.nextInt();
        System.out.println("--------------------");

        // Cargar opción del usuario
        switch (opcion) {
            case 1:
                mate.programaCalcurar();
                break;
            case 2:
                IMC.metodoIMC();
                break;
            case 3:
                System.out.println("Login_3");
                break;
            case 4:
                System.out.println("Calcular_4");
                break;
            case 5:
                System.out.println("Grados_5");
                break;
            case 6:
                ListaDeCompras.programa();
                break;
            case 7:
                System.out.println("opcion 7");
                break;
            case 8:
                System.out.println("opcion 8");
                break;
            case 9:
                System.out.println("opcion 9");
                break;
            case 10:
                System.out.println("salir_10");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        intoOpcion.close();
    }
}
