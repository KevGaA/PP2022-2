package com.mycompany.ejemplo;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class Dibujo extends javax.swing.JPanel {
    
    double aux=0;
     public void dibujar(Stage stage){
         Line linea = new Line();
            //define el punto de partida en el eje X e Y
            linea.setStartX(100.0);
            linea.setStartY(150.0);
            //define el punto final de X e Y
            linea.setEndX(500.0);
            linea.setEndY(150.0);
            //crea una ventana en la cual se dibujara lo anterior declarado(linea)
            Group group = new Group(linea);
            Scene scene = new Scene(group,600,300);
            stage.setTitle("DIBUJO");

            stage.setScene(scene);
            stage.show();
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
