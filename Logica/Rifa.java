package Ejercicios;
// Simon Franco; CC:1038262084; Carné: 22158093
import javax.swing.JOptionPane;
public class Rifa {
    static int min=1, max=9, ced1,ced2,ced3,nr,nr2,nr3,nrs,nrs2,nrs3,nrt,nrt2,nrt3,b=1,premio1,premio2,premio3;
    static double i=0,aleatorio,win;
    static String nom1,nom2,nom3,pr,pr2,pr3;
    //Se desarrolla la declaración de variables, y la operación para encontrar el número aleatorio
    public static void main (String[]args){
        
        aleatorio=Math.random();
        aleatorio*=10;
        win=Math.round(aleatorio);
        
        //System.out.println(win); //Esta linea sirve para verificar el numero al azar.
        datos();
        rifa();
        rifa();
        rifa();
        ganador();
    } 
    //Se realiza la ejecución de de tres métodos
    public static void datos(){          //El primer método realiza la petición de los datos de cada participante uno a uno
        JOptionPane.showMessageDialog(null," BIENVENIDOS A LA RIFA FRANCO","FRANCO S.A.S",JOptionPane.INFORMATION_MESSAGE);
        nom1= JOptionPane.showInputDialog(null,"Ingresar nombre del primer participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE);
        ced1= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar documento del primer participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
        while(b==1){
           premio1=  Integer.parseInt(JOptionPane.showInputDialog(null,"OPCIONES DE PREMIOS\n1-SmartTv\n2-Laptop","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
           switch(premio1) {
               case 1:  
                   pr="Un SmartTv"; b=0; break;
               case 2:
                   pr="Una Laptop"; b=0; break;
               default: 
                   JOptionPane.showMessageDialog(null," DATO NO VALIDO","FRANCO S.A.S",JOptionPane.ERROR_MESSAGE);
                   b=1; break;
           }
        }
        b=1;
        nom2= JOptionPane.showInputDialog(null,"Ingresar nombre del segundo participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE);
        ced2= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar documento del segundo participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
        while(b==1){
           premio2=  Integer.parseInt(JOptionPane.showInputDialog(null,"OPCIONES DE PREMIOS\n1-SmartTv\n2-Laptop","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
           switch(premio2) {
               case 1:  
                   pr2="Un SmartTv"; b=0; break;
               case 2:
                   pr2="Una Laptop"; b=0; break;
               default: 
                   JOptionPane.showMessageDialog(null," DATO NO VALIDO","FRANCO S.A.S",JOptionPane.ERROR_MESSAGE);
                   b=1; break;
           }
        }
        b=1;
        nom3= JOptionPane.showInputDialog(null,"Ingresar nombre de tercer participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE);
        ced3= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar documento del tercer participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
        while(b==1){
           premio3=  Integer.parseInt(JOptionPane.showInputDialog(null,"OPCIONES DE PREMIOS\n1-SmartTv\n2-Laptop","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
           switch(premio3) {
               case 1:  
                   pr3="Un SmartTv"; b=0; break;
               case 2:
                   pr3="Una Laptop"; b=0; break;
               default: 
                   JOptionPane.showMessageDialog(null," DATO NO VALIDO","FRANCO S.A.S",JOptionPane.ERROR_MESSAGE);
                   b=1; break;
           }
        }
     }
    public static void rifa(){   //El segundo método efectúa el ingreso de los números por los cuales se realizará el proceso de la rifa
        
        if(i==0){
        nr= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar intento #1 del primer participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
        nrs= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar intento #1 del segundo participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
        nrt= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar intento #1 del tercer participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
        i++;   
            }
        else if (i==1){
        nr2= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar intento #2 del primer participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
        nrs2= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar intento #2 del segundo participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
        nrt2= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar intento #2 del tercer participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
        i++; 
            }
        else if (i==2){
        nr3= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar intento #3 del primer participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
        nrs3= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar intento #3 del segundo participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
        nrt3= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresar intento #3 del tercer participante: ","FRANCO S.A.S",JOptionPane.QUESTION_MESSAGE));
            }
    
    }
    public static void ganador(){  //El tercer método ejecuta la opción del ganador, y muestra un mensaje con los datos del ganador, en caso de no haber un ganador, simplemente arroja un mensaje donde muestra que no hubo ganador y el número escogido
        if (nr==win){
         JOptionPane.showMessageDialog(null," **GANADOR** \nParticipante #1\nNombre: "+nom1+"\nDocumento: "+ced1+"\nNumero ganador: "+win+"\nSu premio es: "+pr,"FRANCO S.A.S",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (nrs==win){
         JOptionPane.showMessageDialog(null," **GANADOR** \nParticipante #2\nNombre: "+nom2+"\nDocumento: "+ced2+"\nNumero ganador: "+win+"\nSu premio es: "+pr2,"FRANCO S.A.S",JOptionPane.INFORMATION_MESSAGE);
        }  
        else if (nrt==win){
         JOptionPane.showMessageDialog(null," **GANADOR** \nParticipante #3\nNombre: "+nom3+"\nDocumento: "+ced3+"\nNumero ganador: "+win+"\nSu premio es: "+pr3,"FRANCO S.A.S",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (nr2==win){
         JOptionPane.showMessageDialog(null," **GANADOR** \nParticipante #1\nNombre: "+nom1+"\nDocumento: "+ced1+"\nNumero ganador: "+win+"\nSu premio es: "+pr,"FRANCO S.A.S",JOptionPane.INFORMATION_MESSAGE);
        }  
        else if (nrs2==win){
         JOptionPane.showMessageDialog(null," **GANADOR** \nParticipante #2\nNombre: "+nom2+"\nDocumento: "+ced2+"\nNumero ganador: "+win+"\nSu premio es: "+pr2,"FRANCO S.A.S",JOptionPane.INFORMATION_MESSAGE);
        }  
        else if (nrt2==win){
         JOptionPane.showMessageDialog(null," **GANADOR** \nParticipante #3\nNombre: "+nom3+"\nDocumento: "+ced2+"\nNumero ganador: "+win+"\nSu premio es: "+pr3,"FRANCO S.A.S",JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (nr3==win){
         JOptionPane.showMessageDialog(null," **GANADOR** \nParticipante #1\nNombre: "+nom1+"\nDocumento: "+ced2+"\nNumero ganador: "+win+"\nSu premio es: "+pr,"FRANCO S.A.S",JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (nrs3==win){
         JOptionPane.showMessageDialog(null," **GANADOR** \nParticipante #2\nNombre: "+nom2+"\nDocumento: "+ced2+"\nNumero ganador: "+win+"\nSu premio es: "+pr2,"FRANCO S.A.S",JOptionPane.INFORMATION_MESSAGE);
        } 
        else if (nrt3==win){
         JOptionPane.showMessageDialog(null," **GANADOR** \nParticipante #3\nNombre: "+nom3+"\nDocumento: "+ced2+"\nNumero ganador: "+win+"\nSu premio es: "+pr3,"FRANCO S.A.S",JOptionPane.INFORMATION_MESSAGE);
        } 
        else{
         JOptionPane.showMessageDialog(null,"NO HUBO GANADOR\nEl numero ganador fue: "+win,"FRANCO S.A.S",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}    

