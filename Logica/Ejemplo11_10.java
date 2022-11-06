package Ejercicios;

public class Ejemplo11_10 {
String nombreCliente, apellidoCliente, nroCuenta;
enum tipo {Ahorro, Corriente}
tipo tipoCuenta;
double saldo=0;

 Ejemplo11_10(String nombreCliente, String apellidoCliente, String nroCuenta, tipo tipoCuenta){
    this.nombreCliente= nombreCliente;
    this.apellidoCliente = apellidoCliente; 
    this.nroCuenta = nroCuenta;
    this.tipoCuenta = tipoCuenta;
    }

public static void main (String[]args){
Ejemplo11_10 cuenta = new
Ejemplo11_10 ("Pedro","Perez","101-65486-2",tipo.Ahorro);
cuenta.imprimir();
cuenta.consultarSaldo();
cuenta.consignar(120000);
}

void imprimir(){
System.out.println("Nombre del titular: "+nombreCliente);      
System.out.println("Apellido del titular: "+apellidoCliente);
System.out.println("Numero de cuenta: "+nroCuenta);
System.out.println("Tipo de cuenta: "+ tipoCuenta);

    }
void consultarSaldo (){
    System.out.println("Su saldo es: $"+saldo);
    
}
boolean consignar(int valor){
 if (valor>0){
     saldo+=valor;
     System.out.println("Se ha consginado $"+valor+" en la cuenta.\nNuevo saldo: $"+saldo);
     return true;
    }
 else {
     System.out.println("El valor a consignar debe ser mayor a cero");
     return false;
 }
    }                  
}