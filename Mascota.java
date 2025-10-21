public class Mascota{
//Declaro los atributos de la clase u objeto
private String nombre;
private String tipo;
private String color;

public Mascota(String nombredemimascota,String tipomascota,String colormascota){
 this.nombre=nombredemimascota;
 this.tipo=tipomascota;
 this.color=colormascota;
}

public void Saludar(){
    System.out.println("Hola, soy "+nombre+"! y soy de tipo: "+tipo+"! y soy de color "+color+"!");
}

public static void main(String[] args){

    Mascota MascotaHija=new Mascota("Lalo","PastorAleman","cafe");
    MascotaHija.Saludar();

}
}