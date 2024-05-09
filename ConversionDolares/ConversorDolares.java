public class ConversorDolares {
    private double tipoCambio; // Almacena el tipo de cambio de pesos a dólares

    // Constructor que recibe el tipo de cambio como parámetro
    public ConversorDolares(double tipoCambio) {
        this.tipoCambio = tipoCambio; // Asigna el tipo de cambio proporcionado al atributo tipoCambio
    }

    // Método para convertir una cantidad de pesos a dólares utilizando el tipo de cambio
    public double convertirPesosADolares(double cantidadPesos) {
        return cantidadPesos / tipoCambio; // Retorna la cantidad de dólares equivalente a la cantidad de pesos
    }
}
