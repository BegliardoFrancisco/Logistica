package ar.edu.backend.utn.entities;

public abstract class Transporte {

    private String matricula;
    private Float precio_base;
    private String nombre;

    public Transporte(String matricula, Float precio_base, String nombre) {
        this.matricula = matricula;
        this.precio_base = precio_base;
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Float getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(Float precio_base) {
        this.precio_base = precio_base;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract float getTotalCarga();

    @Override
    public String toString() {
        return "Transporte{" +
                "matricula='" + matricula + '\'' +
                ", precio_base=" + precio_base +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
