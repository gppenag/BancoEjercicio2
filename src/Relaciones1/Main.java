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
   //     GregorianCalendar gc= new GregorianCalendar(2017,4,25);
     //   System.out.println(gc.getTime());
        
    Banco banco = new Banco("456778");
    ArrayList<Cuenta>cuentas = new ArrayList();
    ArrayList<Tipo>tipos = new ArrayList();
    
    Cuenta cuenta1 = new Cuenta(34567, 38.000 , (new GregorianCalendar(2017,4,25)).getTime(), "María");
    Movimiento m11 = new Movimiento ((new GregorianCalendar(2017,4,25)).getTime(), 90.000, 20.000);
    Tipo tipo11 = new Tipo("34567", m11);
    tipo11.setMovimientos(m11);
    
    Movimiento m12 = new Movimiento((new GregorianCalendar(2017,4,25)).getTime(), 105.000, 10.000);
    Tipo tipo12 = new Tipo("34567", m12);
    tipo12.setMovimientos(m12);
    
    ArrayList<Movimiento> movimientosC1=new ArrayList<>();
    movimientosC1.add(m11);
    movimientosC1.add(m12);
    
    Cuenta cuenta2 = new Cuenta(34456, 67.000 , (new GregorianCalendar(2017,4,25)).getTime(), "Pepe");
    Movimiento m21 = new Movimiento ((new GregorianCalendar(2017,4,25)).getTime(), 123.000, 20.000);
    Tipo tipo21 = new Tipo ("34456", m21);
    tipo21.setMovimientos(m21);
    
    Movimiento m22 = new Movimiento ((new GregorianCalendar(2017,4,25)).getTime(),345.000,10.000);
    Tipo tipo22 = new Tipo("34567", m22);
    tipo22.setMovimientos(m22);
    
    ArrayList<Movimiento> movimientosC2 = new ArrayList<>();
    movimientosC2.add(m21);
    movimientosC2.add(m22);
    
    
    tipos.add(tipo11);
    tipos.add(tipo12);
    tipos.add(tipo21);
    tipos.add(tipo22);
    
    
    cuentas.add(cuenta1);
    cuentas.add(cuenta2);
    banco.setCuentas(cuentas);
    banco.setTipos(tipos);
    cuenta1.setMovimientos(movimientosC1);
    cuenta2.setMovimientos(movimientosC2);
    
    ArrayList <Cuenta> lista = banco.listarCuentas();
    
    for(int i = 0; i < lista.size();i++ ){
       Cuenta c = lista.get(i);
       System.out.println(c.toString()+" el saldo total de la cuenta es de "+c.calculartotal());
    }
    }
}
