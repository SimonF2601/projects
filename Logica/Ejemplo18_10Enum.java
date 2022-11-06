package Ejercicios;

public class Ejemplo18_10Enum {
    
    enum agenda_semana
    {Lunes, Martes, Miercoles, Jueves, Viernes;}
public static void main (String[]args){  
    agenda_semana reunion;
    reunion =agenda_semana.Miercoles;
        switch(reunion){
            case Lunes:
                System.out.println("Junta directiva.");
                break;
            case Martes:
                System.out.println("Grupo primario.");
                break;
            case Miercoles:
                System.out.println("Seguimiento proyecto Gobernacion.◉");
                break;
            case Jueves:
                System.out.println("Validacion de requerimientos");
                break;
            case Viernes:
                System.out.println("Preparar Licitacion");
                break;
            default:
                System.out.println("Fin de semana");
                break;
        }
    }     
}
