package ar.edu.backend.utn.entities;

public class HojaDeRuta {
    private String codigo;
    private String origen;
    private String destino;
    private String nombreCliente;
    private Transporte transporte;

    public HojaDeRuta() {
    }

    public HojaDeRuta(String codigo, String origen, String nombreCliente, String destino, Transporte transporte) {
        this.codigo = codigo;
        this.origen = origen;
        this.nombreCliente = nombreCliente;
        this.destino = destino;
        this.transporte = transporte;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    @Override
    public String toString() {
        return "HojaDeRuta{" +
                "codigo='" + codigo + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", transporte=" + transporte.toString() +
                '}';
    }

}
