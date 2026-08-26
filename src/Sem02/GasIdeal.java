package Sem02;

public class GasIdeal {
    // Atributos
    private double temperatura;
    private double numeroDeMoles;
    private double volumen; // en litros

    // Constructores
    public GasIdeal(double p_temperatura, double p_numeroDeMoles, double p_volumen) {
        this.temperatura = p_temperatura;
        this.numeroDeMoles = p_numeroDeMoles;
        this.volumen = p_volumen;
    }

    public GasIdeal() {
        this.temperatura = 0;
        this.numeroDeMoles = 0;
        this.volumen = 0;
    }

    // Getters y Setters
    public void set_temperatura(double p_temperatura) {
        this.temperatura = p_temperatura;
    }

    public double get_temperatura() {
        return this.temperatura;
    }

    public void set_numeroDeMoles(double p_numeroDeMoles) {
        this.numeroDeMoles = p_numeroDeMoles;
    }

    public double get_numeroDeMoles() {
        return this.numeroDeMoles;
    }

    public void set_volumen(double p_volumen) {
        this.volumen = p_volumen;
    }

    public double get_volumen() {
        return this.volumen;
    }

    // Métodos
    public double calcularPresion() {
        // Usando la constante universal de los gases ideales (R = 0.082)
        // Formula: P = (n * R * T) / V
        double R = 0.082;
        if (this.volumen == 0) {
            return 0; // Para evitar división por cero si no se inicializa bien
        }
        return (this.numeroDeMoles * R * this.temperatura) / this.volumen;
    }
}