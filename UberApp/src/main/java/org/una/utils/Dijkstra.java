/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.utils;

import com.jfoenix.controls.JFXButton;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;


public class Dijkstra {

    //Atributos
    private final ArrayList<Ruta> caminos;
    private final ArrayList<Ruta> posRuta;
    private ArrayList<Ruta> ruta;
    private ArrayList<Puntos> mapa;
    private Integer peso;
    private Integer saltos;

    //Constructor
    public Dijkstra(ArrayList<Puntos> puntos) {
        this.ruta = new ArrayList();
        this.mapa = new ArrayList();
        this.caminos = new ArrayList();
        this.posRuta = new ArrayList();
        this.mapa = puntos;
        this.peso = 0;
        this.saltos = 0;
    }

    /**
     * Llena la matriz de pesos
     */
    public void llenaPesos() {
        caminos.clear();
        for (int i = 0; i < mapa.size(); i++) {
            if (mapa.get(i).getUp() != null) {
                this.caminos.add(new Ruta(mapa.get(i).getUp(), mapa.get(i).getNombre(), mapa.get(i).getpU(), saltos, false));
            }
            if (mapa.get(i).getDown() != null) {
                this.caminos.add(new Ruta(mapa.get(i).getDown(), mapa.get(i).getNombre(), mapa.get(i).getpD(), saltos, false));
            }
            if (mapa.get(i).getLeft() != null) {
                this.caminos.add(new Ruta(mapa.get(i).getLeft(), mapa.get(i).getNombre(), mapa.get(i).getpL(), saltos, false));
            }
            if (mapa.get(i).getRigth() != null) {
                this.caminos.add(new Ruta(mapa.get(i).getRigth(), mapa.get(i).getNombre(), mapa.get(i).getpR(), saltos, false));
            }
        }
        posRuta.clear();
        ruta.clear();
    }

    /**
     * Trae los caminos desde el punto de salida
     *
     * @param start
     */
    public void traeCaminos(JFXButton start) {
        for (int i = 0; i < caminos.size(); i++) {
            if (!caminos.get(i).isVisitado() && caminos.get(i).getEgreso().equals(start)) {
                posRuta.add(caminos.get(i));
                posRuta.add(new Ruta(caminos.get(i).getIngreso(), caminos.get(i).getEgreso(), (peso + caminos.get(i).getPeso()), (saltos + 1), false));
                caminos.get(i).setVisitado(true);
            }
        }
    }

    /**
     * Decide el camino a tomar
     *
     * @return posicion del camino mas corto
     */
    public Integer menorCamino() {
        Integer pos = -1;
        Integer min = Integer.MAX_VALUE;
        for (int i = 0; i < posRuta.size(); i++) {
            if (!posRuta.get(i).isVisitado()) {
                if (posRuta.get(i).getPeso() < min) {
                    min = posRuta.get(i).getPeso();
                    pos = i;
                }
                if (Objects.equals(posRuta.get(i).getPeso(), min)) {
                    if (posRuta.get(i).getSaltos() <= posRuta.get(pos).getSaltos()) {
                        min = posRuta.get(i).getPeso();
                        pos = i;
                    }
                }
            }
        }
        return pos;
    }

    /**
     * Funcion principal, recibe por parametros el punto de inicio y el punto de
     * llegada
     *
     * @param start
     * @param end
     */
    public void dijkstra(JFXButton start, JFXButton end) {
        llenaPesos();
        Integer termina = 0;
        JFXButton aux = start;
        peso = 0;
        saltos = 0;
        Integer pos;
        while (termina < 500) {
            traeCaminos(aux);
            pos = menorCamino();
            if (pos >= 0) {
                aux = posRuta.get(pos).getIngreso();
                saltos = posRuta.get(pos).getSaltos();
                peso = posRuta.get(pos).getPeso();
                posRuta.get(pos).setVisitado(true);
            }
            if (aux.equals(end)) {
                termina = 500;
            }
            termina++;
        }
        traeRuta(start, end);
    }

    /**
     * Filtra la ruta a solo los caminos que conducen a punto de destino
     *
     * @param start
     * @param end
     */
    public void traeRuta(JFXButton start, JFXButton end) {
        for (int i = 0; i < posRuta.size(); i++) {
            if (posRuta.get(i).getIngreso().equals(end)) {
                ruta.add(posRuta.get(i));
                end = posRuta.get(i).getEgreso();
                i = 0;
            }
            if (end.equals(start)) {
                i = posRuta.size();
            }
        }
        if (!end.equals(start)) {
            ruta.clear();
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("No existe ruta para llegar a su destino.\nVerifique e intente nuevamente.");
            alert.showAndWait();
        }
        /**
         * Aqui se le da vuelta al array de ruta ya que se encuentra del punto
         * de llegada al punto de salida
         */
        Collections.reverse(ruta);
    }

    //Gets and Sets
    public ArrayList<Ruta> getRuta() {
        return ruta;
    }

    public void setRuta(ArrayList<Ruta> ruta) {
        this.ruta = ruta;
    }

}
