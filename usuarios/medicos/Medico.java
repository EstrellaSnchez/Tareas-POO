package usuarios.medicos;

import usuarios.Usuario;
import usuarios.utils.Rol;

import java.time.LocalDate;
import java.util.Random;

public class Medico extends Usuario {

    public String rfc;

    public Random random = new Random();

    public Medico(String idMedico, String nombre,String apellidos, LocalDate fechaNacimiento, String telefono, String contraseña, String correo, Rol rol, String rfc) {
        super(idMedico , nombre,apellidos, fechaNacimiento , telefono, contraseña, correo,  rol);

        this.rfc = rfc;
    }

    public String getRfc() {
        return rfc;
    }


    //@Override
    public String mostrarInformacion() {
        return super.mostrarInformación()+ String.format("\nRFC: %s",rfc);
    }

  public String mostrarDatosMedicos (){
        String datos = String.format("\n Id %d , Nombre %s, Apellidos %s , Fecha de nacimiento %s, telefono %s, rfc %s",
                id, nombre, apellidos, fechaNacimiento, telefono, rfc);
        return datos;
    }

    public String mostrarDatosMedicoPorId (String idMedico){
        String datos = String.format("\n Id %d , Nombre %s, Apellidos %s , Fecha de nacimiento %s, telefono %s, rfc %s",
                id, nombre, apellidos, fechaNacimiento, telefono, rfc);
        return datos;
    }


}

