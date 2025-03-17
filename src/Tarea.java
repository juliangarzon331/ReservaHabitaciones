public class Tarea {

    // Atributos
    private String descripcion;  // Descripción de la tarea
    private String prioridad;    // Prioridad de la tarea (alta, media, baja)
    private boolean completada;   // Estado de la tarea (pendiente o completada)

    // Constructor
    public Tarea(String descripcion, String prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = false;  // Por defecto, la tarea está pendiente
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // Método para mostrar información de la tarea
    @Override
    public String toString() {
        return "Tarea: " + descripcion + " | Prioridad: " + prioridad + " | Estado: " + (completada ? "Completada" : "Pendiente");
    }
}
