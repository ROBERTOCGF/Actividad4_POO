package Punto1;

public class Salida {

    public static void main(String[] args) {
        Habitacion a = new Habitacion();

        a.setAnchura(17);
        a.setLongitud(34);

        System.out.println("perimetro: " + a.CalcularSuperficie());
    }

}
