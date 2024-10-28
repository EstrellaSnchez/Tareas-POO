package usuarios.pacientes;

import consultas.Consulta;
import expedientes.Expediente;
import usuarios.Usuario;
import usuarios.utils.Rol;
import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Usuario {

    public String tipoSangre;
    public char sexo;
    public Expediente expediente;

    public ArrayList<Consulta> consultas = new ArrayList();

    public Paciente(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String contraseña, String correo, Rol rol, String tipoSangre, char sexo) {
        super(id, nombre, apellidos, fechaNacimiento, telefono, contraseña, correo,  rol);
        this.tipoSangre = tipoSangre;
        this.sexo = sexo;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public char getSexo() {
        return sexo;
    }



   public String mostrarDatos (){
        String datos = String.format("\n Id: %s , Nombre: %s, Apellidos: %s , Fecha de nacimiento: %s, Tipo de sangre: %s, Sexo: %s, Telefono: %s",
                id, nombre, apellidos, fechaNacimiento, tipoSangre, sexo, telefono );
        return datos;
    }


    //@Override  // sobre escribir el medoto de la clase usuario y agregar mas funcionalidades
    public String mostrarInformacion() {
        String datosPaciente = String.format("Tipo de sangre %s, Sexo: %s", tipoSangre, sexo);
         return super.mostrarInformación() + datosPaciente ;
    }

    public String mostrarDatosPorId (String idPaciente){
        String datos = String.format("\n Id: %s , Nombre: %s, Apellidos: %s , Fecha de nacimiento: %s, Tipo de sangre: %s, Sexo: %s, Telefono: %s",
                id, nombre, apellidos, fechaNacimiento, tipoSangre, sexo, telefono );
        return datos;
    }

    public void registarExpediente(Expediente expediente){this.expediente = expediente; }


}
