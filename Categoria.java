import java.util.ArrayList;
import java.util.Random;

public class Categoria {
      public static int id;
    public String nombre;
    public ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public Random random = new Random();

    public Categoria(String nombre) {
        this.id = this.random.nextInt();
        this.nombre = nombre;
    }

    public Categoria() {
        this.id = this.random.nextInt();
        this.nombre = nombre;
    }

    public void RegistrarProducto (Producto prodcto){
        this.listaProductos.add(prodcto);
    }

    public String mostrarCategoria() {
        return String.format("ID: %d Nombre: %s",
                id,
                nombre);

    }
}
