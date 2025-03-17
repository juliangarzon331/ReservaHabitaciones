//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        // Agregar habitaciones al hotel
        hotel.agregarHabitacion(new Habitacion(101, "individual"));
        hotel.agregarHabitacion(new Habitacion(102, "doble"));
        hotel.agregarHabitacion(new Habitacion(103, "suite"));

        System.out.println("");
        System.out.println("Reto: 1");

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

        System.out.println("");
        System.out.println("Reto: 2");
        // Crear un gestor de tareas
        GestorTareas gestor = new GestorTareas();

        // Agregar tareas
        gestor.agregarTarea("Hacer la compra", "alta");
        gestor.agregarTarea("Estudiar para el examen", "media");
        gestor.agregarTarea("Pasear al perro", "baja");

        // Mostrar tareas ordenadas por prioridad
        gestor.mostrarTareasOrdenadas();

        // Marcar una tarea como completada
        gestor.marcarCompletada("Hacer la compra");

        // Mostrar tareas después de completar una
        gestor.mostrarTareasOrdenadas();

        // Eliminar tareas completadas
        gestor.eliminarCompletadas();

        // Mostrar tareas después de eliminar las completadas
        gestor.mostrarTareasOrdenadas();




    }
}