/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que construye un Empleado
 * @author alumno
 */
public class Empleado extends Persona {
    private float salario;
    private int horaEntrada, horaSalida;
    
    /**
     * Constructor vacío
     */
    
    public Empleado() {
    }

    /**
     * Constructor que recibe salario, horaEntrada, horaSalida, mascota, nombre y edad
     * @param salario El salario que recibe el empleado 
     * @param horaEntrada La hora de entrada que ingresa a su trabajo el empleado
     * @param horaSalida La hora de salida que sale de su trabajo el empleado
     * @param mascota La mascota que tiene el empleado
     * @param nombre El nombre del empleado 
     * @param edad La edad del empleado 
     */
    
    public Empleado(float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(mascota, nombre, edad);
        this.salario = salario;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    /**
     * Método que indica que el empleado está aclarando dudas 
     */
    
    public void aclararDudas(){
        System.out.println("Estoy aclarando dudas");
    }
    
    /**
     * Método que imprime el salario, horaEntrada y horaSalida de un empleado
     * @return La cantidad del salario, la horaEntrada y horaSalida de un empleado
     */
    
    @Override
    public String toString() {
        return super.toString()+ "Empleado{" + "salario=" + salario + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }
}
