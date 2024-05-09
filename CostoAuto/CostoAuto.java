public class CostoAuto {
    private double costoAuto; // Costo del automóvil

    // Constructor que recibe el costo del automóvil como parámetro
    public CostoAuto(double costoAuto) {
        this.costoAuto = costoAuto; // Asigna el costo del automóvil proporcionado al atributo costoAuto
    }

    // Método para calcular el costo final del automóvil
    public double calcularCostoFinal() {
        double gananciaVendedor = costoAuto * 0.12; // Calcula la ganancia del vendedor (12% del costo del auto)
        double impuestos = costoAuto * 0.06; // Calcula los impuestos (6% del costo del auto)
        return costoAuto + gananciaVendedor + impuestos; // Retorna el costo final para el consumidor
    }
}
