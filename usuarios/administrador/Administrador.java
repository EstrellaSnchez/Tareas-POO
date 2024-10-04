package usuarios.administrador;
import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;

public class Administrador extends Usuario {
    public String sueldo;
    public String añosServicio;
    public String rfc;


    public Administrador(String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String contraseña, Rol rol,String sueldo, String añosServicio, String rfc) {
        super(nombre, apellidos, fechaNacimiento, telefono, contraseña,rol, sueldo, añosServicio, rfc);

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
}