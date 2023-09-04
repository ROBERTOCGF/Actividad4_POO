
package Punto5;


public class PruebaHabitacion {
    public static void main(String[] args) {   
        
        Habitacion H = new Habitacion();
        
        H.setAltura(5.6);
        H.setAncho(7.9);
        H.setLargo(7.9);
        
        System.out.println("Metros cuadrados Paredes: " + H.calcularMetrosCuadradosParedes());
        System.out.println("Metros cuadrados piso: " +H.calcularMetrosCuadradosPiso());
    }
}

       
       

       