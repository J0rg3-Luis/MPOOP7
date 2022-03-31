/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que construye un Perro
 * @author alumno
 */

public class Perro extends Mascota{
    private boolean colaCortada;
    
    /**
     * Constructor vacío
     */
    
    public Perro() {
    }
    
    /**
     * Constructor que recibe colaCortada, color, raza, colorOjos, nombre y edad  
     * @param colaCortada El booleano si tiene o no cola cortada el perro
     * @param color El color del pelaje del perro
     * @param raza La raza del perro 
     * @param colorOjos El color de ojos del perro
     * @param nombre El nombre del perro
     * @param edad La edad del perro
     */

    public Perro(boolean colaCortada, String color, String raza, String colorOjos, String nombre, int edad) {
        super(color, raza, colorOjos, nombre, edad);
        this.colaCortada = colaCortada;
    }
    
    /**
     * Método que afirma o niega si el perro tiene cola cortada
     * @return La afirmación o negación si tiene cola cortada el perro
     */
    public boolean isColaCortada() {
        return colaCortada;
    }
    
    /**
     * Método que asocia la afirmación o negación si tiene cola cortada el perro
     * @param colaCortada El booleano que indica si tiene o no cola corta el perro
     */

    public void setColaCortada(boolean colaCortada) {
        this.colaCortada = colaCortada;
    }
    
    /**
     * Método que indica que está corriendo el perro
     */
    
    public void correr(){
        System.out.println("Estoy corriendo");
    }
    
    /**
     * Método que indica que está correteando el perro
     */
    
    public void corretear(){
        System.out.println("Te estoy correteando");
    }
    
    /**
     * Método que imprime colaCortada de un perro 
     * @return El booleano de colaCortada de un perro
     */
    
    @Override
    public String toString() {
        return super.toString()+"Perro{" + "colaCortada=" + colaCortada + '}';
    }
}
