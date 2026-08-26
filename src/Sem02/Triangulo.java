public class Triangulo {
    //Atributos 
    private double base;
    private double altura;
    //constructor 
    public Triangulo(double p_base, double p_altura){ 
        base=p_base;
        this.altura=p_altura;
    }
    public Triangulo(){
    this.base=0;
    this.altura=0;
    }
    //getter y setter
    public void set_base(double p_base){
        this.base=p_base;
    }
    public double ger_base(){
        return this.base;
    }
    public void set_altura(double altura){
        this.altura=altura;
    }
    public double get_altura(){
        return this.altura;
    }
    //Metodos --> Deben tener un ambito public
    public double area() {
        return 0;
    }
    
    private double NHH () {
        
    }
    public double hipotenusa() {
        double valor;
        valor = Math.sqrt(Math.pow(this.base, 2) + Math.pow(this.altura, 2));
        return valor;
    }
    public double perimetro() {
        return this.base + this.altura + this.hipotenusa();
    }
}