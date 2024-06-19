package Mis_metodos;

public class ListaOpciones {

    // Lista de opciones
    private String[] listaOpciones;

    // Método para cargar las opciones
    public void cargarOpciones() {
        String[] listaDeOpciones = {
                "Calculadora_1", "conversor",
                "IMC", "Interfaz_Grafica",
                "Lista", "mate_6",
                "Conversor de monedas", "opcion_8",
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


