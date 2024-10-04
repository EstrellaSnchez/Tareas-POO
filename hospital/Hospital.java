package hospital;

import consultas.Consulta;
import consultorios.Consultorio;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Hospital {

    public ArrayList<Paciente> listaPacientes = new ArrayList<>();

    public ArrayList<Medico> listaMedicos= new ArrayList<>();

    public ArrayList<Consulta> listaConsultas = new ArrayList<>();

    public ArrayList<Consultorio> listaConsultorios = new ArrayList<>();

    private ValidadorHospital validador = new ValidadorHospital();

    public void registrarPaciente(Paciente paciente){
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medico medico){
        this.listaMedicos.add(medico);
    }
    // fecha, hora y consultorio disponible

    public void registrarConsulta(Consulta consulta){
        if(!validador.validarDisponibilidadFechaConsulta(consulta.getFechaHora(), consulta.getConsultorio().getNumeroConsultorio(), this.listaConsultas)){
            System.out.println("Ya existe una consulta registrada para esa fecha ");
            return;
        }
        // disponibilidad del medico

        if(!validador.validarDisponibilidadMedico(consulta.getFechaHora(), consulta.getMedico().getId(), this.listaConsultas)){
            System.out.println("El medico no tiene disponibiilidad para esa fecha ");
            return;
        }
        this.listaConsultas.add(consulta);
    }

    public void registrarConsultorio(Consultorio consultorio) {
        this.listaConsultorios.add(consultorio);
    }

    public void mostrarPacientes(){
        System.out.println("Pacientes del hospital: ");
        for(Paciente paciente : this.listaPacientes){
            System.out.println(paciente.mostrarDatos()); ///////

        }
    }
    public void mostrarMedicos(){
        System.out.println("Medicos del hospital: ");
        for(Medico medico : this.listaMedicos){
            System.out.println(medico.mostrarDatosMedicos());

        }
    }
    public void mostrarConsultorios(){
        System.out.println("Consultorios del hospital: ");
        for(Consultorio consultorio : this.listaConsultorios){
            System.out.println(consultorio.mostrarDatosConsultorio());
        }
    }

    public void mostrarConsultas(){
        if(this.listaConsultas.isEmpty()){
            System.out.println("No existen consultas registradas ");
            return;
        }
        for(Consulta consulta : this.listaConsultas){
            System.out.println("Consultas del hospital: ");
            System.out.println(consulta.mostrarDatosConsultas());
        }
    }
    public String generarIdPaciente(){                     // ID que inicie con P - año actual - mes actual - listaPacientes+1 - random 1/100000
        Random random = new Random();

        LocalDate fecha = LocalDate.now();
        int anoActual= fecha.getYear();
        int mesActual= fecha.getMonthValue();
        int longitudPacientes = this.listaPacientes.size() +1 ;
        int numeroAleatorio= random.nextInt(10000);

        String id = String.format("P%d%d%d%d",
                anoActual,mesActual,longitudPacientes,numeroAleatorio);

        return id ; }

    public Paciente obtenerPacientePorId(String idPaciente){
      return listaPacientes.stream().filter(paciente -> paciente.getId().equals(idPaciente)).findFirst().orElse(null);}

    public Consultorio obtenerConsultorioPorId(int idConsultorio){
        return listaConsultorios.stream().filter(consultorio -> consultorio.getId().equals(idConsultorio)).findFirst().orElse(null);
    }


    public Medico obtenerMedicoPorId(String idMedico){
        return listaMedicos.stream().filter(consultorio -> consultorio.getId().equals(idMedico)).findFirst().orElse(null);
    }



    public String mostrarPacientePorId (String idPaciente){
            Paciente paciente = obtenerPacientePorId(idPaciente);

            if (idPaciente != null){
                System.out.println(paciente.mostrarDatos());
            } else System.out.println("Paciente no encontrado");
       return paciente.mostrarDatos();
    }

        public String generarIdMedico(Medico medico) {
            Random random = new Random();
            LocalDate fecha = LocalDate.now();

            String primerasDosLetras = medico.getApellidos().substring(0, 2).toUpperCase();
            String[] fechaMedico = medico.getFechaNacimiento().toString().split("-");
            int añoNacimiento = Integer.parseInt(fechaMedico[0]);
            int ultimoDigito = añoNacimiento % 10;
            int anoActualM= fecha.getYear();
            int numeroAleatorio = 50 + random.nextInt(700000 - 50 + 1);
            int longitudMedico = this.listaMedicos.size() +1 ;

           return String.format("M%s%d%d%d%d",
                    primerasDosLetras,ultimoDigito,numeroAleatorio, anoActualM, longitudMedico);
    }
        public void mostrarMedicoPorId (String idM){
            for (Medico medico : this.listaMedicos){
                if (String.valueOf(medico.getId()).equals(idM)){

                    System.out.println(medico.mostrarDatosMedicos());}
            }
                System.out.println("El ID ingresado es incorrecto");   }

        public String generarIdConsultorio (){
            Random random = new Random();
            LocalDate fecha = LocalDate.now();

            int longitudConsultorio= this.listaConsultorios.size() +1 ;
            int anoActual= fecha.getYear();
            int diaActual= fecha.getMonthValue();
            int numeroAleatorio= random.nextInt(10000);

            String idC = String.format("C%d%d%d%d",
                    longitudConsultorio, anoActual, diaActual, numeroAleatorio);

            return idC;

        }
        public void mostrarConsultorioPorId (String idC){
            for (Consultorio consultorio : this.listaConsultorios){
                if (consultorio.getId().equals(idC)){
                    System.out.println(consultorio.mostrarDatosConsultorio());
                }}
                System.out.println("El ID ingresado es incorrecto");

        }
        public ArrayList<Consulta> getListaConsultas(){
        return listaConsultas;
        }

        public String generarIdConsulta() {
        int diaActual= LocalDate.now().getDayOfMonth();
        int numeroA = new Random().nextInt(10000);
        return String.format ("CO-%d%d%d",
                listaConsultorios.size(),numeroA, diaActual);
    }
    public boolean validarFechaConsulta(LocalDateTime fechaDeseada){
        return this.validador.validarFecha(fechaDeseada);
    }

    public boolean validarNumeroPaciente (String numeroPaciente){
        return this.validador.existeNumeroPaiente(listaPacientes,numeroPaciente);
    }

    public boolean validarNumeroMedico (String numeroMedico){
        return this.validador.existeNumeroMedico(listaMedicos,numeroMedico);
    }

    public boolean validarRfc (String RfcMedico){
        return this.validador.existeRfc(listaMedicos,RfcMedico);
    }

    public void mostrarConsultasMedico (String idMedico){
        for (Consulta consulta : this.listaConsultas){
            if (consulta.getMedico().equals(idMedico)){
                System.out.println(consulta.mostrarDatosConsultas());
            }}
    }

    public void mostrarPacientesMedico (String idMedico){
        for (Consulta consulta : this.listaConsultas){
            if (consulta.getMedico().id.equals(idMedico)){
               String idPaciente= consulta.paciente.getId();
                System.out.println(obtenerPacientePorId(idPaciente).mostrarDatos());
            }}
    }

    public void mostrarConsultasPaciente (String idPaciente){
        for (Consulta consulta : this.listaConsultas){
            if (consulta.getPaciente().id.equals(idPaciente)){
                System.out.println(consulta.mostrarDatosConsultas());
            }}
        }


}
