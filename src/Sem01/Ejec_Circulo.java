package Sem01;

public class Ejec_Circulo {

    public static void main(String[] args) {
        // TODO code application logic here
        Circulo obj_1 = new Circulo(12.135);
        
        //obj_1.set_radio(12.25);
        double v_area = obj_1.area();
        double v_longitud = obj_1.longitud();
        System.out.println(" --- Resultado ---");
        System.out.println("Radio del circulo: " + obj_1.get_radio());
        System.out.println("El area del ciculo es: " + v_area);
        System.out.println("La longitud del ciculo es: " + v_longitud);
    }
    
}
