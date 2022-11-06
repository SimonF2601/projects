package Ejercicios;

public class CuentaBancaria {
String nombreCliente, apellidoCliente, nroCuenta,error="✘OPERACION NO VALIDA✘",done="**☑PROCESO EXITOSO ✔**";
int documento=0;
enum tipoC {Ahorro, Corriente}
enum tipoD {TI,CC,CE,NIT,NIP}
tipoC tipoCuenta;
tipoD tipoDocumento;
double saldo=0,interes=1.00089;

CuentaBancaria(String nombreCliente,String apellidoCliente, String nroCuenta,tipoC tipoCuenta,tipoD tipoDocumento,int documento){
    this.nombreCliente= nombreCliente;
    this.apellidoCliente= apellidoCliente;
    this.tipoDocumento = tipoDocumento;
    this.documento= documento;
    this.nroCuenta= nroCuenta;
    this.tipoCuenta= tipoCuenta;
    }

public static void main(String[]args){
CuentaBancaria cuenta1=new CuentaBancaria("Simon","Franco","3507993311",tipoC.Ahorro,tipoD.CC,1038262084);
cuenta1.informacion();
cuenta1.consignacion(23000);
cuenta1.retiro(1000);
cuenta1.consultarSaldo();
cuenta1.rentabilidad();
}
void informacion(){
    System.out.println("_________________________\nNombre: "+nombreCliente);
    System.out.println("Apellido: "+apellidoCliente);
    System.out.println("Tipo de documento: "+tipoDocumento);
    System.out.println("Numero de documento: "+documento);
    System.out.println("Numero de cuenta: "+nroCuenta);
    System.out.println("Tipo de cuenta: "+tipoCuenta+"\n__________________________");
    }
void consignacion(int valor){
    int fin=0;
    do{
    if(valor>0){
        saldo+=valor;
        System.out.println("Se han consignado: $"+valor+"\nSaldo actual $"+saldo+"\n__________________________");
        ++fin;
        } 
    else{
        System.out.println(error);
        }
    }
    while(fin==0);
}
void retiro(int valor){
    if (valor>0&&valor<saldo){
        saldo-=valor;
        System.out.println(done); 
        System.out.println("_________________________\nHa retirado $"+valor+"\nSaldo actual $"+saldo+"\n__________________________");
        
        }
    else {
        System.out.println(error);
        }
    }

void consultarSaldo(){
    System.out.println("Su saldo actual es de $"+saldo+"\n__________________________");
    }
void rentabilidad(){
    if(saldo>20000){
        saldo=saldo*interes;
        System.out.println("Su rentabilidad actual es de: $"+saldo+"\n__________________________");
        }
    else{
        System.out.println("Saldo insuficiente para operar rentabilidad\n***Saldo debe ser mayor a $20.000***");
        }
    }

}