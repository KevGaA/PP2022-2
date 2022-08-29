module com.mycompany.ejemplo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.desktop;
    requires java.logging;

    opens com.mycompany.ejemplo to javafx.fxml;
    exports com.mycompany.ejemplo;
}
