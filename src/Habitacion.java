public class Habitacion {

    // Atributos
    private int numero;          // Número de la habitación
    private String tipo;         // Tipo de habitación (individual, doble, suite)
    private boolean disponible;  // Estado de la habitación (disponible u ocupada)

    // Constructor
    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.disponible = true;  // Por defecto, la habitación está disponible
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método para mostrar información de la habitación
    @Override
    public String toString() {
        return "Habitación " + numero + " (" + tipo + ") - " + (disponible ? "Disponible" : "Ocupada");
    }
}
