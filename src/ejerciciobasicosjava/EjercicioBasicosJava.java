/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobasicosjava;

/**
 *
 * @author Jaime-PC
 */
public class EjercicioBasicosJava {

        public boolean fiestaArdillas(int numBellotas, boolean finDeSemana){
        
            if(finDeSemana){
                //si es findde semana da igual cuantas bellotas haya
                return true;
            }
            //  si llega aqui es que no es fide semana
            if(numBellotas>=40 && numBellotas<=60 ){
                return true;
            }
            
            return false;
        }
        /**
         * multa:Si    la    velocidad    es    de    60    o    menos,    el 
         * resultado    es    0    Si    la   
         * velocidad    es    de    entre    61    y   
         * 80    inclusive,    el    resultado    es    1   
         * Si    la    velocidad    es    81    o    más,    el 
         * resultado    es    2    
         */
        /**
         * 
         * @param velocidad
         * @param birthday
         * @return 
         */
        public int multa (int velocidad, boolean birthday){
            if (birthday){
                velocidad = velocidad - 5; //veloocidad -=5;
            }
            if(velocidad<=60){
                return 0;
            }
            //si va enttre 61 y 80
            if(velocidad > 60 && velocidad<=80){
                return 1; //multa pequeña
            }
            //en cualquier otro valor que tuviera velocidad devolvemos la multa grande
            return 2;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creamos un objeto de la clase en la que estamos (EjerciciosBasicosJava)
        EjercicioBasicosJava ejercicio =new EjercicioBasicosJava(); 
        
        System.out.println("Ejercicio Ardilla");
        System.out.println(ejercicio.fiestaArdillas(30, false));
       System.out.println(ejercicio.fiestaArdillas(50, false));
       System.out.println(ejercicio.fiestaArdillas(70, true));
       
       System.out.println("Ejercicio Multa");
       System.out.println(ejercicio.multa(60, false));
       System.out.println(ejercicio.multa(65, false));
       System.out.println(ejercicio.multa(65, true));
       
       
    }
    
}
