/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.proyectointegrador.clases;

import ec.edu.espoch.proyectointegrador.enumeraciones.TipoExtremo;

/**
 *
 * @author GIGABYTE
 */
public class ResultadoOptimizacion {

    private double xOptimo;
    private double valorOptimo;
    private TipoExtremo tipoExtremo;

    public ResultadoOptimizacion(double xOptimo,
                                 double valorOptimo,
                                 TipoExtremo tipoExtremo) {
        this.xOptimo = xOptimo;
        this.valorOptimo = valorOptimo;
        this.tipoExtremo = tipoExtremo;
    }

    public double getXOptimo() {
        return xOptimo;
    }

    public double getValorOptimo() {
        return valorOptimo;
    }

    public TipoExtremo getTipoExtremo() {
        return tipoExtremo;
    }
}

