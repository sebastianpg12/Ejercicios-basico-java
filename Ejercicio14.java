
package Ejercicios;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
    int numero;  
        Scanner reader = new Scanner (System.in); 
        System.out.println ("Introducir numero un numero:");
        numero = reader.nextInt();
        for(int aux=numero; aux<=1000; aux+=2){
        System.out.println("Número: "+aux);
        }
}
}