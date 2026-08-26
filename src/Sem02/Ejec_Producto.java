package Sem02;

import java.util.Scanner;

public class Ejec_Producto {

    public static void main(String[] args) {
        // Prueba estática
        String p_nom = "Laptop";
        double p_costo = 1500.50; 
        double p_venta = 2100.00;
        
        Producto obj_1 = new Producto();
        obj_1.set_nombre(p_nom);
        obj_1.set_precioDeCosto(p_costo); 
        obj_1.set_precioDeVenta(p_venta);

        double v_ganancia = obj_1.calcularGanancia();

        System.out.println("Producto: " + obj_1.get_nombre());
        System.out.println("La ganancia es: " + v_ganancia);

        // Prueba dinámica
        Scanner obj_teclado = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto (sin espacios): "); 
        p_nom = obj_teclado.next();
        System.out.print("Ingrese precio de costo: "); 
        p_costo = obj_teclado.nextDouble();
        System.out.print("Ingrese precio de venta: "); 
        p_venta = obj_teclado.nextDouble();
        
        Producto obj_2 = new Producto(p_nom, p_costo, p_venta);
        v_ganancia = obj_2.calcularGanancia(); 

        System.out.println("Ganancia del nuevo producto: " + v_ganancia);
    }
}
