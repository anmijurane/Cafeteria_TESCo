/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import static ConexSQL.Conexion.getConeccion;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import poo.Productos;

/**
 *
 * @author Montzerrat Rivera
 */
public class Ad_Productos extends javax.swing.JFrame {

    List cbxProv = new ArrayList();
    List cbxProduct = new ArrayList();
    Productos prodcts = new Productos();
    Connection con = getConeccion();
    PreparedStatement prst;
    ResultSet rslt;

    /**
     * Creates new form Ad_Productos
     */
    public Ad_Productos() {
        initComponents();
        addCbxProv();
    }

    public void addCbxProv() {
        try {

            cbxProveedor.addItem("ELIGE UNA OPCIÓN");

            prst = con.prepareStatement("SELECT nom_prove FROM TBL_Proveedor");
            rslt = prst.executeQuery();
            while (rslt.next()) {
                cbxProv.add(rslt.getString("nom_prove"));
                cbxProveedor.addItem(rslt.getString("nom_prove"));
            }

        } catch (SQLException e) {
            System.out.println("Error en addCbxProv: " + e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtxNuevoProducto = new javax.swing.JTextField();
        cbxProveedor = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jtxtCostoProd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbxProducto = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnNuevoProveedor = new javax.swing.JButton();
        jtxCantBodega = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Producto Existente");

        cbxProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProveedorItemStateChanged(evt);
            }
        });

        jLabel2.setText("Proveedor");

        jLabel4.setText("Costo Unitario");

        cbxProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxProductoItemStateChanged(evt);
            }
        });

        jLabel5.setText("Producto Nuevo");

        btnNuevoProveedor.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnNuevoProveedor.setText("NUEVO PROVEEDOR");
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });

        jLabel6.setText("Cant Llegada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(46, 46, 46)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtxCantBodega, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbxProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jtxNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jtxtCostoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtCostoProd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoProveedor)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxCantBodega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(btnAgregar)
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
        Ad_Inventario acc = new Ad_Inventario();
        acc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    private void cbxProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProveedorItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            int index = cbxProveedor.getSelectedIndex();

            try {
                cbxProduct.clear();
                cbxProducto.removeAllItems();
                cbxProducto.addItem("ELIGE UNA OPCIÓN");
                prst = con.prepareStatement("SELECT nombre_prod FROM TBL_Producto WHERE id_proveedor = ?");
                prst.setInt(1, index);
                rslt = prst.executeQuery();
                while (rslt.next()) {
                    cbxProduct.add(rslt.getString("nombre_prod"));
                    cbxProducto.addItem(rslt.getString("nombre_prod"));
                }

            } catch (SQLException e) {
                System.out.println("Error en cbxProveedorItemStateChanged: " + e);
            }

        }
    }//GEN-LAST:event_cbxProveedorItemStateChanged

    private void cbxProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxProductoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (!(cbxProducto.getSelectedIndex() == 0)) {
                jtxNuevoProducto.setText("");
                jtxNuevoProducto.setEnabled(false);
            } else if (cbxProducto.getSelectedIndex() == 0) {
                jtxNuevoProducto.setEnabled(true);
                jtxNuevoProducto.requestFocus();
            }
        }
    }//GEN-LAST:event_cbxProductoItemStateChanged

    public void ScriptIntert(String query) {

        try {
            con.setAutoCommit(false);
            prst = con.prepareStatement(query);
            prst.executeUpdate();
            int value = JOptionPane.showConfirmDialog(this, "¿CONFIRMAS LOS DATOS? \n"
                    + "PRODUCTO: " + prodcts.getNombreProd()
                    + "\nPRECIO: $" + prodcts.getPrecio()
                    + "\nCANT. BODEGA: " + prodcts.getCantBodega(), "ATENCIÓN", JOptionPane.WARNING_MESSAGE);
            System.out.println("Valor JOption" + value);
            if (value == 0) {
                con.commit();
                JOptionPane.showMessageDialog(this, "Se agrego el producto: " + prodcts.getNombreProd() + " correctamente.");
            } else if (value == 2) {
                JOptionPane.showMessageDialog(this, "No se agrego el producto");
                con.rollback();
            }
        } catch (SQLException e) {
            System.out.println("Error en ScriptIntert: " + e);
        }
    }

    public void ScriptUpdate(String query) {
        try {
            con.setAutoCommit(false);
            prst = con.prepareStatement(query);
            prst.executeUpdate();
            
        } catch (SQLException e) {
        }

    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String script = "null";
        //Producto nuevo
        try {
            if (cbxProducto.getSelectedIndex() == 0) {
                prodcts.setNombreProd(jtxNuevoProducto.getText());
                prodcts.setIdProvedor(cbxProveedor.getSelectedIndex());
                prodcts.setPrecio(new Double(jtxtCostoProd.getText()));
                prodcts.setCantBodega(new Integer(jtxCantBodega.getText()));
                //Producto nuevo Insert
                script = "INSERT INTO TBL_Producto (id_producto, nombre_prod,"
                        + "precio, cant_bodega, id_proveedor) VALUES"
                        + "(" + prodcts.toQuerySQL() + ")";
                ScriptIntert(script);
                Clear();
            } else if (!(cbxProducto.getSelectedIndex() == 0)) {
                prodcts.setNombreProd((String) cbxProducto.getSelectedItem());
                prodcts.setIdProvedor(cbxProveedor.getSelectedIndex());
                prodcts.setPrecio(new Double(jtxtCostoProd.getText()));
                prodcts.setCantBodega(new Integer(jtxCantBodega.getText()));
                //Producto ya activo Update
                script = "UPDATE TBL_Producto SET " + prodcts.toUpdateSQL();

            }

            System.out.println(prodcts.toQuerySQL());
            System.out.println(script);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingresa valores validos");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    public void Clear() {
        jtxCantBodega.setText("");
        jtxNuevoProducto.setText("");
        jtxtCostoProd.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ad_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ad_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ad_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ad_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ad_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnNuevoProveedor;
    private javax.swing.JComboBox<String> cbxProducto;
    private javax.swing.JComboBox<String> cbxProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jtxCantBodega;
    private javax.swing.JTextField jtxNuevoProducto;
    private javax.swing.JTextField jtxtCostoProd;
    // End of variables declaration//GEN-END:variables
}
