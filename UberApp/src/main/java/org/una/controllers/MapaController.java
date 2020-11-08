/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXToggleButton;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import org.una.utils.*;


public class MapaController extends Controller implements Initializable {

    public ImageView iv_inicioViaje;
    public ImageView iv_finalViaje;
    @FXML
    private JFXButton btnInter_1;
    @FXML
    private JFXButton btnInter_2;
    @FXML
    private JFXButton btnInter_3;
    @FXML
    private JFXButton btnInter_4;
    @FXML
    private JFXButton btnInter_5;

    @FXML
    private JFXButton btnDoc_1;
    @FXML
    private JFXButton btnDoc_2;
    @FXML
    private JFXButton btnDoc_3;
    @FXML
    private JFXButton btnDoc_4;
    @FXML
    private JFXButton btnDoc_5;
    @FXML
    private JFXButton btnDoc_6;
    @FXML
    private JFXButton btnDoc_7;
    @FXML
    private JFXButton btnDoc_8;
    @FXML
    private JFXButton btnDoc_9;
    @FXML
    private JFXButton btnDoc_10;
    @FXML
    private JFXButton btnDoc_11;

    @FXML
    private JFXButton btn12Marzo;
    @FXML
    private JFXButton btnMusoc;
    @FXML
    private JFXButton btnMac;
    @FXML
    private JFXButton btnJuanca;
    @FXML
    private JFXButton btnParque;
    @FXML
    private JFXButton btnEstadio;
    @FXML
    private JFXButton btnCoope;
    @FXML
    private JFXButton btnDollar;
    @FXML
    private JFXButton btnTracopa;
    @FXML
    private JFXButton btnMelendez;
    @FXML
    private JFXButton btnCasino;

    @FXML
    private JFXButton btnAv1_1;
    @FXML
    private JFXButton btnAv1_2;
    @FXML
    private JFXButton btnAv1_3;
    @FXML
    private JFXButton btnAv1_4;

    @FXML
    private JFXButton btnAv2_1;
    @FXML
    private JFXButton btnAv2_2;
    @FXML
    private JFXButton btnAv2_3;
    @FXML
    private JFXButton btnAv2_4;

    @FXML
    private JFXButton btnAv3_1;
    @FXML
    private JFXButton btnAv3_2;
    @FXML
    private JFXButton btnAv3_3;
    @FXML
    private JFXButton btnAv3_4;

    @FXML
    private JFXButton btnAv4_1;
    @FXML
    private JFXButton btnAv4_2;
    @FXML
    private JFXButton btnAv4_3;
    @FXML
    private JFXButton btnAv4_4;
    @FXML
    private JFXButton btnAv4_5;
    @FXML
    private JFXButton btnAv4_6;

    @FXML
    private JFXButton btnAv5_1;
    @FXML
    private JFXButton btnAv5_2;

    @FXML
    private JFXButton btnAv6_1;
    @FXML
    private JFXButton btnAv6_2;
    @FXML
    private JFXButton btnAv6_3;
    @FXML
    private JFXButton btnAv6_4;

    @FXML
    private JFXButton btnAv7_1;
    @FXML
    private JFXButton btnAv7_2;
    @FXML
    private JFXButton btnAv7_3;
    @FXML
    private JFXButton btnAv7_4;

    @FXML
    private JFXButton btnAv8_1;
    @FXML
    private JFXButton btnAv8_2;
    @FXML
    private JFXButton btnAv8_3;
    @FXML
    private JFXButton btnAv8_4;

    @FXML
    private JFXButton btnAvG_1;
    @FXML
    private JFXButton btnAvG_2;
    @FXML
    private JFXButton btnAvG_3;
    @FXML
    private JFXButton btnAvG_4;

    @FXML
    private JFXButton btnC1_1;
    @FXML
    private JFXButton btnC1_2;
    @FXML
    private JFXButton btnC1_3;
    @FXML
    private JFXButton btnC1_4;
    @FXML
    private JFXButton btnC1_5;
    @FXML
    private JFXButton btnC1_6;

    @FXML
    private JFXButton btnC2_1;
    @FXML
    private JFXButton btnC2_2;
    @FXML
    private JFXButton btnC2_3;
    @FXML
    private JFXButton btnC2_4;
    @FXML
    private JFXButton btnC2_5;

    @FXML
    private JFXButton btnC3_1;
    @FXML
    private JFXButton btnC3_2;
    @FXML
    private JFXButton btnC3_3;

    @FXML
    private JFXButton btnC6_1;
    @FXML
    private JFXButton btnC6_2;
    @FXML
    private JFXButton btnC6_3;
    @FXML
    private JFXButton btnC6_4;
    @FXML
    private JFXButton btnC6_5;
    @FXML
    private JFXButton btnC6_6;
    @FXML
    private JFXButton btnC6_7;
    @FXML
    private JFXButton btnC6_8;

