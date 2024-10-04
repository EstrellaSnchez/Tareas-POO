package consultorios;
import java.util.Random;

public class Consultorio {

    public String id;
    public int piso;
    public int numeroConsultorio;
    public Random random = new Random();

    public Consultorio(String idConsultorio , int piso, int numeroConsultorio) {
        this.id = idConsultorio;
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getId() {
        return id;
    }

    public int getPiso() {
        return piso;
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public String mostrarDatosConsultorio () {
        String datos = String.format("\n Id %d , piso %d, numero de consultorio %d",
                id, piso, numeroConsultorio);
        return datos;
    }
}
