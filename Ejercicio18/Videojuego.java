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
public class Videojuego implements Entregable{
  
    private final static int HORAS_ESTIMADAS_DEF=100;
    public final static int MAYOR=1;
    public final static int MENOR=-1;
    public final static int IGUAL=0;
  
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compañia;
  
    public String getTitulo() {
        return titulo;
    }
  
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
  
    public int getHorasEstimadas() {
        return horasEstimadas;
    }
  
    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
  
    public String getGenero() {
        return genero;
    }
  
    public void setGenero(String genero) {
        this.genero = genero;
    }
  
    /**
     * Devuelve el compañia del videojuego
     * @return compañia del videojuego
     */
    public String getcompañia() {
        return compañia;
    }
  
    /**
     * Modifica el compañia del videojuego
     * @param compañia a cambiar
     */
    public void setcompañia(String compañia) {
        this.compañia = compañia;
    }
  
    /**
     * Cambia el estado de entregado a true
     */
    public void entregar() {
        entregado=true;
    }
  
    /**
     * Cambia el estado de entregado a false
     */
    public void devolver() {
        entregado=false;
    }
  
    /**
     * Indica el estado de entregado
     * @return 
     */
    public boolean isEntregado() {
        if(entregado){
            return true;
        }
        return false;
    }
  
    /**
     * Compara dos videojuegos segun el numero de paginas
     * @return codigo numerico
     * <ul>
     * <li>1: El videojuego 1 es mayor que el videojuego 2</li>
     * <li>0: Los videojuegos son iguales</li>
     * <li>-1: El videojuego 1 es menor que el videojuego 2</li></ul>
     */
    
    public int compareTo(Object a) {
        int estado=MENOR;
  
        //Hacemos un casting de objetos para usar el metodo get
        Videojuego ref=(Videojuego)a;
        if (horasEstimadas>ref.getHorasEstimadas()){
            estado=MAYOR;
        }else if(horasEstimadas==ref.getHorasEstimadas()){
            estado=IGUAL;
        }
  
        return estado;
    }
  
    /**
     * Muestra informacion del videojuego
     * @return cadena con toda la informacion del videojuego
     */
    @Override
    public String toString(){
        return "Informacion del videojuego: \n" +
                "\tTitulo: "+titulo+"\n" +
                "\tHoras estimadas: "+horasEstimadas+"\n" +
                "\tGenero: "+genero+"\n" +
                "\tcompañia: "+compañia;
    }
  
    /**
     * Indica si dos videojuegos son iguales, siendo el titulo y compañia iguales
     * @param a videojuego a comparar
     * @return true si son iguales y false si son distintos
     */
    public boolean equals(Videojuego a){
        if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getcompañia())){
            return true;
        }
        return false;
    }
  
    //Constructor
  
    /**
     * Constructo por defecto
     */
    public Videojuego(){
        this("",HORAS_ESTIMADAS_DEF, "", "");
    }
  
    /**
     * Constructor con 2 parametros
     * @param titulo del videojuego
     * @param compañia del videojuego
     */
    public Videojuego(String titulo, String compañia){
        this(titulo,HORAS_ESTIMADAS_DEF, "", compañia);
    }
  
    /**
     * Constructor con 4 parametros
     * @param titulo del videojuego
     * @param horasEstimadas
     * @param genero del videojuego
     * @param compañia del videojuego
     */
    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia){
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.genero=genero;
        this.compañia=compañia;
        this.entregado=false;
    }
 
  
}
