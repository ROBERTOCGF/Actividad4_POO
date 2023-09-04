package Punto3;

public class coche {
    String marca;
    String modelo;
    String color;
    int caballos;   
    int puertas;
    String matricula;
    
   
    public coche(String marca, String modelo, String color, int caballos, int puertas, String matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.caballos = caballos;
        this.puertas = puertas;
        this.matricula = matricula;
        
        
    }
    public coche(){
        this.marca = "nissan";
        this.modelo = "centra";
        this.color = "rojo";
        this.caballos = 300;
        this.puertas = 4;
        this.matricula = "abcde";
    }
                
    public void probrar_coche(){
        System.out.println("paso la prueba");
    }
    
    public void prenda(){
        System.out.println("prendido");
    }
    
    public void encienda(){
        System.out.println("encendido");
    }
    
    public void fenar(){
        System.out.println("frenado");
    }
       
}               