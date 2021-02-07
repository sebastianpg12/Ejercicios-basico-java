
package Ejercicios;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        String conc = reader.nextLine();
        String Frase = "La sonrisa serala mejor arma "
                + "contra la tristeza";
        Frase = Frase.replace('a','e');
        Frase = Frase.concat(" "+ conc);
       
        System.out.println(Frase);
      
    }
}



