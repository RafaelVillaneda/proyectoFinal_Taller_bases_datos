/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

/**
 *
 * @author Rafael Villaneda
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    /** Creates new form PantallaPrincipal */
    public PantallaPrincipal() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Altas = new javax.swing.JMenu();
        jMenu_altasClientes = new javax.swing.JMenuItem();
        jMenu_Cliente_demo = new javax.swing.JMenuItem();
        jMenu_cliente_demografico = new javax.swing.JMenuItem();
        jMenu_Bajas = new javax.swing.JMenu();
        jMenu_Cambios = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Visuales/fondo.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 11, 10);
        getContentPane().add(jLabel1, gridBagConstraints);

        jMenu_Altas.setText("Altas");

        jMenu_altasClientes.setText("Altas Clientes");
        jMenu_altasClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_altasClientesActionPerformed(evt);
            }
        });
        jMenu_Altas.add(jMenu_altasClientes);

        jMenu_Cliente_demo.setText("Cliente Demo");
        jMenu_Cliente_demo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_Cliente_demoActionPerformed(evt);
            }
        });
        jMenu_Altas.add(jMenu_Cliente_demo);

        jMenu_cliente_demografico.setText("Cliente demografico");
        jMenu_cliente_demografico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_cliente_demograficoActionPerformed(evt);
            }
        });
        jMenu_Altas.add(jMenu_cliente_demografico);

        jMenuBar1.add(jMenu_Altas);

        jMenu_Bajas.setText("Bajas");
        jMenuBar1.add(jMenu_Bajas);

        jMenu_Cambios.setText("Cambios");
        jMenuBar1.add(jMenu_Cambios);

        jMenu1.setText("Consultas");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu_altasClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_altasClientesActionPerformed
        new Clientes().setVisible(true);
    }//GEN-LAST:event_jMenu_altasClientesActionPerformed

    private void jMenu_Cliente_demoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_Cliente_demoActionPerformed
        new Cliente_demo_Altas().setVisible(true);
    }//GEN-LAST:event_jMenu_Cliente_demoActionPerformed

    private void jMenu_cliente_demograficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_cliente_demograficoActionPerformed
        new Cliente_demo_Altas().setVisible(true);
    }//GEN-LAST:event_jMenu_cliente_demograficoActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenu_Altas;
    private javax.swing.JMenu jMenu_Bajas;
    private javax.swing.JMenu jMenu_Cambios;
    private javax.swing.JMenuItem jMenu_Cliente_demo;
    private javax.swing.JMenuItem jMenu_altasClientes;
    private javax.swing.JMenuItem jMenu_cliente_demografico;
    // End of variables declaration//GEN-END:variables

}
