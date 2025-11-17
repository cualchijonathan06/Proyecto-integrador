/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.proyectointegrador.clases;

/**
 *
 * @author GIGABYTE
 */
public class ProblemaOptimizacion {

    private String nombreProblema;
    private String descripcion;
    private String unidadX;
    private String unidadY;
    private Funcion funcion;
    private ResultadoOptimizacion resultado;
    private double a;
    private double b;

    public ProblemaOptimizacion(String nombre, String descripcion,
            String unidadX, String unidadY) {
        this.nombreProblema = nombre;
        this.descripcion = descripcion;
        this.unidadX = unidadX;
        this.unidadY = unidadY;
    }

    public void solicitarParametros() {
        a = 50.0;  
        b = 2.0;    
        Termino[] terminos = new Termino[2];
        terminos[0] = new Termino(a, 1);    // a·x
        terminos[1] = new Termino(-b, 2);   // -b·x^2

        funcion = new Funcion(terminos);
    }

   
    public void resolver() {
      
    }
    public void mostrarDescripcion() {
        System.out.println("======================================");
        System.out.println("PROBLEMA: " + nombreProblema);
        System.out.println(descripcion);
        System.out.println("x en: " + unidadX);
        System.out.println("f(x) en: " + unidadY);
        System.out.println("======================================");
    }
    public void mostrarResultado() {
        System.out.println("----- DATOS DEL MODELO CUADRÁTICO -----");
        System.out.println("Coeficiente a (precio base por licencia): " + a);
        System.out.println("Coeficiente b (disminucion de ventas): " + b);
        
    }

}
