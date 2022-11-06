package Ejercicios;

public class Ejemplo14_10Constructor {
    int num_credito,intensidad_h;
    String cod_asignatura, nom_asignatura, nom_programa, nom_director,cod_aula;
   
    public Ejemplo14_10Constructor(String cod_asignatura, String nom_asignatura, String nom_programa, String nom_director, int num_credito,int intensidad_h,String cod_aula){
    this.cod_asignatura=cod_asignatura;
    this.nom_asignatura=nom_asignatura;
    this.nom_programa=nom_programa;
    this.nom_director=nom_director;
    this.num_credito=num_credito;
    this.intensidad_h=intensidad_h;
    this.cod_aula=cod_aula;
    }
    
   public static void main(String[]args){
      Ejemplo14_10Constructor asignatura = new Ejemplo14_10Constructor("lp1020","Logica programacion","Ing. Sistemas","Alba Vélez",6,6,"504L");
      asignatura.info_asignatura();
      
      
    }
    void info_asignatura(){
        System.out.println("CODIGO:\t\t\t\t"+cod_asignatura);   
        System.out.println("ASIGNATURA:\t\t\t"+nom_asignatura);   
        System.out.println("PROGRAMA:\t\t\t"+nom_programa);
        System.out.println("DOCENTE:\t\t\t"+nom_director);
        System.out.println("CREDITOS:\t\t\t"+num_credito);
        System.out.println("INTENSIDAD H/S:\t\t\t"+intensidad_h);
        System.out.println("AULA ASIGNADA:\t\t\t"+cod_aula);
        
        
        
    }
    
}
