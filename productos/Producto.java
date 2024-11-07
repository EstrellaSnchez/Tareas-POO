package productos;

public class Producto {
    
    public String nombre;
    public double precio;
    public int cantidad;


        // Excepciones personalizadas como clases estáticas internas
        public static class ProductoInvalidoException extends Exception {
            public ProductoInvalidoException(String mensaje) {
                super(mensaje);
            }
        }
    
        public static class PrecioInvalidoException extends Exception {
            public PrecioInvalidoException(String mensaje) {
                super(mensaje);
            }
        }
    
        public static class CantidadInvalidaException extends Exception {
            public CantidadInvalidaException(String mensaje) {
                super(mensaje);
            }
        }

    public Producto(String nombre, double precio, int cantidad) throws ProductoInvalidoException, PrecioInvalidoException, CantidadInvalidaException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new ProductoInvalidoException("El nombre del producto no puede estar vacío.");
        }
        if (precio <= 0) {
            throw new PrecioInvalidoException("El precio del producto debe ser mayor a cero.");
        }
        
        if (cantidad < 0) {
            throw new CantidadInvalidaException("La cantidad del producto no puede ser negativa.");
        }

        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularValorTotal() {
        double valorTotal = this.precio * this.cantidad;
        return valorTotal;
    }

    public String mostrarDetalles() {
     return String.format("\n Nombre: %s , Precio: %d, Cantidad en inventario: %d, Valor total: %d", nombre, precio, cantidad, calcularValorTotal() );
    }
}
