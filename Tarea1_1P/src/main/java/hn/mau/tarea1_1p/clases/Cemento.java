/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hn.mau.tarea1_1p.clases;

/**
 *
 * @author maureen
 */
public class Cemento {

    private int cantMaxCemento;
    private int ingresoCemento;
    private int retiroCemento;
    private int inventario;

    public Cemento() {
        super();
    }

    public Cemento(int cantCemento) {
        this.cantMaxCemento = cantCemento;
    }

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = this.ingresoCemento - this.retiroCemento;
    }

    public int getIngresoCemento() {
        return ingresoCemento;
    }

    public void setIngresoCemento(int ingresoCemento) {
        this.ingresoCemento = ingresoCemento;
    }

    public int getRetiroCemento() {
        return retiroCemento;
    }

    public void setRetiroCemento(int retiroCemento) {
        this.retiroCemento = retiroCemento;
    }

    public int getCantMaxCemento() {
        return cantMaxCemento;
    }

    public void setCantMaxCemento(int cantMaxCemento) {
        this.cantMaxCemento = cantMaxCemento;
    }

    public String valInventarios() {
        String val = "";
        if (this.ingresoCemento > this.cantMaxCemento) {
            val = "El valor a ingresar es mayor a la cantidad maxima de capacidad de cemento";
        }
        return val;
    }

    public String valRetiroNegativo() {
        String val = "";
        if (this.inventario - this.retiroCemento < 0) {
            val = "No puede retirar menos de la existencia de inventario";
        }
        return val;
    }

}
