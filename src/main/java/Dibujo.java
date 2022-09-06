//kevgaaaaaaa
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

public class Dibujo extends javax.swing.JFrame {
    
    
    public Dibujo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        palabra = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Script", 0, 18)); // NOI18N
        jLabel1.setText("TRANSFORMADOR DE TEXTO");

        jLabel2.setText("Ingrese una palabra");

        palabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palabraActionPerformed(evt);
            }
        });

        button.setText("Confirmar");
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMouseClicked(evt);
            }
        });
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );

        limpiar.setText("Limpiar");
        limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiarMouseClicked(evt);
            }
        });
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 249, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(button)
                                .addGap(206, 206, 206))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(349, 349, 349))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(252, 252, 252))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(limpiar)
                                .addGap(365, 365, 365))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(limpiar)
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button)
                    .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void palabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palabraActionPerformed
    }//GEN-LAST:event_palabraActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String text = palabra.getText();//guarda en una variable de tipo string la palabra ingresada que originalmente es de tipo textfield
        if (text==""){
            System.out.println("No se ha introducido ningun dato, vuelva a intentarlo...");
        }else if(text!=""){
            System.out.println("La palabra es: "+text);
        }
    }//GEN-LAST:event_buttonActionPerformed

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseClicked
        String text = palabra.getText();//convierte la variable de textfield en un string
        int x=0,y=0;//posiciones iniciales
        int aux = text.length();//auxiliar para el ciclo donde se identificara cada letra de una palabra
        Graphics2D g2d = (Graphics2D)jPanel1.getGraphics();
        Path2D.Double curve = new Path2D.Double();
        //validacion de la letra que esta leyendo en el momento el programa
        
        //intentar que las letras minusculas terminen en la altura 70 para que se puedan unir con mas facilidad
            if ("j".equals(text)){//listo
                curve.moveTo(25, 30);
                curve.curveTo(28, 33, 28, 36, 25, 39);
                curve.curveTo(22, 36, 22, 33, 25, 30);

                curve.moveTo(0, 75);
                curve.curveTo(15, 70, 15, 70, 25, 50);
                curve.lineTo(25, 125);
                curve.curveTo(0, 150, 0, 125, 0, 125);
                curve.curveTo(0, 110, 0, 100, 40, 70);
            }
            if("k".equals(text)){//listo
                curve.moveTo(0, 70);
                curve.curveTo(30, 55, 70, 10, 40, 0);
                curve.curveTo(30, 10, 25, 35, 25, 70);
                curve.moveTo(25, 50);
                curve.curveTo(50, 45, 50, 45, 35, 60);
                curve.curveTo(50, 60, 55, 65, 35, 70);
                curve.lineTo(60, 70);
            }
            if("l".equals(text)){//listo
                curve.moveTo(0, 70);
                curve.curveTo(30, 55, 70, 10, 50, 0);
                curve.curveTo(40, 10, 25, 35, 25, 50);
                curve.curveTo(30, 65, 35, 65, 55, 70);
            }
            if("m".equals(text)){//listo
                curve.moveTo(0, 45);
                curve.curveTo(5, 25, 15, 25, 25, 45);
                curve.lineTo(25, 70);
                curve.moveTo(25, 45);
                curve.curveTo(30, 25, 35, 25, 45, 45);
                curve.lineTo(45, 70);
                curve.moveTo(45, 45);
                curve.curveTo(55, 25, 65, 25, 65, 45);
                curve.lineTo(65, 65);
                curve.curveTo(67, 70, 69, 70, 70, 70);
            }
            if("n".equals(text)){
                curve.moveTo(0, 45);//listo
                curve.curveTo(5, 25, 15, 25, 25, 45);
                curve.lineTo(25, 70);
                curve.moveTo(25, 45);
                curve.curveTo(30, 25, 35, 25, 45, 45);
                curve.curveTo(45, 60, 47, 68, 55, 70);
            }
            if("ñ".equals(text)){//listo
                curve.moveTo(0, 45);
                curve.curveTo(5, 25, 15, 25, 25, 45);
                curve.lineTo(25, 70);
                curve.moveTo(25, 45);
                curve.curveTo(30, 25, 35, 25, 45, 45);
                curve.curveTo(45, 60, 47, 68, 55, 70);
                curve.moveTo(10, 20);
                curve.curveTo(20, 5, 30, 30, 40, 20);
            }
            if("o".equals(text)){//listo //achicar la o y arreglar el tema de la union
                curve.moveTo(20, 50);
                curve.curveTo(60, 55, 60, 95, 30, 100);
                curve.curveTo(0, 95, 0, 55, 30, 50);
                curve.moveTo(10, 60);
                curve.curveTo(40, 75, 60, 75, 70, 70);
            }
            if("p".equals(text)){//listo //agrandar la letra
                curve.moveTo(0, 70);
                curve.curveTo(5, 70, 10, 60, 20, 45);
                curve.curveTo(35, 55, 35, 65, 20, 70);
                curve.lineTo(20, 45);
                curve.lineTo(20, 95);
                curve.moveTo(20, 70);
                curve.lineTo(35, 70);
            }
            if("q".equals(text)){//listo //achicar un poco mas el circulo
                curve.moveTo(25, 20);
                curve.curveTo(50, 25, 50, 65, 25, 70);
                curve.curveTo(0, 65, 0, 25, 25, 20);
                curve.moveTo(44, 45);
                curve.lineTo(44, 105);
                curve.curveTo(41, 117, 38, 117, 35, 115);
                curve.moveTo(44, 85);
                curve.curveTo(25, 85, 25, 80, 55, 70);
            }else{
                System.out.println("no a ingresado ningun valor,vuelva a intentarlo...");
            }
            g2d.draw(curve);//dibuja la letra en el JPanel dentro de la interfaz
        
        
    }//GEN-LAST:event_buttonMouseClicked

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // posible boton qu el se encargue de limpiar el panel principal
    }//GEN-LAST:event_limpiarActionPerformed

    private void limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiarMouseClicked
        
        //limpia el panel del dibujo
        jPanel1.updateUI();
    }//GEN-LAST:event_limpiarMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dibujo().setVisible(true);
            }
        });
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField palabra;
    // End of variables declaration//GEN-END:variables
}
