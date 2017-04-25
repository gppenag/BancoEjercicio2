/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones1;

import java.util.ArrayList;

/**
 *
 * @author gipao
 */
public class Banco {
    private String codigo;
    private ArrayList<Tipo>tipos;
    private ArrayList<Cuenta>cuentas;

    public Banco(String codigo) {
        this.codigo = codigo;
        this.tipos = new ArrayList<>();
        this.cuentas = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Tipo> getTipos() {
        return tipos;
    }

    public void setTipos(ArrayList<Tipo> tipos) {
        this.tipos = tipos;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
    public ArrayList <Cuenta> listarCuentas(){
        return this.cuentas;
    }
    
}
