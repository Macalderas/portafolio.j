package Colegios;


public class Cursos {
    public Cursos(String matemáticas, String primaria, String numero) {
    }

    public class Curso {
        private String nombre;
        private String categoria;
        private String periodo;

        public Curso(String nombre, String categoria, String periodo) {
            this.nombre = nombre;
            this.categoria = categoria;
            this.periodo = periodo;
        }

        // Getters y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
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
