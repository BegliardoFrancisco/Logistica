package ar.edu.backend.utn.entities;

public class Maritimo extends Transporte {

    private TipoBuque tipoBuque;
    private Integer totalToneladas;

    public Maritimo(String matricula, Float precio_base, String nombre, TipoBuque tipoBuque, Integer totalToneladas) {
        super(matricula, precio_base, nombre);
        this.tipoBuque = tipoBuque;
        this.totalToneladas = totalToneladas;
    }

    public TipoBuque getTipoBuque() {
        return tipoBuque;
    }

    public void setTipoBuque(TipoBuque tipoBuque) {
        this.tipoBuque = tipoBuque;
    }

    public Integer getTotalToneladas() {
        return totalToneladas;
    }

    public void setTotalToneladas(Integer totalToneladas) {
        this.totalToneladas = totalToneladas;
    }

    @Override
    public float getTotalCarga() {
        return this.getPrecio_base() +
                (this.getTotalToneladas() * 450f) +
                (this.getPrecio_base() * 0.4f);
    }

    @Override
    public String toString() {
        return "Maritimo{" +
                "tipoBuque=" + tipoBuque +
                ", totalToneladas=" + totalToneladas +
                '}';
    }
}
