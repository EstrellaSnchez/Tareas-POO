package envios;

public abstract class Envio {

    public double CostoBase;
    public double peso; 

public Envio (double CostoBase, double peso){
    this.CostoBase = CostoBase;
    this.peso= peso;
}

public double getCostoBase(){ return this.CostoBase;}
public double getpeso(){ return this.peso;}

public abstract String calcularTiempoYCostoDeEntrega();

public void validarPeso() {
    if (peso <= 0) {
        System.out.println ("El peso debe ser mayor que cero.");
    }
}

}