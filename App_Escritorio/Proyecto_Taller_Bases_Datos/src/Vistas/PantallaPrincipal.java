/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;
import Modelo.llamarReporte;
import Modelo.Graficos;
import javax.swing.*;

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
        jMenu_eliminarcliente = new javax.swing.JMenuItem();
        jMenu_eliminar_cliente_demo = new javax.swing.JMenuItem();
        jMenu_eliminar_clientes_demograficos = new javax.swing.JMenuItem();
        jMenu_Cambios = new javax.swing.JMenu();
        jMenu_Cambios_Clientes = new javax.swing.JMenuItem();
        jMenu_cambios_clientes_demo = new javax.swing.JMenuItem();
        jMenu_Cambios_clientes_demograficos = new javax.swing.JMenuItem();
        jMenu_Consultas = new javax.swing.JMenu();
        jMenuItem_consultas_clientes = new javax.swing.JMenuItem();
        jMenuItem_demografias_por_cliente = new javax.swing.JMenuItem();
        jMenu_Reporte = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu_Graficos = new javax.swing.JMenu();
        jMenu_grafico = new javax.swing.JMenuItem();

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

        jMenu_cliente_demografico.setText("Demografia");
        jMenu_cliente_demografico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_cliente_demograficoActionPerformed(evt);
            }
        });
        jMenu_Altas.add(jMenu_cliente_demografico);

        jMenuBar1.add(jMenu_Altas);

        jMenu_Bajas.setText("Bajas");

        jMenu_eliminarcliente.setText("Eliminar Cliente");
        jMenu_eliminarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_eliminarclienteActionPerformed(evt);
            }
        });
        jMenu_Bajas.add(jMenu_eliminarcliente);

        jMenu_eliminar_cliente_demo.setText("Eliminar cliente demo");
        jMenu_eliminar_cliente_demo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_eliminar_cliente_demoActionPerformed(evt);
            }
        });
        jMenu_Bajas.add(jMenu_eliminar_cliente_demo);

        jMenu_eliminar_clientes_demograficos.setText("Eliminar Demografias");
        jMenu_eliminar_clientes_demograficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_eliminar_clientes_demograficosActionPerformed(evt);
            }
        });
        jMenu_Bajas.add(jMenu_eliminar_clientes_demograficos);

        jMenuBar1.add(jMenu_Bajas);

        jMenu_Cambios.setText("Cambios");

        jMenu_Cambios_Clientes.setText("Cambios Clientes");
        jMenu_Cambios_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_Cambios_ClientesActionPerformed(evt);
            }
        });
        jMenu_Cambios.add(jMenu_Cambios_Clientes);

        jMenu_cambios_clientes_demo.setText("Cambios clientes demo");
        jMenu_cambios_clientes_demo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_cambios_clientes_demoActionPerformed(evt);
            }
        });
        jMenu_Cambios.add(jMenu_cambios_clientes_demo);

        jMenu_Cambios_clientes_demograficos.setText("Cambios demografias");
        jMenu_Cambios_clientes_demograficos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_Cambios_clientes_demograficosActionPerformed(evt);
            }
        });
        jMenu_Cambios.add(jMenu_Cambios_clientes_demograficos);

        jMenuBar1.add(jMenu_Cambios);

        jMenu_Consultas.setText("Consultas");

        jMenuItem_consultas_clientes.setText("Consultas clientes");
        jMenuItem_consultas_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_consultas_clientesActionPerformed(evt);
            }
        });
        jMenu_Consultas.add(jMenuItem_consultas_clientes);

        jMenuItem_demografias_por_cliente.setText("Consultas demografias");
        jMenuItem_demografias_por_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_demografias_por_clienteActionPerformed(evt);
            }
        });
        jMenu_Consultas.add(jMenuItem_demografias_por_cliente);

        jMenuBar1.add(jMenu_Consultas);

        jMenu_Reporte.setText("Reportes");

        jMenuItem2.setText("Generar reporte de clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu_Reporte.add(jMenuItem2);

        jMenuBar1.add(jMenu_Reporte);

        jMenu_Graficos.setText("Graficos");

        jMenu_grafico.setText("Generar grafica en formato PNG sobre las ciudades");
        jMenu_grafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_graficoActionPerformed(evt);
            }
        });
        jMenu_Graficos.add(jMenu_grafico);

        jMenuBar1.add(jMenu_Graficos);

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
        new Cliente_Demografia_Altas().setVisible(true);
    }//GEN-LAST:event_jMenu_cliente_demograficoActionPerformed

    private void jMenu_Cambios_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_Cambios_ClientesActionPerformed
        new Cambios_clientes().setVisible(true);
    }//GEN-LAST:event_jMenu_Cambios_ClientesActionPerformed

    private void jMenu_cambios_clientes_demoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_cambios_clientes_demoActionPerformed
        new Cambios_cliente_demo().setVisible(true);
    }//GEN-LAST:event_jMenu_cambios_clientes_demoActionPerformed

    private void jMenu_Cambios_clientes_demograficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_Cambios_clientes_demograficosActionPerformed
       new Cambios_clientes_Demograficos().setVisible(true);
    }//GEN-LAST:event_jMenu_Cambios_clientes_demograficosActionPerformed

    private void jMenu_eliminarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_eliminarclienteActionPerformed
        new Bajas_clientes().setVisible(true);
    }//GEN-LAST:event_jMenu_eliminarclienteActionPerformed

    private void jMenu_eliminar_cliente_demoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_eliminar_cliente_demoActionPerformed
        new Bajas_clientes_demo().setVisible(true);
    }//GEN-LAST:event_jMenu_eliminar_cliente_demoActionPerformed

    private void jMenu_eliminar_clientes_demograficosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_eliminar_clientes_demograficosActionPerformed
       new Bajas_demografias().setVisible(true);
    }//GEN-LAST:event_jMenu_eliminar_clientes_demograficosActionPerformed

    private void jMenuItem_consultas_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_consultas_clientesActionPerformed
        new Consultas_clientes().setVisible(true);
    }//GEN-LAST:event_jMenuItem_consultas_clientesActionPerformed

    private void jMenuItem_demografias_por_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_demografias_por_clienteActionPerformed
        new Vista_demografias().setVisible(true);
    }//GEN-LAST:event_jMenuItem_demografias_por_clienteActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       llamarReporte llamado=new llamarReporte();
        llamado.mostrarReporte();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu_graficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_graficoActionPerformed
        Graficos gr=new Graficos();
        if(gr.dibujar()){
            JOptionPane.showMessageDialog(null,"Se genero el grafico y se guardo");
        }else{
            JOptionPane.showMessageDialog(null,"NO se genero el grafico y se guardo");
        }
    }//GEN-LAST:event_jMenu_graficoActionPerformed

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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem_consultas_clientes;
    private javax.swing.JMenuItem jMenuItem_demografias_por_cliente;
    private javax.swing.JMenu jMenu_Altas;
    private javax.swing.JMenu jMenu_Bajas;
    private javax.swing.JMenu jMenu_Cambios;
    private javax.swing.JMenuItem jMenu_Cambios_Clientes;
    private javax.swing.JMenuItem jMenu_Cambios_clientes_demograficos;
    private javax.swing.JMenuItem jMenu_Cliente_demo;
    private javax.swing.JMenu jMenu_Consultas;
    private javax.swing.JMenu jMenu_Graficos;
    private javax.swing.JMenu jMenu_Reporte;
    private javax.swing.JMenuItem jMenu_altasClientes;
    private javax.swing.JMenuItem jMenu_cambios_clientes_demo;
    private javax.swing.JMenuItem jMenu_cliente_demografico;
    private javax.swing.JMenuItem jMenu_eliminar_cliente_demo;
    private javax.swing.JMenuItem jMenu_eliminar_clientes_demograficos;
    private javax.swing.JMenuItem jMenu_eliminarcliente;
    private javax.swing.JMenuItem jMenu_grafico;
    // End of variables declaration//GEN-END:variables

}
