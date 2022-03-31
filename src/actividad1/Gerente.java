/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1;

/**
 * Clase que construye un Gerente
 * @author alumno
 */

public class Gerente extends Empleado{
    private int presupuesto;

    /**
     * Constructor vacío
     */
    
    public Gerente() {
    }
    
    /**
     * Constructor que recibe presupuesto, nombre, numEmpleado y sueldo 
     * @param presupuesto El presupuesto que recibe el gerente
     * @param nombre El nombre del gerente
     * @param numEmpleado El número telefónico del gerente
     * @param sueldo El sueldo que recibe el gerente
     */
    
    public Gerente(int presupuesto, String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
    }
    
    /**
     * Método que indica el presupuesto que recibe el gerente
     * @param presupuesto El presupuesto que recibe el gerente
     */
    
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto=presupuesto;
    }
    
    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    /**
     * Método que imprime el presupuesto de un gerente
     * @return La cantidad del presupuesto de un gerente
     */
    
    @Override
    public String toString() {
        return super.toString()+"Gerente{" + "presupuesto=" + presupuesto + '}';
    }  
}