    @FXML
    private JFXButton btnC8_1;
    @FXML
    private JFXButton btnC8_2;
    @FXML
    private JFXButton btnC8_3;

    @FXML
    private JFXButton btnCS_1;
    @FXML
    private JFXButton btnCS_2;
    @FXML
    private JFXButton btnCS_3;
    @FXML
    private JFXButton btnCS_4;

    @FXML
    private JFXButton btnES_1;
    @FXML
    private JFXButton btnES_2;

    @FXML
    private AnchorPane root;

    @FXML
    private ToggleGroup trafico;
    @FXML
    private JFXRadioButton traficoNormal;
    @FXML
    private JFXRadioButton traficoModerado;
    @FXML
    private JFXRadioButton traficoLento;
    @FXML
    private JFXRadioButton dijkstra;
    @FXML
    private ToggleGroup tipoAlgoritmo;
    @FXML
    private JFXRadioButton floyd;
    @FXML
    private Label aristaTotal;
    @FXML
    private Label tiempoTotal;
    @FXML
    private Label costoTotal;
    @FXML
    private JFXButton comenzar;
    @FXML
    private JFXToggleButton tgAccidente;
    @FXML
    private JFXToggleButton tgCosevi;
    @FXML
    private ToggleGroup bloqueo;
    @FXML
    private JFXButton btnVer;

