import java.util.ArrayList;
import java.util.List;

public class Hotel {

    // Lista para almacenar las habitaciones del hotel
    private List<Habitacion> habitaciones;

    // Constructor
    public Hotel() {
        this.habitaciones = new ArrayList<>();
    }

    // Método para agregar una habitación al hotel
    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    // Método para reservar una habitación disponible de un tipo específico
    public void reservarHabitacion(String tipo) throws Exception {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getTipo().equalsIgnoreCase(tipo) && habitacion.isDisponible()) {
                habitacion.setDisponible(false);  // Cambiar estado a ocupado
                System.out.println("Habitación " + habitacion.getNumero() + " reservada con éxito.");
                return;
            }
        }
        // Si no se encuentra una habitación disponible, lanzar una excepción
        throw new Exception("No hay habitaciones disponibles de tipo " + tipo);
    }

    // Método para liberar una habitación ocupada
    public void liberarHabitacion(int numero) throws Exception {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero && !habitacion.isDisponible()) {
                habitacion.setDisponible(true);  // Cambiar estado a disponible
                System.out.println("Habitación " + habitacion.getNumero() + " liberada con éxito.");
                return;
            }
        }
        // Si no se encuentra la habitación o ya está disponible, lanzar una excepción
        throw new Exception("Habitación " + numero + " no está ocupada o no existe.");
    }

    // Método para mostrar todas las habitaciones del hotel
    public void mostrarHabitaciones() {
        for (Habitacion habitacion : habitaciones) {
            System.out.println(habitacion);
        }
    }
}
