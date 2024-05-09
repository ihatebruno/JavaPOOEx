import java.util.Scanner;

public class MainConversorDolares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario

        // Solicitar al usuario que ingrese el tipo de cambio de pesos a dólares
        System.out.print("Ingrese el tipo de cambio de pesos a dólares: ");
        double tipoCambio = sc.nextDouble(); // Leer el tipo de cambio proporcionado por el usuario

        ConversorDolares conversor = new ConversorDolares(tipoCambio); // Crear un objeto ConversorDolares con el tipo de cambio proporcionado

        // Solicitar al usuario que ingrese la cantidad de pesos
        System.out.print("Ingrese la cantidad de pesos: ");
        double cantidadPesos = sc.nextDouble(); // Leer la cantidad de pesos proporcionada por el usuario

        // Convertir la cantidad de pesos a dólares utilizando el método convertirPesosADolares de la clase ConversorDolares
        double cantidadDolares = conversor.convertirPesosADolares(cantidadPesos);

        // Mostrar la cantidad de pesos y la cantidad de dólares equivalentes
        System.out.println(cantidadPesos + " pesos equivalen a " + cantidadDolares + " dólares.");

        sc.close(); // Cerrar el Scanner para liberar recursos
    }
}
