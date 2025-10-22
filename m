public class Cine { // El nombre debe coincidir con el archivo: Cine.java
    // Atributos
    public String nombre;
    private String tipo;
    private String direccion;
    private String capacidad;

    // Constructor
    public Cine(String nombreDeMicine, String tipocine, String direccioncine) {
        this.nombre = nombreDeMicine;
        this.tipo = tipocine;
        this.direccion = direccioncine;
    }

    // Método
    public void saludar() {
        System.out.println("Bienvenido, soy " + nombre + ", de tipo " + tipo + " y mi dirección es " + direccion + ".");
    }

    // Subclase Tipocine
    public static class TipoCine extends Cine {
        private String categoria;

        public TipoCine(String nombre, String tipo, String direccion, String categoria) {
            super(nombre, tipo, direccion);
            this.categoria = categoria;
        }

        public void definirTipoCine() {
            System.out.println("Soy un cine de categoría: " + categoria);
        }
    }

    // Subclase CineCartelera (polimorfismo)
    public static class CineCartelera extends Cine {
        private String especialidad;

        public CineCartelera(String nombre, String tipo, String direccion, String especialidad) {
            super(nombre, tipo, direccion);
            this.especialidad = especialidad;
        }

        @Override
        public void saludar() {
            System.out.println("¡Hola! Soy " + nombre + " y mi especialidad es " + especialidad + ".");
        }
    }

    // Método main
    public static void main(String[] args) {
        // Crear instancia de la clase Cine
        Cine cine1 = new Cine("Los Avengers", "Acción", "Av. Principal 123");
        cine1.saludar();

        // Otra instancia
        Cine cine2 = new Cine("Pijama de Rayas", "Drama", "Calle 45 Sur");
        cine2.saludar();

        // Instancia de la subclase TipoCine
        TipoCine cineCategoria = new TipoCine("365", "Romance", "Av. Central 10", "Premium");
        cineCategoria.saludar();
        cineCategoria.definirTipoCine();

        // Instancia de la subclase CineCartelera (polimorfismo)
        CineCartelera cineEspecial = new CineCartelera("Titanic", "Romance", "Calle del Mar", "Clásicos");
        cineEspecial.saludar();
    }
}
