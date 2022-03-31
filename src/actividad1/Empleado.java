/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que construye un Empleado
 * @author alumno
 */

public class Empleado extends Object {
    private String nombre;
    private int numEmpleado, sueldo;

    /**
     * Constructor vacío
     */
    
    public Empleado() {
    }
    
    /**
     * Constructor que recibe nombre, numEmpleado y sueldo
     * @param nombre El nombre del empleado
     * @param numEmpleado El número telefónico del empleado 
     * @param sueldo El sueldo que recibe el empleado 
     */
    
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }
    
    /**
     * Método que aumenta el porcentaje del sueldo que recibe el empleado
     * @param porcentaje El porcentaje que aumenta el sueldo que recibe el empleado 
     */
 
    public void aumentarSueldo(int porcentaje){
        sueldo+=(int)(sueldo*porcentaje/100);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método que imprime el nombre, numEmpleado y sueldo de un empleado
     * @return El nombre, numEmpleado y sueldo de un empleado
     */
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }   
}
