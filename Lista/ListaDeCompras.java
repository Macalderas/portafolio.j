package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {

    // Lista de opciones
    public static String[] opciones6 = {"Crear lista de compras", "Salir"};

    public static void main(String[] args) {
        programa();
    }

    // Programa inicial
    public static void programa() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            for (int i = 0; i < opciones6.length; i++) {
                System.out.println((i + 1) + ". " + opciones6[i]);
            }

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (opcion == 1) {
                crearLista();
            } else if (opcion == 2) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }

    // Opción 1: Crear lista de compras
    public static void crearLista() {
        // Crear listas vacías
        List<String> listaNombre = new ArrayList<>();
        List<Double> listaPrecio = new ArrayList<>();

        // Crear un escáner para la entrada del usuario
        Scanner item = new Scanner(System.in);

        // Pedir productos y sus precios
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese el nombre del producto " + i + ":");
            String rP = item.nextLine();
            System.out.println("Ingrese el precio del producto " + i + ":");
            double rPc = item.nextDouble();
            item.nextLine(); // Consume newline

            // Agregar a las listas vacías
            listaNombre.add(rP);
            listaPrecio.add(rPc);
        }

        // Mostrar la lista
        System.out.println("Lista de compras:");
        for (int i = 0; i < listaNombre.size(); i++) {
            System.out.println(listaNombre.get(i) + " --> " + listaPrecio.get(i));
        }
    }
}


