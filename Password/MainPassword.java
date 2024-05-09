import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario la longitud de las contraseñas
        System.out.print("Ingrese la longitud de las contraseñas: ");
        int longitudPassword = sc.nextInt();

        // Solicitar al usuario el tamaño del array de contraseñas
        System.out.print("Ingrese el tamaño del array de contraseñas: ");
        int tamañoArray = sc.nextInt();

        // Crear un array de objetos de tipo Password
        Password[] passwords = new Password[tamañoArray];

        // Crear un array para almacenar si cada contraseña es fuerte o no
        boolean[] esFuerteArray = new boolean[tamañoArray];

        // Generar contraseñas aleatorias y verificar si son fuertes o no
        for (int i = 0; i < tamañoArray; i++) {
            passwords[i] = new Password(longitudPassword); // Crear una nueva contraseña
            esFuerteArray[i] = passwords[i].esFuerte(); // Verificar si la contraseña es fuerte
        }

        // Imprimir cada contraseña generada junto con su estado de fuerza
        for (int i = 0; i < tamañoArray; i++) {
            System.out.println(passwords[i].getContraseña() + " " + esFuerteArray[i]);
        }
    }
}
