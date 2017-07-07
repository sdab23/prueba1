package hospital;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 5/07/2017.
 */
public class Animal {
    private String tipoAnimal;
    private String raza;
    private int edad;

    //private List <String> anios = new ArrayList <String>;
    public Animal() {

    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }



}
