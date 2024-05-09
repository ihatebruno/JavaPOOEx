public class SecondsByDay {
    private int dias; // Variable para almacenar la cantidad de días

    // Constructor que recibe la cantidad de días como parámetro
    public SecondsByDay(int dias) {
        this.dias = dias; // Asignar la cantidad de días a la variable de instancia
    }

    // Método para calcular la cantidad de segundos en función de los días almacenados en la variable dias
    public int calcularSegundosPorDias() {
        return dias * 24 * 3600; // Retorna la cantidad de segundos en los días almacenados (1 día = 24 horas * 3600 segundos)
    }
}
