/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gipao
 */
public class Cuenta {
private int numeroCuenta;
private double saldoCorriente;
private Date fechaCreacion;
private String nomCliente;
private ArrayList<Movimiento>movimientos;

    public Cuenta(int numeroCuenta, double saldoCorriente, Date fechaCreacion, String nomCliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoCorriente = saldoCorriente;
        this.fechaCreacion = fechaCreacion;
        this.nomCliente = nomCliente;
        this.movimientos = new  ArrayList<>();
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoCorriente() {
        return saldoCorriente;
    }

    public void setSaldoCorriente(double saldoCorriente) {
        this.saldoCorriente = saldoCorriente;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(ArrayList<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }

    public double calculartotal(){
    double total =this.getSaldoCorriente();
        for(Movimiento m: movimientos){
            if(m.getType().getCodigo().equals("0001"))            
                total+= m.getCantidad();
            else if(m.getType().getCodigo().equals("0002"))
                total-=m.getCantidad();
        }
        return total;
    }

    @Override
    public String toString() {
        String acum= "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldoCorriente=" +
                saldoCorriente + ", fechaCreacion=" + fechaCreacion + ", nomCliente=" 
                + nomCliente + ", movimientos=";
        for(Movimiento m: movimientos){
            acum+=m.toString();
        }
        
        return acum;
    }



}
