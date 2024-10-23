package menu;

import hospital.Hospital;
import usuarios.medicos.Medico;

import java.util.Scanner;

public class MenuMedico {
    Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {

            System.out.println("SISTEMA HOSPITAL ");
            System.out.println("1. Ver mis consultas "); ////////7
            System.out.println("2. Ver mis pacientes ");
            System.out.println("3. Consultar paciente");
            System.out.println("4. Consultar expediente ");
            System.out.println("5. Completar consulta");
            System.out.println("6. Ver mi información "); ///////////
            System.out.println("7. Salir");

            System.out.println("Seleccione una opcion");
            int opcion= scanner.nextInt();}


    public int procesarDatosMenu(int opcion, Medico medico, Hospital hospital) {
        switch (opcion){

            case 1:
                System.out.println("Estas son sus consultas registradas: ");
                hospital.mostrarConsultasMedico(medico.getId());

                break;
            case 2:

                System.out.println("Estos son sus pacientes registrados: ");
                System.out.println("Ingrese el ID del médico: ");
                String idMed = scanner.nextLine();

                hospital.mostrarPacientesMedico(idMed);

                break;
            case 3:

                System.out.println("");

                break;
            case 6:
                System.out.println("Estos son tus datos registrados: ");
                medico.mostrarDatosMedicoPorId(medico.getId());

                break; }

         return opcion;}


    }
