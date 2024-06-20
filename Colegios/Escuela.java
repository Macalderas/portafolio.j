package Colegios;

public class Escuela {
    private String nombre;
    private String correo;
    private String carrera;
    private String edad;
    private String solvencia;

    void Estudiantes(String nombre, String correo, String carrera, String edad, String solvencia) {

        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.edad = edad;
        this.solvencia = solvencia;
    }

    // get
    public String getnombre() {
        return nombre;
    }
    public String getcorreo() {
        return correo;
    }
    public String getcarrera() {
        return carrera;
    }
    public String getedad(){
        return  edad;
    }
    // Métodos set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public void setEdad(String edad) {
        this.edad = edad;
    }
    public void setSolvencia(String solvencia) {

        this.solvencia = solvencia;
    }
}
