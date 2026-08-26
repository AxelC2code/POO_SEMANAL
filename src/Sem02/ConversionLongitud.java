package Sem02;

public class ConversionLongitud {
    // Atributos
    private double metros;

    // Constructores
    public ConversionLongitud(double p_metros) {
        this.metros = p_metros;
    }

    public ConversionLongitud() {
        this.metros = 0;
    }

    // Getters y Setters
    public void set_metros(double p_metros) {
        this.metros = p_metros;
    }

    public double get_metros() {
        return this.metros;
    }

    // Métodos
    public double convertirPies() {
        // 1 metro equivale a 3.28084 pies
        return this.metros * 3.28084;
    }
    
    public double convertirPulgadas() {
        // 1 metro equivale a 39.3701 pulgadas
        return this.metros * 39.3701;
    }
}