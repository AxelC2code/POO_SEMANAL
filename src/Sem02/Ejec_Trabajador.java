package Sem02;

import java.util.Scanner;

public class Ejec_Trabajador {

    public static void main(String[] args) {
        // Prueba estática
        String p_nom = "Carlos";
        double p_phora = 15.5; 
        double p_horas = 40;
        
        Trabajador obj_1 = new Trabajador();
        obj_1.set_nombre(p_nom);
        obj_1.set_precioHora(p_phora); 
        obj_1.set_horasTrabajadas(p_horas);

        System.out.println("Trabajador: " + obj_1.get_nombre());
        System.out.println("Salario Bruto: " + obj_1.calcularSalarioBruto());
        System.out.println("Impuesto: " + obj_1.calcularImpuesto());
        System.out.println("Salario Neto: " + obj_1.calcularSalarioNeto());

        // Prueba dinámica
        Scanner obj_teclado = new Scanner(System.in);
        System.out.print("Ingrese nombre del trabajador (sin espacios): "); 
        p_nom = obj_teclado.next();
        System.out.print("Ingrese precio por hora: "); 
        p_phora = obj_teclado.nextDouble();
        System.out.print("Ingrese horas trabajadas: "); 
        p_horas = obj_teclado.nextDouble();
        
        Trabajador obj_2 = new Trabajador(p_nom, p_phora, p_horas);

        System.out.println("Salario Bruto: " + obj_2.calcularSalarioBruto());
        System.out.println("Impuesto: " + obj_2.calcularImpuesto());
        System.out.println("Salario Neto: " + obj_2.calcularSalarioNeto());
    }
}