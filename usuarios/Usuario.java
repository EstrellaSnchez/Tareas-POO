package usuarios;

import java.time.LocalDate;
import usuarios.utils.Rol;

public class Usuario {
    public String id;
    public String nombre;
    public String apellidos;
    public LocalDate fechaNacimiento;
    public String telefono;
    private String contraseña;
    public String correo;
    public Rol rol;

    public Usuario(String id, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String contraseña, String correo, Rol rol) {
        this.id = id;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.contraseña = contraseña;
        this.correo = correo;
        this.rol = rol;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getId() {
        return id;
    }

    public String getContraseña() { // solo en esta clase y en clases hijas
        return contraseña;
    }

    public String getCorreo() {return correo;}

    public Rol getRol() {
        return rol;
    }

    public String mostrarInformación(){
        String nombreCompleto = this.nombre + " " + this.apellidos;
        String datos = String.format("ID: %s, Nombre completo:  %s, Fecha de nacimiento: %s Telefono:  %s",
                this.id, nombreCompleto, this.fechaNacimiento, this.telefono);
        return datos;
    }
}
