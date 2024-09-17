public class producto {
    private String nombre;
    private double precio;
    private int stock;

public producto (String nombre, double precio, int stock){
    this.nombre=nombre;
    this.precio=precio;
    this.stock=stock;
}
public producto (String nombre, double precio){
    this.nombre=nombre;
    this.precio=precio;
    this.stock=0;
}

public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    if (nombre == null) System.out.println("El nombre no puede ser nulo."); 
    this.nombre = nombre;}

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    if (precio < 0) {
     System.out.println("El precio no puede ser negativo.");}
     this.precio = precio;
  }
  public int getStock() {
    return  stock;
  }

  public void setStock(int stock) {
    if (stock < 0) { System.out.println("El stock no puede ser negativo");
   this.stock = stock;
  }

  public void aumentarStock(int cantidad){
    if (cantidad <= 0) {
        System.out.println("El numero ingresado debe ser mayor que cero"); }
    this.stock += cantidad; }

    public void reducirStock(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("El numero ingresado debe ser mayor que cero.");
        }
        if (cantidad > this.stock) {
            System.out.println("La cantidad a eliminar no puede ser mayor que el stock actual.");
        }
        this.stock -= cantidad;


}}
}
