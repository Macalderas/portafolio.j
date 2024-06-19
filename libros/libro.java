package libros;

public class libro {
    private String titulo;
    private String autor;
    private String fecha;

    // Método constructor
    public libro(String titulo, String autor, String fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
    }
  // metodo get
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFecha() {
        return fecha;
    }

    // Métodos set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    // Método toString
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
