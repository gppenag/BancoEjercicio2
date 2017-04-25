/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relaciones1;

/**
 *
 * @author gipao
 */
public class Tipo {
    private String codigo;
    private Movimiento movimientos;

    public Tipo(String codigo, Movimiento movimientos) {
        this.codigo = codigo;
        this.movimientos = movimientos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Movimiento getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(Movimiento movimientos) {
        this.movimientos = movimientos;
    }
    
    
}
