package vehiculo;

public class Vehiculo implements Comparable<Vehiculo> {

    protected String nombre;
    protected String modelo;
    protected int puertas;
    protected String cilindradas;
    protected double precio;

    public Vehiculo() {
    }

    public Vehiculo(String nombre, String modelo, int puertas, double precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.puertas = puertas;
        this.precio = precio;
    }

    public Vehiculo(String nombre, String modelo, String cilindradas, double precio) {
        this.nombre = nombre;
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPuertas() {
        return this.puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getCilindradas() {
        return this.cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int compareTo(Vehiculo o) {
        if (this.precio > o.precio) {
            return -1;
        } else {
            return this.precio < o.precio ? 1 : 0;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "nombre=" + nombre + ", modelo=" + modelo + ", puertas=" + puertas + ", cilindradas=" + cilindradas + ", precio=" + precio + '}';
    }
    
    
}
