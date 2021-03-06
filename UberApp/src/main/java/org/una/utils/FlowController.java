package org.una.utils;


import java.io.IOException;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import org.una.App;
import org.una.controllers.Controller;
import java.util.Stack;
import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;


public class FlowController {

    @SuppressWarnings("FieldMayBeFinal")
    private static Stack<String> viewed = new Stack();
    private static FlowController INSTANCE = null;
    private static Stage mainStage;
    private static ResourceBundle idioma;
    @SuppressWarnings("FieldMayBeFinal")
    private static HashMap<String, FXMLLoader> loaders = new HashMap<>();

    private FlowController() {
    }

    @SuppressWarnings("DoubleCheckedLocking")
    private static void createInstance() {
        if (INSTANCE == null) {
            synchronized (FlowController.class) {
                if (INSTANCE == null) {
                    INSTANCE = new FlowController();
                }
            }
        }
    }

    public void loadLanguage(ResourceBundle lenguaje) {
        FlowController.idioma = lenguaje;
        loaders.clear();
        //goMain();
    }

    public ResourceBundle getLanguage() {
        return FlowController.idioma;
    }

    public static FlowController getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }

    @Override
    @SuppressWarnings("CloneDoesntCallSuperClone")
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @SuppressWarnings("static-access")
    public void InitializeFlow(Stage stage, ResourceBundle idioma) {
        getInstance();
        this.mainStage = stage;
        this.idioma = idioma;
        mainStage.setMinWidth(633d);
        mainStage.setMinHeight(500d);
    }

    @SuppressWarnings({"DoubleCheckedLocking", "static-access", "UseSpecificCatch"})
    private FXMLLoader getLoader(String name) {
        FXMLLoader loader = loaders.get(name);
        if (loader == null) {
            synchronized (FlowController.class) {
                if (loader == null) {
                    try {
                        loader = new FXMLLoader(App.class.getResource("view/" + name + ".fxml"), this.idioma);
                        loader.load();
                        loaders.put(name, loader);
                    } catch (Exception ex) {
                        loader = null;
                        java.util.logging.Logger.getLogger(FlowController.class.getName()).log(Level.SEVERE, "Creando loader [" + name + "].", ex);
                    }
                }
            }
        }
        return loader;
    }

    @SuppressWarnings("static-access")
    public void goMain() {
        try {
            this.mainStage.setScene(new Scene(FXMLLoader.load(App.class.getResource("view/Inicio.fxml"), this.idioma)));
            this.mainStage.show();
            this.mainStage.setHeight(580);
            this.mainStage.setWidth(700);
            this.mainStage.getIcons().add(new Image(String.valueOf(getClass().getResource("/Imagenes/car.png"))));
            this.mainStage.setTitle("Uber App");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FlowController.class.getName()).log(Level.SEVERE, "Error inicializando la vista base.", ex);
        }
    }

    public Boolean isMainMaximized() {
        return FlowController.mainStage.isMaximized();
    }

    public void maximizeMain() {
        FlowController.mainStage.setMaximized(true);
    }

    public void goView(String viewName) {
        goView(viewName, "Center", null);
    }

    public void goView(String viewName, String accion) {
        goView(viewName, "Center", accion);
    }

    @SuppressWarnings("static-access")
    public void goView(String viewName, String location, String accion) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.setAccion(accion);
        controller.initialize();
        Stage stage = controller.getStage();
        if (stage == null) {
            stage = this.mainStage;
            controller.setStage(stage);
        }
        switch (location) {
            case "Center":
                ((AnchorPane) ((BorderPane) stage.getScene().getRoot()).getCenter()).getChildren().clear();
                ((AnchorPane) ((BorderPane) stage.getScene().getRoot()).getCenter()).getChildren().add(loader.getRoot());
                if (!viewed.isEmpty()) {
                    if (!viewed.peek().equals(viewName)) {
                        viewed.push(viewName);
                    }
                } else {
                    viewed.push(viewName);
                }
                break;
            case "Top":
                ((AnchorPane) ((BorderPane) stage.getScene().getRoot()).getTop()).getChildren().clear();
                ((AnchorPane) ((BorderPane) stage.getScene().getRoot()).getTop()).getChildren().add(loader.getRoot());
                break;
            case "Bottom":
                break;
            case "Right":
                break;
            case "Left":
                ((AnchorPane) ((BorderPane) stage.getScene().getRoot()).getLeft()).getChildren().clear();
                ((AnchorPane) ((BorderPane) stage.getScene().getRoot()).getLeft()).getChildren().add(loader.getRoot());
                break;
            default:
                break;
        }
        AnchorPane.setBottomAnchor(loader.getRoot(), 0d);
        AnchorPane.setTopAnchor(loader.getRoot(), 0d);
        AnchorPane.setRightAnchor(loader.getRoot(), 0d);
        AnchorPane.setLeftAnchor(loader.getRoot(), 0d);
    }

    public void goViewInStage(String viewName, Stage stage) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.setStage(stage);
        stage.getScene().setRoot(loader.getRoot());
    }

    public void goViewInWindow(String viewName) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.initialize();
        Stage stage = new Stage();
        //stage.getIcons().add(new Image("clinicauna/resources/logo01.png"));
        stage.setTitle("UberApp");
        stage.setOnHidden((WindowEvent event) -> {
            controller.getStage().getScene().setRoot(new Pane());
            controller.setStage(null);
        });
        controller.setStage(stage);
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();

    }

    public void goViewInWindow(String viewName, Boolean resizable) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.initialize();
        Stage stage = new Stage();
        //stage.setMaximized(true);
        //stage.getIcons().add(new Image("clinicauna/resources/logo01.png"));
        stage.setTitle("UberApp");
        stage.setResizable(resizable);
        stage.setOnHidden((WindowEvent event) -> {
            controller.getStage().getScene().setRoot(new Pane());
            controller.setStage(null);
        });
        controller.setStage(stage);
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public void goViewInWindowModal(String viewName, Stage parentStage, Boolean resizable) {
        FXMLLoader loader = getLoader(viewName);
        Controller controller = loader.getController();
        controller.initialize();
        Stage stage = new Stage();
        //stage.getIcons().add(new Image("clinicauna/resources/logo01.png"));
        stage.setTitle("UberApp");
        stage.setResizable(resizable);
        stage.setOnHidden((WindowEvent event) -> {
            controller.getStage().getScene().setRoot(new Pane());
            controller.setStage(null);
        });
        controller.setStage(stage);
        Parent root = loader.getRoot();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(parentStage);
        stage.centerOnScreen();
        stage.showAndWait();
    }

    public Controller getController(String viewName) {
        return getLoader(viewName).getController();
    }

    public static void setIdioma(ResourceBundle idioma) {
        FlowController.idioma = idioma;
    }

    @SuppressWarnings("static-access")
    public void initialize() {
        this.loaders.clear();
    }

    @SuppressWarnings("static-access")
    public void salir() {
        this.mainStage.close();
    }

    public void eliminarDeCache(String viewName) {
        loaders.put(viewName, null);
    }

    public void goBack() {
        if (viewed.size() > 1) {
            viewed.pop();
            goView(viewed.peek());
        }
    }

    public boolean deleteHistoryTo(String viewName) {
        int pos = viewed.search(viewName);
        boolean existe = pos != -1;
        if (existe) {
            while (!viewed.peek().equals(viewName)) {
                viewed.pop();
            }
            return true;
        }
        return false;
    }

    public void limpiarCache() {
        loaders.clear();
    }

    public Stage getStage() {
        return mainStage;
    }

    public <RootTipe extends Node> void chargeOn(Pane chargeHere, String viewName) {
        try {
            FXMLLoader loader = getLoader(viewName);
            Controller controller = loader.getController();
            controller.initialize();
            RootTipe root = ((RootTipe) loader.getRoot());
            chargeHere.getChildren().clear();
            chargeHere.getChildren().add(root);
            AnchorPane.setBottomAnchor(root, 0d);
            AnchorPane.setTopAnchor(root, 0d);
            AnchorPane.setRightAnchor(root, 0d);
            AnchorPane.setLeftAnchor(root, 0d);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(FlowController.class.getName()).log(Level.SEVERE, "Error al cargar ''" + viewName + "'' dentro de otro nodo.", ex);
        }
    }
}
