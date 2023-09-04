
package Punto5;


public class Habitacion {
    private double largo;
    private double ancho;
    private double altura;

    public Habitacion(){
        this.largo = 0;
        this.ancho = 0;
        this.altura = 0;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular los metros cuadrados del piso
    public double calcularMetrosCuadradosPiso() {
        return largo * ancho;
    }

    // Método para calcular los metros cuadrados de las paredes
    public double calcularMetrosCuadradosParedes() {
        double perimetro = 2 * (largo + ancho);
        return perimetro * altura;
    }

}
