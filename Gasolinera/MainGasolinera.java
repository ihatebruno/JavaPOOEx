import java.util.Scanner;

public class MainGasolinera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario
        Gasolinera gasolinera = new Gasolinera(); // Crear un objeto de la clase Gasolinera

        // Solicitar al usuario que ingrese el precio por litro de gasolina
        System.out.print("Ingrese el precio por litro de gasolina: ");
        double precioPorLitro = scanner.nextDouble(); // Leer el precio por litro proporcionado por el usuario
        gasolinera.setPrecioPorLitro(precioPorLitro); // Establecer el precio por litro en la gasolinera

        // Solicitar al usuario que ingrese la cantidad de galones surtidos
        System.out.print("Ingrese la cantidad de galones surtidos: ");
        double galonesSurtidos = scanner.nextDouble(); // Leer la cantidad de galones surtidos proporcionada por el usuario

        // Calcular el monto a cobrar utilizando el método calcularMontoACobrar de la clase Gasolinera
        double montoACobrar = gasolinera.calcularMontoACobrar(galonesSurtidos);

        // Imprimir el monto a cobrar al cliente
        System.out.println("El monto a cobrar al cliente es: $" + montoACobrar);
    }
}
