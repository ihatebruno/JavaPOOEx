import java.util.Scanner;

public class MainEstudiante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear un objeto Scanner para la entrada del usuario

        // Solicitar al usuario que ingrese el nombre del estudiante
        System.out.print("Ingrese el nombre del estudiante: ");
        String name = sc.nextLine(); // Leer el nombre del estudiante proporcionado por el usuario

        // Solicitar al usuario que ingrese la edad del estudiante
        System.out.print("Ingrese la edad del estudiante: ");
        int age = sc.nextInt(); // Leer la edad del estudiante proporcionada por el usuario

        // Solicitar al usuario que ingrese la calificación del estudiante
        System.out.print("Ingrese la calificación del estudiante: ");
        int score = sc.nextInt(); // Leer la calificación del estudiante proporcionada por el usuario

        Estudiante estudiante = new Estudiante(); // Crear un objeto Estudiante

        // Establecer el nombre, la edad y la calificación del estudiante utilizando los métodos de la clase Estudiante
        estudiante.setName(name);
        estudiante.setAge(age);
        estudiante.setScore(score);

        // Mostrar el nombre, la edad y la calificación del estudiante
        System.out.println("Nombre del estudiante: " + estudiante.getName());
        System.out.println("Edad del estudiante: " + estudiante.getAge());
        System.out.println("Calificación del estudiante: " + estudiante.getScore());

        sc.close(); // Cerrar el Scanner para liberar recursos
    }
}
