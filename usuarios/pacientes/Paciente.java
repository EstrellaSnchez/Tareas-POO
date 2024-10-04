package usuarios.pacientes;

import usuarios.Usuario;
import usuarios.utils.Rol;
import java.time.LocalDate;

public class Paciente extends Usuario {

    public String tipoSangre;
    public char sexo;


    public Paciente(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String contraseña, Rol rol, String tipoSangre, char sexo) {
        super(id, nombre, apellidos, fechaNacimiento, telefono, contraseña, rol);
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
}
