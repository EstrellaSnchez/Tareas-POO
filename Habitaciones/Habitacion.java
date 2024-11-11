package Habitaciones;

public class Habitacion {
    private Tipo tipo;
    private double precioPorNoche;
    private boolean disponible;

    public Habitacion(Tipo tipo, double precioPorNoche, boolean disponible) {
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.disponible = disponible;
    }

    public void reservar(int noches) throws HabitacionNoDisponibleException, NumeroDeNochesInvalidoException {
        if (!disponible) {
            throw new HabitacionNoDisponibleException("La habitación ya está ocupada.");
        }
        if (noches < 1) {
            throw new NumeroDeNochesInvalidoException("El número de noches debe ser al menos 1.");
        }
        this.disponible = false;
    }

    public void liberar() {
        this.disponible = true;
        System.out.println("La habitación ha sido liberada y está disponible nuevamente.");
    }

    public void mostrarDetalles() {
        System.out.println("Tipo de habitación: " + tipo);
        System.out.println("Precio por noche: $" + precioPorNoche);
        System.out.println("Disponibilidad: " + (disponible ? "Disponible" : "No Disponible") + "\n");
    }

    public void calcularCosto(int noches) {
        double costoTotal = noches * precioPorNoche;
        System.out.println("Reserva exitosa para " + noches + " noches.");
        System.out.println("Costo total de la reserva: $" + costoTotal);
    }
}