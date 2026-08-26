package Sem02;

import java.util.Scanner;

public class Ejec_Triangulo {

    public static void main(String[] args) {
        // TODO code application logic here
        double p_alt = 15.2; double p_bas = 4.21;
        
        Triangulo obj_1 = new Triangulo();
        obj_1.set_altura(p_alt); 
        obj_1.set_base(p_bas);

        double v_area = obj_1.area();
        double v_perimetro = obj_1.perimetro();

        System.out.println("El area es: " + v_area);
        System.out.println("La altura es: " + v_perimetro);

        Scanner obj_teclado = new Scanner(System.in);
        System.out.println("Ingrese base del triangulo: "); 
        p_bas = obj_teclado.nextDouble();
        System.out.print("Ingrese altura del triangulo: "); p_alt = obj_teclado.nextDouble();
        Triangulo obj_2 = new Triangulo(p_bas, p_alt);
        v_area = obj_2.area(); v_perimetro = obj_2.perimetro();

        System.out.println("Area: " + v_area);
        System.out.println("Perimetro: " + v_perimetro);
    }
    
}
