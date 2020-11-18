/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.utils;

import com.jfoenix.controls.JFXButton;


public class Ruta {

    //Atributos
    private JFXButton ingreso;
    private JFXButton egreso;
    private Integer peso;
    private Integer saltos;
    private Boolean visitado;

    //Constructores
    public Ruta() {
        this.ingreso = new JFXButton();
        this.egreso = new JFXButton();
        this.peso = 0;
        this.saltos = 0;
        this.visitado = false;
    }

    public Ruta(JFXButton ingreso, JFXButton egreso, Integer peso, Integer saltos, Boolean visitado) {
        this();
        this.ingreso = ingreso;
        this.egreso = egreso;
        this.peso = peso;
        this.saltos = saltos;
        this.visitado = visitado;
    }

    //Gets and Sets
    public JFXButton getIngreso() {
        return ingreso;
    }

    public void setIngreso(JFXButton ingreso) {
        this.ingreso = ingreso;
    }

    public JFXButton getEgreso() {
        return egreso;
    }

    public void setEgreso(JFXButton egreso) {
        this.egreso = egreso;
    }

    public Integer getPeso() {
        if(peso != null) return peso;
        else return 0;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getSaltos() {
        return saltos;
    }

    public void setSaltos(Integer saltos) {
        this.saltos = saltos;
    }

    public Boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(Boolean visitado) {
        this.visitado = visitado;
    }
    
    @Override
    public String toString() {
        return "Egreso: [" + getEgreso().getId() + "] Ingreso: [" + getIngreso().getId() + "] Peso: [" + getPeso() + " metros] Saltos: [" + getSaltos() + "]";
    }
}
