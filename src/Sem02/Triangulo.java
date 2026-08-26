package Sem02;

public class Triangulo {
    //Atributos --> Deben tener un ambito privado
    private double base;
    private double altura;
    //Constructor
    public Triangulo(double p_base, double p_altura){
        base=p_base;
        this.altura=p_altura;
    }
    public Triangulo(){
        this.base=0;
        this.altura=0;
    }

    //Getter y Setter
    public void set_base(double p_base){
        this.base=p_base;
    }
    public double get_base(){
        return this.base;
    }
    public void set_altura(double altura){
        this.altura=altura;
    }
    public double get_altura(){
        return this.altura;
    }
    //Metodos --> Deben tener un ambito public
    public double area(){
        return this.base*this.altura/2;
    }
    public double hipotunusa(){
        double valor;
        valor = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
        return valor;
    }
    public double perimetro(){
        return this.base + this.altura + this.hipotunusa();
    }
}
