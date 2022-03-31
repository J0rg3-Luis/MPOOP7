/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que construye un ProfesorAsignatura
 * @author alumno
 */

public class ProfesorAsignatura extends Profesor{
    private String nomAsignatura;

    /**
     * Constructor vacío
     */
    
    public ProfesorAsignatura() {
    }
    
    /**
     * Constructor que recibe nomAsignatura, numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre y edad  
     * @param nomAsignatura El nombre de la asignatura que imparte el profesor de asignatura
     * @param numAlumnos El número de alumnos que tiene el profesor de asignatura
     * @param salario El salario que recibe el profesor de asignatura
     * @param horaEntrada La hora de entrada que ingresa a su trabajo el profesor de asignatura
     * @param horaSalida La hora de salida que sale de su trabajo el profesor de asignatura
     * @param mascota La mascota que tiene el profesor de asignatura
     * @param nombre El nombre del profesor de asignatura 
     * @param edad La edad del profesor de asignatura
     */
    
    public ProfesorAsignatura(String nomAsignatura, int numAlumnos, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.nomAsignatura = nomAsignatura;
    }

    public String getNomAsignatura() {
        return nomAsignatura;
    }

    public void setNomAsignatura(String nomAsignatura) {
        this.nomAsignatura = nomAsignatura;
    }
    
    /**
     * Método que imprime el nomAsignatura de un profesor de asignatura
     * @return El nombre del nomAsignatura de un profesor de asignatura
     */
    
    @Override
    public String toString() {
        return super.toString() + "ProfesorAsignatura{" + "nomAsignatura=" + nomAsignatura + '}';
    }
}

