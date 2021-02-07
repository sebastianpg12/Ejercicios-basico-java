/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        double Iva = 0.21;
        double Valor;
        double ValorFinal;
        Scanner reader = new Scanner (System.in); 
        System.out.println ("introducir Valor del producto:");
        Valor = reader.nextDouble();
        ValorFinal = (Valor * Iva) + Valor;
        System.out.println("El Valor final incluyendo el IVA es: ["+ValorFinal+"]");
        
    }
}

