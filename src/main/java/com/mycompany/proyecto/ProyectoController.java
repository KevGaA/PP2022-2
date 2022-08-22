package com.mycompany.proyecto;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


public class ProyectoController implements Initializable {

    @FXML
    private TextField palabra;
    @FXML
    private ImageView tablero;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void setPalabra(ActionEvent event) {
    }
    
}
