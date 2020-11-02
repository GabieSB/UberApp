/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.utils;

import com.jfoenix.controls.JFXButton;

public class Puntos {
    //Atributos
    private JFXButton nombre;
    private JFXButton up;
    private JFXButton down;
    private JFXButton left;
    private JFXButton rigth;
    private Integer pU;
    private Integer pD;
    private Integer pL;
    private Integer pR;
    
    //Constructores
    public Puntos(){
        this.nombre = new JFXButton();
        this.up = new JFXButton();
        this.down = new JFXButton();
        this.left = new JFXButton();
        this.rigth = new JFXButton();
        this.pU = 0;
        this.pD = 0;
        this.pL = 0;
        this.pR = 0;
    }
    
    /***
     * Constructor por parametros
     * @param nombre
     * @param up
     * @param down
     * @param left
     * @param rigth 
     */
    public Puntos(JFXButton nombre, JFXButton up, JFXButton down, JFXButton left, JFXButton rigth, Integer pU, Integer pD, Integer pL, Integer pR){
        this.nombre = nombre;
        this.up = up;
        this.down = down;
        this.left = left;
        this.rigth = rigth;
        this.pU = pU;
        this.pD = pD;
        this.pL = pL;
        this.pR = pR;
    }

    public JFXButton getNombre() {
        return nombre;
    }

    public void setNombre(JFXButton nombre) {
        this.nombre = nombre;
    }

    public JFXButton getUp() {
        return up;
    }

    public void setUp(JFXButton up) {
        this.up = up;
    }

    public JFXButton getDown() {
        return down;
    }

    public void setDown(JFXButton down) {
        this.down = down;
    }

    public JFXButton getLeft() {
        return left;
    }

    public void setLeft(JFXButton left) {
        this.left = left;
    }

    public JFXButton getRigth() {
        return rigth;
    }

    public void setRigth(JFXButton rigth) {
        this.rigth = rigth;
    }

    public Integer getpU() {
        return pU;
    }

    public void setpU(Integer pU) {
        this.pU = pU;
    }

    public Integer getpD() {
        return pD;
    }

    public void setpD(Integer pD) {
        this.pD = pD;
    }

    public Integer getpL() {
        return pL;
    }

    public void setpL(Integer pL) {
        this.pL = pL;
    }

    public Integer getpR() {
        return pR;
    }

    public void setpR(Integer pR) {
        this.pR = pR;
    }
    
}
