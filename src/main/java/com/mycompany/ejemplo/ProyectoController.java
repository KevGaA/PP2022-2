package com.mycompany.ejemplo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ProyectoController implements Initializable {
    String text;
    @FXML
    private TextField palabra;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    

    @FXML
    private void setPalabra() {
        //convertir la palabra introducida en el programa que es de variable TextField y la convierte en String
        text = palabra.getText();
        
        if (text==""){
            System.out.println("No se ha introducido ningun dato, vuelva a intentarlo...");
        }else{
            System.out.println("La palabra es: "+text);
            Stage stage = new Stage();
            //llamado a la clase la cual tendra la funcion para dibujar las letras
            Dibujo d = new Dibujo();
            d.dibujar(stage);
            
        }
    }
}
