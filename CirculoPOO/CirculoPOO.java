class CirculoPOO {
    private double radio; // Almacena el radio del círculo

    // Constructor que recibe el radio como parámetro
    public CirculoPOO(double radio) {
        this.radio = radio; // Asigna el radio proporcionado al atributo radio
    }

    // Método para calcular el área del círculo
    public double calcularArea() {
        return 3.1416 * radio * radio; // Retorna el área del círculo utilizando la fórmula π * radio^2
    }
}
