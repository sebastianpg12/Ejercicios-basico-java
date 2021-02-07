
package Ejercicios;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        int numero;
        Scanner reader = new Scanner (System.in); 
        do{
            System.out.println ("Introducir numero otra vez:");
            numero = reader.nextInt();
        }while(numero<0);
        System.out.println("El numero causante del romper el ciclo fue: "
        +numero+" porque es mayor o igual a cero");
    }
}
