public class Main {
    public static void main(String[] args) {
        import consultorios.Consultorio;
        import hospital.ValidadorHospital;
        import medicos.Medico;
        import pacientes.Paciente;
        import hospital.Hospital;
        import consultas.Consulta;
        
        import java.time.LocalDate;
        import java.time.LocalDateTime;
        import java.util.Scanner;
        
        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Hospital hospital = new Hospital();
                ValidadorHospital validadorHospital = new ValidadorHospital();
        
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
        
                            System.out.println("\nSeleccionaste la opción para registrar un paciente");
        
                            String id = hospital.generarIdPaciente();
                            System.out.println(id);
        
                            System.out.println("Ingresa el nombre del paciente: ");
                            String nombre = scanner.nextLine();
        
                            scanner.nextLine();
        
                            System.out.println("Ingresa los apellidos del paciente: ");
                            String apellidos = scanner.nextLine();
        
                            scanner.nextLine();
        
                            System.out.println("Ingresa el año de nacimiento: ");
                            int año = scanner.nextInt();
        
                            System.out.println("Ingresa el mes de nacimiento:");
                            int mes = scanner.nextInt();
        
                            System.out.println("Ingresa el dia de nacimiento: ");
                            int dia = scanner.nextInt();
        
                            LocalDate fechaDeNacimientoPaciente = LocalDate.of(año, mes, dia);
        
                            scanner.nextLine();
        
                            System.out.println("Ingresa el tipo de sangre del paciente: ");
                            String tipoDeSangre = scanner.nextLine();
        
                            scanner.nextLine();
        
                            System.out.println("Ingresa el sexo del paciente: ");
                            char sexo = scanner.next().charAt(0);
        
                            System.out.println("Ingresa el numero de telefono del paciente: ");
                            String telefono = scanner.nextLine();
        
                            if(!hospital.validarNumeroPaciente(telefono)) {
                                System.out.println("\n Este numero de telefono ya fue registrado, por favor ingrese una válido:");
                                return;}
        
                            scanner.nextLine();
        
                            Paciente paciente = new Paciente(id, nombre, apellidos, fechaDeNacimientoPaciente, telefono, tipoDeSangre, sexo);
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
        
                            System.out.println("Ingresa el año de nacimiento: ");
                            int añoMedico = scanner.nextInt();
        
                            System.out.println("Ingresa el mes de nacimiento:");
                            int mesMedico = scanner.nextInt();
        
                            System.out.println("Ingresa el dia de nacimiento: ");
                            int diaMedico = scanner.nextInt();
        
                            LocalDate fechaDeNacimientoMedico = LocalDate.of(añoMedico, mesMedico, diaMedico);
        
                            scanner.nextLine();
        
                            System.out.println("Ingresa el telefono del medico: ");
                            String telefonoMedico = scanner.nextLine();
        
                            if(!hospital.validarNumeroPaciente(telefonoMedico)) {
                                System.out.println("\n Este numero de telefono ya fue registrado, por favor ingrese una válido:");
                                return;}
        
                            scanner.nextLine();
        
                            System.out.println("Ingresa el RFC del medico: ");
                            String rfc = scanner.nextLine();
        
                            if(!hospital.validarRfc(rfc)) {
                                System.out.println("\n Este RFC ya fue registrado, por favor ingrese uno válido:");
                                return;}
        
                            scanner.nextLine();
                            Medico medicoT = new Medico(nombreMedico, apellidosMedico, fechaDeNacimientoMedico, telefonoMedico, rfc);
        
                            Medico medico = new Medico(hospital.generarIdMedico(medicoT), nombreMedico, apellidosMedico, fechaDeNacimientoMedico, telefonoMedico, rfc);
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
                                return;
                            }
        
                            Consulta consulta = new Consulta(fechaConsulta, idPaciente, idMedico, consultorioId);
        
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
        
                        default:
                            break;
        
        }}

    }}