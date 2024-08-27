/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import modelo.Cliente;


/**
 *
 * @author Anthony Giron
 */
public class Frm_personas extends javax.swing.JFrame {
    Cliente cliente;
    /**
     * Creates new form frm_personas
     */
    public Frm_personas() {
        initComponents();
        cliente = new Cliente();
        this.tbl_clientes.setModel(cliente.leer());
        
        //tbl_model = new DefaultTableModel();
        //String encabezado [] = {"Nit","Nombres","Apellidos","Direccion","Telefono","FechaNacimiento"};
          //  tbl_model.setColumnIdentifiers(encabezado);
           // tb_clientes.setModel(tbl_model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbpn_clientes = new javax.swing.JTabbedPane();
        pn_clientes = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tbl_nit = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        tbl_nombres = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        tbl_apellidos = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        tbl_direccion = new javax.swing.JLabel();
        tbl_telefono = new javax.swing.JLabel();
        tbl_fdn = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_fn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        btn_modificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();
        pn_empleados = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Leelawadee", 1, 12)); // NOI18N
        jLabel3.setText("Formulario clientes");

        tbl_nit.setText("Nit:");

        txt_nit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_nombres.setText("Nombres:");

        txt_nombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresActionPerformed(evt);
            }
        });

        tbl_apellidos.setText("Apellidos:");

        txt_apellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_direccion.setText("Dirección: ");

        tbl_telefono.setText("Teléfono:");

        tbl_fdn.setText("Fecha Nacimiento:");

        btn_guardar.setText("Guardar");
        btn_guardar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        txt_direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_telefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_fn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientesMouseClicked(evt);
            }
        });
        tbl_clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_clientesKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_clientes);

        btn_modificar.setText("Modificar");
        btn_modificar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        jLabel1.setText("id");

        lbl_id.setText("0");

        btn_eliminar.setText("Eliminar");
        btn_eliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_clientesLayout = new javax.swing.GroupLayout(pn_clientes);
        pn_clientes.setLayout(pn_clientesLayout);
        pn_clientesLayout.setHorizontalGroup(
            pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_clientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE))
            .addGroup(pn_clientesLayout.createSequentialGroup()
                .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_clientesLayout.createSequentialGroup()
                        .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_guardar)
                            .addGroup(pn_clientesLayout.createSequentialGroup()
                                .addComponent(tbl_fdn)
                                .addGap(18, 18, 18)
                                .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar))
                    .addGroup(pn_clientesLayout.createSequentialGroup()
                        .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tbl_nombres)
                            .addComponent(tbl_apellidos)
                            .addComponent(tbl_direccion)
                            .addComponent(tbl_telefono)
                            .addComponent(tbl_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_clientesLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(jLabel3)
                                .addGap(86, 86, 86))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_clientesLayout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pn_clientesLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_clientesLayout.setVerticalGroup(
            pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_clientesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(lbl_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbl_nit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbl_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbl_apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbl_direccion)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbl_fdn)
                    .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(pn_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_eliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbpn_clientes.addTab("Clientes", pn_clientes);

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("Formulario Empleados");

        javax.swing.GroupLayout pn_empleadosLayout = new javax.swing.GroupLayout(pn_empleados);
        pn_empleados.setLayout(pn_empleadosLayout);
        pn_empleadosLayout.setHorizontalGroup(
            pn_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_empleadosLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel4)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        pn_empleadosLayout.setVerticalGroup(
            pn_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_empleadosLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 389, Short.MAX_VALUE))
        );

        tbpn_clientes.addTab("Empleados", pn_empleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpn_clientes, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpn_clientes)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        cliente = new Cliente(0,txt_nit.getText(),txt_nombres.getText(), txt_apellidos.getText(), txt_direccion.getText(),txt_telefono.getText(), txt_fn.getText());
        cliente.crear();
        this.tbl_clientes.setModel(cliente.leer());
// TODO add your handling code here:
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {                                              
//GEN-FIRST:event_btn_modificarActionPerformed
    cliente = new Cliente(Integer.valueOf(lbl_id.getText()),txt_nit.getText(),txt_nombres.getText(), txt_apellidos.getText(), txt_direccion.getText(),txt_telefono.getText(), txt_fn.getText());
        cliente.actualizar();
        this.tbl_clientes.setModel(cliente.leer());
    }//GEN-LAST:event_btn_modificarActionPerformed
   void selec_datos(){
    int fila = tbl_clientes.getSelectedRow();
    lbl_id.setText(tbl_clientes.getValueAt(fila,0).toString());
    txt_nit.setText(tbl_clientes.getValueAt(fila,1).toString());
    txt_nombres.setText(tbl_clientes.getValueAt(fila,2).toString());
    txt_apellidos.setText(tbl_clientes.getValueAt(fila,3).toString());
    txt_direccion.setText(tbl_clientes.getValueAt(fila,4).toString());
    txt_telefono.setText(tbl_clientes.getValueAt(fila,5).toString());
    txt_fn.setText(tbl_clientes.getValueAt(fila,6).toString());
    }
    private void tbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientesMouseClicked
     selec_datos();
    }//GEN-LAST:event_tbl_clientesMouseClicked

    private void tbl_clientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_clientesKeyReleased
        selec_datos();
    }//GEN-LAST:event_tbl_clientesKeyReleased

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        cliente = new Cliente();
        cliente.setId(Integer.valueOf(lbl_id.getText()) );
        cliente.eliminar();
        this.tbl_clientes.setModel(cliente.leer());
    }//GEN-LAST:event_btn_eliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JPanel pn_clientes;
    private javax.swing.JPanel pn_empleados;
    private javax.swing.JLabel tbl_apellidos;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JLabel tbl_direccion;
    private javax.swing.JLabel tbl_fdn;
    private javax.swing.JLabel tbl_nit;
    private javax.swing.JLabel tbl_nombres;
    private javax.swing.JLabel tbl_telefono;
    private javax.swing.JTabbedPane tbpn_clientes;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fn;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
