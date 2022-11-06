
package Ejercicios;

    import javax.swing.JOptionPane;

public class Categoria_afiliacion_Panel {
    public static void main(String []args){
        String categoria;
        //JOptionPane.showMessageDialog ("INGRESE LA CATEGORIA DEL USUARIO:");
        categoria = JOptionPane.showInputDialog ("INGRESE LA CATERGORIA DEL USUARIO: ");
        switch (categoria){
            case "a": case "A":
                JOptionPane.showMessageDialog(null,"USUARIO CATEGORIA A."); break;
            case "b": case "B":
                JOptionPane.showMessageDialog(null,"USUARIO CATEGORIA B"); break;
            case "c": case "C":
                JOptionPane.showMessageDialog(null,"USUARIO CATEGORIA C"); break;
            default: 
                JOptionPane.showMessageDialog(null,"OPCION INCORRECTA"); break;
        }
    }
}
