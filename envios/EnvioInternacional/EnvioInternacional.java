package envios.EnvioInternacional;
//import java.text.NumberFormat;
//import java.util.Locale;

import envios.Envio;

public class EnvioInternacional extends Envio {
   
    private String destino;

    public EnvioInternacional(double costoBase, double peso, String destino) {
        super(400, peso);
        this.destino = destino;
    }

    @Override
    public String calcularTiempoYCostoDeEntrega() {
        int diasEntrega = 10;
        if (peso > 10) {
            diasEntrega += 3; 
        }
        
        double costoTotal = CostoBase * 0.20; 

        /* NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(new Locale("es", "MX"));
        String costoFinal = formatoMoneda.format(costoTotal); */
        
    
        return String.format("Destino: %s,\nPeso validado: %.2f kg,\nCosto total: %d,\nDías estimados de entrega: %d", 
        destino, peso, costoTotal, diasEntrega);
    } }
    
