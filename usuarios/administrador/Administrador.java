package usuarios.administrador;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Administrador extends Usuario {
    public String sueldo;
    public String añosServicio;
    public String rfc;


    public Administrador( String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono,
                          String contraseña, String correo,  Rol rol,String sueldo, String añosServicio, String rfc) {

        super(id, nombre,apellidos, fechaNacimiento , telefono, contraseña, correo, rol.ADMIN);

        this.rfc = rfc;
        this.sueldo = sueldo;
        this.añosServicio= añosServicio;

    }

    public String getSueldo() {
        return sueldo;
    }

    public String getAñosServicio() {
        return añosServicio;
    }

    public String getRfc() {
        return rfc;
    }

    public String mostrarDatosAdministrador () {
        String datos = String.format("\n Id %d , Nombre %s, Apellidos %s , Fecha de nacimiento %s, telefono %s, rfc %s, Sueldo: %s , Años de servicio: %s",
                id, nombre, apellidos, fechaNacimiento, telefono, rfc, sueldo, añosServicio);
        return datos;
    }
}
