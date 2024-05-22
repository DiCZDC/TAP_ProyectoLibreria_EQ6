/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import Conector.Conexion;

public class VentanaVentas extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.conectar();
    
    public VentanaVentas() {
        initComponents();
        mostrarVentas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaVentas.setName(""); // NOI18N
        tablaVentas.setRequestFocusEnabled(false);
        tablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentasMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tablaVentasMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVentas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaProductos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasMouseClicked
        
        mostrarProductos();
    }//GEN-LAST:event_tablaVentasMouseClicked

    private void tablaVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tablaVentasMouseExited

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
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVentas().setVisible(true);
            }
        });
    }

    private void mostrarVentas(){
        DefaultTableModel modelo = new DefaultTableModel();
        DefaultTableModel modelo2 = new DefaultTableModel();
        
        
        modelo.addColumn("idVenta");
        modelo.addColumn("nombre del cliente");
        modelo.addColumn("fecha de venta");
        modelo.addColumn("correo cliente");
        modelo.addColumn("cajero");
        
        modelo2.addColumn("codigo de barras");
        modelo2.addColumn("titulo");
        modelo2.addColumn("isbn");
        modelo2.addColumn("precio");
        modelo2.addColumn("cantidad");
        modelo2.addColumn("subtotal");
        
        tablaVentas.setModel(modelo);
        tablaProductos.setModel(modelo2);
        String consulta = "SELECT * FROM venta";
        
        String data[] = new String[5];
        Statement st;
        
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            
            while(rs.next()){
                
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(5);
                data[4] = rs.getString(4);
                modelo.addRow(data);
                
            }
            
        } catch (SQLException e) {
            System.out.println("error al conectar la tabla de ventas con la base de datos "+e);
        }
        
    }
    
    public void mostrarProductos(){
        System.out.println("Ventanas.VentanaVentas.mostrarProductos()");
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("codigo de barras");
        modelo.addColumn("titulo");
        modelo.addColumn("isbn");
        modelo.addColumn("precio");
        modelo.addColumn("cantidad");
        modelo.addColumn("subtotal");
        
        
        String idVenta =tablaVentas.getValueAt(tablaVentas.getSelectedRow(),0).toString();
        String consulta = "SELECT * FROM libro JOIN incluir ON libro.codigoBarras = incluir.codigoBarras WHERE incluir.idVenta = ?";
        System.out.println(idVenta);
        tablaProductos.setModel(modelo);
        String data[] = new String[6];
        
        try {
            PreparedStatement ps = cn.prepareStatement(consulta);
            ps.setString(1, idVenta);
            ResultSet rs = ps.executeQuery();
            ResultSet rs2;
            
            while(rs.next()){
                
                data[0] = rs.getString(1);
                data[1] = rs.getString(4);
                data[2] = rs.getString(3);
                data[3] = rs.getString(5);
                
                consulta = "SELECT * FROM incluir WHERE codigoBarras=? && idVenta =?";                
                ps = cn.prepareStatement(consulta);
                ps.setString(1, data[0]);
                ps.setString(2, idVenta);
                System.out.println(data[0]+" "+idVenta);
                rs2 = ps.executeQuery();
                rs2.next();
                
                data[4] = rs2.getString(3);
                data[5] = rs2.getString(4);
                
                modelo.addRow(data);
                
            }
            
            
            
        } catch (SQLException e) {
            System.out.println("error al conectar con la bd "+e);
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables
}
