package Sem02;

public class Trabajador {
    // Atributos
    private String nombre;
    private double precioHora;
    private double horasTrabajadas;

    // Constructores
    public Trabajador(String p_nombre, double p_precioHora, double p_horasTrabajadas) {
        this.nombre = p_nombre;
        this.precioHora = p_precioHora;
        this.horasTrabajadas = p_horasTrabajadas;
    }

    public Trabajador() {
        this.nombre = "";
        this.precioHora = 0;
        this.horasTrabajadas = 0;
    }

    // Getters y Setters
    public void set_nombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String get_nombre() {
        return this.nombre;
    }

    public void set_precioHora(double p_precioHora) {
        this.precioHora = p_precioHora;
    }

    public double get_precioHora() {
        return this.precioHora;
    }

    public void set_horasTrabajadas(double p_horasTrabajadas) {
        this.horasTrabajadas = p_horasTrabajadas;
    }

    public double get_horasTrabajadas() {
        return this.horasTrabajadas;
    }

    // Métodos
    public double calcularSalarioBruto() {
        return this.precioHora * this.horasTrabajadas;
    }

    public double calcularImpuesto() {
        return this.calcularSalarioBruto() * 0.10; // 10 por ciento
    }

    public double calcularSalarioNeto() {
        return this.calcularSalarioBruto() - this.calcularImpuesto();
    }
}