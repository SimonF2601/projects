
package Ejercicios;
import java.util.Scanner;
public class Ejemplo27_10Equals {
 
public static void main(String[]args){
   String marca1="";
   boolean fin=false;
   String[]marca={"Audi","Mercedes","BMW","Toyota","Renault","Mini"};
   Scanner sc= new Scanner (System.in);
    System.out.println("Ingrese una marca de automovil");
    marca1=sc.nextLine();
    
    for (int i=0;i<marca.length;i++){
        if (marca[i].equals(marca1)){
        fin=true;
        i=6;
        }    
    }
        if (fin==true){
            System.out.println("Su marca esta en la base de datos, y el arreglo contiene "+marca.length+" posiciones.");
                      }
        else{
            System.out.println("Su marca no esta en la base de datos, y el arreglo contiene "+marca.length+" posiciones.");
        }
    }
}
