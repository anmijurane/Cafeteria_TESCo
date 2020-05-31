package Logica;

/**
 *
 * @author Montzerrat Rivera
 */
public class Rol extends javax.swing.JFrame {

    /**
     * Creates new form Rol
     */
    public Rol() {
        initComponents();
    }       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Admon = new javax.swing.JButton();
        btn_Cajero = new javax.swing.JButton();
        btn_Supervisor = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Admon.setBackground(new java.awt.Color(102, 204, 0));
        btn_Admon.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btn_Admon.setText("ADMINISTRADOR");
        btn_Admon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AdmonActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Admon, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 310, 110));

        btn_Cajero.setBackground(new java.awt.Color(102, 204, 0));
        btn_Cajero.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btn_Cajero.setText("CAJERO");
        btn_Cajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CajeroActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Cajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 310, 110));

        btn_Supervisor.setBackground(new java.awt.Color(102, 204, 0));
        btn_Supervisor.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        btn_Supervisor.setText("SUPERVISOR");
        btn_Supervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SupervisorActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Supervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 310, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/rol.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AdmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AdmonActionPerformed
        SignIn acc = new SignIn("101");
        acc.setVisible(true);
    }//GEN-LAST:event_btn_AdmonActionPerformed

    private void btn_CajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CajeroActionPerformed
        SignIn acc = new SignIn("102");
        acc.setVisible(true);
    }//GEN-LAST:event_btn_CajeroActionPerformed

    private void btn_SupervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SupervisorActionPerformed
        SignIn acc = new SignIn("103");
        acc.setVisible(true);
    }//GEN-LAST:event_btn_SupervisorActionPerformed

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
            java.util.logging.Logger.getLogger(Rol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rol().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Admon;
    private javax.swing.JButton btn_Cajero;
    private javax.swing.JButton btn_Supervisor;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
