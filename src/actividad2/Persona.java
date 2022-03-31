/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que construye una Persona
 * @author alumno
 */

public class Persona extends SerVivo{
    private Mascota mascota;

    /**
     * Constructor vacío
     */
    
    public Persona() {
    }
    
    /**
     * Constructor que recibe mascota, nombre y edad  
     * @param mascota La mascota que tiene la persona
     * @param nombre El nombre de la persona
     * @param edad La edad de la persona 
     */

    public Persona(Mascota mascota, String nombre, int edad) {
        super(nombre, edad);
        this.mascota = mascota;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    /**
     * Método que imprime la mascota de una persona 
     * @return La mascota de una persona 
     */
    
    @Override
    public String toString() {
        return super.toString()+ "Persona{" + "mascota=" + mascota + '}';
    }
 }
