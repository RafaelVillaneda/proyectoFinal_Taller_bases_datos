/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import Controlador.Cliente_DAO;
import Modelo.Cliente;
import java.awt.Component;
import javax.swing.*;

/**
 *
 * @author Rafael Villaneda
 */
public class Bajas_clientes extends javax.swing.JFrame {
    Cliente cli=new Cliente();
    int fila=-1;
    /** Creates new form Bajas_clientes */
    public Bajas_clientes() {
        initComponents();
        actualizarTabla("SELECT * FROM customers");
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

        jLabel2 = new javax.swing.JLabel();
        caja_nombre_contacto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        caja_Nombre_compañia1 = new javax.swing.JTextField();
        caja_titulo_contacto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        caja_direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        caja_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        caja_ciudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        caja_region = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        caja_codigo_postal = new javax.swing.JTextField();
        caja_pais = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        caja_telefono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        caja_fax = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btn_eliminar_registro = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel2.setText("Nombre de la compañia:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 23, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        caja_nombre_contacto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_nombre_contactoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 28, 0, 0);
        getContentPane().add(caja_nombre_contacto, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel3.setText("Nombre de contacto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 25, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        caja_Nombre_compañia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_Nombre_compañia1KeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 28, 0, 0);
        getContentPane().add(caja_Nombre_compañia1, gridBagConstraints);

        caja_titulo_contacto.setEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 28, 0, 0);
        getContentPane().add(caja_titulo_contacto, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel4.setText("Titulo de contacto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 25, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel5.setText("Dirección: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 25, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);

        caja_direccion.setEnabled(false);
        caja_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_direccionKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 0, 0);
        getContentPane().add(caja_direccion, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel6.setText("Indentificador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 23, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        caja_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                caja_idKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_idKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 28, 0, 0);
        getContentPane().add(caja_id, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel7.setText("Ciudad: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 25, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        caja_ciudad.setEnabled(false);
        caja_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_ciudadActionPerformed(evt);
            }
        });
        caja_ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_ciudadKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 28, 0, 0);
        getContentPane().add(caja_ciudad, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel8.setText("Region: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 25, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);

        caja_region.setEnabled(false);
        caja_region.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_regionActionPerformed(evt);
            }
        });
        caja_region.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_regionKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 28, 0, 0);
        getContentPane().add(caja_region, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel9.setText("Codigo postal: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 25, 0, 0);
        getContentPane().add(jLabel9, gridBagConstraints);

        caja_codigo_postal.setEnabled(false);
        caja_codigo_postal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_codigo_postalActionPerformed(evt);
            }
        });
        caja_codigo_postal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_codigo_postalKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 28, 0, 0);
        getContentPane().add(caja_codigo_postal, gridBagConstraints);

        caja_pais.setEnabled(false);
        caja_pais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_paisActionPerformed(evt);
            }
        });
        caja_pais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_paisKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 26, 0, 0);
        getContentPane().add(caja_pais, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel10.setText("Pais: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 23, 0, 0);
        getContentPane().add(jLabel10, gridBagConstraints);

        caja_telefono.setEnabled(false);
        caja_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_telefonoActionPerformed(evt);
            }
        });
        caja_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_telefonoKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 26, 0, 0);
        getContentPane().add(caja_telefono, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel11.setText("Telefono: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 25;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 24, 0, 0);
        getContentPane().add(jLabel11, gridBagConstraints);

        caja_fax.setEnabled(false);
        caja_fax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caja_faxActionPerformed(evt);
            }
        });
        caja_fax.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caja_faxKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 12;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 26, 0, 0);
        getContentPane().add(caja_fax, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 2, 14)); // NOI18N
        jLabel12.setText("Fax: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 24, 0, 0);
        getContentPane().add(jLabel12, gridBagConstraints);

        btn_eliminar_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Visuales/borrar_registro.png"))); // NOI18N
        btn_eliminar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminar_registroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = 106;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 8, 0, 0);
        getContentPane().add(btn_eliminar_registro, gridBagConstraints);

        btn_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Visuales/Limpiar.png"))); // NOI18N
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridheight = 5;
        gridBagConstraints.ipadx = 90;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(22, 8, 0, 0);
        getContentPane().add(btn_Limpiar, gridBagConstraints);

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Visuales/salir.png"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 23;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 92;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 6, 0, 0);
        getContentPane().add(btn_salir, gridBagConstraints);

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Visuales/icono_tabla.png"))); // NOI18N
        btn_buscar.setText("Restablecer Tabla");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 8, 0, 0);
        getContentPane().add(btn_buscar, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Visuales/Modificar_Usuario.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 23, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 28;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 465;
        gridBagConstraints.ipady = 555;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caja_nombre_contactoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_nombre_contactoKeyTyped
        char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isSpaceChar(car)){}else{
            evt.consume();
        }
        String agregado=caja_nombre_contacto.getText();
        actualizarTabla("SELECT * FROM customers WHERE  ContactName LIKE '%"+agregado+"%'");
        
    }//GEN-LAST:event_caja_nombre_contactoKeyTyped

    private void caja_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_direccionKeyTyped
        char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isSpaceChar(car) || Character.isDigit(car)){}else{
            evt.consume();
        }
    }//GEN-LAST:event_caja_direccionKeyTyped

    private void caja_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja_ciudadActionPerformed

    private void caja_ciudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_ciudadKeyTyped
        char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isSpaceChar(car) || car=='.'){}else{
            evt.consume();
        }
    }//GEN-LAST:event_caja_ciudadKeyTyped

    private void caja_regionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_regionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja_regionActionPerformed

    private void caja_regionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_regionKeyTyped
        char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isSpaceChar(car)){}else{
            evt.consume();
        }
    }//GEN-LAST:event_caja_regionKeyTyped

    private void caja_codigo_postalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_codigo_postalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja_codigo_postalActionPerformed

    private void caja_codigo_postalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_codigo_postalKeyTyped
        char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isSpaceChar(car) || Character.isDigit(car)){}else{
            evt.consume();
        }
    }//GEN-LAST:event_caja_codigo_postalKeyTyped

    private void caja_paisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_paisActionPerformed
        
    }//GEN-LAST:event_caja_paisActionPerformed

    private void caja_paisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_paisKeyTyped
        char car = evt.getKeyChar();
        if(Character.isLetter(car) || Character.isSpaceChar(car)){}else{
            evt.consume();
        }
    }//GEN-LAST:event_caja_paisKeyTyped

    private void caja_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja_telefonoActionPerformed

    private void caja_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_telefonoKeyTyped
        char car = evt.getKeyChar();
        if(Character.isDigit(car) || car=='-' || car=='(' || car==')'){}else{
            evt.consume();
        }
    }//GEN-LAST:event_caja_telefonoKeyTyped

    private void caja_faxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caja_faxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caja_faxActionPerformed

    private void caja_faxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_faxKeyTyped
        char car = evt.getKeyChar();
        if(Character.isDigit(car) || car=='-' || car=='(' || car==')'){}else{
            evt.consume();
        }
    }//GEN-LAST:event_caja_faxKeyTyped

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        caja_id.setText("");
        caja_Nombre_compañia1.setText("");
        caja_nombre_contacto.setText("");
        caja_titulo_contacto.setText("");
        caja_direccion.setText("");
        caja_ciudad.setText("");
        caja_region.setText("");
        caja_codigo_postal.setText("");
        caja_pais.setText("");
        caja_telefono.setText("");
        caja_fax.setText("");
         actualizarTabla("SELECT * FROM customers");
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        actualizarTabla("SELECT * FROM Customers");
        /*
        cli=new Cliente();
        Cliente_DAO DAO=new Cliente_DAO();
        
        if(!caja_id.getText().isEmpty()){
        cli=DAO.buscar(caja_id.getText());
        }
        
        if(cli!=null && !caja_id.getText().isEmpty() ){
        caja_Nombre_compañia1.setText(cli.getNombre_compañia());
        caja_nombre_contacto.setText(cli.getNombre_contacto());
        caja_titulo_contacto.setText(cli.getTitulo_contacto());
        caja_direccion.setText(cli.getDireccion());
        caja_ciudad.setText(cli.getCiudad());
        caja_region.setText(cli.getRegion());
        caja_codigo_postal.setText(cli.getCodigo_postal());
        caja_pais.setText(cli.getPais());
        caja_telefono.setText(cli.getTelefono());
        caja_fax.setText(cli.getTelefono());
        }else{
            JOptionPane.showMessageDialog(null,"No existe un cliente con ese indentificador");
        }       
        */
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_eliminar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminar_registroActionPerformed
        if(!caja_id.getText().isEmpty()){
            cli.setId(caja_id.getText().toString());
            
            Cliente_DAO DAO=new Cliente_DAO();
            boolean eliminado=DAO.borrarRegistro(cli);
            if(eliminado){
                JOptionPane.showMessageDialog(null,"Registro eliminado satisfactoriamente");
                caja_id.setText("");
        caja_Nombre_compañia1.setText("");
        caja_nombre_contacto.setText("");
        caja_titulo_contacto.setText("");
        caja_direccion.setText("");
        caja_ciudad.setText("");
        caja_region.setText("");
        caja_codigo_postal.setText("");
        caja_pais.setText("");
        caja_telefono.setText("");
        caja_fax.setText("");
            }else{
                JOptionPane.showMessageDialog(null,"El registro  no pudo ser eliminado satisfactoriamente");
            }
        }else{
            JOptionPane.showMessageDialog(null,"No Puede estar vacia la caja del indentificador");
        }
    }//GEN-LAST:event_btn_eliminar_registroActionPerformed

    private void caja_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_idKeyTyped
        
    }//GEN-LAST:event_caja_idKeyTyped

    private void caja_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_idKeyReleased
        char car = evt.getKeyChar();
	if(Character.isLetter(car) || Character.isDigit(car)){}else{
	evt.consume();
        }
        String agregado=caja_id.getText();
        actualizarTabla("SELECT * FROM customers WHERE CustomerID LIKE '%"+agregado+"%'");
    }//GEN-LAST:event_caja_idKeyReleased

    private void caja_Nombre_compañia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caja_Nombre_compañia1KeyTyped
        char car = evt.getKeyChar();
	if(Character.isLetter(car) || Character.isDigit(car)){}else{
	evt.consume();
        }
        String agregado=caja_Nombre_compañia1.getText();
        actualizarTabla("SELECT * FROM customers WHERE  CompanyName LIKE '%"+agregado+"%'");
    }//GEN-LAST:event_caja_Nombre_compañia1KeyTyped

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyTyped

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        fila = tabla.getSelectedRow();
        Object address;
        Object city;
        Object region;
        Object postalCode;
        Object country;
        Object phone;
        Object fax;
        
        caja_id.setText(tabla.getModel().getValueAt(fila,0).toString());
        caja_Nombre_compañia1.setText(tabla.getModel().getValueAt(fila,1).toString());
        caja_nombre_contacto.setText(tabla.getModel().getValueAt(fila,2).toString());
        caja_titulo_contacto.setText(tabla.getModel().getValueAt(fila,3).toString());
        
        address = tabla.getModel().getValueAt(fila, 4);
        city = tabla.getModel().getValueAt(fila, 5);
        region = tabla.getModel().getValueAt(fila, 6);
        postalCode = tabla.getModel().getValueAt(fila, 7);
        country = tabla.getModel().getValueAt(fila, 8);
        phone = tabla.getModel().getValueAt(fila, 9);
        fax = tabla.getModel().getValueAt(fila, 10);
        
        if(city==null){
            address="";
        }else{
            address=address.toString();
        }
        
        if(city==null){
            city="";
        }else{
            city=city.toString();
        }
        
        if(region==null){
            region="";
        }else{
            region=region.toString();
        }
        
        if(postalCode==null){
            postalCode="";
        }else{
            postalCode=postalCode.toString();
        }
        
        if(country==null){
            country="";
        }else{
            country=country.toString();
        }
        
        if(phone==null){
            phone="";
        }else{
            phone=phone.toString();
        }
        
        if(fax==null){
            fax="";
        }else{
            fax=fax.toString();
        }
        
        caja_direccion.setText((String)address);
        caja_ciudad.setText((String)city);
        caja_region.setText((String)region);
        caja_codigo_postal.setText((String)postalCode);
        caja_pais.setText((String)country);
        caja_telefono.setText((String)phone);
        caja_fax.setText((String)fax);
    }//GEN-LAST:event_tablaMouseClicked
        public void actualizarTabla(String consulta) {

	String url="jdbc:mysql://localhost:3306/northwind";
	String controlador="com.mysql.cj.jdbc.Driver";
	ResultSetTableModel modeloDatos=null;
	try {
	modeloDatos=new ResultSetTableModel(controlador, url,consulta);
	}catch (ClassNotFoundException e) {
	e.printStackTrace();
	}catch (Exception e) {
	e.printStackTrace();
	}
	tabla.setModel(modeloDatos);
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
            java.util.logging.Logger.getLogger(Bajas_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bajas_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bajas_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bajas_clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bajas_clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar_registro;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField caja_Nombre_compañia1;
    private javax.swing.JTextField caja_ciudad;
    private javax.swing.JTextField caja_codigo_postal;
    private javax.swing.JTextField caja_direccion;
    private javax.swing.JTextField caja_fax;
    private javax.swing.JTextField caja_id;
    private javax.swing.JTextField caja_nombre_contacto;
    private javax.swing.JTextField caja_pais;
    private javax.swing.JTextField caja_region;
    private javax.swing.JTextField caja_telefono;
    private javax.swing.JTextField caja_titulo_contacto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
