import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        Curso curso1= new Curso("Programación","B-12", "Eder Cisneros");
        Curso curso2= new Curso("Estadística","C-01", "Villaseñor");
        Curso curso3= new Curso("Matematicas discretas","A-18", "Murillo");

        Estudiante estudiante1= new Estudiante("Estrella Sánchez", 2505);
        Estudiante estudiante2 = new Estudiante("Marisol Hernández", 2202);

        System.out.println(estudiante1.mostrarInformacion());
        System.out.println(curso1.mostrarInformacion());

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar curso");
            System.out.println("2. Dar de baja un curso");
            System.out.println("3. Mostrar cursos");
            System.out.println("4. Salir");

            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nSeleccionaste la opción para registrar un curso");

                    System.out.println("Ingresa el ID del curso");
                    String nombre = scanner.nextLine();
                    estudiante1.

                    scanner.nextLine();
    }

    }}}