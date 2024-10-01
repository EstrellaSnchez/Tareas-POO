package consultas;

import consultorios.Consultorio;
import medicos.Medico;
import pacientes.Paciente;

import java.time.LocalDateTime;
import java.util.Random;

public class Consulta {

    public static int id;
    public LocalDateTime fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;
    public Random random = new Random();

    public Consulta(LocalDateTime fechaHora, String idPaciente, String idMedico, int numeroConsultorio) {
        this.id = this.random.nextInt();
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }

    public String mostrarDatosConsultas () {
        String datos = String.format("\n Id %d , fecha y hora %s, paciente %s, medico %s, consultorio %s",
                id, fechaHora,paciente,medico,consultorio );
        return datos;
    }
}