
package Punto6;


public class Punto6 {
    public static void main(String[] args) {
        TrianguloIso triangulo = new TrianguloIso();
        
        triangulo.setAltura(10.0);
        triangulo.setBase(8.0);
        
        System.out.println("Area del triangulo: " + triangulo.calcularArea());
        System.out.println("Longitud de los lados iguales: " + triangulo.calcularLongitudLadosIguales() );  
        System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
        System.out.println("Valor del ángulo vértice: " + triangulo.calcularAnguloVertice() + " grados");
    }
}
