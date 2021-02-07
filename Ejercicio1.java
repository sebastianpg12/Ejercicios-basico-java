
package Ejercicios;


public class Ejercicio1 {
      public static void main(String[] args) {
        
        int numero1=1;
        int numero2=15;
 
        
        if (numero1>=numero2){
         
            if(numero1==numero2){
                System.out.println("El primer numero y el segundo numero son los mismo numeros "+ numero1+ "="+ numero2);
            }else{
                System.out.println("El primer numero: "+numero1+", es un numero mayor que el segundo numero: "+numero2);
            }
        }else{
            System.out.println("El segundo numero: "+numero2+", es un numero mayor que el primer numero: "+numero1);
        }
    }
}
