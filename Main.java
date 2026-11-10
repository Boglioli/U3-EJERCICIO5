public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("po1", "parlante", 150000, 5);
        producto.registrarVenta(3);
        producto.registrarVenta(6);
        producto.registrarVenta(2);
        producto.registrarIngresoStock(5);
        producto.mostrarEstado();
    }
}