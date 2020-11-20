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


public class Floyd {

    //Atributos
    private final Integer cantNodos;
    private final Integer pesos[][];
    private final JFXButton direcciones[][];
    private final Integer INF;
    private ArrayList<Puntos> mapa;
    private ArrayList<Ruta> ruta;
    private JFXButton start ;
    private JFXButton end ;


    //Constructor
    public Floyd(ArrayList<Puntos> puntos) {
        this.cantNodos = puntos.size();
        this.pesos = new Integer[cantNodos][cantNodos];
        this.direcciones = new JFXButton[cantNodos][cantNodos];
        this.INF = Integer.MAX_VALUE;
        this.mapa = new ArrayList();
        this.mapa = puntos;
        this.ruta = new ArrayList();
    }

    //Metodos
    public void llenaMatrices() {
        JFXButton nulo = new JFXButton();
        nulo.setId("-");

        //Lleno la matriz de pesos
        for (int i = 0; i < cantNodos; i++) {
            for (int j = 0; j < cantNodos; j++) {
                direcciones[i][j] = mapa.get(j).getNombre();
            }
        }

        //Llena las matrices con datos infinitos y ceros
        for (int i = 0; i < cantNodos; i++) {
            for (int k = 0; k < cantNodos; k++) {
                if (!Objects.equals(i, k)) {
                    pesos[i][k] = INF;

                } else {
                    pesos[i][k] = 0;
                    direcciones[i][k] = nulo;
                }
            }
        }
        //Llena las matrices con datos
        for (int i = 0; i < cantNodos; i++) {
            if (mapa.get(i).getUp() != null) {
                pesos[i][buscaBoton(mapa.get(i).getUp())] = mapa.get(i).getpU();
            }
            if (mapa.get(i).getDown() != null) {
                pesos[i][buscaBoton(mapa.get(i).getDown())] = mapa.get(i).getpD();
            }
            if (mapa.get(i).getLeft() != null) {
                pesos[i][buscaBoton(mapa.get(i).getLeft())] = mapa.get(i).getpL();
            }
            if (mapa.get(i).getRigth() != null) {
                pesos[i][buscaBoton(mapa.get(i).getRigth())] = mapa.get(i).getpR();
            }
        }
    }

    /**
     * Ordena todo la matriz de pesos con los menore pesos de un punto a otro
     *
     * @param start
     * @param end
     */
    public void floyd(JFXButton start, JFXButton end) {

        llenaMatrices();
        //imprime();
        //Controla el pivot
        for (int k = 0; k < cantNodos; k++) {
            //Evaluamos la matriz
            for (int i = 0; i < cantNodos; i++) {
                for (int j = 0; j < cantNodos; j++) {
                    //Actualiza con el peso menor
                    if ((pesos[i][k] > 0 && pesos[i][k] < INF) && (pesos[k][j] > 0 && pesos[k][j] < INF)) {
                        if ((pesos[i][k] + pesos[k][j]) < pesos[i][j]) {
                            pesos[i][j] = (pesos[i][k] + pesos[k][j]);
                            direcciones[i][j] = mapa.get(k).getNombre();
                        }
                    }
                }
            }
        }
        //imprime();
        obtieneRuta(start, end);
    }

    public void imprime() {
        String dato = "";
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                if (pesos[i][k] == 0) {
                    dato += "-\t";
                } else {
                    dato += pesos[i][k] + "\t";
                }
            }
            dato += "\n";
        }
        System.out.println(dato + "\n\n");
        dato = "";
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                dato += direcciones[i][k].getId() + "\t";
            }
            dato += "\n";
        }
        System.out.println(dato);
    }

    public Integer buscaBoton(JFXButton a) {
        Integer pos = -1;
        for (int i = 0; i < cantNodos; i++) {

            if (mapa.get(i).getNombre().equals(a)) {
                pos = i;
                i = cantNodos;

            }
        }

        return pos;
    }

    public void obtieneRuta(JFXButton start, JFXButton end) {
        ruta.clear();
        Integer termina = 0;
        while (termina < 500) {
            if (!direcciones[buscaBoton(start)][buscaBoton(end)].equals(end)) {
                int peso = (pesos[buscaBoton(start)][buscaBoton(end)]);
                //System.out.println("Peso dado " + peso);
                if(peso>0 && peso < 2000){
                    ruta.add(new Ruta(end, direcciones[buscaBoton(start)][buscaBoton(end)], peso, 0, true));
                    end = direcciones[buscaBoton(start)][buscaBoton(end)];
                }

            }
            if (end.equals(start)) {
                termina = 500;
            }
            termina++;
        }
        if(pesos[buscaBoton(start)][buscaBoton(end)]>0 && pesos[buscaBoton(start)][buscaBoton(end)]<2000) ruta.add(new Ruta(end, start, (pesos[buscaBoton(start)][buscaBoton(end)]), 0, true));

        Collections.reverse(ruta);
        Integer saltos = 1;
        //Actualizo los saltos
        for (int i = 0; i < ruta.size(); i++) {
            ruta.get(i).setSaltos(saltos);
            saltos++;
        }

        //Testeo de ruta
        /*
        for (int i = 0; i < ruta.size(); i++) {
            System.out.println(ruta.get(i).toString());
        }*/
    }



    public ArrayList<Ruta> getRuta() {
        return ruta;
    }

    public void setRuta(ArrayList<Ruta> ruta) {
        this.ruta = ruta;
    }

}
