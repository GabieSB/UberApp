package org.una.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import org.una.utils.FlowController;

import java.net.URL;
import java.util.ResourceBundle;

public class InstruccionesController extends Controller implements Initializable {
    public Label lbl_titulo;
    public AnchorPane acp_instrucciones;
    public Label lbl_instrucciones;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void atrasButtonOnAction(ActionEvent actionEvent) {
        FlowController.getInstance().goBack();
    }

    @Override
    public void initialize() {

    }
}
