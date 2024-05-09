import java.util.Scanner;

public class MainCirculoPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario

        // Solicitar al usuario que ingrese el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = sc.nextDouble(); // Leer el radio del círculo proporcionado por el usuario

        CirculoPOO circulo = new CirculoPOO(radio); // Crear un objeto CirculoPOO con el radio proporcionado

        // Mostrar el área del círculo utilizando el método calcularArea de la clase CirculoPOO
        System.out.println("El área del círculo es: " + circulo.calcularArea());

        sc.close(); // Cerrar el Scanner para liberar recursos
    }
}
