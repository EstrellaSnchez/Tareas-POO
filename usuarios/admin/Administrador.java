package usuarios.admin;

import usuarios.Usuarios;
import utils.Rol;

public class Administrador extends Usuarios {
    public Administrador(String id, String nombre, String apellido, String telefono,String contrasenia, Rol rol) {
        super(id, nombre, apellido, telefono, contrasenia,rol);
        //cambie porque me daba error  Rol.ADMINISTRADOR a rol
    }

    //---------Getters y Setters-------------

}

