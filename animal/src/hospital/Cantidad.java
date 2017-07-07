package hospital;

/**
 * Created by alumno on 5/07/2017.
 */
public class Cantidad {
    private int sumtotal=0;
    public Cantidad (){

    }

    public void sumaTotal (int anios, String tipoAnimal){

        if (tipoAnimal.equals("perro")){
            sumtotal= sumtotal + anios;
        }

    }

    public int getSumtotal(){
        return sumtotal;
    }

}