    private ArrayList<Puntos> puntos;
    private ArrayList<Line> lines;
    private ArrayList<Line> linesVer;
    private ImageView icon;
    private Dijkstra dijks;
    private Floyd floy;
    private JFXButton start;
    private JFXButton end;
    private Boolean inicio;
    private Boolean fin;
    private Boolean quita;
    private ImageView ptInicio;
    private ImageView ptFinal;
    private ArrayList<ImageView> bloqueos;
    private ImageView carrito;
    private Timer time;
    private Integer tiempo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        inicializa();
    }

    @Override
    public void initialize() {
    }

    /**
     * Inicializa los componentes y atributos
     */
    public void inicializa() {
        this.puntos = new ArrayList();
        this.lines = new ArrayList();
        this.linesVer = new ArrayList();
        creaPuntos();
        this.dijks = new Dijkstra(this.puntos);
        this.floy = new Floyd(this.puntos);
        click();
        ocultaBotones(true);
        this.start = null;
        this.end = null;
        this.inicio = false;
        this.fin = false;
        this.quita = false;
        this.ptInicio = new ImageView();
        this.ptFinal = new ImageView();
        this.bloqueos = new ArrayList();
        this.carrito = new ImageView();
        AppContext.getInstance().set("root", root);
    }

    public void ocultaBotones(Boolean oculta) {
        for (int i = 0; i < puntos.size(); i++) {
            puntos.get(i).getNombre().setVisible(!oculta);
        }
    }

    public void lineas(ArrayList<Line> lineas, JFXButton start, JFXButton end, Color color, Integer tam) {
        Double startX, startY, endX, endY;
        startX = start.getLayoutX() + 5;
        startY = start.getLayoutY() + 5;
        endX = end.getLayoutX() + 5;
        endY = end.getLayoutY() + 5;
        Line line = new Line(startX, startY, endX, endY);
        line.setStroke(color);
        line.setStrokeWidth(tam);
        line.setStrokeLineCap(StrokeLineCap.ROUND);
        lineas.add(line);
    }

    public void creaPuntos() {
        //Nombre, arriba, abajo,izquierda, derecha
        this.puntos.add(new Puntos(btnInter_1, null, btnDoc_1, null, btn12Marzo, 0, 9, 0, 91));
        this.puntos.add(new Puntos(btnDoc_1, btnInter_1, btnDoc_2, null, null, 9, 13, 0, 0));
        this.puntos.add(new Puntos(btnDoc_2, btnDoc_1, btnDoc_3, null, btnAv3_1, 13, 54, 0, 39));
        this.puntos.add(new Puntos(btnAv3_1, null, null, btnDoc_2, btnAv3_2, 0, 0, 39, 43));
        this.puntos.add(new Puntos(btn12Marzo, null, null, btnInter_1, btnInter_2, 0, 0, 91, 72));
        this.puntos.add(new Puntos(btnAv3_2, null, btnDoc_3, btnAv3_1, btnAv5_2, 0, 28, 43, 54));
        this.puntos.add(new Puntos(btnDoc_3, btnDoc_2, btnDoc_4, null, btnAv3_2, 54, 21, 0, 28));
        this.puntos.add(new Puntos(btnDoc_4, btnDoc_3, btnDoc_5, null, btnAv5_1, 21, 48, 0, 39));
        this.puntos.add(new Puntos(btnAv5_1, null, btnC6_1, btnDoc_4, btnAv5_2, 0, 46, 39, 22));
        this.puntos.add(new Puntos(btnAv5_2, btnAv3_2, btnAv3_3, btnAv5_1, btnInter_2, 54, 41, 22, 23));
        this.puntos.add(new Puntos(btnInter_2, null, btnAv5_2, btn12Marzo, btnInter_3, 0, 23, 72, 45));
        this.puntos.add(new Puntos(btnDoc_5, btnDoc_4, btnDoc_6, null, btnCS_1, 48, 12, 0, 38));
        this.puntos.add(new Puntos(btnCS_1, null, null, btnDoc_5, null, 0, 0, 38, 0));
        this.puntos.add(new Puntos(btnC6_1, btnAv5_1, btnC6_2, null, null, 46, 31, 0, 0));
        this.puntos.add(new Puntos(btnAv3_3, btnAv5_2, null, null, btnAv3_4, 41, 0, 0, 58));
        this.puntos.add(new Puntos(btnInter_3, null, btnAv3_4, btnInter_2, btnInter_4, 0, 31, 45, 77));
        this.puntos.add(new Puntos(btnAv3_4, null, btnCasino, btnAv3_3, btnMusoc, 0, 8, 58, 39));
        this.puntos.add(new Puntos(btnMusoc, null, null, btnAv3_4, btnC2_1, 0, 0, 39, 19));
        this.puntos.add(new Puntos(btnC2_1, btnInter_4, null, btnMusoc, null, 12, 0, 19, 0));
        this.puntos.add(new Puntos(btnInter_4, null, null, btnInter_3, btnMac, 0, 0, 77, 66));
        this.puntos.add(new Puntos(btnCasino, null, btnAv1_2, null, null, 0, 19, 0, 0));
        this.puntos.add(new Puntos(btnMac, null, btnAv1_4, btnInter_4, btnInter_5, 0, 20, 66, 156));
        this.puntos.add(new Puntos(btnC6_2, btnC6_1, btnC6_3, null, btnAv1_1, 31, 43, 0, 36));
        this.puntos.add(new Puntos(btnAv1_1, null, btnAv7_2, btnC6_2, btnAv1_2, 0, 26, 36, 35));
        this.puntos.add(new Puntos(btnAv1_2, null, btnAv7_3, btnAv1_1, null, 0, 26, 35, 0));
        this.puntos.add(new Puntos(btnC2_2, btnC2_1, null, btnAv1_2, null, 23, 0, 54, 0));
        this.puntos.add(new Puntos(btnAv1_3, null, btnES_1, btnC2_2, null, 0, 12, 25, 0));
        this.puntos.add(new Puntos(btnAv1_4, null, btnAv7_4, btnAv1_3, null, 0, 30, 26, 0));
        this.puntos.add(new Puntos(btnC2_3, btnC2_2, null, null, btnES_1, 0, 14, 0, 23));
        this.puntos.add(new Puntos(btnES_1, btnAv1_3, null, btnC2_3, null, 12, 0, 23, 0));
        this.puntos.add(new Puntos(btnDoc_6, btnDoc_5, btnDoc_7, null, btnAv7_1, 12, 1, 0, 56));
        this.puntos.add(new Puntos(btnAv7_1, null, btnAv2_1, btnDoc_6, btnC6_3, 0, 11, 56, 43));
        this.puntos.add(new Puntos(btnC6_3, btnC6_2, btnMelendez, btnAv7_1, btnAv7_2, 43, 10, 43, 19));
        this.puntos.add(new Puntos(btnMelendez, btnC6_3, btnC6_4, null, null, 10, 16, 0, 0));
        this.puntos.add(new Puntos(btnAv7_2, btnAv1_1, null, btnC6_3, btnAv7_3, 26, 0, 19, 35));
        this.puntos.add(new Puntos(btnAv7_3, null, btnAv2_2, btnAv7_2, btnC2_4, 0, 21, 35, 55));
        this.puntos.add(new Puntos(btnC2_4, btnC2_3, null, btnAv7_3, null, 13, 0, 55, 0));
        this.puntos.add(new Puntos(btnAv7_4, null, btnAv2_4, btnC2_4, btnParque, 0, 21, 54, 32));
        this.puntos.add(new Puntos(btnParque, null, btnInter_5, btnAv7_4, null, 0, 74, 32, 0));
        this.puntos.add(new Puntos(btnInter_5, btnParque, btnTracopa, btnMac, null, 74, 3, 156, 0));
        this.puntos.add(new Puntos(btnDoc_7, btnDoc_6, btnDoc_8, null, btnAv2_1, 1, 5, 0, 67));
        this.puntos.add(new Puntos(btnAv2_1, btnAv7_1, btnAv4_1, null, btnC6_4, 11, 18, 0, 58));
        this.puntos.add(new Puntos(btnC6_4, btnMelendez, btnC6_5, null, btnJuanca, 16, 20, 0, 24));
        this.puntos.add(new Puntos(btnJuanca, null, null, null, btnAv2_2, 0, 0, 0, 25));
        this.puntos.add(new Puntos(btnAv2_2, null, btnAv4_2, null, btnAv2_3, 0, 24, 0, 26));
        this.puntos.add(new Puntos(btnAv2_3, null, null, null, btnC2_5, 0, 0, 0, 29));
        this.puntos.add(new Puntos(btnC2_5, btnC2_4, null, null, btnAv2_4, 21, 0, 0, 54));
        this.puntos.add(new Puntos(btnAv2_4, null, btnAv4_5, null, btnC1_1, 0, 22, 0, 50));
        this.puntos.add(new Puntos(btnC1_1, null, null, null, btnC3_1, 0, 0, 0, 51));
        this.puntos.add(new Puntos(btnC3_1, btnTracopa, btnC3_2, null, null, 13, 24, 0, 0));
        this.puntos.add(new Puntos(btnTracopa, btnInter_5, btnC3_1, null, null, 3, 13, 0, 0));
        this.puntos.add(new Puntos(btnDoc_8, btnDoc_7, btnDoc_9, null, btnAv4_1, 5, 3, 0, 80));
        this.puntos.add(new Puntos(btnAv4_1, btnAv2_1, null, btnDoc_8, btnC8_1, 18, 0, 80, 20));
        this.puntos.add(new Puntos(btnC8_1, null, btnC8_2, btnAv4_1, btnC6_5, 0, 25, 20, 40));
        this.puntos.add(new Puntos(btnC6_5, btnC6_4, btnC6_6, btnC8_1, btnAv4_2, 20, 25, 40, 53));
        this.puntos.add(new Puntos(btnAv4_2, null, btnAv6_2, btnC6_5, btnAv4_3, 0, 29, 53, 25));
        this.puntos.add(new Puntos(btnAv4_3, btnAv2_3, null, btnAv4_2, btnAv4_4, 23, 0, 25, 18));
        this.puntos.add(new Puntos(btnAv4_4, null, null, btnAv4_3, btnAv4_5, 0, 0, 18, 64));
        this.puntos.add(new Puntos(btnAv4_5, null, btnAv6_4, btnAv4_4, btnC1_2, 0, 22, 64, 51));
        this.puntos.add(new Puntos(btnC1_2, btnC1_1, null, btnAv4_5, btnAv4_6, 23, 0, 51, 35));
        this.puntos.add(new Puntos(btnAv4_6, btnCS_4, null, btnC1_2, btnC3_2, 8, 0, 35, 17));
        this.puntos.add(new Puntos(btnCS_4, null, btnAv4_6, null, null, 0, 8, 0, 0));
        this.puntos.add(new Puntos(btnC3_2, btnC3_1, btnC3_3, btnAv4_6, null, 24, 56, 17, 0));
        this.puntos.add(new Puntos(btnDoc_9, btnDoc_8, btnDoc_10, null, btnAv6_1, 3, 6, 0, 77));
        this.puntos.add(new Puntos(btnAv6_1, null, btnCS_3, btnDoc_9, btnC8_2, 0, 12, 77, 45));
        this.puntos.add(new Puntos(btnC8_2, btnC8_1, btnC8_3, btnAv6_1, btnC6_6, 25, 15, 45, 40));
        this.puntos.add(new Puntos(btnC6_6, btnC6_5, btnC6_7, btnC8_2, btnAv6_2, 25, 32, 40, 57));
        this.puntos.add(new Puntos(btnAv6_2, btnAv4_2, btnES_2, btnC6_6, null, 29, 36, 57, 0));
        this.puntos.add(new Puntos(btnAv6_3, btnAv4_4, null, null, btnCoope, 29, 0, 0, 41));
        this.puntos.add(new Puntos(btnCoope, null, null, btnAv6_3, btnAv6_4, 0, 0, 41, 16));
        this.puntos.add(new Puntos(btnAv6_4, null, btnAv8_4, btnCoope, btnC1_3, 0, 24, 16, 51));
        this.puntos.add(new Puntos(btnC1_3, btnC1_2, null, btnAv6_4, null, 22, 0, 51, 0));
        this.puntos.add(new Puntos(btnDoc_10, btnDoc_9, btnDoc_11, null, btnCS_2, 6, 3, 0, 39));
        this.puntos.add(new Puntos(btnCS_2, null, null, btnDoc_10, null, 0, 0, 39, 0));
        this.puntos.add(new Puntos(btnCS_3, btnAv6_1, null, null, null, 12, 0, 0, 0));
        this.puntos.add(new Puntos(btnC8_3, btnC8_2, null, null, null, 15, 0, 0, 0));
        this.puntos.add(new Puntos(btnC6_7, btnC6_6, null, null, btnES_2, 32, 0, 0, 61));
        this.puntos.add(new Puntos(btnES_2, btnAv6_2, null, btnC6_7, null, 36, 0, 61, 0));
        this.puntos.add(new Puntos(btnAv8_3, btnAv6_3, btnAv8_2, null, btnAv8_4, 29, 25, 0, 52));
        this.puntos.add(new Puntos(btnAv8_4, null, btnDollar, btnAv8_3, btnC1_4, 0, 11, 52, 48));
        this.puntos.add(new Puntos(btnC1_4, btnC1_3, null, btnAv8_4, null, 21, 0, 48, 0));
        this.puntos.add(new Puntos(btnAv8_1, null, null, null, btnC6_8, 0, 0, 141, 0));
        this.puntos.add(new Puntos(btnC6_8, btnC6_7, null, btnAv8_1, btnAv8_2, 5, 0, 141, 117));
        this.puntos.add(new Puntos(btnAv8_2, btnAv8_3, btnAvG_1, btnC6_8, null, 25, 26, 117, 0));
        this.puntos.add(new Puntos(btnDollar, btnAv8_4, btnAvG_2, null, null, 11, 47, 0, 0));
        this.puntos.add(new Puntos(btnC1_5, btnC1_4, null, null, btnC3_3, 9, 0, 0, 56));
        this.puntos.add(new Puntos(btnC3_3, btnC3_2, btnAvG_4, btnC1_5, null, 56, 41, 56, 0));
        this.puntos.add(new Puntos(btnDoc_11, btnDoc_10, null, null, btnAvG_1, 3, 0, 0, 333));
        this.puntos.add(new Puntos(btnAvG_1, btnAv8_2, null, btnDoc_11, btnAvG_2, 26, 0, 333, 59));
        this.puntos.add(new Puntos(btnAvG_2, btnDollar, null, btnAvG_1, btnEstadio, 47, 0, 59, 34));
        this.puntos.add(new Puntos(btnEstadio, null, null, btnAvG_2, btnAvG_3, 0, 0, 34, 37));
        this.puntos.add(new Puntos(btnAvG_3, btnC1_6, null, btnEstadio, btnAvG_4, 8, 0, 37, 25));
        this.puntos.add(new Puntos(btnC1_6, btnC1_5, null, null, null, 64, 0, 0, 0));
        this.puntos.add(new Puntos(btnAvG_4, btnC3_3, null, btnAvG_3, null, 41, 0, 25, 0));
    }

    public void bloqueo(JFXButton a) {
        JFXButton cerrar = cierraCalles(a);
        if (cerrar == null) {
            for (int i = 0; i < puntos.size(); i++) {
                if (puntos.get(i).getNombre().equals(a)) {
                    puntos.get(i).setUp(null);
                    puntos.get(i).setDown(null);
                    puntos.get(i).setLeft(null);
                    puntos.get(i).setRigth(null);
                }
                if (puntos.get(i).getUp() != null && puntos.get(i).getUp().equals(a)) {
                    puntos.get(i).setUp(null);
                }
                if (puntos.get(i).getDown() != null && puntos.get(i).getDown().equals(a)) {
                    puntos.get(i).setDown(null);
                }
                if (puntos.get(i).getLeft() != null && puntos.get(i).getLeft().equals(a)) {
                    puntos.get(i).setLeft(null);
                }
                if (puntos.get(i).getRigth() != null && puntos.get(i).getRigth().equals(a)) {
                    puntos.get(i).setRigth(null);
                }
            }
        } else {
            for (int i = 0; i < puntos.size(); i++) {
                if (puntos.get(i).getNombre().equals(a)) {
                    if (puntos.get(i).getUp() != null && puntos.get(i).getUp().equals(cerrar)) {
                        puntos.get(i).setUp(null);
                    } else if (puntos.get(i).getDown() != null && puntos.get(i).getDown().equals(cerrar)) {
                        puntos.get(i).setDown(null);
                    } else if (puntos.get(i).getLeft() != null && puntos.get(i).getLeft().equals(cerrar)) {
                        puntos.get(i).setLeft(null);
                    } else if (puntos.get(i).getRigth() != null && puntos.get(i).getRigth().equals(cerrar)) {
                        puntos.get(i).setRigth(null);
                    }
                }
            }
        }

        if (this.tgAccidente.isSelected()) {
            icon = new ImageView(String.valueOf(getClass().getResource("Imagenes/ambulance.png")));
        } else if (this.tgCosevi.isSelected()) {
            icon = new ImageView(String.valueOf(getClass().getResource("Imagenes/firmar.png")));
        }
        lento(a, false);
        icon.setLayoutX(a.getLayoutX());
        icon.setLayoutY(a.getLayoutY() + 5);
        icon.setOnMouseClicked((e) -> {
            if (quita) {
                //quita((FontAwesomeIconView) e.getSource());
            }
        });
        this.bloqueos.add(icon);
        this.root.getChildren().add(icon);

    }

    public void click() {
       this.iv_inicioViaje.setOnMouseClicked((e) -> {
            this.inicio = true;
            this.fin = false;
            ocultaBotones(false);
            tiempo = 0;
        });
        this.iv_finalViaje.setOnMouseClicked((e) -> {
            this.root.getChildren().removeAll(lines);
            this.root.getChildren().removeAll(linesVer);
            this.fin = true;
            this.inicio = false;
            ocultaBotones(false);
            tiempo = 0;
        });
        for (int i = 0; i < puntos.size(); i++) {
            puntos.get(i).getNombre().setOnMouseClicked((e) -> {
                if (this.tgAccidente.isSelected()) {
                    bloqueo((JFXButton) e.getSource());
                    this.tgAccidente.setSelected(false);
                } else if (this.tgCosevi.isSelected()) {
                    bloqueo((JFXButton) e.getSource());
                    this.tgCosevi.setSelected(false);
                } else if (inicio) {
                    if(time != null) time.cancel();
                    this.root.getChildren().removeAll(lines);
                    lines.clear();
                    this.root.getChildren().removeAll(linesVer);
                    linesVer.clear();
                    iniFin((JFXButton) e.getSource());
                    this.start = (JFXButton) e.getSource();
                    this.root.getChildren().remove(this.carrito);
                } else if (fin) {
                    if(time != null) time.cancel();
                    this.root.getChildren().removeAll(lines);
                    lines.clear();
                    this.root.getChildren().removeAll(linesVer);
                    linesVer.clear();
                    iniFin((JFXButton) e.getSource());
                    this.end = (JFXButton) e.getSource();
                    this.root.getChildren().remove(this.carrito);
                }
                ocultaBotones(true);
            });
        }
    }

    public void destinos() {
        for (int i = 0; i < puntos.size(); i++) {
            this.root.getChildren().remove(this.puntos.get(i).getNombre());
        }
        for (int i = 0; i < puntos.size(); i++) {
            this.root.getChildren().add(this.puntos.get(i).getNombre());
        }
    }

    @FXML
    private void accidente(ActionEvent event) {
        ocultaBotones(!this.tgAccidente.isSelected());
        this.inicio = false;
        this.fin = false;
    }

    @FXML
    private void cosevi(ActionEvent event) {
        ocultaBotones(!this.tgCosevi.isSelected());
        this.inicio = false;
        this.fin = false;
    }

    @FXML
    private void modoTrafico(ActionEvent event) {
        creaPuntos();
        if (traficoLento.isSelected()) {
            for (int i = 0; i < puntos.size(); i++) {
                lento(puntos.get(i).getNombre(), true);
            }
        } else if (traficoModerado.isSelected()) {
            for (int i = 0; i < puntos.size(); i++) {
                moderado(puntos.get(i).getNombre(), true);
            }
        }
    }

    @FXML
    private void tipoAlgoritmo(ActionEvent event) {
    }

    @FXML
    private void comenzar(ActionEvent event) {
        if (start != null && end != null) {
            this.root.getChildren().removeAll(lines);
            lines.clear();
            Integer distancia = 0;
            //Dijkstra
            if (this.dijkstra.isSelected()) {
                dijks.dijkstra(this.start, this.end);
                for (int i = 0; i < dijks.getRuta().size(); i++) {
                    lineas(lines, dijks.getRuta().get(i).getEgreso(), dijks.getRuta().get(i).getIngreso(), Color.RED, 3);
                    distancia += dijks.getRuta().get(i).getPeso();
                }
                movimiento(dijks.getRuta());
            } //Floyd
            else if (this.floyd.isSelected()) {
                floy.floyd(this.start, this.end);
                for (int i = 0; i < floy.getRuta().size(); i++) {
                    lineas(lines, floy.getRuta().get(i).getEgreso(), floy.getRuta().get(i).getIngreso(), Color.RED, 3);
                    distancia += floy.getRuta().get(i).getPeso();
                }
                movimiento(floy.getRuta());
            }
            this.aristaTotal.setText(Integer.toString(distancia));
            this.root.getChildren().addAll(lines);
            destinos();
            tiempo = Integer.parseInt(tiempoTotal.getText());
            if (tiempo == 0) {
                tiempo = 1;
            }
            this.root.getChildren().remove(this.ptInicio);
            this.root.getChildren().add(this.ptInicio);
            this.root.getChildren().remove(this.ptFinal);
            this.root.getChildren().add(this.ptFinal);
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Debe seleccionar un punto de partida y un punto de llegada.\nVerifique e intente nuevamente.");
            alert.showAndWait();
        }
    }

    @FXML
    private void mostrarRuta(ActionEvent event) {
        if (start != null && end != null) {
            this.root.getChildren().removeAll(linesVer);
            linesVer.clear();
            //Dijkstra
            if (this.dijkstra.isSelected()) {
                dijks.dijkstra(this.start, this.end);
                for (int i = 0; i < dijks.getRuta().size(); i++) {
                    lineas(linesVer, dijks.getRuta().get(i).getEgreso(), dijks.getRuta().get(i).getIngreso(), Color.BLUE, 5);
                }
            } //Floyd
            else if (this.floyd.isSelected()) {
                floy.floyd(this.start, this.end);
                for (int i = 0; i < floy.getRuta().size(); i++) {
                    lineas(linesVer, floy.getRuta().get(i).getEgreso(), floy.getRuta().get(i).getIngreso(), Color.BLUE, 5);
                }
            }
            this.root.getChildren().addAll(linesVer);
            destinos();
           this.root.getChildren().remove(this.ptInicio);
            this.root.getChildren().add(this.ptInicio);
            this.root.getChildren().remove(this.ptFinal);
            this.root.getChildren().add(this.ptFinal);
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Debe seleccionar un punto de partida y un punto de llegada.\nVerifique e intente nuevamente.");
            alert.showAndWait();
        }
    }

   public void iniFin(JFXButton a) {
        if (this.inicio) {
            this.root.getChildren().remove(this.ptInicio);
            this.inicio = false;
            this.root.getChildren().add(this.ptInicio);
        }
        if (this.fin) {
            this.root.getChildren().remove(this.ptFinal);
            this.ptFinal.setX(a.getLayoutX());
            this.ptFinal.setY(a.getLayoutY() + 5);
            this.fin = false;
            this.root.getChildren().add(this.ptFinal);
        }
    }

    @FXML
    private void eliminaBloqueos(ActionEvent event) {
        this.root.getChildren().removeAll(bloqueos);
        bloqueos.clear();
        puntos.clear();
        creaPuntos();
    }

    public void pintarCarrito(JFXButton a) {

      //  this.root.getChildren().remove(carrito);

        this.carrito.setImage(new Image(String.valueOf(getClass().getResource("/Imagenes/car.png"))));

        this.carrito.setFitHeight(24);
        this.carrito.setFitWidth(24);
        System.out.println(a.getLayoutX());
        this.carrito.setX(a.getLayoutX() - 5);
        this.carrito.setY(a.getLayoutY() - 5);

        System.out.println("Inicio x " + carrito.getX()  + " y " + carrito.getY());

        this.root.getChildren().add(carrito);
    }

    public void movimiento(ArrayList<Ruta> ruta) {
        pintarCarrito(ruta.get(0).getEgreso());
        time = new Timer();
        AppContext.getInstance().set("time", time);

        TimerTask taskMovimiento = new TimerTask() {
            int i = 0;

            @Override
            public void run() {
                Platform.runLater(() -> {


                    System.out.println("Carrito: getX: "+carrito.getX()  + " getY " + carrito.getY()+  " ruta getX " + ruta.get(i).getIngreso().getLayoutX() + " ruta getY " + ruta.get(i).getIngreso().getLayoutY() );
                    if (carrito.getX() != ruta.get(i).getIngreso().getLayoutX() || carrito.getY() != ruta.get(i).getIngreso().getLayoutY()) {

                      //  root.getChildren().remove(carrito);
                        if (carrito.getX() < ruta.get(i).getIngreso().getLayoutX()) {
                            carrito.setX(carrito.getX()+1);
                            System.out.println("le setea x + 1");
                        } else if (carrito.getX() > ruta.get(i).getIngreso().getLayoutX()) {
                            carrito.setX(carrito.getX() - 1);
                            System.out.println("le setea x - 1");
                        }

                        if (carrito.getY() < ruta.get(i).getIngreso().getLayoutY()) {
                            carrito.setY(carrito.getY() + 1);
                            System.out.println("le setea y + 1");
                        } else if (carrito.getY() > ruta.get(i).getIngreso().getLayoutY()) {
                            carrito.setY(carrito.getY() - 1);
                            System.out.println("le setea y - 1");
                        }
                       // root.getChildren().add(carrito);
                        tiempo++;
                        tiempoTotal.setText(Integer.toString(tiempo / 60));
                        if (tiempo / 60 > 0 && (tiempo / 40) * Integer.parseInt(aristaTotal.getText()) > 655) {
                            costoTotal.setText(Integer.toString(Integer.parseInt(aristaTotal.getText()) * (tiempo / 40)));
                        } else {
                            costoTotal.setText("655");
                        }
                    } else {

                        i++;
                    }
                    if (i == ruta.size()) {
                        time.cancel();
                        Alert alert = new Alert(Alert.AlertType.INFORMATION);
                        alert.setTitle("Gracias");
                        alert.setHeaderText(null);
                        alert.setContentText("Has llegado a tu destino.\nGracias por utilizar nuestro servicios.");
                        alert.showAndWait();
                    }
                });
            }
        };
        time.schedule(taskMovimiento, 0, 25);
    }

    public void lento(JFXButton epicentro, Boolean activado) {
        for (int i = 0; i < puntos.size(); i++) {
            if (puntos.get(i).getUp() != null && puntos.get(i).getUp().equals(epicentro)) {
                if (!activado) {
                    moderado(puntos.get(i).getNombre(), activado);
                }
                puntos.get(i).setpU(puntos.get(i).getpU() * 3);
            }
            if (puntos.get(i).getDown() != null && puntos.get(i).getDown().equals(epicentro)) {
                if (!activado) {
                    moderado(puntos.get(i).getNombre(), activado);
                }
                puntos.get(i).setpD(puntos.get(i).getpD() * 3);
            }
            if (puntos.get(i).getLeft() != null && puntos.get(i).getLeft().equals(epicentro)) {
                if (!activado) {
                    moderado(puntos.get(i).getNombre(), activado);
                }
                puntos.get(i).setpL(puntos.get(i).getpL() * 3);
            }
            if (puntos.get(i).getRigth() != null && puntos.get(i).getRigth().equals(epicentro)) {
                if (!activado) {
                    moderado(puntos.get(i).getNombre(), activado);
                }
                puntos.get(i).setpR(puntos.get(i).getpR() * 3);
            }
        }
    }

    public void moderado(JFXButton epicentro, Boolean activado) {
        for (int i = 0; i < puntos.size(); i++) {
            if (puntos.get(i).getUp() != null && puntos.get(i).getUp().equals(epicentro)) {
                puntos.get(i).setpU(puntos.get(i).getpU() * 2);
            }
            if (puntos.get(i).getDown() != null && puntos.get(i).getDown().equals(epicentro)) {
                puntos.get(i).setpD(puntos.get(i).getpD() * 2);
            }
            if (puntos.get(i).getLeft() != null && puntos.get(i).getLeft().equals(epicentro)) {
                puntos.get(i).setpL(puntos.get(i).getpL() * 2);
            }
            if (puntos.get(i).getRigth() != null && puntos.get(i).getRigth().equals(epicentro)) {
                puntos.get(i).setpR(puntos.get(i).getpR() * 2);
            }
        }
    }

    public JFXButton cierraCalles(JFXButton a) {
        ArrayList<ButtonType> botones = new ArrayList();
        ArrayList<JFXButton> jfxbotones = new ArrayList();
        for (int i = 0; i < puntos.size(); i++) {
            if (puntos.get(i).getNombre().equals(a)) {
                if (puntos.get(i).getUp() != null) {
                    botones.add(new ButtonType("Arriba"));
                    jfxbotones.add(puntos.get(i).getUp());
                }
                if (puntos.get(i).getDown() != null) {
                    botones.add(new ButtonType("Abajo"));
                    jfxbotones.add(puntos.get(i).getDown());
                }
                if (puntos.get(i).getLeft() != null) {
                    botones.add(new ButtonType("Izquierda"));
                    jfxbotones.add(puntos.get(i).getLeft());
                }
                if (puntos.get(i).getRigth() != null) {
                    botones.add(new ButtonType("Derecha"));
                    jfxbotones.add(puntos.get(i).getRigth());
                }
                i = puntos.size();
            }
        }

        if (botones.size() > 1) {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Dialog with Custom Actions");
            alert.setHeaderText("La ruta tiene varias direcciones.");
            alert.setContentText("Seleccione la ruta a bloquear.");

            alert.getButtonTypes().setAll(botones);

            Integer pos = -1;
            Optional<ButtonType> result = alert.showAndWait();
            for (int i = 0; i < botones.size(); i++) {
                if (result.get().equals(botones.get(i))) {
                    pos = i;
                    i = botones.size();
                }
            }
            return jfxbotones.get(pos);
        } else {
            return null;
        }
    }

    @FXML
    private void quitaUnBloqueo(ActionEvent event) {
        quita = true;
    }

    public void quita(ImageView a) {
        for (int i = 0; i < bloqueos.size(); i++) {
            if (bloqueos.get(i).equals(a)) {
                this.root.getChildren().remove(bloqueos.get(i));
                bloqueos.remove(bloqueos.get(i));
                puntos.clear();
                creaPuntos();
                for (int k = 0; k < bloqueos.size(); k++) {
                    for (int j = 0; j < puntos.size(); j++) {
                        if (puntos.get(j).getNombre().getLayoutX() == bloqueos.get(k).getLayoutX() && puntos.get(j).getNombre().getLayoutY() == bloqueos.get(k).getLayoutY()) {
                            lento(puntos.get(j).getNombre(), false);
                        }
                    }
                }
                i = bloqueos.size();
            }
        }
    }

    public Timer getTime() {
        return time;
    }

    public void atrasButtonOnAction(ActionEvent actionEvent) {
        FlowController.getInstance().goMain();
        FlowController.getInstance().getStage().centerOnScreen();
    }


    public void inicioViaje(MouseEvent mouseEvent) {
    }

    public void finalViaje(MouseEvent mouseEvent) {
    }

    public void conClickEnMap(MouseEvent mouseEvent) {

        System.out.println("x: " + mouseEvent.getX() + " y: " + mouseEvent.getY());
    }
}
