package hospital;


import consultas.Consulta;
import usuarios.medicos.Medico;
import usuarios.pacientes.Paciente;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ValidadorHospital {

    public boolean validarDisponibilidadFechaConsulta(LocalDateTime fechaDeseada,int getnumeroConsultorio, ArrayList<Consulta> listaConsultas) {
        for (Consulta consulta : listaConsultas) {
            if (consulta.getFechaHora().isEqual(fechaDeseada) && getnumeroConsultorio == consulta.getConsultorio().getNumeroConsultorio());
            return false;}


        return true; }


    public boolean validarDisponibilidadMedico (LocalDateTime fechaDeseada, String idMedico, ArrayList<Consulta> listaConsultas ) {

            for (Consulta consulta : listaConsultas) {
                if (consulta.getFechaHora().isEqual(fechaDeseada) && consulta.getMedico().getId().equals(idMedico))
                    return false;
            }
         return true; }

    public boolean validarFecha(LocalDateTime fechaDeseada) {
     LocalDateTime fechaActual = LocalDateTime.now();
     if(fechaDeseada.isBefore(fechaActual))
         return false;
     return true;
    }

    public boolean existeNumeroPaiente (ArrayList<Paciente> numeroPaciente, String nuevoNumero) {
        for (Paciente paciente : numeroPaciente) {
            if (paciente.getTelefono().equals(nuevoNumero)) {
                return true;
            }
        }
        return false;
    }


    public boolean existeNumeroMedico (ArrayList<Medico> NumeroMedico, String nuevoNumero) {
        for (Medico medico: NumeroMedico) {
            if (medico.getTelefono().equals(nuevoNumero)) {
                return true;
            }
        } return false;
    }

    public boolean existeRfc(ArrayList<Medico> RFCMedico, String nuevoRfc) {
        for (Medico medico: RFCMedico) {
            if (medico.getRfc().equals(nuevoRfc)) {
                return true;
            }
        } return false;
    }

}
