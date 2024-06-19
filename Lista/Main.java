package Lista;

import Conversor.ConversosGrados;
import Conversor.Longitudes;
import Conversor.Monedas.ConversorDeMonedas;
import InterfazGrafica.Banner;
import Mis_metodos.ListaOpciones;
import IMC.IMC;
import java.util.Scanner;

import Calculadora.mate;
import libros.Biblioteca;

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
                ConversorDeMonedas.conversor();
                break;
            case 4:
                ConversosGrados.conversorGrados();
                break;
            case 5:
                ConversosGrados.conversorGrados();
                break;
            case 6:
                Banner.MensajeBanner();
                break;
            case 7:
               Longitudes.ConversorLongitudes();
                break;
            case 8:
                Biblioteca.programa();
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
