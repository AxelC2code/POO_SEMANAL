package Sem02;

import java.util.Scanner;

public class Ejec_TrianguloRectangulo {

    public static void main(String[] args) {
        // Prueba estática con constructor vacío y setters
        double p_c1 = 3.5; double p_c2 = 4.2;
        
        TrianguloRectangulo obj_1 = new TrianguloRectangulo();
        obj_1.set_cateto1(p_c1); 
        obj_1.set_cateto2(p_c2);

        double v_area = obj_1.area();
        double v_perimetro = obj_1.perimetro();

        System.out.println("El area es: " + v_area);
        System.out.println("El perimetro es: " + v_perimetro);

        // Prueba dinámica con teclado y constructor con parámetros
        Scanner obj_teclado = new Scanner(System.in);
        System.out.print("Ingrese cateto 1 del triangulo rectangulo: "); 
        p_c1 = obj_teclado.nextDouble();
        System.out.print("Ingrese cateto 2 del triangulo rectangulo: "); 
        p_c2 = obj_teclado.nextDouble();
        
        TrianguloRectangulo obj_2 = new TrianguloRectangulo(p_c1, p_c2);
        v_area = obj_2.area(); 
        v_perimetro = obj_2.perimetro();

        System.out.println("Area: " + v_area);
        System.out.println("Perimetro: " + v_perimetro);
    }
}