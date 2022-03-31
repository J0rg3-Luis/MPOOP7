/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que construye una Mascota
 * @author alumno
 */

public class Mascota extends SerVivo {
    private String color,raza,colorOjos;
    
    /**
     * Constructor vacío
     */
    
    public Mascota() {
    }
    
    /**
     * Constructor que recibe color, raza, colorOjos, nombre y edad  
     * @param color El color del pelaje de la mascota
     * @param raza La raza de la mascota
     * @param colorOjos El color de ojos de la mascota
     * @param nombre El nombre de la mascota
     * @param edad La edad de la mascota
     */

    public Mascota(String color, String raza, String colorOjos, String nombre, int edad) {
        super(nombre, edad);
        this.color = color;
        this.raza = raza;
        this.colorOjos = colorOjos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }
    
    /**
     * Método que indica que está durmiendo la mascota 
     */
    
    public void dormir(){
        System.out.println("ZZzzzzZZZzZzzzz");
    }
    
    /**
     * Método que indica que está saltando la mascota 
     */
    
    public void saltar(){
        System.out.println("Estoy saltando");
    }
    
    /**
     * Método que indica que está jugando la mascota 
     */
    
    public void jugar(){
        System.out.println("Estoy jugando");     
    }
    
    /**
     * Método que imprime el color, raza y colorOjos de una mascota 
     * @return El color, raza y colorOjos de una mascota 
     */
    
    @Override
    public String toString() {
        return super.toString()+ "Mascota{" + "color=" + color + ", raza=" + raza + ", colorOjos=" + colorOjos + '}';
    }
}
