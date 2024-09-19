import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 2) {
            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("Si usted es un paciente elija 1, si es un medico elija 2 ");
            System.out.println("Selecciona una opción: ");
            opcion = scanner.nextInt();

        switch (opcion) {

        case 1: int opcion1=0;
            System.out.println("1. Solicitar cita ");
            System.out.println("2. Consultar citas ");
            System.out.println("3. Cancelar cita ");
            System.out.println("4. Consultar historial medico ");
            System.out.println("5. Salir");

            switch (opcion1) {
                case 1:
                break;

                case 2: 
                break;

                case 3: 
                break;

                case 4: 
                break;

                case 5:
                System.out.println("Hasta luego");
                break;
                
            } break;

            case 2: int opcion2 = 0;
                System.out.println("1. Consultar citas ");
                System.out.println("2. Agregar cita");
                System.out.println("3. Consultar historial medico ");
                System.out.println("4. Actualizar historial medico ");
                System.out.println("5. Consultar disponibilidad de consultorio ");
                System.out.println("6. Salir");
            switch (opcion2){
                case 1: 
                break;

                case 2: 
                break;

                case 3: 
                break;

                case 4: 
                break;

                case 5:
                break;

                case 6:
                System.out.println("Hasta luego");
                break;
            }
                break;



        }


        }
}

    }