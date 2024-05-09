import java.util.Scanner;

public class MainTrianguloPOO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario

        // Solicitar al usuario que ingrese la base del triángulo
        System.out.print("Ingrese la base del triángulo: ");
        double base = sc.nextDouble(); // Leer la base del triángulo proporcionada por el usuario

        // Solicitar al usuario que ingrese la altura del triángulo
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = sc.nextDouble(); // Leer la altura del triángulo proporcionada por el usuario

        // Crear un objeto TrianguloPOO con la base y la altura proporcionadas
        TrianguloPOO triangulo = new TrianguloPOO(base, altura);

        // Calcular el área del triángulo utilizando el método calcularArea de la clase TrianguloPOO
        double area = triangulo.calcularArea();

        // Mostrar el área del triángulo al usuario
        System.out.println("El área del triángulo es: " + area);

        sc.close(); // Cerrar el Scanner para liberar recursos
    }
}
