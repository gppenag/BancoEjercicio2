/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones1;

import java.util.Date;

/**
 *
 * @author gipao
 */
public class Movimiento {
 private Date fecha;
 private double saldoPrecedente;
 private double cantidad;
 private Tipo type;

    public Movimiento(Date fecha, double saldoPrecedente, double cantidad, Tipo type) {
        this.fecha = fecha;
        this.saldoPrecedente = saldoPrecedente;
        this.cantidad = cantidad;
        this.type = type;
    }

    public Tipo getType() {
        return type;
    }

    public void setType(Tipo type) {
        this.type = type;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSaldoPrecedente() {
        return saldoPrecedente;
    }

    public void setSaldoPrecedente(double saldoPrecedente) {
        this.saldoPrecedente = saldoPrecedente;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "fecha=" + fecha + ", saldoPrecedente=" + 
                saldoPrecedente + ", cantidad=" + cantidad + '}';
    }
}
