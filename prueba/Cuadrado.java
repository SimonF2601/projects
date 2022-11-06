import java.util.Scanner;

public class Cuadrado {

public static void main (String[]args){
Scanner sc = new Scanner(System.in);
int num;
num=sc.nextInt();
adivi(num);
    }    

public static void adivi(int num){
    Scanner xc=new Scanner (System.in);
    double i, inten;
    inten=xc.nextDouble();
    i=Math.pow(num,2);
    while (inten!=i){
        System.out.println("NO");
        inten=xc.nextDouble();
            } 
        System.out.println("SI");    
    }
    
}

