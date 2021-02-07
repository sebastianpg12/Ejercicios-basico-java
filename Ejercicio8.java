
package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {  
        String dia;
        Scanner reader = new Scanner (System.in); 
        System.out.println ("Introducir numero");
        dia = reader.nextLine();
        switch(dia){
            case "lunes":
                System.out.println("El "+dia+" es un día laboral");
                break;
                
            case "martes":
                System.out.println("El "+dia+" es un día laboral");
                break;
                
            case "miercoles":
                System.out.println("El "+dia+" es un día laboral");
                break;
                
            case "jueves":
                System.out.println("El "+dia+" es un día laboral");
                break;
                
            case "viernes":
                System.out.println("El "+dia+" es un día laboral");
                break;
                
            case "sabado":
                System.out.println("El "+dia+" es un día laboral");
                break;
                
            case "domingo":
                System.out.println("El "+dia+" no es un día laboral, es día de descanso");
                break;
                
            default:
                System.out.println("Ingrese un día valido");
                break;
        }
        
    }
}
