
package test_autobus;

public class Ruta {

    private String codigo;
    private String origen;
    private String destino;
    private Autobus autobus;

    public Ruta(String codigo, String origen, String destino) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void asignarAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "codigo='" + codigo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", autobus=" + (autobus != null ? autobus.getId() : "No asignado") +
                '}';
    }
}

