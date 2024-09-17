public class Empleado {
    public  String nombre;
    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
    }

    public double calcularSalario(double sueldoBase) {
        return sueldoBase;
    }

    public double calcularSalario(double sueldoBase, double bonificacion) {
        return sueldoBase + bonificacion;
    }

    public double calcularSalario(double sueldoBase, double bonificacion, int Extras) {
        return sueldoBase + bonificacion + (Extras * 20);
    }
}
