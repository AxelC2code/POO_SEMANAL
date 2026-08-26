package Sem02;

import java.util.Scanner;

public class Ejec_GasIdeal {

    public static void main(String[] args) {
        // Prueba estática
        double p_temp = 298; // Kelvin
        double p_moles = 2.5; 
        double p_vol = 10.0; // Litros
        
        GasIdeal obj_1 = new GasIdeal();
        obj_1.set_temperatura(p_temp);
        obj_1.set_numeroDeMoles(p_moles); 
        obj_1.set_volumen(p_vol);

        System.out.println("La presion calculada es: " + obj_1.calcularPresion() + " atm");

        // Prueba dinámica
        Scanner obj_teclado = new Scanner(System.in);
        System.out.print("Ingrese temperatura (en Kelvin): "); 
        p_temp = obj_teclado.nextDouble();
        System.out.print("Ingrese numero de moles: "); 
        p_moles = obj_teclado.nextDouble();
        System.out.print("Ingrese volumen (en litros): "); 
        p_vol = obj_teclado.nextDouble();
        
        GasIdeal obj_2 = new GasIdeal(p_temp, p_moles, p_vol);

        System.out.println("La nueva presion es: " + obj_2.calcularPresion() + " atm");
    }
}