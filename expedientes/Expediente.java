package expedientes;

import consultas.Consulta;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Expediente {

    public Consulta consulta;
    public String Observaciones;
    public LocalDateTime fechaExpediente;
    public String Id;

    public Expediente(String observaciones, Consulta consulta) {
        this.Id=this.generarIdExpediente();
        this.Observaciones = observaciones;
        this.consulta = consulta;
        this.fechaExpediente = LocalDateTime.now();
    }

    public String generarIdExpediente(){
        Random random = new Random();
        LocalDate fecha = LocalDate.now();

        int añoActual= fecha.getYear();
        int mesActual= fecha.getMonthValue();
        int numeroAleatorio= random.nextInt(10000);

        String id = String.format("E%d%d%d",
                añoActual,mesActual,numeroAleatorio);

        return id ; }
}
