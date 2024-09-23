import medicos.Medico;
import pacientes.Paciente;
import hospital.Hospital;
import consultas.Consulta;
import consultorios.java.Consultorio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();
        /////////////// Medico medico = new Medico();

        int opcion = 0;

        while (opcion != 12) {

            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar medico");
            System.out.println("3. Registrar consultorio");
            System.out.println("4. Registrar consulta ");
            System.out.println("5. Mostar pacientes ");
            System.out.println("6. Mostar medicos");
            System.out.println("7. Mostrar consultorios ");
            System.out.println("8. Mostrar consultas");
            System.out.println("9. Buscar paciente por ID");
            System.out.println("10. Buscar medico por ID");
            System.out.println("11. Buscar consultorio por ID");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    // ID que inicie con P - año actual - mes actual - listaPacientes+1 - random 1/100000
                    String id = hospital.generarIdPaciente();
                    System.out.println(id);

                    System.out.println("\nSeleccionaste la opción para registrar un paciente");

                    System.out.println("Ingresa el nombre del paciente: ");
                    String nombre = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa los apellidos del paciente: ");
                    String apellidos = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa la fecha de nacimiento del paciente: ");
                    String fechaDeNacimiento = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el tipo de sangre del paciente: ");
                    String tipoDeSangre = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el sexo del paciente: ");
                    char sexo = scanner.next().charAt(0);

                    System.out.println("Ingresa el numero de telefono del paciente: ");
                    String telefono = scanner.nextLine();

                    scanner.nextLine();

                    Paciente paciente = new Paciente(id, nombre, apellidos, fechaDeNacimiento, telefono, tipoDeSangre, sexo);
                    hospital.registrarPaciente(paciente);

                    System.out.println("\nPaciente registrado correctamente ");
                    break;

                case 2:

                    System.out.println("\nSeleccionaste la opción para registrar un medico");

                    System.out.println("Ingresa el nombre del medico: ");
                    String nombreMedico = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa los apellidos del medico: ");
                    String apellidosMedico = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa la fecha de nacimiento: ");
                    String fechaDeNacimientoMedico = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el telefono del medico: ");
                    String telefonoMedico = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el tipo de sangre del medico: ");
                    String rfc = scanner.nextLine();

                    scanner.nextLine();

                    Medico medico = new Medico(nombreMedico, apellidosMedico, fechaDeNacimientoMedico, telefonoMedico, rfc);
                    hospital.registrarMedico(medico);


                case 3:

                    System.out.println("\nSeleccionaste la opción para registrar un consultorio ");

                    System.out.println("Ingrese el piso en el que se encuentra el consultorio: ");
                    int piso = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese el número del consultorio: ");
                    int numeroConsultorio = scanner.nextInt();

                    Consultorio consultorio = new Consultorio(numeroConsultorio,piso);
                    hospital.registrarConsultorio(consultorio);

                    break;

                case 4:

                    System.out.println("\nSeleccionaste la opción para registrar una consulta ");

                    System.out.print("Ingrese el ID del paciente: ");
                    int idPaciente = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el ID del médico: ");
                    int idMedico = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese el número del consultorio: ");
                    int numeroConsultorioDeseado = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Ingrese la fecha y hora de la consulta: ");
                    String fechaHora = scanner.nextLine();

                    Consulta consulta = new Consulta(fechaHora,idPaciente,idMedico,numeroConsultorioDeseado);
                    hospital.registrarConsulta(consulta);

                    System.out.println("Consultorio registrado correctamente ");
                    break;

                case 5:

                    System.out.println("Estos son los pacientes registrados actualmente: ");
                    hospital.mostrarPacientes();
                    break;

                case 6:

                    System.out.println("\n Estos son los medicos registrados actualmente: ");
                    hospital.mostrarMedicos();
                    break;

                case 7:

                    System.out.println("Estos son los consultorio actuales: ");
                    hospital.mostrarConsultorios();
                    break;

                case 8:

                    System.out.println("Estas son las consultas registradas: ");
                    hospital.mostrarConsultas();
                    break;

                case 9:
                    System.out.println("Buscar paciente ");
                    System.out.println("Ingresa el id del paciente: ");
                    String pacienteId = scanner.nextLine();
                    hospital.mostrarPacientePorId(pacienteId);

                case 10:
                    System.out.println("Buscar medico \n Ingresa el id del medico: ");
                    String medicoId = scanner.nextLine();
                    hospital.mostrarMedicoPorId(medicoId);
                    return;

                case 11:
                    System.out.println("Buscar consultorio \n Ingresa el id del consultorio: ");
                    String consultorioId = scanner.nextLine();
                    hospital.mostrarConsultorioPorId(consultorioId);
                    return;
                case 12:

            }


        }
}}
