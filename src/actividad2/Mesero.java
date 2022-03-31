/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad2;

/**
 * Clase que construye un Mesero
 * @author alumno
 */

public class Mesero extends Empleado {
    private String restaurante, colorDelUniforme;
    private int numMesas;
    
    /**
     * Constructor vacío
     */
    
    public Mesero() {
    }
    
    /**
     * Constructor que recibe restaurante, colorDelUniforme, salario, horaEntrada, horaSalida, mascota, nombre y edad 
     * @param restaurante El nombre del restaurante del mesero
     * @param colorDelUniforme El color del uniforme del mesero
     * @param numMesas El número de mesas que atiende el mesero
     * @param salario El salario que recibe el mesero
     * @param horaEntrada La hora de entrada que ingresa a su trabajo el mesero
     * @param horaSalida La hora de salida que sale de su trabajo el mesero
     * @param mascota La mascota que tiene el mesero
     * @param nombre El nombre del mesero
     * @param edad La edad del mesero 
     */

    public Mesero(String restaurante, String colorDelUniforme, int numMesas, float salario, int horaEntrada, int horaSalida, Mascota mascota, String nombre, int edad) {
        super(salario, horaEntrada, horaSalida, mascota, nombre, edad);
        this.restaurante = restaurante;
        this.colorDelUniforme = colorDelUniforme;
        this.numMesas = numMesas;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public String getColorDelUniforme() {
        return colorDelUniforme;
    }

    public void setColorDelUniforme(String colorDelUniforme) {
        this.colorDelUniforme = colorDelUniforme;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }
    
    /**
     * Método que indica que está recibiendo propina el mesero
     */
    
    public void recibirPropina(){
        System.out.println("Recibiendo propina");
    } 
    
    /**
     * Método que indica que el mesero está dando el pedido
     */
    
    public void darPedido(){
        System.out.println("Tenga su pedido");
    }
    
    /**
     * Método que indica que el mesero está recibiendo el pedido
     */
    
    public void recibirPedido(){
        System.out.println("Tomaré su pedido");
    }
    
    /**
     * Método que indica que el mesero está tomando un descanso
     */
    
    public void tomarDescanso (){
        System.out.println("Estoy tomando un descanso");
    }
    
    /**
     * Método que imprime el restaurante, colorDelUniforme y numMesas de un mesero
     * @return El nombre del restaurante, el colorDelUniforme y el numMesas de un mesero
     */
    @Override
    public String toString() {
        return "Mesero{" + "restaurante=" + restaurante + ", colorDelUniforme=" + colorDelUniforme + ", numMesas=" + numMesas + '}';
    }
}
