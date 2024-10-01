package medicos;
import java.time.LocalDate;
import java.util.Random;

public class Medico {
    public String id;
    public String nombre;
    public String apellidos;
    public LocalDate fechaNacimiento;
    private String telefono;
    public String rfc;
    public Random random = new Random();

    public Medico(String idMedico, String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String rfc) {
        this.id = idMedico;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.rfc = rfc;
    }
    public Medico(String nombre, String apellidos, LocalDate fechaNacimiento, String telefono, String rfc) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.rfc = rfc;
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

    public String getRfc() {
        return rfc;
    }

    public String mostrarDatosMedicos (){
        String datos = String.format("\n Id %d , Nombre %s, Apellidos %s , Fecha de nacimiento %s, telefono %s, rfc %s",
                id, nombre, apellidos, fechaNacimiento, telefono, rfc);
        return datos;
    }


}