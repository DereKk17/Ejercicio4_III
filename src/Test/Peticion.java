package Test;

public class Peticion {
    private String id;
    private String nombreArchivo;

    public Peticion(String id, String nombreArchivo) {
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

