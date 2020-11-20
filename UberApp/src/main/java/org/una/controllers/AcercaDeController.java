package org.una.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.una.utils.FlowController;

import java.net.URL;
import java.util.ResourceBundle;

public class AcercaDeController extends Controller implements Initializable {


    public AnchorPane acp_acercade;
    public ImageView img_fondo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @Override
    public void initialize() {

    }

    public void atrasButtonOnAction(ActionEvent actionEvent) {
        FlowController.getInstance().goMain();
    }
}
