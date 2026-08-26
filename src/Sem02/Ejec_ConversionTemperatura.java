package Sem02;

import java.util.Scanner;

public class Ejec_ConversionTemperatura {

    public static void main(String[] args) {
        // Prueba estática
        double p_centigrados = 25.0; 
        
        ConversionTemperatura obj_1 = new ConversionTemperatura();
        obj_1.set_gradosCentigrados(p_centigrados); 

        double v_fahrenheit = obj_1.convertirFahrenheit();

        System.out.println("Los grados fahrenheit son: " + v_fahrenheit);

        // Prueba dinámica
        Scanner obj_teclado = new Scanner(System.in);
        System.out.print("Ingrese temperatura en grados centigrados: "); 
        p_centigrados = obj_teclado.nextDouble();
        
        ConversionTemperatura obj_2 = new ConversionTemperatura(p_centigrados);
        v_fahrenheit = obj_2.convertirFahrenheit(); 

        System.out.println("Fahrenheit: " + v_fahrenheit);
    }
}