import java.util.Random;

public class Consultorio {

    public static int id;
    public int piso;
    public int numeroConsultorio;
    public Random random = new Random();

    public Consultorio(int piso, int numeroConsultorio) {
        this.id = this.random.nextInt(100);
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }

    public int getId() {
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

