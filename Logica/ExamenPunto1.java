package Ejercicios;
    import java.util.Scanner;

public class ExamenPunto1 {
    public static void main (String[]args){
   Scanner sc = new Scanner (System.in);
        double a=0, b=0, c=0, respuesta=0;
        
        System.out.println ("INGRESAR ESTATURA EN METROS\n");
        System.out.println ("Ingresar la estatura del primer participante: ");
        double estatura1=sc.nextDouble();
        System.out.println ("Ingresar la estatura del segundo participante: ");
        double estatura2=sc.nextDouble();
        System.out.println ("Ingresar la estatura del primer participante: ");
        double estatura3=sc.nextDouble();
        
        a+= estatura1;
        b+= estatura2;
        c+= estatura3;
        
        respuesta+= (a>b&&c<a)?a:(b>c)?b:c;
        
        System.out.println ("La estatura mas alta es: " + respuesta + " metros");
                
        
    }
}
