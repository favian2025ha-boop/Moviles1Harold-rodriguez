public class cine { // El nombre debe coincidir con el archivo: cine.java
    // Atributos
    public String nombre;
    private String tipo;
    private String direccion;
    private String capacidad;

    // Constructor
    public cine(String nombreDeMicine, String tipocine, String direccioncine) {
        this.nombre = nombreDeMicine;
        this.tipo = tipocine;
        this.direccion = direccioncine;
    }

    // Método
    public void saludar() {
        System.out.println("" + nombre + ", de tipo " + tipo + " y mi dirección es " + direccion + ".");
    }

    // Subclase tipocine
    public static class tipocine extends cine {
        private String categoria;

        public tipocine(String nombre, String tipo, String direccion, String categoria) {
            super(nombre, tipo, direccion);
            this.categoria = categoria;
        }

        public void definirtipocine() {
            System.out.println(" un cine de categoría: " + categoria);
        }
    }

    // Subclase cinecartelera (polimorfismo)
    public static class cinecartelera extends cine {
        private String especialidad;

        public cinecartelera(String nombre, String tipo, String direccion, String especialidad) {
            super(nombre, tipo, direccion);
            this.especialidad = especialidad;
        }

        @Override
        public void saludar() {
            System.out.println("" + nombre + " y mi especialidad es " + especialidad + ".");
        }
    }

    // Método main
    public static void main(String[] args) {
        // Crear instancia de la clase cine
        cine cine1 = new cine("Los Avengers", "Acción", "Av. Principal 123");
        cine1.saludar();

        // Otra instancia
        cine cine2 = new cine("Pijama de Rayas", "Drama", "Calle 45 Sur");
        cine2.saludar();

        // Instancia de la subclase tipocine
        tipocine cinecategoria = new tipocine("365", "Romance", "Av. Central 10", "Premium");
        cinecategoria.saludar();
        cinecategoria.definirtipocine();

        // Instancia de la subclase cinecartelera (polimorfismo)
        cinecartelera cineespecial = new cinecartelera("Titanic", "Romance", "Calle del Mar", "Clásicos");
        cineespecial.saludar();
    }
}
