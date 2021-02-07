
package Ejercicios;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Ejercicio3 {
    public static void main(String[] args) {
  String respuesta="";
  do{
 
  System.out.println("Ingresar el radio del circulo" );
      System.out.println("________________________");
  Scanner Escribir=new Scanner(System.in);
  double radioCirculo=Double.parseDouble(Escribir.nextLine());
  double areaCirculo = Math.PI * Math.pow(radioCirculo,2);
  
  System.out.println("El radio del circulo es: "+radioCirculo+
    " por ende su area es "+areaCirculo);
  System.out.println("Empezar de nuevo");
  System.out.println("Posibles respuestas (si/no)");
  respuesta=Escribir.nextLine();
  }while(respuesta.equalsIgnoreCase("si"));
  System.out.println("Terminado");
 }

}
    

