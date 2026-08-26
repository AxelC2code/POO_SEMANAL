package Sem02;

public class TrianguloRectangulo {
    // Atributos --> Ámbito privado
    private double cateto1;
    private double cateto2;

    // Constructores
    public TrianguloRectangulo(double p_cateto1, double p_cateto2) {
        this.cateto1 = p_cateto1;
        this.cateto2 = p_cateto2;
    }

    public TrianguloRectangulo() {
        this.cateto1 = 0;
        this.cateto2 = 0;
    }

    // Getters y Setters
    public void set_cateto1(double p_cateto1) {
        this.cateto1 = p_cateto1;
    }

    public double get_cateto1() {
        return this.cateto1;
    }

    public void set_cateto2(double p_cateto2) {
        this.cateto2 = p_cateto2;
    }

    public double get_cateto2() {
        return this.cateto2;
    }

    // Métodos --> Ámbito public
    public double area() {
        return (this.cateto1 * this.cateto2) / 2;
    }

    public double hipotenusa() {
        double valor;
        valor = Math.sqrt(Math.pow(this.cateto1, 2) + Math.pow(this.cateto2, 2));
        return valor;
    }

    public double perimetro() {
        return this.cateto1 + this.cateto2 + this.hipotenusa();
    }
}