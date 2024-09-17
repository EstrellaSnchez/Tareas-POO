public class CalculadoraImpuestos {

    public Double sueldoBase;
    public Double ventas;
    public Double impuestos;
    public Double extension;

    public CalculadoraImpuestos(Double sueldoBase, Double ventas, Double impuestos, Double extension){
        this.sueldoBase = sueldoBase;
        this.ventas = ventas;
        this.impuestos = impuestos;
    }

    public double calcularImpuestos(double sueldoBase) {
        return sueldoBase + 0.15;
    }

    public double calcularImpuestos(double ventas, double impuestos) {
        return ventas * (impuestos / 100);
    }

    public double calcularImpuestos(double divicendos, double impuestos, double extension) {
        impuestos = divicendos * (impuestos / 100);
        if (impuestos > extension) {
            return impuestos-extension;
        }
        else return 0;
    }

}
