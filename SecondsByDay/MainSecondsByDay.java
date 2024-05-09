import java.util.Scanner;

public class MainSecondsByDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario

        System.out.print("Ingrese la cantidad de días: ");
        int dias = scanner.nextInt(); // Leer la cantidad de días ingresada por el usuario

        int segundos = calcularSegundosPorDias(dias); // Calcular la cantidad de segundos en función de los días ingresados

        // Mostrar la cantidad de segundos en la cantidad de días ingresados por el usuario
        System.out.println("La cantidad de segundos en " + dias + " días es: " + segundos);
        
        scanner.close(); // Cerrar el Scanner para liberar recursos
    }

    // Método estático para calcular la cantidad de segundos en función de los días
    public static int calcularSegundosPorDias(int dias) {
        return dias * 24 * 3600; // Retorna la cantidad de segundos en los días proporcionados (1 día = 24 horas * 3600 segundos)
    }
}
