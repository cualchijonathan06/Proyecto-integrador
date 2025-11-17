/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.proyectointegrador;

import ec.edu.espoch.proyectointegrador.clases.ProblemaOptimizacion;
/**
 *
 * @author GIGABYTE
 */
public class ProyectoIntegrador {

    public static void main(String[] args) {
      ProblemaOptimizacion problema = new ProblemaOptimizacion(
                "Optimizacion de ingresos en venta de software",
                "Una empresa de TI vende licencias y desea conocer el ingreso máximo.",
                "licencias vendidas",
                "unidades monetarias"
        );

        problema.mostrarDescripcion();    
        problema.solicitarParametros();   
        problema.mostrarResultado();     
    }
    
}
