package proy_semana01;

public class Circulo {
    //Propiedades
    private double radio;
    //Constructor
    public Circulo(double p_radio){
        this.radio=p_radio;
    }
    public Circulo(){
        this.radio=0;
    }
    //Getter y Setter
    public double get_radio(){
        return this.radio;
    }
    public void set_radio(double p_radio){
        this.radio = p_radio;
    }
    //Metodos --> comportamiento
    public double area(){
        double v_area;
        v_area=2*Math.PI*Math.pow(this.radio,2);
        return v_area;
    }
    public double longitud(){
        return 2*Math.PI*this.get_radio();
    }
}
