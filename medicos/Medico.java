import java.util.Random;

public class Medico {
      public static int id;
    public String nombre;
    public String apellidos;
    public String fechaNacimiento;
    private String telefono;
    public String rfc;
    public Random random = new Random();

    public Medico(String nombre, String apellidos, String fechaNacimiento, String telefono, String rfc) {
        this.id = this.random.nextInt();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.rfc = rfc;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getFechaNacimiento() {
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
