package Sem02;

import java.util.Scanner;

public class Ejec_Cilindro {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj_teclado = new Scanner(System.in);
        System.out.print("Ingrese radio: "); double v_radio = obj_teclado.nextDouble();
        System.out.print("Ingrese altura: "); double v_altura = obj_teclado.nextDouble();
        Cilindro obj_c1 = new Cilindro(v_radio, v_altura);

        System.out.println("Volumen: " + obj_c1.volumen());
        System.out.println("Area: " + obj_c1.area());
    }
}
