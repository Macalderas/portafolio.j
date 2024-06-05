import InterfazGrafica.Banner;
import InterfazGrafica.ListaOpciones;
import Lista.ListaDeCompras;
import programas.IMC;
import java.util.Scanner;
import calculadoraEdad.CalculadoraEdad;
import mate.mate;
import

public class Main {
    //metodo main
    public static void main(String[] args) {
// invocar a la clase Banner y a su metodo mensaje()
     Banner.mensaje();
     //. Su función y propósito dependen de cómo lo hayas implementado en tu programa.
        ListaOpciones.cargarOpciones();
   /*
   *Scanner creando un objeto
   *System imprime en consola un mensaje
   * int almacena el valor del scanner (intoOpcion) en formato int (numero entero)
    */
        Scanner intoOpcion = new Scanner(System.in);
        System.out.println("[?]:");
        int opcion = intoOpcion.nextInt();
        System.out.println("--------------------");

    // Cargar opcion del usuario
   switch (opcion) {
       case 1:


           break;
       case 2:
           System.out.println("IMC_2");
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
           System.out.println("Lista de compras");
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

   }
    }
}