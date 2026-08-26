package Sem02;

import java.util.Scanner;

public class Ejec_ConversionLongitud {

    public static void main(String[] args) {
        // Prueba estática
        double p_metros = 10.5; 
        
        ConversionLongitud obj_1 = new ConversionLongitud();
        obj_1.set_metros(p_metros); 

        double v_pies = obj_1.convertirPies();
        double v_pulgadas = obj_1.convertirPulgadas();

        System.out.println("La longitud en pies es: " + v_pies);
        System.out.println("La longitud en pulgadas es: " + v_pulgadas);

        // Prueba dinámica
        Scanner obj_teclado = new Scanner(System.in);
        System.out.print("Ingrese longitud en metros: "); 
        p_metros = obj_teclado.nextDouble();
        
        ConversionLongitud obj_2 = new ConversionLongitud(p_metros);
        v_pies = obj_2.convertirPies(); 
        v_pulgadas = obj_2.convertirPulgadas();

        System.out.println("Pies: " + v_pies);
        System.out.println("Pulgadas: " + v_pulgadas);
    }
}