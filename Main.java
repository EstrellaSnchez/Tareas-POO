import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        Categoria categoria= new Categoria();
        int opcion = 0;

        while (opcion != 6) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Mostrar productos");
            System.out.println("4. Mostrar categorías ");
            System.out.println("5. Registrar categorías");
            System.out.println("6. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            scanner.nextLine();

            switch (opcion) {
                case 1:
                   /* if (!inventario.validarExistenciaDeCategorias() /* == Falso)) {
                        System.out.println("No existen categorías en el sistema");
                        break;*/


                    System.out.println("\nSeleccionaste la opción para registrar un producto");

                    System.out.println("Ingresa el nombre del producto");
                    String nombre = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el precio del producto");
                    double precio = scanner.nextDouble();

                    scanner.nextLine();

                    System.out.println("Ingresa la descripción del producto");
                    String descripcion = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el Id de la categoríia en la cual registraras el producto");
                    int idCategoria = scanner.nextInt();

                    scanner.nextLine();

                    System.out.println("Ingresa el stock del producto");
                    int stock = scanner.nextInt();

                    /// System.out.println(nombre);

                    Producto producto = new Producto(nombre, precio, descripcion, idCategoria, stock);
                    inventario.registrarProducto(producto);

                    System.out.println("\nProducto registrado correctamente");
                    break;
                case 2:
                    System.out.println("\nSeleccionaste la opción para eliminar un producto");

                    System.out.println("Ingresa el ID del producto: ");
                    int id = scanner.nextInt();

                    inventario.eliminarProducto(id);
                    break;
                case 3:
                    inventario.mostrarProductos();
                    break;

                case 4:
                    if (!inventario.validarExistenciaDeCategorias() /* == Falso)*/) {
                        System.out.println("No existen categorías en el sistema");
                        break;
                    }
                    inventario.mostrarCategorias();
                    break;
                //Tarea Crear un metodo para listar las categorías y sus productos

                case 5:
                    System.out.println("\nSeleccionaste la opción para registrar una categoría");
                    System.out.println("Ingresa el nombre de la categoría: ");
                    String nombreCategoria = scanner.nextLine();
                    categoria = new Categoria(nombreCategoria);
                    inventario.registrarCategoria(categoria);
                    System.out.println("\nCategoría registrada correctamente ");
                    break;

                case 6:
                    System.out.println("Hasta luego");
                    return;
            }
        }
    }
    }