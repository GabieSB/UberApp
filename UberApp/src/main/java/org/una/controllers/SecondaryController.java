package org.una.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.una.App;
import org.una.utils.FlowController;

public class SecondaryController  extends Controller implements Initializable {

    @FXML
    private void switchToPrimary() throws IOException {
        FlowController.getInstance().goView("primary");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @Override
    public void initialize() {

    }

    public void secondary(ActionEvent actionEvent) {
        FlowController.getInstance().goView("primary");
    }
}