package InterfazGrafica;

public class ListaOpciones {

    public static void cargarOpciones() {
        String[] ListaDeOpciones = {
                "Calculadora_1", "IMC_2",
                "Login_3", "Calcular_4",
                "Grados_5", "opcion_6",
                "opcion_7", "opcion_8",
                "opcion_9", "salir_10"};

        for (int i = 0; i < ListaDeOpciones.length; i++) {
            System.out.printf("[%d] %-12s", (i + 1), ListaDeOpciones[i]);

            if ((i + 1) % 2 == 0 || i == ListaDeOpciones.length - 1) {

                for (int f = 0; f < 5; f++) {
                    System.out.print("hola");
                }
            }
        }
    }
            }




