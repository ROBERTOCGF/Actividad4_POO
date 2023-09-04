package Punto1;


public class Habitacion {
    private double longitud;
    private double anchura;
    
    

    public Habitacion() {
        this.longitud = 0;
        this.anchura = 0;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }
    
    public double CalcularSuperficie(){
        return (this.longitud*this.anchura);
    }
}
