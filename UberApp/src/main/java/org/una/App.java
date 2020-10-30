package org.una;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.una.utils.AppContext;
import org.una.utils.FlowController;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {



    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        FlowController.getInstance().InitializeFlow(stage, null);
        FlowController.getInstance().goViewInWindow("Inicio", Boolean.FALSE);
    }

    public static void main(String[] args) {

        AppContext.getInstance();
        launch();
    }

}