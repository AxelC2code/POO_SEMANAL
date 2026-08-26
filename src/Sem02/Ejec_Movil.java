package Sem02;

import java.util.Scanner;

public class Ejec_Movil {

    public static void main(String[] args) {
        // Prueba estática
        double p_vi = 10.0; // m/s
        double p_t = 5.0; // segundos
        double p_a = 2.0; // m/s^2
        
        Movil obj_1 = new Movil();
        obj_1.set_velocidadInicial(p_vi);
        obj_1.set_tiempo(p_t); 
        obj_1.set_aceleracion(p_a);

        System.out.println("El espacio recorrido es: " + obj_1.calcularEspacioRecorrido());

        // Prueba dinámica
        Scanner obj_teclado = new Scanner(System.in);
        System.out.print("Ingrese la velocidad inicial: "); 
        p_vi = obj_teclado.nextDouble();
        System.out.print("Ingrese el tiempo: "); 
        p_t = obj_teclado.nextDouble();
        System.out.print("Ingrese la aceleracion: "); 
        p_a = obj_teclado.nextDouble();
        
        Movil obj_2 = new Movil(p_vi, p_t, p_a);

        System.out.println("El nuevo espacio recorrido es: " + obj_2.calcularEspacioRecorrido());
    }
}