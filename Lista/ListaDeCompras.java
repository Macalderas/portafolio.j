package Lista;
import InterfazGrafica.ListaOpciones;

import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {
    // Lista De Compras
    public static String[] opciones6 = {"Lista de  compras", "salir"};

    //programa inicial
    public static void programa() {
        ListaOpciones.cargarOpciones("...");

        // Opcion 1 crear lista de compras
        public static void crearLista () {

            // Crear una lista vacia
            List<String> ListaNombre = new ArrayList<>();

            // pedir un producto y su precio
            Scanner item = new Scanner(System.in);
            String rP;
            double rPc;

            for (int i = 1; i <= 3,1++){
                Scanner item = new Scanner(System.in);
                rP = item.nextLine();
                System.out.println("precio");
                rPc = item.nextDouble();

                //Agregar a la -lista Vacia
                listaNombre.add(rP);
                listaPrecio.add(rPc);
            }
            // Mostrar Lista
            System.out.println(listaNombre + "-->" + listaPrecio);

        }
    }
}


