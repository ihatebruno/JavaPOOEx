import java.util.Scanner;

public class MainConversionTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario
        ConversionTemp temp = new ConversionTemp(); // Crear un objeto de la clase ConversionTemp

        // Solicitar al usuario que ingrese la temperatura en grados Celsius
        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = sc.nextDouble(); // Leer la temperatura en grados Celsius proporcionada por el usuario

        // Convertir la temperatura de Celsius a Fahrenheit utilizando el método de la clase ConversionTemp
        double fahrenheit = temp.convertirCelsiusAFahrenheit(celsius);

        // Mostrar la temperatura en grados Celsius y grados Fahrenheit
        System.out.println(celsius + " grados Celsius equivalen a " + fahrenheit + " grados Fahrenheit.");

        sc.close(); // Cerrar el Scanner para liberar recursos
    }
}
