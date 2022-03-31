/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop7;

import actividad1.Empleado;
import actividad1.Gerente;
import actividad2.Alumno;
import actividad2.Gato;
import actividad2.Mesero;
import actividad2.Perro;
import actividad2.ProfesorAsignatura;
import actividad2.ProfesorCarrera;

/**
 *
 * @author alumno
 */
public class MPOOP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado empleado = new Empleado();
        empleado.setNombre("joaquín");
        empleado.setNumEmpleado(998877);
        empleado.setSueldo(10_000);
        
        System.out.println(empleado);
        System.out.println(empleado.toString());
        
        empleado.aumentarSueldo(30);
        System.out.println(empleado);
        
        
        Gerente gerente = new Gerente();
        gerente.setNombre("Paulina");
        gerente.setNumEmpleado(887766);
        gerente.setSueldo(30_000);
        gerente.setPresupuesto(100_000);
        System.out.println(gerente);
        gerente.aumentarSueldo(50);

        System.out.println(gerente);
    
        Gerente gerente2 = new Gerente(1_000_000,"Saúl",113365,50_000);
        System.out.println(gerente2);
        
        
        System.out.println("\n---------- Perro ----------");
        Perro perro = new Perro(true,"negro","Chihuahua","Amarillos","Pipo",3);
        Perro perro2= new Perro(false,"Blanco","Mestizo","Negros","Tifus",12);
        System.out.println(perro);
        
        System.out.println("\n---------- Gato ----------");
        Gato gato = new Gato("Café", "Siamés", "Azules", "Misifus", 7);
        Gato gato2= new Gato("Blanco", "Ragdoll","Negros","Pelusa", 5);
        System.out.println(gato);
       
        System.out.println("\n---------- Alumno ----------");
        Alumno alumno = new Alumno("Eléctrica Electrónica", 2022, gato, "Ismael", 19);
        System.out.println(alumno);
        
        System.out.println("\n---------- Mesero ----------");
        Mesero mesero = new Mesero("Hamburguesas","Negro con Rojo",10,5_000,8,16,gato2,"Norberto",23);
        System.out.println(mesero);
        
        System.out.println("\n---------- Profesor Asignatura ----------");
        ProfesorAsignatura asignatura = new ProfesorAsignatura ("Análisis Numérico",54,9_000,13,21,perro2,"Jorge Armando",28);
        System.out.println(asignatura);
        
        System.out.println("\n---------- Profesor Carrera ----------");
        ProfesorCarrera carrera = new ProfesorCarrera (3,5,56,8_000,7,17, perro, "Jesús", 38);
        System.out.println(carrera);
    }
}
