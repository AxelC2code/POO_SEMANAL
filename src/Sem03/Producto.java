package Sem03;

public class Producto {
    // 1. Atributos
    private String codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    // 2. Constructores
    // Inicialmente solo se conoce código y nombre
    public Producto(String p_codigo, String p_nombre) {
        this.codigo = p_codigo;
        this.nombre = p_nombre;
        this.categoria = "Sin registrar";
        this.precio = 0.0;
        this.stock = 0;
    }

    // Se conoce código, nombre y precio
    public Producto(String p_codigo, String p_nombre, double p_precio) {
        this.codigo = p_codigo;
        this.nombre = p_nombre;
        this.categoria = "Sin registrar";
        this.stock = 0;
        
        if (p_precio >= 0) {
            this.precio = p_precio;
        } else {
            this.precio = 0.0;
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }

    // Se dispone de toda la información
    public Producto(String p_codigo, String p_nombre, String p_categoria, double p_precio, int p_stock) {
        this.codigo = p_codigo;
        this.nombre = p_nombre;
        this.categoria = p_categoria;
        
        if (p_precio >= 0) { this.precio = p_precio; } else { this.precio = 0.0; }
        if (p_stock >= 0) { this.stock = p_stock; } else { this.stock = 0; }
    }

    // 3. Getters y Setters
    public void set_codigo(String p_codigo) { this.codigo = p_codigo; }
    public String get_codigo() { return this.codigo; }

    public void set_nombre(String p_nombre) { this.nombre = p_nombre; }
    public String get_nombre() { return this.nombre; }

    public void set_categoria(String p_categoria) { this.categoria = p_categoria; }
    public String get_categoria() { return this.categoria; }

    public void set_precio(double p_precio) {
        if (p_precio >= 0) {
            this.precio = p_precio;
        } else {
            System.out.println("Error: El precio no puede ser negativo.");
        }
    }
    public double get_precio() { return this.precio; }

    public void set_stock(int p_stock) {
        if (p_stock >= 0) {
            this.stock = p_stock;
        } else {
            System.out.println("Error: El stock no puede ser negativo.");
        }
    }
    public int get_stock() { return this.stock; }

    // 4. Comportamientos (Métodos)
    public double calcularValorStock() {
        return this.precio * this.stock;
    }

    public double calcularPrecioConDescuento(double descuentoPorcentaje) {
        if (descuentoPorcentaje >= 0 && descuentoPorcentaje <= 100) {
            return this.precio - (this.precio * (descuentoPorcentaje / 100));
        } else {
            System.out.println("Error: El descuento debe estar entre 0% y 100%.");
            return this.precio; 
        }
    }

    public double calcularImporte(int cantidadVender) {
        if (cantidadVender <= this.stock) {
            return this.precio * cantidadVender;
        } else {
            System.out.println("Error: La cantidad a vender no puede ser mayor que el stock disponible.");
            return 0.0;
        }
    }

    public void mostrarInformacion() {
        System.out.println("--- DATOS DEL PRODUCTO ---");
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Precio: S/ " + this.precio);
        System.out.println("Stock: " + this.stock);
        System.out.println("--------------------------");
    }
}