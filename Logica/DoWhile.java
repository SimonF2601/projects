
package Ejercicios;
    import javax.swing.JOptionPane;

public class DoWhile {
    public static void main (String[]args){
    int contador=1;
    double est;
    String Si= "Candidato prioritario", No="No aplica",nombre="";
  JOptionPane.showMessageDialog(null, "BIENVENIDO A LA SELECCION DE RECLUTAMIENTO PARA EL EQUIPO DE BALOCESTO", "EQUIPO DE BALONCESTO LUCHIMÓN",JOptionPane.QUESTION_MESSAGE);
          do { 
              nombre= JOptionPane.showInputDialog("INGRESAR NOMBRE: \n");
               
              est=Double.parseDouble(JOptionPane.showInputDialog("Registro n° "+contador+"\n\nINGRESAR ESTATURAS EN METROS (Por ejemplo 1.85)"));
              if (est<1.85){
             JOptionPane.showMessageDialog(null,No);
              System.out.println("Registro n° "+contador+" "+No);
            }
              else if (est>2.1){
              JOptionPane.showMessageDialog(null,Si);
              System.out.println("Registro n° "+contador+""
                      + " "+Si);
          }
         ++contador;
          }
          while (contador<=10);
    }   
}
