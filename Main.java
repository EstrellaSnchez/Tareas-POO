import envios.Envio;
import envios.EnvioInternacional.EnvioInternacional;
import envios.EnvioNacional.EnvioNacional;

public class Main {
    public static void main(String[] args) {

         // Envío Nacional
        Envio envioNacional = new EnvioNacional(300, 6, 600);
        envioNacional.validarPeso();
        envioNacional.calcularTiempoYCostoDeEntrega();

        // Envío Internacional
        Envio envioInternacional = new EnvioInternacional(500, 12, "España");
        envioInternacional.validarPeso();
        envioInternacional.calcularTiempoYCostoDeEntrega();
    }
    }