package consultas;

import consultorios.Consultorio;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;

import java.time.LocalDateTime;
import java.util.Random;

public class Consulta {

    public String id;
    public LocalDateTime fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;
    public Random random = new Random();

    public Consulta(LocalDateTime fechaHora,Paciente paciente , Medico medico, Consultorio consultorio) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }

    public String getId() {
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
        String datos = String.format("\n Id: %d , Fecha: %s, Paciente: %s, Medico: %s, Consultorio: %s",
                id, fechaHora,paciente,medico,consultorio );
        return datos;
    }
}