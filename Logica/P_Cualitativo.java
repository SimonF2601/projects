package Ejercicios;
        import java.util.Scanner;

public class P_Cualitativo{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        String S="Sobresaliente", A="Alto", B= "Básico", D= "Deficiente"; 
        
        System.out.print ("Ingresar nota definitiva: ");
        double nota= sc.nextDouble();
        
        if (nota>=0&&nota<2.95){
            System.out.println ("Desempeño DEFICIENTE ");
                            }  
        else if (nota<4){
            System.out.println ("Desempeño BASICO");
                        }
        else if (nota<=4.5){
            System.out.println ("Desempeño ALTO ");
                    }
        else if (nota<=5){
            System.out.println ("Desempeño SOBRESALIENTE ");
                }
        else {
            System.out.println ("Dato no valido");
            }
       
               
        
        
        
        
                
    
    
 }
} 