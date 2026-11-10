public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    public Producto(String codigo, String nombre, double precio, int stock) {
this.codigo = codigo;
this.nombre = nombre;
this.precio = precio;
this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    public void registrarIngresoStock(int cantidad) {
        if (cantidad > 0) {
            stock = stock + cantidad;
            System.out.println("ingreso registrado correctamente");
        } else {
            System.out.println("la cantidad debe ser positiva");
        }
    }
    public void registrarVenta(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("la cantidad debe ser positiva");
        } else if(cantidad <= stock) {
            stock = stock - cantidad;
            System.out.println("venta realizada correctamente");
        } else {
            System.out.println("venta rechazada: stock insuficiente");
        }
    }
    public void mostrarEstado() {
        System.out.println("codigo: " + codigo);
        System.out.println("nombre: " + nombre);
        System.out.println("precio: $ " + precio);
        System.out.println("stock final: " + getStock());
    }
}
