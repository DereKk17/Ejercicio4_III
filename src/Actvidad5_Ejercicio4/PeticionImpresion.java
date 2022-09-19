package Actvidad5_Ejercicio4;

public class PeticionImpresion {

    private String id;
    private String nombreArchivo;

    public PeticionImpresion(String id, String nombreArchivo) {
        this.id = id;
        this.nombreArchivo = nombreArchivo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
}
