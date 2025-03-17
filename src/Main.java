//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // Agregar habitaciones al hotel
        hotel.agregarHabitacion(new Habitacion(101, "individual"));
        hotel.agregarHabitacion(new Habitacion(102, "doble"));
        hotel.agregarHabitacion(new Habitacion(103, "suite"));

        // Mostrar todas las habitaciones
        hotel.mostrarHabitaciones();

        try {
            // Reservar una habitación
            hotel.reservarHabitacion("doble");
            hotel.mostrarHabitaciones();

            // Liberar una habitación
            hotel.liberarHabitacion(102);
            hotel.mostrarHabitaciones();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}