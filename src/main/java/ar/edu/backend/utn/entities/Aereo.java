package ar.edu.backend.utn.entities;

public class Aereo extends Transporte {

    private Integer bultos;
    private Float precioCombustible;

    public Aereo(String matricula, Float precio_base, String nombre, Integer bultos, Float precioCombustible) {
        super(matricula, precio_base, nombre);
        this.bultos = bultos;
        this.precioCombustible = precioCombustible;
    }

    public Integer getBultos() {
        return bultos;
    }

    public void setBultos(Integer bultos) {
        this.bultos = bultos;
    }

    public Float getPrecioCombustible() {
        return precioCombustible;
    }

    public void setPrecioCombustible(Float precioCombustible) {
        this.precioCombustible = precioCombustible;
    }

    @Override
    public float getTotalCarga() {
        return this.getPrecio_base() + (this.getBultos() * 250f) + this.getPrecioCombustible();
    }

    @Override
    public String toString() {
        return "Aereo{" +
                "bultos=" + bultos +
                ", precioCombustible=" + precioCombustible +
                '}';
    }
}
