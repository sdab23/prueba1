package hospital;

/**
 * Created by alumno on 5/07/2017.
 */
public class Principal {
    public static  void main (String[] args){
        Cantidad c = new Cantidad();
        Animal animal = new Animal();
        Ingresodatos i = new Ingresodatos();

        i.setNombGerente("Jose Martines");
        i.setDireccion("zona 2");
        i.setAnio(2017);


        animal.setTipoAnimal("perro");
        animal.setRaza("pastor aleman");
        animal.setEdad(20);
        c.sumaTotal(animal.getEdad(), animal.getTipoAnimal());

        Animal a1= new Animal();
        a1.setTipoAnimal("perro");
        a1.setRaza("chihuahua");
        a1.setEdad(5);
        c.sumaTotal(a1.getEdad(), a1.getTipoAnimal());

        Animal a2= new Animal();
        a2.setTipoAnimal("perico");
        a2.setRaza("australiano");
        a2.setEdad(5);
        c.sumaTotal(a1.getEdad(), a2.getTipoAnimal());

        System.out.println("Informacion Tienda: ");
        System.out.println("nombre gerente: " + i.getNombGerente());
        System.out.println("Direccion: " + i.getDireccion());
        System.out.println("Anios: " + i.getAnio());
        System.out.println("");
        System.out.println("La suma total de edad de perros es: " + c.getSumtotal());



    }
}
