package Sem02;

public class ConversionTemperatura {
    // Atributos
    private double gradosCentigrados;

    // Constructores
    public ConversionTemperatura(double p_gradosCentigrados) {
        this.gradosCentigrados = p_gradosCentigrados;
    }

    public ConversionTemperatura() {
        this.gradosCentigrados = 0;
    }

    // Getters y Setters
    public void set_gradosCentigrados(double p_gradosCentigrados) {
        this.gradosCentigrados = p_gradosCentigrados;
    }

    public double get_gradosCentigrados() {
        return this.gradosCentigrados;
    }

    // Métodos
    public double convertirFahrenheit() {
        return (this.gradosCentigrados * 9 / 5) + 32;
    }
}