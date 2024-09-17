import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
             Scanner Scanner = new Scanner(System.in);
        Empleado empleado1 = new Empleado("Juan",100);

        System.out.println("Sueldo base:");
        Double sueldoBase = Scanner.nextDouble();
        System.out.println("Ingrese la cantidad de bonificaciones: ");
        Double bonificacion = Scanner.nextDouble();
        System.out.println("Ingrese la cantidad de horas extra:");
        int Extras = Scanner.nextInt();

        System.out.println("Salario sin bonificación ni horas extra: " + empleado1.calcularSalario(sueldoBase));
        System.out.println("Salario con sueldo base y bonificación: " + empleado1.calcularSalario(sueldoBase, bonificacion));
        System.out.println("Salario con sueldo base, bonificación y horas extras: " + empleado1.calcularSalario(sueldoBase,bonificacion,Extras));


        System.out.println("*** PAGO DE IMPUESTOS ***");
        System.out.println("El pago de acuerdo a sus ingresos es: " + empleado1);

        System.out.println("Ingrese el numero de ventas: ");
        double ventas = Scanner.nextDouble();
        System.out.println("Ingrese el numero de dividendos: ");
        double dividendos = Scanner.nextDouble();


    }

    }