
package Punto6;

import java.lang.Math;

public class TrianguloIso {
    
    private double base;
    private double altura;

    public TrianguloIso() {
        this.base = 0;
        this.altura = 0;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método para calcular el área del triángulo
    public double calcularArea() {
        return 0.5 * base * altura;
    }

    // Método para calcular la longitud de los lados iguales (catetos)
    public double calcularLongitudLadosIguales() {
        return Math.sqrt((base * base) / 4 + (altura * altura));
    }

    // Método para calcular el perímetro del triángulo
    public double calcularPerimetro() {
        double ladoIgual = calcularLongitudLadosIguales();
        return 2 * ladoIgual + base;
    }

    // Método para calcular el valor del ángulo vértice (ángulo entre los lados iguales)
    public double calcularAnguloVertice() {
        double ladoIgual = calcularLongitudLadosIguales();
        return Math.toDegrees(Math.acos(base / (2 * ladoIgual)));
    }

}
