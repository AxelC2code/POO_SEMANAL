package Sem03;

public class Ejec_Producto {

    public static void main(String[] args) {
        // Prueba de los constructores y reglas de negocio
        
        System.out.println(">> REGISTRO 1 (Solo codigo y nombre):");
        Producto prod1 = new Producto("A001", "Mouse Inalambrico");
        prod1.mostrarInformacion();
        
        System.out.println("\n>> REGISTRO 2 (Informacion completa):");
        Producto prod2 = new Producto("A002", "Laptop Gaming", "Computadoras", 3500.0, 5);
        prod2.mostrarInformacion();
        
        System.out.println("\n>> PRUEBA DE OPERACIONES:");
        System.out.println("Valor del stock de Laptop: S/ " + prod2.calcularValorStock());
        System.out.println("Precio con 10% de descuento: S/ " + prod2.calcularPrecioConDescuento(10));
        System.out.println("Importe por 2 laptops: S/ " + prod2.calcularImporte(2));
        
        System.out.println("\n>> PRUEBA DE RESTRICCIONES (Errores provocados intencionalmente):");
        prod2.set_precio(-500);
        prod2.calcularPrecioConDescuento(120);
        prod2.calcularImporte(10);
    }
}