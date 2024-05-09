public class Gasolinera {
    private double precioPorLitro; // Precio por litro de la gasolina en la gasolinera

    // Constructor por defecto que inicializa el precio por litro a 0.0
    public Gasolinera() {
        this.precioPorLitro = 0.0;
    }

    // Método para establecer el precio por litro de la gasolina
    public void setPrecioPorLitro(double precioPorLitro) {
        this.precioPorLitro = precioPorLitro;
    }

    // Método para calcular el monto a cobrar por una cantidad de galones surtidos
    public double calcularMontoACobrar(double galonesSurtidos) {
        // Convertir galones a litros (1 galón = 3.78 litros)
        double litrosSurtidos = galonesSurtidos * 3.78;

        // Calcular el monto a cobrar multiplicando los litros surtidos por el precio por litro
        return litrosSurtidos * precioPorLitro;
    }
}
