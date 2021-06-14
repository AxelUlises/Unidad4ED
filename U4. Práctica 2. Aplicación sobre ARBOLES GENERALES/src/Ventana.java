/**
 *
 * @author axelulises
 */
public class Ventana extends javax.swing.JFrame {

    ÁrbolGeneral a;
    
    public Ventana() {
        initComponents();
        a = new ÁrbolGeneral();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("U4. Práctica 2");
        lblMensaje.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblDato = new javax.swing.JLabel();
        txtDato = new javax.swing.JTextField();
        lblPath = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 153, 0));
        lblTitulo.setText("Aplicación sobre ÁRBOLES GENERALES");

        lblDato.setFont(new java.awt.Font("Lucida Grande", 2, 19)); // NOI18N
        lblDato.setText("Dato");

        txtDato.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        lblPath.setFont(new java.awt.Font("Lucida Grande", 2, 19)); // NOI18N
        lblPath.setText("Path");

        txtPath.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblMensaje.setFont(new java.awt.Font("Lucida Grande", 2, 17)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(204, 0, 0));
        lblMensaje.setText("Mensaje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDato)
                                .addGap(36, 36, 36)
                                .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPath)
                                .addGap(18, 18, 18)
                                .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDato)
                    .addComponent(txtDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPath)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(lblMensaje)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        char d = txtDato.getText().toUpperCase().charAt(0);
        String mensaje = "SE INSERTÓ CORRECTAMENTE (" + d + ")";
        if(a.insertar(txtDato.getText().toUpperCase().charAt(0), 
                txtPath.getText().toUpperCase().trim())){
            lblMensaje.setText(mensaje);
            return;
        }
        lblMensaje.setText("¡NO SE PUDO INSERTAR!");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String mensaje = "¡SE ENCONTRÓ EL NODO CORRECTAMENTE!";
        if(a.buscarNodoRecursivo(txtPath.getText().toUpperCase().trim()) != null){
            lblMensaje.setText(mensaje);
            return;
        }
        lblMensaje.setText("¡NO SE PUDO ENCONTRAR EL NODO!");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        char d = txtDato.getText().toUpperCase().charAt(0);
        String mensaje = "SE ELIMINÓ CORRECTAMENTE (" + d + ")";
        if(a.eliminar(txtDato.getText().toUpperCase())){
            lblMensaje.setText(mensaje);
            return;
        }
        lblMensaje.setText("¡NO SE PUDO ELIMINAR!");
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel lblDato;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblPath;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDato;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables
}
