//git
import java.awt.Graphics2D;
import java.awt.geom.Path2D;

public class Dibujo extends javax.swing.JFrame {
    
    String aux;
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
            .addGap(0, 973, Short.MAX_VALUE)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(palabra, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(143, 143, 143))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(limpiar)
                        .addGap(159, 159, 159)))
                .addGap(298, 298, 298))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
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
        System.out.println("La palabra ingresada es: "+text);
    }//GEN-LAST:event_buttonActionPerformed

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseClicked
        //librerias utilizadas para poder dibujar
        Graphics2D g2d = (Graphics2D)jPanel1.getGraphics();
        Path2D.Double curve = new Path2D.Double();
        
        //declaracion de variables
        char aux;
        String text = palabra.getText();//convierte la variable de textfield en un string
        int x=0,y=0;//posiciones iniciales
        
        for (int i = 0; i < text.length(); i++) {
            //guarda en la variable aux letra por letra una variable tipo char la cual luego es modificada por una de tipo string y guardada en la variable letra
            aux = text.charAt(i);
            String letra = Character.toString(aux);
                
            if ("a".equals(letra)){//listo
                curve.moveTo(0+x, 70);
                curve.curveTo(10+x, 70, 20+x, 65, 20+x, 50);
                curve.moveTo(20+x, 50);
                curve.curveTo(30+x, 75, 50+x, 75, 60+x, 50);
                curve.moveTo(20+x, 50);
                curve.curveTo(30+x, 20, 50+x, 20, 60+x, 50);
                curve.moveTo(60+x, 50);
                curve.curveTo(55+x, 65, 60+x, 70, 70+x, 70);
                x = x + 70;
            }
            if ("b".equals(letra)){//listo
                curve.moveTo(0+x, 70);
                curve.curveTo(17+x, 68, 30+x, 48, 23+x, 25);
                curve.moveTo(23+x, 25);
                curve.curveTo(22+x, 19, 18+x, 19, 18+x, 25);
                curve.moveTo(18+x, 25);
                curve.curveTo(10+x, 35, 10+x, 55, 18+x, 68);
                curve.moveTo(18+x, 68);
                curve.curveTo(20+x, 75, 20+x, 70, 30+x, 65);
                curve.moveTo(30+x, 65);
                curve.curveTo(32+x, 63, 33+x, 59, 32+x, 55);
                curve.moveTo(32+x, 55);
                curve.lineTo(40+x, 55);
                x = x+40;
                //solucion al no quedar en 70
                //curve.moveTo(60, 55);
                //curve.curveTo(59, 63, 60, 70, 70, 70);
            }

            if ("c".equals(letra)){//listo
                curve.moveTo(0+x, 70);
                curve.curveTo(12+x, 65, 16+x, 60, 20+x, 50);
                curve.moveTo(20+x, 50);
                curve.curveTo(23+x, 35, 35+x, 28, 50+x, 29);
                curve.moveTo(20+x, 50);
                curve.curveTo(23+x, 65, 35+x, 72, 60+x, 70);
                curve.moveTo(20+x, 50);
                curve.curveTo(23+x, 35, 35+x, 28, 50+x, 29);
                x = x+50;
            }
            if ("d".equals(letra)){//listo
                curve.moveTo(0+x, 70);
                curve.curveTo(10+x, 69, 13+x, 65, 15+x, 55);
                curve.moveTo(15+x, 55);
                curve.curveTo(20+x, 40, 38+x, 40, 40+x, 55);
                curve.moveTo(40+x, 55);
                curve.lineTo(40+x, 10);
                curve.moveTo(15+x, 55);
                curve.curveTo(20+x, 75, 35+x, 75, 40+x, 55);
                curve.moveTo(40+x, 55);
                curve.curveTo(40+x, 65, 45+x, 72, 55+x, 70);  
                x = x+55;
            }
            if ("e".equals(letra)){//listo
                curve.moveTo(0+x, 70);
                curve.curveTo(15+x, 69, 27+x, 57, 26+x, 43);
                curve.moveTo(26+x, 43);
                curve.curveTo(25+x, 30, 18+x, 30, 13+x, 43);
                curve.moveTo(13+x, 43);
                curve.curveTo(10+x, 55, 25+x, 68, 50+x, 70);
                x = x +50;
            }
            
            if ("f".equals(letra)){//listo
                curve.moveTo(0+x, 70);
                curve.curveTo(15+x, 65, 23+x, 50, 23+x, 33);
                curve.moveTo(23+x, 33);
                curve.curveTo(20+x, 20, 15+x, 20, 10+x, 35);
                curve.moveTo(10+x, 35);
                curve.curveTo(8+x, 52, 8+x, 75, 10+x, 90);
                curve.moveTo(10+x, 90);
                curve.curveTo(12+x, 98, 18+x, 98, 20+x, 90);
                curve.moveTo(20+x, 90);
                curve.curveTo(25+x, 75, 18+x, 53, 10+x, 60);
                curve.moveTo(10+x, 60);
                curve.curveTo(15+x, 74, 20+x, 75, 50+x, 70);
                x=x+50;
            }
            //letra no completada
            /*if ("g".equals(letra)){//listo
                curve.moveTo(0, 70);
                curve.curveTo(10, 73, 16, 78, 15, 55);
                curve.moveTo(15, 55);
                curve.curveTo(20, 20, 15, 20, 40, 55);
                curve.moveTo(10, 35);
                curve.curveTo(8, 52, 8, 75, 10, 90);
                curve.moveTo(10, 90);
                curve.curveTo(12, 98, 18, 98, 20, 90);
                curve.moveTo(20, 90);
                curve.curveTo(25, 75, 18, 53, 10, 60);
                curve.moveTo(10, 60);
                curve.curveTo(15, 74, 20, 75, 50, 70);
                x=x+50;
            }*/
            
            
            //validacion de la letra que esta leyendo en el momento el programa
            if ("j".equals(letra)){//listo
                curve.moveTo(25+x, 30);
                curve.curveTo(28+x, 33, 28+x, 36, 25+x, 39);
                curve.curveTo(22+x, 36, 22+x, 33, 25+x, 30);

                curve.moveTo(0+x, 70);
                curve.curveTo(15+x, 70, 15+x, 70, 25+x, 50);
                curve.lineTo(25+x, 125);
                curve.curveTo(0+x, 150, 0+x, 125, 0+x, 125);
                curve.curveTo(0+x, 110, 0+x, 100, 40+x, 70);
                x = x + 40;
            }
            if("k".equals(letra)){//listo
                curve.moveTo(0+x, 70);
                curve.curveTo(25+x, 65, 25+x, 20, 20+x,15 );
                curve.curveTo(5+x, 20, 5+x, 65, 15+x, 60);
                curve.curveTo(30+x, 61, 30+x, 64, 15+x, 65);
                curve.curveTo(30+x, 66, 30+x, 69, 15+x, 70);
                curve.curveTo(20+x, 70, 30+x, 70, 35+x, 70);
                x = x + 35;
            }
            if("l".equals(letra)){//listo
                curve.moveTo(0+x, 70);
                curve.curveTo(25+x, 65, 25+x, 20, 20+x,15);
                curve.curveTo(5+x, 20, 5+x, 65, 35+x, 70);
                x = x + 35; 
            }
            if("m".equals(letra)){//listo
                curve.moveTo(0+x, 70);
                curve.curveTo(2+x, 70, 8+x, 70, 10+x, 64);
                curve.lineTo(10+x, 40);
                curve.curveTo(15+x, 35, 20+x, 35, 25+x, 40);
                curve.lineTo(25+x, 70);
                curve.moveTo(25+x, 40);
                curve.curveTo(30+x, 35, 35+x, 35, 40+x, 40);
                curve.lineTo(40+x, 70);
                curve.moveTo(40+x, 40);
                curve.curveTo(45+x, 35, 45+x, 35, 55+x, 40);
                curve.lineTo(55+x, 64);
                curve.curveTo(53+x, 70, 62+x, 70, 65+x, 70);
                g2d.draw(curve);
                x = x + 65;
            }
            if("n".equals(letra)){
                curve.moveTo(0+x, 70);
                curve.curveTo(2+x, 70, 8+x, 70, 10+x, 64);
                curve.lineTo(10+x, 40);
                curve.curveTo(15+x, 35, 20+x, 35, 25+x, 40);
                curve.lineTo(25+x, 70);
                curve.moveTo(25+x, 40);
                curve.curveTo(30+x, 35, 35+x, 35, 40+x, 40);
                curve.lineTo(40+x, 64);
                curve.curveTo(43+x, 70, 47+x, 70, 50+x, 70);
                g2d.draw(curve);
                x = x +50;
            }
            if("ñ".equals(letra)){//listo
                curve.moveTo(0+x, 70);
                curve.curveTo(2+x, 70, 8+x, 70, 10+x, 64);
                curve.lineTo(10+x, 40);
                curve.curveTo(15+x, 35, 20+x, 35, 25+x, 40);
                curve.lineTo(25+x, 70);
                curve.moveTo(25+x, 40);
                curve.curveTo(30+x, 35, 35+x, 35, 40+x, 40);
                curve.lineTo(40+x, 64);
                curve.curveTo(43+x, 70, 47+x, 70, 50+x, 70);
                
                curve.moveTo(15+x, 30);
                curve.curveTo(20+x, 25, 30+x, 35, 35+x, 30);
                x = x + 50;
            }
            if("o".equals(letra)){//listo
                curve.moveTo(0+x, 70);
                curve.curveTo(4+x, 70, 8+x, 70, 13+x, 64);
                curve.moveTo(25+x, 40);
                curve.curveTo(5+x, 45, 5+x, 65, 25+x, 70);
                curve.curveTo(45+x, 65, 45+x, 45, 25+x, 40);
                curve.moveTo(13+x, 46);
                curve.curveTo(18+x, 50, 40+x, 50, 45+x, 45);
                curve.moveTo(37+x, 64);
                curve.curveTo(42+x, 70, 46+x, 70, 50+x, 70);
                g2d.draw(curve);
                x = x + 50;
            }
            if("p".equals(letra)){//listo
                curve.moveTo(0+x, 70);
                curve.curveTo(5+x, 75, 17+x, 47, 20+x, 40);
                curve.curveTo(45+x, 45, 45+x, 65, 20+x, 70);
                curve.lineTo(20+x, 40);
                curve.lineTo(20+x, 90);
                curve.moveTo(20+x, 70);
                curve.curveTo(25+x, 72, 40+x, 72, 45+x, 70);
                x = x +45;
            }
            if("q".equals(letra)){//listo //achicar un poco mas el circulo
                curve.moveTo(0+x, 70);
                curve.curveTo(4+x, 70, 8+x, 70, 10+x, 64);
                curve.moveTo(20+x, 40);
                curve.curveTo(0+x, 45, 0+x, 65, 20+x, 70);
                curve.curveTo(40+x, 65, 40+x, 45, 20+x, 40);
                curve.moveTo(35+x, 55);
                curve.lineTo(35+x, 90);
                curve.moveTo(35+x, 70);
                curve.curveTo(20+x, 85, 20+x, 60, 45+x, 70);
                x = x + 45;
            }
            if ("J".equals(letra)){//Dibujar J
                curve.moveTo(0+x, 20);
                curve.curveTo(20+x, 5, 40+x, 30, 60+x, 20);
                curve.curveTo(60+x, 15, 50+x, 5, 30+x, 20);
                curve.curveTo(30+x, 20, 50+x, 50, 40+x, 90);
                curve.curveTo(10+x, 90, 0+x, 70, 60+x, 70);
                g2d.draw(curve);
                x=x+60;
            }
            if ("K".equals(letra)) {
                curve.moveTo(0+x, 10);
                curve.curveTo(0+x, 10, 6+x, 7, 10+x, 10);
                curve.lineTo(10+x, 70);
                curve.curveTo(7+x, 70, 5+x, 70, 0+x, 65);
                curve.moveTo(40+x, 10);
                curve.curveTo(30+x, 5, 20+x, 30, 10+x, 30);
                curve.curveTo(10+x, 50, 25+x, 45, 30+x, 65);
                curve.curveTo(30+x, 65, 32+x, 70, 40+x, 70);
                g2d.draw(curve);
                x=x+45;
            }
            
            if ("L".equals(letra)){//L mayuscula
                curve.moveTo(25+x, 10);
                curve.curveTo(20+x, 0, 5+x, 0, 0+x, 10);
                curve.curveTo(0+x, 15, 8+x, 40, 5+x, 65);
                curve.curveTo(0+x, 80, 0+x, 40, 5+x, 65);
                curve.curveTo(5+x, 65, 15+x, 75, 30+x, 70);
                g2d.draw(curve);
                x=x+30;
            }
            if ("M".equals(letra)) {
                curve.moveTo(0+x, 30);
                curve.curveTo(5+x, 0, 20+x, 0, 25+x, 30);
                curve.lineTo(25+x, 70);
                curve.moveTo(25+x, 30);
                curve.curveTo(30+x, 0, 45+x, 0, 50+x, 30);
                curve.lineTo(50+x,70);
                curve.moveTo(50+x, 30);
                curve.curveTo(55+x, 0, 70+x, 0, 75+x, 30);
                curve.lineTo(75+x, 65);
                curve.curveTo(77+x, 70, 80+x, 70, 85+x, 70);
                g2d.draw(curve);
                x=x+85;
            }
            if ("N".equals(letra)) {
                curve.moveTo(0+x, 30);
                curve.curveTo(5+x, 0, 20+x, 0, 25+x, 30);
                curve.lineTo(25+x, 70);
                curve.moveTo(25+x, 30);
                curve.curveTo(30+x, 0, 45+x, 0, 50+x, 30);
                curve.lineTo(50+x,65);
                curve.curveTo(53+x, 70, 57+x, 70, 60+x, 70);
                g2d.draw(curve);
                x=x+60;
            }
            if ("Ñ".equals(letra)) {
                curve.moveTo(0+x, 30);
                curve.curveTo(5+x, 0, 20+x, 0, 25+x, 30);
                curve.lineTo(25+x, 70);
                curve.moveTo(25+x, 30);
                curve.curveTo(30+x, 0, 45+x, 0, 50+x, 30);
                curve.lineTo(50+x,65);
                curve.curveTo(53+x, 70, 57+x, 70, 60+x, 70);
                
                curve.moveTo(10+x, 3);
                curve.curveTo(20+x, -2, 30+x, 8, 40+x, 3);
                g2d.draw(curve);
                x=x+60;
            }
            if ("O".equals(letra)) {
                curve.moveTo(40+x, 0);
                curve.curveTo(0+x, 5, 0+x, 65, 40+x, 70);
                curve.curveTo(80+x, 65, 80+x, 5, 40+x, 0);
                curve.moveTo(18+x, 14);
                curve.curveTo(40+x, 20, 60+x, 20, 80+x, 10);
                curve.moveTo(65+x, 56);
                curve.curveTo(70+x, 65, 75+x, 70, 80+x, 70);
                g2d.draw(curve);
                x=x+80;
            }
            
            if ("P".equals(letra)) {
                curve.moveTo(5+x, 15);
                curve.curveTo(10+x,15 , 25+x,10, 20+x,7);
                curve.curveTo(12+x, 5, 8+x, 10, 20+x, 10);
                curve.curveTo(50+x, 12, 50+x, 38, 20+x, 40);
                curve.lineTo(20+x, 7);
                curve.lineTo(20+x, 70);
                curve.curveTo(25+x, 70, 30+x, 75, 45+x, 70);
                g2d.draw(curve);
                x=x+45;
            }
            if ("Q".equals(letra)) {
                curve.moveTo(40+x, 0);
                curve.curveTo(0+x, 5, 0+x, 65, 40+x, 70);
                curve.curveTo(80+x, 65, 80+x, 5, 40+x, 0);
                curve.moveTo(18+x, 14);
                curve.curveTo(20+x, 30, 20+x, 50, 25+x, 50);
                curve.curveTo(35+x, 40, 55+x, 40, 65+x, 56);
                curve.curveTo(70+x, 65, 75+x, 70, 80+x, 70);
                g2d.draw(curve);
                x=x+80;
            }
             
            if("r".equals(letra)){
                curve.moveTo(0+x, 70);
                curve.curveTo(10+x, 65, 10+x, 35, 0+x, 30);
                curve.curveTo(0+x, 60, 40+x, 35, 30+x, 40);
                curve.curveTo(25+x, 35, 25+x, 65, 30+x, 70);
                x = x + 30;
            }
            
            if("s".equals(letra)){
                curve.moveTo(0+x, 70);
                curve.curveTo(15+x, 70, 25+x, 30, 20+x, 30);
                curve.curveTo(40+x, 35, 50+x, 90, 25+x, 67);
                curve.curveTo(35+x, 60, 40+x, 80, 50+x, 70);
                x = x + 50;
            }
            if("t".equals(letra)){
                curve.moveTo(0+x, 70);
                curve.curveTo(25+x, 70, 20+x, 20, 20+x, 0);
                curve.curveTo(20+x, 70, 20+x, 70, 40+x, 70);
                curve.moveTo(8+x, 25);
                curve.lineTo(32+x, 17);
                x = x + 40;
            }
            if("u".equals(letra)){
                curve.moveTo(0+x, 70);
                curve.curveTo(15+x, 75, 15+x, 35, 15+x, 30);
                curve.curveTo(10+x, 83, 45+x, 83, 40+x, 30);
                curve.curveTo(40+x, 35, 40+x, 75, 55+x, 70);
                x = x + 55;
            }
            if("v".equals(letra)){
                curve.moveTo(0+x, 45);
                curve.curveTo(5+x, 30, 10+x, 30, 15+x, 30);
                curve.curveTo(10+x, 83, 45+x, 83, 40+x, 30);
                curve.curveTo(45+x, 35, 49+x, 35, 53+x, 30);
                x = x + 53;
            }
            if("w".equals(letra)){
                curve.moveTo(0+x, 45);
                curve.curveTo(5+x, 30, 10+x, 30, 15+x, 30);
                curve.curveTo(5+x, 83, 40+x, 83, 35+x, 35);
                curve.curveTo(25+x, 83, 60+x, 83, 55+x, 30);
                curve.curveTo(58+x, 35, 60+x, 35, 66+x, 30);
                x = x + 66;
            }
            
            if("x".equals(letra)){
                curve.moveTo(6+x, 70);
                curve.curveTo(30+x, 75, 30+x, 30, 50+x, 30);
                curve.moveTo(0+x, 45);
                curve.curveTo(5+x, 30, 10+x, 30, 15+x, 30);
                curve.curveTo(28+x, 30, 28+x, 80, 56+x, 70);
                x = x + 50;
            }
            if("y".equals(letra)){
                curve.moveTo(0+x, 70);
                curve.curveTo(10+x, 70, 10+x, 30, 10+x, 30);
                curve.curveTo(10+x, 83, 45+x, 83, 40+x, 30);
                curve.curveTo(40+x, 120, 40+x, 125, 20+x, 120);
                curve.curveTo(10+x, 100, 40+x, 80, 50+x, 70);
                x = x + 50;
            }
            if("z".equals(letra)){
                curve.moveTo(0+x, 70);
                curve.curveTo(-5+x, 20, 55+x, 20, 25+x, 70); 
                curve.curveTo(50+x, 120, 40+x, 125, 20+x, 120);
                curve.curveTo(10+x, 100, 30+x, 80, 40+x, 70);
                x = x + 40;
            }
            
            //MAYUSCULAS
            if("R".equals(letra)){
                curve.moveTo(0+x, 70);
                curve.curveTo(20+x, 70, 5+x, 0, 5+x, 10);
                curve.moveTo(-10+x, 10);
                curve.curveTo(50+x, 0, 50+x, 35, 11+x, 40);
                curve.moveTo(11+x, 40);
                curve.curveTo(45+x, 45, 20+x, 70, 45+x, 70);
                x = x + 45;
            }
            if("S".equals(letra)){
                curve.moveTo(0+x, 70);
                curve.curveTo(15+x, 70, 25+x, 30, 20+x, 0);
                curve.curveTo(80+x, 25, 60+x, 90, 30+x, 65);
                curve.curveTo(35+x, 50, 45+x, 80, 70+x, 70);
                x = x + 70;
            }
            if("T".equals(letra)){
                curve.moveTo(25+x, 70);
                curve.curveTo(50+x, 70, 35+x, 0, 35+x, 5);
                curve.moveTo(5+x, 20);
                curve.curveTo(10+x, -10, 50+x, 15, 60+x, 0);
                x = x + 60;
            }
            if("U".equals(letra)){
                curve.moveTo(0+x, 10);
                curve.curveTo(25+x, 0, 0+x, 74, 32+x, 70);
                curve.moveTo(32+x, 70);
                curve.curveTo(50+x, 74, 39+x, 15, 43+x, 10);
                curve.curveTo(43+x, 40, 40+x, 75, 58+x, 70);
                x = x + 58;
            }
            if("V".equals(letra)){
                curve.moveTo(0+x, 25);
                curve.curveTo(0+x, 5, 15+x, 5, 15+x, 10);
                curve.curveTo(10+x, 90, 45+x, 90, 40+x, 10);
                curve.curveTo(45+x, 15, 49+x, 15, 56+x, 10);
                x = x + 56;
            }
            if("W".equals(letra)){
                curve.moveTo(0+x, 25);
                curve.curveTo(0+x, 5, 15+x, 5, 15+x, 10);
                curve.curveTo(10+x, 90, 45+x, 90, 40+x, 10);
                curve.curveTo(35+x, 90, 70+x, 90, 65+x, 10);
                curve.curveTo(50+x, 10, 70+x, 20, 78+x, 10);
                x = x + 78;
            }
            if("X".equals(letra)){
                curve.moveTo(0+x, 70);
                curve.curveTo(30+x, 80, 25+x, 10, 55+x, 10);
                curve.moveTo(0+x, 10);
                curve.curveTo(25+x, 0, 25+x, 80, 55+x, 70);
                x = x + 55;
            }
            if("Y".equals(letra)){
                curve.moveTo(0+x, 10);
                curve.curveTo(25+x, 0, 0+x, 74, 32+x, 70);
                curve.moveTo(32+x, 70);
                curve.curveTo(50+x, 74, 39+x, 15, 43+x, 10);
                curve.curveTo(43+x, 60, 50+x, 140, 28+x, 120);
                curve.curveTo(25+x, 90, 32+x, 80, 55+x, 70);
                x = x + 55;
            }
            if("Z".equals(letra)){
                curve.moveTo(5+x, 20);
                curve.curveTo(10+x, -10, 50+x, 15, 60+x, 0);
                curve.lineTo(5+x, 70);
                curve.moveTo(18+x, 35);
                curve.lineTo(48+x, 35);
                curve.moveTo(5+x, 70);
                curve.curveTo(10+x, 60, 50+x, 75, 60+x, 70);
                x = x + 60;
            }
            
            //SIMBOLOS
            if("-".equals(letra)){
                curve.moveTo(10+x, 50);
                curve.lineTo(30+x, 50);
                x = x + 40;
            }
            if("_".equals(letra)){
                curve.moveTo(10+x, 70);
                curve.lineTo(30+x, 70);
                x = x + 40;
            }
            if("(".equals(letra)){
                curve.moveTo(15+x, 0);
                curve.curveTo(5+x, 0, 5+x, 70, 15+x, 70);
                x = x + 30;
            }
            if(")".equals(letra)){
                curve.moveTo(15+x, 0);
                curve.curveTo(25+x, 0, 25+x, 70, 15+x, 70);
                x = x + 30;
            }
            if("[".equals(letra)){
                curve.moveTo(25+x, 0);
                curve.lineTo(10+x, 0);
                curve.lineTo(10+x, 70);
                curve.lineTo(25+x, 70);
                x = x + 30;
            } 
            if("]".equals(letra)){
                curve.moveTo(10+x, 0);
                curve.lineTo(25+x, 0);
                curve.lineTo(25+x, 70);
                curve.lineTo(10+x, 70);
                x = x + 30;
            }
            
            if("¿".equals(letra)){ //falta punto del signo
                curve.moveTo(25+x, 30);
                curve.lineTo(25+x, 65);
                curve.curveTo(-30+x, 90, 45+x, 140, 45+x, 90);
                x = x + 50;
            }
            
            if("?".equals(letra)){ //falta punto del signo
                curve.moveTo(25+x, 90);
                curve.lineTo(25+x, 65);
                curve.curveTo(90+x, 50, 25+x, -20, 5+x, 30);
                x = x + 50;
            }
            
            if (" ".equals(letra)){//reconoce los espacios para hacer un salto entre letras
                x = x + 50;
            }
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
