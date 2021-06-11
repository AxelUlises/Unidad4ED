/**
 *
 * @author axelulises
 */
public class Ventana extends javax.swing.JFrame {
    
    Grafo g;
    
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("U4. Práctica 1");
        setResizable(false);
        g = new Grafo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblDato = new javax.swing.JLabel();
        txtDato = new javax.swing.JTextField();
        btnAgregarVértice = new javax.swing.JButton();
        btnEliminarVértice = new javax.swing.JButton();
        lblOrigen = new javax.swing.JLabel();
        comboOrigen = new javax.swing.JComboBox<>();
        lblDestino = new javax.swing.JLabel();
        comboDestino = new javax.swing.JComboBox<>();
        lblVértices = new javax.swing.JLabel();
        comboVértices = new javax.swing.JComboBox<>();
        btnAgregarArista = new javax.swing.JButton();
        btnEliminarArista = new javax.swing.JButton();
        lblValidarCamino = new javax.swing.JLabel();
        btnValidarCamino = new javax.swing.JButton();
        txtValidarCamino = new javax.swing.JTextField();
        lblAristas = new javax.swing.JLabel();
        lblValidarCamino1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultados = new javax.swing.JTextArea();
        lblGenerar = new javax.swing.JLabel();
        btnMatrizAdyacencia = new javax.swing.JButton();
        btnListaAdyacencia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 153, 51));
        lblTitulo.setText("Aplicación sobre GRAFOS");

        lblDato.setFont(new java.awt.Font("Lucida Grande", 2, 19)); // NOI18N
        lblDato.setText("Dato");

        txtDato.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        btnAgregarVértice.setText("Agregar Vértice");
        btnAgregarVértice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarVérticeActionPerformed(evt);
            }
        });

        btnEliminarVértice.setText("Eliminar Vértice");
        btnEliminarVértice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVérticeActionPerformed(evt);
            }
        });

        lblOrigen.setFont(new java.awt.Font("Lucida Grande", 2, 19)); // NOI18N
        lblOrigen.setText("De");

        lblDestino.setFont(new java.awt.Font("Lucida Grande", 2, 19)); // NOI18N
        lblDestino.setText("A");

        lblVértices.setFont(new java.awt.Font("Lucida Grande", 2, 19)); // NOI18N
        lblVértices.setText("Vértices");

        btnAgregarArista.setText("Agregar Arista");
        btnAgregarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAristaActionPerformed(evt);
            }
        });

        btnEliminarArista.setText("Eliminar Arista");
        btnEliminarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAristaActionPerformed(evt);
            }
        });

        lblValidarCamino.setFont(new java.awt.Font("Lucida Grande", 2, 19)); // NOI18N
        lblValidarCamino.setText("Validar camino");

        btnValidarCamino.setText("Validar Camino");
        btnValidarCamino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidarCaminoActionPerformed(evt);
            }
        });

        txtValidarCamino.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        lblAristas.setFont(new java.awt.Font("Lucida Grande", 2, 19)); // NOI18N
        lblAristas.setText("Aristas");

        lblValidarCamino1.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        lblValidarCamino1.setForeground(new java.awt.Color(204, 0, 0));
        lblValidarCamino1.setText("Ejemplo \" Vértice1, Vértice2, N\"");

        txtResultados.setColumns(20);
        txtResultados.setFont(new java.awt.Font("Lucida Grande", 2, 14)); // NOI18N
        txtResultados.setRows(5);
        jScrollPane1.setViewportView(txtResultados);

        lblGenerar.setFont(new java.awt.Font("Lucida Grande", 2, 19)); // NOI18N
        lblGenerar.setText("Generar");

        btnMatrizAdyacencia.setText("Matriz Adyacencia");
        btnMatrizAdyacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizAdyacenciaActionPerformed(evt);
            }
        });

        btnListaAdyacencia.setText("Lista Adyacencia");
        btnListaAdyacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaAdyacenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblDato)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblOrigen)
                                        .addGap(67, 67, 67)
                                        .addComponent(comboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblVértices)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboVértices, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(btnAgregarArista)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarVértice)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnEliminarArista)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblDestino)
                                        .addGap(18, 18, 18)
                                        .addComponent(comboDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnEliminarVértice))))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnValidarCamino)
                                    .addComponent(lblValidarCamino))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtValidarCamino)
                                    .addComponent(lblValidarCamino1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAristas)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblGenerar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMatrizAdyacencia)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnListaAdyacencia)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDato)
                    .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarVértice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVértices)
                    .addComponent(comboVértices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarVértice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrigen)
                    .addComponent(comboOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDestino)
                    .addComponent(comboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarArista)
                    .addComponent(btnAgregarArista)
                    .addComponent(lblAristas))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValidarCamino)
                    .addComponent(txtValidarCamino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValidarCamino)
                    .addComponent(lblValidarCamino1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMatrizAdyacencia)
                    .addComponent(lblGenerar)
                    .addComponent(btnListaAdyacencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarVérticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarVérticeActionPerformed
        char d =  txtDato.getText().toUpperCase().charAt(0);
        String mensaje = "¡SE INSERTÓ CORRECTAMENTE EL DATO (" + d + ")!";
        if(g.insertarVértice(d)){
            comboOrigen.addItem(d);
            comboDestino.addItem(d);
            comboVértices.addItem(d);
            txtResultados.setText(mensaje);
        }
        txtDato.setText("");
    }//GEN-LAST:event_btnAgregarVérticeActionPerformed

    private void btnEliminarVérticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVérticeActionPerformed
        char d =  (char)comboVértices.getSelectedItem();
        String mensaje = "¡SE ELIMINÓ CORRECTAMENTE EL VÉRTICE (" + d + ")!";
        if(g.eliminarVértice(d)){
            comboVértices.removeItem(d);
            comboOrigen.removeItem(d);
            comboDestino.removeItem(d);
            txtResultados.setText(mensaje);
            return;
        }
        mensaje = "¡NO SE PUDO ELIIMINAR, AÚN CUENTA CON VÉRTICES!";
    }//GEN-LAST:event_btnEliminarVérticeActionPerformed

    private void btnAgregarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAristaActionPerformed
        String mensaje = "¡SE AGREGÓ CORRECTAMENTE LA ARISTA!";
        g.insertarAristas((char)comboOrigen.getSelectedItem(),
                (char)comboDestino.getSelectedItem());
        txtResultados.setText(mensaje);
    }//GEN-LAST:event_btnAgregarAristaActionPerformed

    private void btnEliminarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAristaActionPerformed
        String mensaje = "¡SE ELIMINÓ CORRECTAMENTE LA ARISTA!";
        g.eliminarArista((char)comboOrigen.getSelectedItem(),
                (char)comboDestino.getSelectedItem());
        txtResultados.setText(mensaje);
    }//GEN-LAST:event_btnEliminarAristaActionPerformed

    private void btnValidarCaminoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidarCaminoActionPerformed
        String c = txtValidarCamino.getText().trim();
        if(c.equals("")){
            txtResultados.setText("¡ESCRIBA LOS VÉRTICES PARA VALIDAR "
                    + "EL \nCAMINO! EJEMPLO: Vertice1, vertice2, verticeN");
            return;
        }
        if(c.matches("^\\S[A-z0-9]?[,]?([A-z0-9][,])*[A-z0-9]?$")){
            String t = txtValidarCamino.getText().trim().toUpperCase().replaceAll(",", "");
            txtResultados.setText(g.validarCamino(t.toCharArray()));
        }
        txtValidarCamino.setText("");
    }//GEN-LAST:event_btnValidarCaminoActionPerformed

    private void btnMatrizAdyacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizAdyacenciaActionPerformed
       boolean matriz[][] = g.matrizDeAdyacencia();
       String r = "   ";
       for(int i = 0; i < comboVértices.getItemCount(); i++){
           r += comboVértices.getItemAt(i) + " ";
       }
       for(int i = 0; i < comboVértices.getItemCount(); i++){
           r += "\n" + comboVértices.getItemAt(i) + " ";
           for (int j = 0; j < comboVértices.getItemCount(); j++) {
                r += matriz[i][j] ? "1 " : "0 ";
            }
       }
       txtResultados.setText(r);
    }//GEN-LAST:event_btnMatrizAdyacenciaActionPerformed

    private void btnListaAdyacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaAdyacenciaActionPerformed
        if(comboVértices.getItemCount() > 0)
            txtResultados.setText(g.listaDeAdyacencia((char)
                    comboVértices.getSelectedItem()));
    }//GEN-LAST:event_btnListaAdyacenciaActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarArista;
    private javax.swing.JButton btnAgregarVértice;
    private javax.swing.JButton btnEliminarArista;
    private javax.swing.JButton btnEliminarVértice;
    private javax.swing.JButton btnListaAdyacencia;
    private javax.swing.JButton btnMatrizAdyacencia;
    private javax.swing.JButton btnValidarCamino;
    private javax.swing.JComboBox<Character> comboDestino;
    private javax.swing.JComboBox<Character> comboOrigen;
    private javax.swing.JComboBox<Character> comboVértices;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAristas;
    private javax.swing.JLabel lblDato;
    private javax.swing.JLabel lblDestino;
    private javax.swing.JLabel lblGenerar;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValidarCamino;
    private javax.swing.JLabel lblValidarCamino1;
    private javax.swing.JLabel lblVértices;
    private javax.swing.JTextField txtDato;
    private javax.swing.JTextArea txtResultados;
    private javax.swing.JTextField txtValidarCamino;
    // End of variables declaration//GEN-END:variables
}
