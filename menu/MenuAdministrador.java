package menu;

import consultas.Consulta;
import consultorios.Consultorio;
import hospital.Hospital;
import usuarios.administrador.Administrador;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;
import usuarios.utils.Rol;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuAdministrador {
    Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {

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
            System.out.println("12. Consultar mi información");
            System.out.println("13. Salir ");
            int opcion = scanner.nextInt();
     return opcion; }


    public int procesarDatosMenu(int opcion,Hospital hospital, Administrador administrador) {
        switch (opcion) {
            case 1:

                System.out.println("\nSeleccionaste la opción para registrar un paciente");

                String id = hospital.generarIdPaciente();
                System.out.println(id);

                ArrayList<String> datosPaciente = this.obtenerDatosComun(Rol.PACIENTE);

                String nombrePaciente = datosPaciente.get(0);
                String apellidoPaciente = datosPaciente.get(1);
                LocalDate fechaNacimientoPaciente= LocalDate.parse(datosPaciente.get(2));
                String numeroTelefonoPaciente = datosPaciente.get(3);
                String contraseñaPaciente = datosPaciente.get(4);


                System.out.println("Ingresa el tipo de sangre del paciente: ");
                String tipoDeSangre = scanner.nextLine();

                scanner.nextLine();

                System.out.println("Ingresa el sexo del paciente: ");
                char sexo = scanner.next().charAt(0);

                    /*if(!hospital.validarNumeroPaciente(telefono)) {
                        System.out.println("\n Este numero de telefono ya fue registrado, por favor ingrese una válido:");
                        return;}*/

                Paciente paciente = new Paciente(id, nombrePaciente, apellidoPaciente, fechaNacimientoPaciente,
                        numeroTelefonoPaciente, contraseñaPaciente, Rol.PACIENTE, tipoDeSangre, sexo);

                hospital.registrarPaciente(paciente);

                System.out.println("\nPaciente registrado correctamente ");
                break;

            case 2:

                System.out.println("\nSeleccionaste la opción para registrar un medico");

                ArrayList<String> datosMedico = this.obtenerDatosComun(Rol.MEDICO);

                String nombreMedico = datosMedico.get(0);
                String apellidoMedico = datosMedico.get(1);
                LocalDate fechaNacimientoMedico= LocalDate.parse(datosMedico.get(2));
                String numeroTelefonoMedico = datosMedico.get(3);
                String contraseñaMedico = datosMedico.get(4);

                    /*if(!hospital.validarNumeroPaciente(telefonoMedico)) {
                        System.out.println("\n Este numero de telefono ya fue registrado, por favor ingrese una válido:");
                        return;}*/

                System.out.println("Ingresa el RFC del medico: ");
                String rfc = scanner.nextLine();

                    /*if(!hospital.validarRfc(rfc)) {
                        System.out.println("\n Este RFC ya fue registrado, por favor ingrese uno válido:");
                        return;}*/

                id="1";
                Medico medicoT = new Medico(id, nombreMedico, apellidoMedico, fechaNacimientoMedico, numeroTelefonoMedico,
                        contraseñaMedico,Rol.MEDICO, rfc);


                Medico medico = new Medico(hospital.generarIdMedico(medicoT), nombreMedico, apellidoMedico,
                        fechaNacimientoMedico, numeroTelefonoMedico, contraseñaMedico,Rol.MEDICO, rfc);
                hospital.registrarMedico(medico);

                break;


            case 3:

                System.out.println("\nSeleccionaste la opción para registrar un consultorio ");

                System.out.println("Ingrese el piso en el que se encuentra el consultorio: ");
                int piso = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Ingrese el número del consultorio: ");
                int numeroConsultorio = scanner.nextInt();

                Consultorio consultorio = new Consultorio(hospital.generarIdConsultorio(), numeroConsultorio, piso);
                hospital.registrarConsultorio(consultorio);

                break;

            case 4:

                System.out.println("\nSeleccionaste la opción para registrar una consulta ");
                String idConsulta = hospital.generarIdConsulta();

                System.out.println("Ingresa el dia deseado para consulta:");
                int diaConsulta = scanner.nextInt();

                scanner.nextLine();
                System.out.println("Ingresa el mes deseado para consulta: ");
                int mesConsulta = scanner.nextInt();

                System.out.println("Ingresa el año de la consulta: ");
                int añoConsulta = scanner.nextInt();

                System.out.println("Ingresa la hora de la consulta: ");
                int horaConsulta = scanner.nextInt();

                System.out.println("Ingresa los minutos de la consulta: ");
                int minutoConsulta = scanner.nextInt();

                Paciente pacienteConsulta = null;

                while (pacienteConsulta == null) {
                    System.out.println("Ingresa el id del paciente: ");
                    String idPaciente = scanner.nextLine();
                    pacienteConsulta = hospital.obtenerPacientePorId(idPaciente);

                    if(pacienteConsulta == null) {
                        System.out.println("\n Ingresa un ID válido:");
                    }
                }

                Medico medicoConsulta = null;
                while (medicoConsulta == null) {
                    System.out.println("Ingresa el id del medico: ");
                    String idMedico = scanner.nextLine();
                    medicoConsulta= hospital.obtenerMedicoPorId(idMedico);}

                Consultorio consultorioConsulta = null;
                while (consultorioConsulta == null) {
                    System.out.println("Ingrese el id del consultorio:");
                    int consultorioId = scanner.nextInt();
                    consultorioConsulta = hospital.obtenerConsultorioPorId(consultorioId);}

                LocalDateTime fechaConsulta = LocalDateTime.of(añoConsulta, mesConsulta, diaConsulta, horaConsulta, minutoConsulta);
                if(!hospital.validarFechaConsulta(fechaConsulta)) {
                    System.out.println("\n La fecha no puede estar en el pasado, ingrese una fehca correcta:");
                     } ////7

                Consulta consulta = new Consulta(fechaConsulta, pacienteConsulta, medicoConsulta, consultorioConsulta);

                hospital.registrarConsulta(consulta);

                System.out.println("Consultorio registrado correctamente ");
                break;

            case 5:

                System.out.println("Estos son los usuarios.pacientes registrados actualmente: ");
                hospital.mostrarPacientes();
                break;

            case 6:

                System.out.println("\n Estos son los usuarios.medicos registrados actualmente: ");
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
                System.out.println("Buscar paciente por ID ");
                System.out.println("Ingresa el id del paciente: ");
                String pacienteId = scanner.nextLine();
                hospital.mostrarPacientePorId(pacienteId);
                break;

            case 10:
                System.out.println("Buscar medico \n Ingresa el id del medico: ");
                String medicoId = scanner.nextLine();
                hospital.mostrarMedicoPorId(medicoId);
                break;

            case 11:
                System.out.println("Buscar consultorio \n Ingresa el id del consultorio: ");
                String consultorioId = scanner.nextLine();
                hospital.mostrarConsultorioPorId(consultorioId);
                break;

            case 12:
                hospital.mostrarAdminPorId(administrador.getId());
                break;
            case 13:
                System.out.println("Hasta luego ");
                break;

        } return opcion;
    }

    private ArrayList<String> obtenerDatosComun(Rol rol ){
        String tipoUsuario =rol == Rol.PACIENTE ? "paciente" : rol == Rol.MEDICO ? "medico" : "administrador" ; /// operador ternario
        ArrayList<String> datosEnComun = new ArrayList<>();

        System.out.println(String.format("Ingresa el nombre del %s: ",  tipoUsuario));
        String nombre = scanner.nextLine();
        datosEnComun.add(nombre);

        scanner.nextLine();

        System.out.println(String.format("Ingresa los apellidos del %s: " , tipoUsuario));
        String apellidos = scanner.nextLine();
        datosEnComun.add(apellidos);
        scanner.nextLine();

        System.out.println(String.format("Ingresa el año de nacimiento del %s: " , tipoUsuario));
        int año = scanner.nextInt();

        System.out.println(String.format("Ingresa el mes de nacimiento del %s:", tipoUsuario));
        int mes = scanner.nextInt();

        System.out.println(String.format("Ingresa el dia de nacimiento del %s: ", tipoUsuario));
        int dia = scanner.nextInt();

        LocalDate fechaDeNacimiento = LocalDate.of(año, mes, dia);
        datosEnComun.add(fechaDeNacimiento.toString());


        System.out.println(String.format("Ingresa el numero de telefono del %s: " , tipoUsuario));
        String telefono = scanner.nextLine();
        datosEnComun.add(telefono);

        System.out.println(String.format("Ingresa la contraseña del %s: " , tipoUsuario));
        String contraseña = scanner.nextLine();
        datosEnComun.add(contraseña);


        return datosEnComun; }

    }

