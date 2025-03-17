import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GestorTareas {

    // Lista para almacenar las tareas
    private List<Tarea> tareas;

    // Constructor
    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }

    // Método para agregar una nueva tarea
    public void agregarTarea(String descripcion, String prioridad) {
        Tarea nuevaTarea = new Tarea(descripcion, prioridad);
        tareas.add(nuevaTarea);
        System.out.println("Tarea agregada: " + nuevaTarea);
    }

    // Método para marcar una tarea como completada
    public void marcarCompletada(String descripcion) {
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equalsIgnoreCase(descripcion) && !tarea.isCompletada()) {
                tarea.setCompletada(true);
                System.out.println("Tarea completada: " + tarea);
                return;
            }
        }
        System.out.println("No se encontró la tarea o ya está completada: " + descripcion);
    }

    // Método para eliminar tareas completadas
    public void eliminarCompletadas() {
        tareas.removeIf(Tarea::isCompletada);
        System.out.println("Tareas completadas eliminadas.");
    }

    // Método para mostrar tareas ordenadas por prioridad (alta primero)
    public void mostrarTareasOrdenadas() {
        // Ordenar las tareas por prioridad (alta > media > baja)
        tareas.sort(Comparator.comparing(Tarea::getPrioridad).reversed());

        System.out.println("\n--- Tareas Pendientes ---");
        for (Tarea tarea : tareas) {
            if (!tarea.isCompletada()) {
                System.out.println(tarea);
            }
        }

        System.out.println("\n--- Tareas Completadas ---");
        for (Tarea tarea : tareas) {
            if (tarea.isCompletada()) {
                System.out.println(tarea);
            }
        }
    }
}
