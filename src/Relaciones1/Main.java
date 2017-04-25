/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author gipao
 */
public class Main {
    
    public static void main(String[] args) {
        
    Banco banco = new Banco("456778");
    ArrayList<Cuenta>cuentas = new ArrayList();
    ArrayList<Tipo>tipos = new ArrayList();
    Tipo CONSIGNACION=new Tipo("0001");
    Tipo RETIRO=new Tipo("0002");
    tipos.add(CONSIGNACION);
    tipos.add(RETIRO);
    banco.setTipos(tipos);
    
    Cuenta cuenta1 = new Cuenta(34567, 38.000 , (new GregorianCalendar(2004,4,25)).getTime(), "María");
    Movimiento m11 = new Movimiento ((new GregorianCalendar(2004,12,15)).getTime(), cuenta1.getSaldoCorriente(), 20.000,banco.getTipos().get(0));
    Movimiento m12 = new Movimiento((new GregorianCalendar(2016,8,25)).getTime(), cuenta1.getSaldoCorriente(), 10.000,banco.getTipos().get(1));

    ArrayList<Movimiento> movimientosC1=new ArrayList<>();
    movimientosC1.add(m11);
    movimientosC1.add(m12);
    
    Cuenta cuenta2 = new Cuenta(34456, 67.000 , (new GregorianCalendar(2004,10,12)).getTime(), "Pepe");
    Movimiento m21 = new Movimiento ((new GregorianCalendar(2005,2,25)).getTime(), 123.000, 20.000,banco.getTipos().get(0));
    Movimiento m22 = new Movimiento ((new GregorianCalendar(2017,4,25)).getTime(),345.000,10.000, banco.getTipos().get(1));
    
    ArrayList<Movimiento> movimientosC2 = new ArrayList<>();
    movimientosC2.add(m21);
    movimientosC2.add(m22);
   
    
    cuentas.add(cuenta1);
    cuentas.add(cuenta2);
    banco.setCuentas(cuentas);
    cuenta1.setMovimientos(movimientosC1);
    cuenta2.setMovimientos(movimientosC2);
    
    ArrayList <Cuenta> lista = banco.listarCuentas();
    
    for(int i = 0; i < lista.size();i++ ){
       Cuenta c = lista.get(i);
       System.out.println(c.toString()+" el saldo total de la cuenta es de "+c.calculartotal());
    }
    }
}
