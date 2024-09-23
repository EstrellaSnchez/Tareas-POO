import medicos.Medico;
import pacientes.Paciente;
import consultorios.Consultorio;
import java.util.Random;

public class Consulta {

    public static int id;
    public String fechaHora;
    public Paciente paciente;
    public Medico medico;
    public Consultorio consultorio;
    public Random random = new Random();

    public Consulta(String fechaHora, int idPaciente, int idMedico, int numeroConsultorio) {
        this.id = this.random.nextInt();
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }

    public int getId() {
        return id;
    }

    public String getFechaHora() {
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
}

