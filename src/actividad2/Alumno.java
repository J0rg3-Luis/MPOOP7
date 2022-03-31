/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que construye un Gerente
 * @author alumno
 */

public class Alumno extends Persona {
    private String carrera;
    private int semestre;

    /**
     * Constructor vacío
     */
    public Alumno() {
    }
    
    /**
     * Constructor que recibe carrera, semestre, mascota, nombre y edad 
     * @param carrera La carrera que cursa el alumno
     * @param semestre El año del semestre que cursa el alumno 
     * @param mascota La mascota que tiene el alumno 
     * @param nombre El nombre del alumno
     * @param edad La edad del alumno 
     */
    
    public Alumno(String carrera, int semestre, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    /**
     * Método que indica que está aprendiendo el alumno
     */
    public void aprender(){
        System.out.println("Estoy aprendiendo");
    }
    
    /**
     * Método que indica que está estudiando el alumno
     */
    
    public void estudiar(){
        System.out.println("Estoy estudiando");
    }
    
    /**
     * Método que indica que se está dando de baja el alumno
     */
    
    public void darseDeBaja(){
        System.out.println("Me di de baja");
    }
    
    /**
     * Método que imprime la carrera y semestre que cursa un alumno 
     * @return El nombre de la carrera y el semestre que cursa un alumno 
     */
    
    @Override
    public String toString() {
        return super.toString()+ "Alumno{" + "carrera=" + carrera + ", semestre=" + semestre + '}';
    }
    
    
}
