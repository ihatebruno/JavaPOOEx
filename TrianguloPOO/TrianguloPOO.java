class TrianguloPOO {
    private double base; // Almacena la longitud de la base del triángulo
    private double altura; // Almacena la altura del triángulo

    // Constructor que recibe la base y la altura del triángulo
    public TrianguloPOO(double base, double altura) {
        this.base = base; // Asigna la base proporcionada al atributo base
        this.altura = altura; // Asigna la altura proporcionada al atributo altura
    }

    // Método para calcular el área del triángulo
    public double calcularArea() {
        return (base * altura) / 2; // Retorna el área del triángulo usando la fórmula (base * altura) / 2
    }
}
