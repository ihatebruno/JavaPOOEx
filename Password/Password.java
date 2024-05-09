import java.util.Random;

public class Password {
    private int longitud; // La longitud de la contraseña
    private String contraseña; // La contraseña generada

    // Constructor por defecto que genera una contraseña de longitud 8
    public Password() {
        this.longitud = 8;
        this.contraseña = generarPassword(); // Genera la contraseña automáticamente
    }

    // Constructor que permite especificar la longitud de la contraseña
    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword(); // Genera la contraseña automáticamente
    }

    // Método para determinar si la contraseña es fuerte
    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;

        // Contar el número de mayúsculas, minúsculas y dígitos en la contraseña
        for (int i = 0; i < contraseña.length(); i++) {
            char caracter = contraseña.charAt(i);
            if (Character.isUpperCase(caracter)) {
                mayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                minusculas++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            }
        }

        // La contraseña se considera fuerte si tiene más de 2 mayúsculas, más de 1 minúscula y más de 5 dígitos
        return mayusculas > 2 && minusculas > 1 && numeros > 5;
    }

    // Método privado para generar una contraseña aleatoria
    private String generarPassword() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Generar la contraseña con los caracteres disponibles
        for (int i = 0; i < longitud; i++) {
            password.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }

        return password.toString(); // Devuelve la contraseña generada
    }

    // Método para obtener la contraseña
    public String getContraseña() {
        return contraseña;
    }

    // Método para obtener la longitud de la contraseña
    public int getLongitud() {
        return longitud;
    }

    // Método para establecer la longitud de la contraseña y regenerarla
    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarPassword(); // Regenera la contraseña con la nueva longitud
    }
}
