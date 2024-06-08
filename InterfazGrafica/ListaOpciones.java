package InterfazGrafica;

public class ListaOpciones {

    // Lista de opciones
    private String[] listaOpciones;

    // Método para cargar las opciones
    public void cargarOpciones() {
        String[] listaDeOpciones = {
                "Calculadora_1", "IMC_2",
                "Login_3", "ListaOpciones_4",
                "Grados_5", "mate_6",
                "opcion_7", "opcion_8",
                "opcion_9", "salir_10"
        };

        listaOpciones = listaDeOpciones; // Asignar opciones a la variable de instancia

        // Mostrar las opciones
        for (int i = 0; i < listaDeOpciones.length; i++) {
            System.out.printf("[%d] %s%n", i + 1, listaDeOpciones[i]);
        }
    }

    public static void main(String[] args) {
        ListaOpciones opciones = new ListaOpciones();
        opciones.cargarOpciones();
    }
}


