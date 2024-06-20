package Colegios;


public class Cursos {
    public Cursos(String matemáticas, String primaria, String numero) {
    }

    public String getNombre() {
        return "";
    }

    public String getCategoria() {
        return "";
    }

    public String getPeriodo() {
        return "";
    }

    public class Curso {
        private String Nombre;
        private String categoria;
        private String periodo;

        public Curso(String nombre, String categoria, String periodo) {
            this.Nombre = Nombre;
            this.categoria = categoria;
            this.periodo = periodo;
        }

        // Getters y Setters
        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public String getPeriodo() {
            return periodo;
        }

        public void setPeriodo(String periodo) {
            this.periodo = periodo;
        }
    }
}
