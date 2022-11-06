
package Ejercicios;

public class Parcial_07_10_Aves {
    
public static void main (String[]args){
    
    int i=0,hora=7;
    double radianes=0, vuelo=17,ascenso=3 ; 
    String a;
    
    System.out.println("\nA las 6:00 am.\nLa altura promedio alcanzada es de 0 grados"+
            "\nLa altura promedio alcanzada es de "+Math.toRadians(0)+ " radianes\n_______________________________________"); 
    do {
        
        radianes= Math.toRadians(vuelo);
        System.out.println("\nA las "+hora+":00 am.\nLa altura promedio alcanzada es de "+vuelo+ " grados"
                + "\nLa altura promedio alcanzada es de "+radianes+ " radianes\n_______________________________________");  
        vuelo= vuelo+ascenso;
            
            hora=hora+2;
            ++i;
            
        }
        while(i<2);
        System.out.println("\nA las 11:00 am.\nLa altura promedio alcanzada es de 0 grados"+
            "\nLa altura promedio alcanzada es de "+Math.toRadians(0)+ " radianes\n_______________________________________"); 
    }
    
}
