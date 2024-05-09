import java.util.Scanner;

public class MainCostoAuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario

        // Mostrar información sobre la ganancia del vendedor y los impuestos
        System.out.println("---Ganancia del vendedor es del 12% sobre el costo del auto.---");
        System.out.println("---Tasa de impuesto es de 6% sobre el costo del auto.---");

        // Solicitar al usuario que ingrese el costo del automóvil
        System.out.print("Ingrese el costo del automóvil: ");
        double costoAuto = scanner.nextDouble(); // Leer el costo del automóvil proporcionado por el usuario

        double costoFinal = calcularCostoFinal(costoAuto); // Calcular el costo final del automóvil

        // Mostrar el costo final para el consumidor
        System.out.println("El costo final para el consumidor es: $" + costoFinal);

        scanner.close(); // Cerrar el Scanner para liberar recursos
    }

    // Método estático para calcular el costo final del automóvil
    public static double calcularCostoFinal(double costoAuto) {
        double gananciaVendedor = costoAuto * 0.12; // Calcular la ganancia del vendedor (12% del costo del auto)
        double impuestos = costoAuto * 0.06; // Calcular los impuestos (6% del costo del auto)
        return costoAuto + gananciaVendedor + impuestos; // Retornar el costo final para el consumidor
    }
}
