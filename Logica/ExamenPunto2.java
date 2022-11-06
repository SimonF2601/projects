
package Ejercicios;
 import java.util.Scanner;

public class ExamenPunto2 {
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);
        double velocidad=0;
        String nombre; 
        String transporte;
       
        System.out.println ("Nombre: ");
        nombre = sc.nextLine();
        System.out.println ("¿Cuantas personas van a ingresar al sistema?: ");
        int personas = sc.nextInt();
        System.out.println ("¿Cuantos metros hay desde su casa hasta su trabajo?: ");
        double distancia= sc.nextDouble();
        System.out.println ("¿Cuantos minutos tarda en realizar el recorrido anterior?: ");
        double tiempo= sc.nextDouble();
        System.out.println ("¿En que medio de transporte se dezplaza?: ");
        transporte= sc.next();
        
  
        double distanciaKm= distancia/1000;
        double tiempoH= tiempo/60; 
        velocidad += distanciaKm/tiempoH; 
        
        System.out.println ("\nINFORMACION INGRESADA");
        System.out.println (nombre);
        System.out.println ("Velocidad: "+velocidad + " Km/h");
        System.out.println ("Distancia recorrida: "+ distancia + " metros");
        System.out.println ("Tiempo: " + tiempo + " minutos"); 
        System.out.println ("Transporte empleado: " + transporte); 
        System.out.println ("\n\nTotal de usuarios: "+personas); 
    }
}
