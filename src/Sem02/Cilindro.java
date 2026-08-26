package Sem02;

public class Cilindro {
    //Atributos
    private double radio ;
    private double altura;
    //Constructor
    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }
    //Getter y setter
    public double getRadio() {
        return radio;
    }
    public double getAltura() {
        return altura;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    //Metodos
    public double area_base(){
        return Math.pow(this.radio, 2);
    }
    public double volumen(){
        return this.area_base()*this.altura;
    }
    public double area(){
        double v_areaLat;
        v_areaLat = (2*Math.PI*this.radio)*this.altura;
        return 2*this.area() + v_areaLat;
    }   



}
