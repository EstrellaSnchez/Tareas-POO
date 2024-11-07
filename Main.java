import java.util.Scanner;

import productos.Producto;
import productos.Producto.CantidadInvalidaException;
import productos.Producto.PrecioInvalidoException;
import productos.Producto.ProductoInvalidoException;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
      
        try {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad en inventario del producto: ");
            int cantidad = scanner.nextInt();
            

            Producto producto = new Producto(nombre, precio, cantidad);
            producto.mostrarDetalles();



        } catch (ProductoInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PrecioInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (CantidadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}