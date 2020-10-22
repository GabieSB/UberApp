module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;

    opens org.una to javafx.fxml;
    opens org.una.controllers to javafx.fxml, javafx.controls, com.jfoenix;
    exports org.una to javafx.graphics;

}