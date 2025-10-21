public class Mascota { // siempre lleva el nombre del archivo
    // Declaro los atributos de la clase u objeto
    private String nombre; // String es para poder agregar letras
    private String tipo;
    private String color;

    // Constructor
    public Mascota(String nombreDeMiMascota, String tipomascota, String Colormascota) {
        this.nombre = nombreDeMiMascota;
        this.tipo = tipomascota;
        this.color = Colormascota;
    }

    // Creo mi primer método
    public void saludar() {
        System.out.println("Hola, soy " + nombre + "! y soy de tipo: " + tipo + "! y soy de color " + color + "!");
    }

    // Creando herencia de la clase mascota
    public static class Tipoanimalmascota extends Mascota {
        private String animal;

            // Constructor para la clase Tipoanimalmascota
            public Tipoanimalmascota(String nombre, String tipo, String color, String animal) {
                super(nombre, tipo, color);
                this.animal = animal;
            }

        // Método para definir tipo de animal
        public void definirtipoanimal() {
            System.out.println("Soy un " + animal);
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Crear instancia de la clase Mascota
        Mascota mascotahija = new Mascota("Kronos", "Pastor Alemán", "Dorado");
        mascotahija.saludar();

        // Crear otra instancia de la clase Mascota
        Mascota mimascota = new Mascota("Golden", "Golden Retriever", "Dorado");
        mimascota.saludar();

        // Crear instancia de la clase Tipoanimalmascota
        Tipoanimalmascota mascotaconraza = new Tipoanimalmascota("killer", "Pitbull", "barcino", "Perro");
        mascotaconraza.saludar();
        mascotaconraza.definirtipoanimal();
    }
}