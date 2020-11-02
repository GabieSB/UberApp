package org.una.controllers;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.Initializable;
import org.una.utils.FlowController;

import java.net.URL;
import java.util.ResourceBundle;

public class InicioController extends Controller implements Initializable {
    
    public AnchorPane ap_ini;
    public JFXButton btn_iniciar;
    public JFXButton btn_comenzar;
    public JFXButton btn_instruccion;
    public JFXButton btn_acercade;
    public JFXButton btn_salir;

    @Override
    public void initialize() {
        
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void btn_comenzar(ActionEvent actionEvent) {


        FlowController.getInstance().goView("Mapa");

        FlowController.getInstance().getStage().setWidth(1250);
        FlowController.getInstance().getStage().setHeight(650);
        FlowController.getInstance().getStage().centerOnScreen();
    }

    public void btn_instruccion(ActionEvent actionEvent) {
        FlowController.getInstance().goView("Instrucciones");
    }

    public void btn_acercade(ActionEvent actionEvent) {

        FlowController.getInstance().goView("AcercaDe");
        

    }

    public void btn_salir(ActionEvent actionEvent) {
        getStage().close();
    }
}
