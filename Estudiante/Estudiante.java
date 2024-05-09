public class Estudiante {
    private String name; // Nombre del estudiante
    private int age; // Edad del estudiante
    private int score; // Calificación del estudiante

    // Método para establecer el nombre del estudiante
    public void setName(String name) {
        this.name = name; // Asigna el nombre proporcionado al atributo name
    }

    // Método para establecer la edad del estudiante
    public void setAge(int age) {
        if (age < 0) { // Verifica si la edad es negativa
            System.out.println("Edad inválida = 0."); // Muestra un mensaje de error
            this.age = 0; // Asigna 0 a la edad
        } else {
            this.age = age; // Asigna la edad proporcionada al atributo age
        }
    }

    // Método para establecer la calificación del estudiante
    public void setScore(int score) {
        if (score < 0) { // Verifica si la calificación es negativa
            System.out.println("Calificación inválida = 0."); // Muestra un mensaje de error
            this.score = 0; // Asigna 0 a la calificación
        } else {
            this.score = score; // Asigna la calificación proporcionada al atributo score
        }
    }

    // Método para obtener el nombre del estudiante
    public String getName() {
        return name; // Retorna el nombre del estudiante
    }

    // Método para obtener la edad del estudiante
    public int getAge() {
        return age; // Retorna la edad del estudiante
    }

    // Método para obtener la calificación del estudiante
    public int getScore() {
        return score; // Retorna la calificación del estudiante
    }
}
