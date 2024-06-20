package Colegios;
import java.util.Scanner;
public  class Estudiantes {
    private static Estudiantes[] Estudiantes;
    private static Cursos[] Cursos;

    public Estudiantes(String nombre, String email, String seccion, int edad, boolean solvencia) {
    }

    public static void programa2() {
        System.out.println("Estudiantes");

        // alumno
        Estudiantes a1 = new Estudiantes("Juan", "j@scl.edu.gt", "A", 8, true);
        Estudiantes a2 = new Estudiantes("Mynor", "m@scl.edu.gt", "B", 7, false);
        Estudiantes a3 = new Estudiantes("Roberto", "r@scl.edu.gt", "A", 8, true);
        Estudiantes a4 = new Estudiantes(" Rocky", "ro@scl.edu.gt", "B", 8, true);
        Estudiantes a5 = new Estudiantes("Melisa", "me@scl.edu.gt", "A", 7, false);

        // Imprimir listado de alumnos (nombre, correo)
        System.out.println("Listado de alumnos:");
        for (Estudiantes estudiante : Estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + ", Correo: " + estudiante.getCorreo());
        }

        // Crear 4 cursos
        Cursos c1 = new Cursos("Matemáticas", "Primaria", "2024");
        Cursos c2 = new Cursos("Ciencias", "Primaria", "2024");
        Cursos c3 = new Cursos("Lengua", "Primaria", "2024");
        Cursos c4 = new Cursos("Arte", "Primaria", "2024");

        // Imprimir listado de cursos
        System.out.println("\nListado de cursos:");
        for (Cursos curso : Cursos) {
            System.out.println("Nombre: " + curso.getNombre() + ", Categoría: " + curso.getCategoria() + ", Periodo: " + curso.getPeriodo());
        }
    }

    

    private String getCorreo() {
        return "";
    }

    private String getNombre() {
        return null;
    }
}


