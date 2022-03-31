/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que construye un Profesor
 * @author alumno 
 */

public class Profesor extends Empleado {
    private int numAlumnos;
    
    /**
     * Constructor vacío
     */
    
    public Profesor() {
    }
    
    /**
     * Constructor que recibe numAlumnos, salario, horaEntrada, horaSalida, mascota, nombre y edad  
     * @param numAlumnos El número de alumnos que tiene el profesor
     * @param salario El salario que recibe el profesor
     * @param horaEntrada La hora de entrada que ingresa a su trabajo el profesor
     * @param horaSalida La hora de salida que sale de su trabajo el profesor
     * @param mascota La mascota que tiene el profesor
     * @param nombre El nombre del profesor
     * @param edad La edad del profesor
     */
    
    public Profesor(int numAlumnos, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.numAlumnos = numAlumnos;
    }

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }
    
    /**
     * Método que indica que el profesor está reprobando 
     */

    public void reprobar(){
        System.out.println("Estás reprobado");
    }
    
    /**
     * Método que indica que el profesor está aprobando
     */
    
    public void pasarAlumnos(){
        System.out.println("Estás aprobado");
    }
    
    /**
     * Método que indica que está explicando el profesor
     */
    
    public void explicar(){
        System.out.println("estoy explicando");
    }
    
    /**
     * Método que imprime el numAlumnos de un profesor
     * @return La cantidad del numAlumnos de un profesor
     */
    
    @Override
    public String toString() {
        return super.toString() + "Profesor{" + "numAlumnos=" + numAlumnos + '}';
    }
}
