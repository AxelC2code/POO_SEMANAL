package Sem02;

public class Producto {
    // Atributos
    private String nombre;
    private double precioDeCosto;
    private double precioDeVenta;

    // Constructores
    public Producto(String p_nombre, double p_precioDeCosto, double p_precioDeVenta) {
        this.nombre = p_nombre;
        this.precioDeCosto = p_precioDeCosto;
        this.precioDeVenta = p_precioDeVenta;
    }

    public Producto() {
        this.nombre = "";
        this.precioDeCosto = 0;
        this.precioDeVenta = 0;
    }

    // Getters y Setters
    public void set_nombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String get_nombre() {
        return this.nombre;
    }

    public void set_precioDeCosto(double p_precioDeCosto) {
        this.precioDeCosto = p_precioDeCosto;
    }

    public double get_precioDeCosto() {
        return this.precioDeCosto;
    }

    public void set_precioDeVenta(double p_precioDeVenta) {
        this.precioDeVenta = p_precioDeVenta;
    }

    public double get_precioDeVenta() {
        return this.precioDeVenta;
    }

    // Métodos
    public double calcularGanancia() {
        return this.precioDeVenta - this.precioDeCosto;
    }
}