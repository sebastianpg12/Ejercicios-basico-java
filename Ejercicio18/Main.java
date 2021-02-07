/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio18;

/**
 *
 * @author Brayan Gomez
 */
public class Main {
    
    public static void main(String[] args) {
        
        Serie listaSeries[]=new Serie[5];
        Videojuego listaVideojuegos[]=new Videojuego[5];
  
        listaSeries[0]=new Serie();
        listaSeries[1]=new Serie("The walking dead", "Luis alberto ");
        listaSeries[2]=new Serie("Bananas en pijama", 25, "infantil", "marta");
        listaSeries[3]=new Serie("pp", 12 ,"Humor", "Sasasaasa");
        listaSeries[4]=new Serie("Breaking the Bad", 5, "Humor", "Vsdsd");
  
        listaVideojuegos[0]=new Videojuego();
        listaVideojuegos[1]=new Videojuego("Simsopns", 30, "Humor", "EA");
        listaVideojuegos[2]=new Videojuego("call of duty", "san luis");
        listaVideojuegos[3]=new Videojuego("fifa", 30, "Plataforma", "play");
        listaVideojuegos[4]=new Videojuego("God of war", 200, "Rol", "Square Enix");
  
        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();
  
        int entregados=0;
  
        for(int i=0;i<listaSeries.length;i++){
            if(listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();
  
            }
            if(listaVideojuegos[i].isEntregado()){
                entregados+=1;
                listaVideojuegos[i].devolver();
            }
        }
  
        System.out.println("Hay "+entregados+" articulos entregados");
  
        Serie serieMayor=listaSeries[0];
        Videojuego videojuegoMayor=listaVideojuegos[0];
  
        for(int i=1;i<listaSeries.length;i++){
            if(listaSeries[i].compareTo(serieMayor)==Serie.MAYOR){
                serieMayor=listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)==Videojuego.MAYOR){
                videojuegoMayor=listaVideojuegos[i];
            }
  
        }
  
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);
       
    }
    
}
