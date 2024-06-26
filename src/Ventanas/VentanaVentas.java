/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ventanas;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import Modelo.Conexion;
import Modelo.registroFunciones;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentanaVentas extends javax.swing.JDialog {

    Conexion con = new Conexion();
    Connection cn = con.conectar();
    registroFunciones regfun = new registroFunciones();
    boolean seleccionado = false;
    
    public VentanaVentas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mostrarVentas();
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        txtIDventa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(234, 228, 185));

        jPanel2.setBackground(new java.awt.Color(209, 250, 209));
        jPanel2.setOpaque(false);

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(209, 250, 209));
        jPanel1.setOpaque(false);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtIDventa.setForeground(new java.awt.Color(153, 153, 153));
        txtIDventa.setText("Buscar un idVenta");
        txtIDventa.setToolTipText("");
        txtIDventa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDventaMouseClicked(evt);
            }
        });
        txtIDventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDventaActionPerformed(evt);
            }
        });
        txtIDventa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDventaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(txtIDventa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(956, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39))))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(txtIDventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(651, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasMouseClicked
        
        mostrarProductos(tablaVentas.getValueAt(tablaVentas.getSelectedRow(),0).toString());
    }//GEN-LAST:event_tablaVentasMouseClicked

    private void tablaVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tablaVentasMouseExited

    private void txtIDventaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDventaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDventaMouseClicked

    private void txtIDventaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDventaKeyPressed
        if(!seleccionado){
            txtIDventa.setText("");
            txtIDventa.setForeground(Color.black);
            seleccionado = true;
        }
    }//GEN-LAST:event_txtIDventaKeyPressed

    private void txtIDventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDventaActionPerformed
        String consulta ="SELECT * FROM venta WHERE idVenta=?"; 
        try {
            PreparedStatement ps = cn.prepareStatement(consulta);
            ps.setString(1,txtIDventa.getText());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                mostrarProductos(txtIDventa.getText());
            }else{
                JOptionPane.showMessageDialog(null, "no existe ese idVenta");
            }
        } catch (SQLException e) {
            System.out.println("error al conectar con la bd "+e);
        }
        
        
    }//GEN-LAST:event_txtIDventaActionPerformed

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
                VentanaVentas dialog = new VentanaVentas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
            }
        });
    }

    private void mostrarVentas(){
        DefaultTableModel modelo = new DefaultTableModel();
        DefaultTableModel modelo2 = new DefaultTableModel();
        
        String [] cabecera1 = {"IdVenta","Nombre del cliente","Fecha de venta","Correo cliente","Cajero"};
        
        for (String i : cabecera1)
            modelo.addColumn(i);
        
        String[] cabecera2 = {"Codigo de barras","Titulo","ISBN","Precio","Cantidad","Subtotal"};
        
        for (String i : cabecera2)
            modelo2.addColumn(i);
        
        tablaVentas.setModel(modelo);
        tablaProductos.setModel(modelo2);
        
        ArrayList <String[]> dataTabla = regfun.leerDatos("venta", cabecera1.length);
        
        for (String[] i : dataTabla) 
            modelo.addRow(i);
        
        
    }
    
    public void mostrarProductos(String idVenta){
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        String[] cabecera = {"Codigo de barras","Titulo","ISBN","Precio","Cantidad","Subtotal"};
        for (String i : cabecera)
            modelo.addColumn(i);
        
        
        tablaProductos.setModel(modelo);
        String data[] = new String[6];
        
        try {
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM libro JOIN incluir ON libro.codigoBarras = incluir.codigoBarras WHERE incluir.idVenta = ?");
            ps.setString(1, idVenta);
            ResultSet rs = ps.executeQuery();
            ResultSet rs2;
            
            while(rs.next()){
                
                data[0] = rs.getString(1);
                data[1] = rs.getString(4);
                data[2] = rs.getString(3);
                data[3] = rs.getString(5);
                        
                ps = cn.prepareStatement("SELECT * FROM incluir WHERE codigoBarras=? && idVenta =?");
                ps.setString(1, data[0]);
                ps.setString(2, idVenta);
                //System.out.println(data[0]+" "+idVenta);
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTextField txtIDventa;
    // End of variables declaration//GEN-END:variables
}
