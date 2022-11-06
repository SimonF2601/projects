
package Ejercicios;


import javax.swing.JOptionPane;

public class Categoria_afiliacion_Swicth {
    public static void main (String []args){
       double PrecioA1= 105000, PrecioA2= 95800, PrecioB1= 117900, PrecioB2= 106200, PrecioC1= 148700, PrecioC2= 141900, PrecioP1= 148700 , PrecioP2=141900 ; 
       double iva= 1.19, TotalSinIva=0, TotalIva, salir = 0, factura=0, Tvehiculo= 0, PrecioCarro= 11000, PrecioMoto= 6000; 
        String categoria, personas, vehiculo="", nombre, noches = "", cat="";
       
        JOptionPane.showMessageDialog(null,"BIENVENIDOS AL PLAN FindeAll","CONFAMA",JOptionPane.QUESTION_MESSAGE);
        nombre= JOptionPane.showInputDialog(null,"INGRESAR NOMBRE DE USUARIO:");
        categoria= JOptionPane.showInputDialog("INGRESE LA CATEGORIA DEL USUARIO: \nOpcion 1: A\nOpcion 2: B\nOpcion 3: C\nOpcion 4: Particular");
        
        switch (categoria){
            case "a": case "A": case "1": 
                cat = "A"; break;
            case "b": case "B": case "2":
                cat  = "B"; break;
            case "c": case "C": case "3":
                cat  = "C" ; break;
            case "Particular": case "particular": case "P": case "p": case "4":   
                cat  = "Particular"; break;
            default: 
                 salir=1; break;
        }
        if (salir ==0){
        personas= JOptionPane.showInputDialog("INGRESE LA CANTIDAD DE PERSONAS : \n 1 Persona \n 2 Personas\n 3 personas\n 4 Personas");
        switch (personas){
            case "1": case "2":
                switch (cat){
                    case "A":
                        factura=PrecioA1;
                    break;
                    case "B":
                        factura=PrecioB1;
                    break;
                    case "C":
                        factura=PrecioC1;
                    break;
                    case "Particular":
                        factura=PrecioP1;
                    break;
                 }
                 vehiculo = JOptionPane.showInputDialog("INGRESAR TIPO DE VEHICULO: \n Carro \n Moto \n No aplica");
                switch (vehiculo){
                case "Carro": case "carro": case "CARRO": case "Coche": case "C": case "c":  
                  Tvehiculo = PrecioCarro; vehiculo = "Carro"; break;
                case "Moto": case "moto": case "MOTO": case "M": case "m":
                  Tvehiculo =PrecioMoto; vehiculo= "Moto"; break;
                case "No": case "no": case "NO":
                     Tvehiculo = 0; vehiculo = "No aplica"; break;
                default: 
                  salir=1; break;
                } 
                break;
            case "3": case "4":
            switch (cat){
                    case "A":
                        factura=PrecioA2; 
                    break;
                    case "B":
                        factura=PrecioB2;
                    break;
                    case "C":
                        factura=PrecioC2;
                    break;
                    case "Particular":
                        factura=PrecioP2;
                    break;
                }
        vehiculo = JOptionPane.showInputDialog("INGRESE LA VEHICULO: \n Carro \n Moto \n No");
            switch (vehiculo){
                case "Carro": case "carro": case "CARRO": case "Coche": case "C": case "c": 
                  Tvehiculo = PrecioCarro; vehiculo = "Carro"; break;
                case "Moto": case "moto": case "MOTO": case "M": case "m": 
                  Tvehiculo =PrecioMoto; vehiculo= "Moto"; break;
                case "No": case "no": case "NO": 
                   Tvehiculo = 0; vehiculo = "No aplica"; break;
                default: 
                    salir=1; break;
                } 
                break;
            default:
                salir=1; break;
         }
        
        
        if (salir==0){
            noches = JOptionPane.showInputDialog("INGRESAR CANTIDAD DE NOCHES (Maximo 4 noches):");
            int Cnoches =Integer.parseInt(noches);
                if(Cnoches== 1){
                TotalSinIva = Tvehiculo + factura;}
                else if (Cnoches==2){
                TotalSinIva = 2*Tvehiculo + factura;}
                else if (Cnoches==3){
                TotalSinIva = 3*Tvehiculo + factura;}
                else if (Cnoches==4){
                TotalSinIva = 4*Tvehiculo + factura;}
                else{
                    JOptionPane.showMessageDialog(null,"VALOR INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE); 
                }
        }
        else {
        JOptionPane.showMessageDialog(null,"VALOR INCORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);}
        
        //OPERACIONES 
        TotalIva= TotalSinIva * iva;
        
        if (salir == 0){
             JOptionPane.showMessageDialog(null,"RECIBO\nUSUARIO: " + nombre +"\nCATEGORIA: "+ cat +"\nCANTIDAD DE PERSONAS INCLUIDAS EN EL PLAN: "+ personas +"\nVEHICULO: " + vehiculo +"\nNOCHES DE ESTADIA: "+ noches +"\nTARIFA SIN IVA: " + TotalSinIva +"\nTARIFA IVA INCLUIDO: "+ TotalIva );
            System.out.println("RECIBO\nUSUARIO: " + nombre +"\nCATEGORIA: "+ cat +"\nVehiculo: " + vehiculo +"\nNoches de estadia: "+ noches +"\n Tarifa sin IVA: " + TotalSinIva +"\n Tarifa IVA incluido: "+ TotalIva);
        }
    }
    }
}
