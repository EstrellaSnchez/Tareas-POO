package envios.EnvioNacional;
//import java.text.NumberFormat;
//import java.util.Locale;

import envios.Envio;

public class EnvioNacional extends Envio {

    public double distancia;

    public EnvioNacional(double CostoBase, double peso, double distancia) {
        super(200, peso);
        this.distancia = distancia;

    }
    
    @Override
    public String calcularTiempoYCostoDeEntrega() {
        double costoTotal= 0;

        int diasEntrega = (int) (distancia / 200) +1;
         costoTotal = CostoBase;
        
        if (peso > 5) {
            costoTotal += CostoBase * 0.05;
        }

       /*  NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(new Locale("es", "MX"));
        String costoFinal = formatoMoneda.format(costoTotal); */
        
        return String.format("Peso validado: %d, Costo total: %d, Días estimados de entrega: %d", 
        peso, costoTotal, diasEntrega);
}
}