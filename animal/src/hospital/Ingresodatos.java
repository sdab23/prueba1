package hospital;

/**
 * Created by alumno on 5/07/2017.
 */
public class Ingresodatos {
    private String nombGerente;
    private String Direccion;
    private int anio;

    public Ingresodatos(){

    }

    public String getNombGerente() {
        return nombGerente;
    }

    public void setNombGerente(String nombGerente) {
        this.nombGerente = nombGerente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
