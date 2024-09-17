import java.util.Scanner;

public class areas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los datos del rectangulo: ");

        System.out.print("Largo: ");
        Double Largo = scanner.nextDouble();

        System.out.print("Altura: ");
        Double Altura = scanner.nextDouble();

        Rectangulo Rectangulo = new Rectangulo(Largo,Altura);

        Double CalcularArea = Rectangulo.CalcularArea();
        System.out.println("Area: " + CalcularArea);

        System.out.println("El perimetro calculado es: " + Rectangulo.CalcularPerimetro());



    }
}