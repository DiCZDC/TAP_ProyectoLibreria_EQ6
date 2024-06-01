/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ventanas;

import Modelo.Conexion;
import Modelo.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Zaidc
 */
public class VentanaBodega extends javax.swing.JDialog {

    /**
     * Creates new form VentanaBodega
     */
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    registroFunciones regfun = new registroFunciones();
    int idActAlm = 0;
    
    public VentanaBodega(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        inicbo();
    }
    public void inicbo(){
        ArrayList<String> cboGenerator = regfun.cboArray("libro", 1);
        for(String i: cboGenerator)
            cboBarcode.addItem(i);
        
        cboGenerator = regfun.cboArray("almacen", 2);
        for(String i: cboGenerator)
            cboAlmacen.addItem(i);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDatos = new javax.swing.JPanel();
        cboBarcode = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cboAlmacen = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jsCantidad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        btnEntrada = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        panelInfo = new Modelo.panelInfoLibro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(180, 211, 178));
        setName("JFProductos"); // NOI18N

        panelDatos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder("Movimiento de Libros"));

        cboBarcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cboBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboBarcodeActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo de barras:");

        cboAlmacen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel2.setText("Dirección del almacen:");

        jLabel3.setText("Cantidad");

        btnEntrada.setText("Entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnSalida.setText("Salida");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEntrada, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(btnSalida)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cboAlmacen, 0, 245, Short.MAX_VALUE)
                    .addComponent(cboBarcode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jsCantidad))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboAlmacen)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jsCantidad)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalida)
                    .addComponent(btnEntrada))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelInfo.setBackground(new java.awt.Color(255, 196, 167));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboBarcodeActionPerformed
        panelInfo.setCodigoBarras(cboBarcode.getSelectedItem().toString());
        panelInfo.actualizaDatos();
    }//GEN-LAST:event_cboBarcodeActionPerformed
    private boolean salidaValida(int sal){
        int lim = 0;
        
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM almacen WHERE direccion=?");
            ps.setString(1, cboAlmacen.getSelectedItem().toString());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                idActAlm = rs.getInt(1);
            
            ps = cn.prepareStatement("SELECT * FROM sistemalibreria.almacenar WHERE codigoBarras=? AND idAlmacen=?");
            ps.setLong(1, Long.parseLong(cboBarcode.getSelectedItem().toString()));
            ps.setInt(2, idActAlm);
            rs= ps.executeQuery();
            if(rs.next())
                lim = Integer.parseInt(rs.getString(3));
            
        } catch (SQLException ex) {
            Logger.getLogger(VentanaBodega.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lim>=sal && sal >0;
    }
    
    private void salidaBodega(){
        int salen = Integer.parseInt(jsCantidad.getValue().toString());
        
        if(!salidaValida(salen)){
            JOptionPane.showMessageDialog(null, "INGRESE DATOS VALIDOS");
            return;
        }
        try {
            //MODIFICAR EN ALMACEN
            PreparedStatement ps = cn.prepareStatement("UPDATE almacenar SET existencia=existencia-? WHERE codigoBarras=? AND idalmacen=?");
                ps.setInt(1, Integer.parseInt(jsCantidad.getValue().toString()));
                ps.setLong(2, Long.parseLong(cboBarcode.getSelectedItem().toString()));
                ps.setInt(3, idActAlm);
            ps.executeUpdate();
            
            //ACTUALIZAR DISPONIBILIDAD EN TIENDA
            
            ps = cn.prepareStatement("UPDATE libro SET existencia_tienda=existencia_tienda+? WHERE codigoBarras=?");
                ps.setInt(1, Integer.parseInt(jsCantidad.getValue().toString()));
                ps.setLong(2, Long.parseLong(cboBarcode.getSelectedItem().toString()));
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(VentanaBodega.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void entradaBodega(){
        
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM almacen WHERE direccion=?");
            ps.setString(1, cboAlmacen.getSelectedItem().toString());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                idActAlm = rs.getInt(1);
            
            ps = cn.prepareStatement("INSERT INTO almacenar (codigoBarras, idalmacen, existencia) VALUES(?,?,?) ON DUPLICATE KEY UPDATE existencia = existencia+?");
            ps.setLong(1, Long.parseLong(cboBarcode.getSelectedItem().toString()));
            ps.setInt(2, idActAlm);
            ps.setInt(3, Integer.parseInt(jsCantidad.getValue().toString()));
            ps.setInt(4, Integer.parseInt(jsCantidad.getValue().toString()));
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(VentanaBodega.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void limpiarCampos(){
        cboAlmacen.setSelectedIndex(0);
        cboBarcode.setSelectedIndex(0);
        jsCantidad.setValue(0);
    }
    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaActionPerformed
        entradaBodega();
        limpiarCampos();
    }//GEN-LAST:event_btnEntradaActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        salidaBodega();
        limpiarCampos();
    }//GEN-LAST:event_btnSalidaActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaBodega.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaBodega dialog = new VentanaBodega(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnSalida;
    private javax.swing.JComboBox<String> cboAlmacen;
    private javax.swing.JComboBox<String> cboBarcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSpinner jsCantidad;
    private javax.swing.JPanel panelDatos;
    private Modelo.panelInfoLibro panelInfo;
    // End of variables declaration//GEN-END:variables
}
