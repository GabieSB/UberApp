package org.una.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.una.App;
import org.una.utils.FlowController;

public class PrimaryController  extends Controller implements Initializable {

    @FXML
    private void switchToSecondary() throws IOException {
        FlowController.getInstance().goView("secondary");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @Override
    public void initialize() {

    }

    public void cambiarDeVista(ActionEvent actionEvent) {
        FlowController.getInstance().goViewInStage("secondary", getStage());
    }
}
