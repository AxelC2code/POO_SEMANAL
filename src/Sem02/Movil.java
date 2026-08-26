package Sem02;

public class Movil {
    // Atributos
    private double velocidadInicial;
    private double tiempo;
    private double aceleracion; // Corregido el nombre "acelearacion" de la imagen

    // Constructores
    public Movil(double p_velocidadInicial, double p_tiempo, double p_aceleracion) {
        this.velocidadInicial = p_velocidadInicial;
        this.tiempo = p_tiempo;
        this.aceleracion = p_aceleracion;
    }

    public Movil() {
        this.velocidadInicial = 0;
        this.tiempo = 0;
        this.aceleracion = 0;
    }

    // Getters y Setters
    public void set_velocidadInicial(double p_velocidadInicial) {
        this.velocidadInicial = p_velocidadInicial;
    }

    public double get_velocidadInicial() {
        return this.velocidadInicial;
    }

    public void set_tiempo(double p_tiempo) {
        this.tiempo = p_tiempo;
    }

    public double get_tiempo() {
        return this.tiempo;
    }

    public void set_aceleracion(double p_aceleracion) {
        this.aceleracion = p_aceleracion;
    }

    public double get_aceleracion() {
        return this.aceleracion;
    }

    // Métodos
    public double calcularEspacioRecorrido() {
        // Formula MRUV: d = (Vo * t) + (0.5 * a * t^2)
        double termino1 = this.velocidadInicial * this.tiempo;
        double termino2 = 0.5 * this.aceleracion * Math.pow(this.tiempo, 2);
        return termino1 + termino2;
    }
}