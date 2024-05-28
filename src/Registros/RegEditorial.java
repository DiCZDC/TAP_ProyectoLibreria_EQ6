/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Registros;

import Conector.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

    
public class RegEditorial extends javax.swing.JDialog {
    Conexion con = new Conexion();
    Connection cn = con.conectar();
    private int fila = 0;
    
    public RegEditorial(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mostrarDatos();
    }
    private void mostrarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        String [] cabeceras = {"ID","Nombre","Telefono","URL","Email","Dirección"};
        
        for(int i = 0; i < cabeceras.length; i++)
            modelo.addColumn(cabeceras[i]);
        
        JTEditorial.setModel(modelo);
        String consulta = "SELECT * FROM editorial";
        String data[] = new String[cabeceras.length];
        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                for(int i = 0; i < data.length; i++)
                    data[i] = rs.getString(i+1);
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar los datos de la BD");
        }
    }
    public void limpiarCampos(){
        txtDireccion.setText("");
        txtEmail.setText("");
        txtNombre.setText("");
        txtPagWeb.setText("");
        txtTelefono.setText("");
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTEditorial = new javax.swing.JTable();
        panelEditorial = new javax.swing.JPanel();
        panelEmail = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextArea();
        panelPweb = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPagWeb = new javax.swing.JTextArea();
        panelDireccion = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextArea();
        panelTelefono = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextArea();
        panelNombre = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bgPanel.setBackground(new java.awt.Color(234, 228, 185));
        bgPanel.setLayout(new java.awt.GridLayout(1, 3));

        panelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de editoriales"));
        panelTabla.setOpaque(false);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        JTEditorial.setBackground(new java.awt.Color(241, 240, 226));
        JTEditorial.setModel(new javax.swing.table.DefaultTableModel(
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
        JTEditorial.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTEditorial.setOpaque(false);
        JTEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTEditorialMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTEditorial);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 393, Short.MAX_VALUE)
            .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
            .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
        );

        bgPanel.add(panelTabla);

        panelEditorial.setBorder(javax.swing.BorderFactory.createTitledBorder("Introduzca la información de la editorial"));
        panelEditorial.setOpaque(false);

        panelEmail.setOpaque(false);

        jLabel5.setText("E-mail");

        txtEmail.setColumns(20);
        txtEmail.setRows(5);

        javax.swing.GroupLayout panelEmailLayout = new javax.swing.GroupLayout(panelEmail);
        panelEmail.setLayout(panelEmailLayout);
        panelEmailLayout.setHorizontalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );
        panelEmailLayout.setVerticalGroup(
            panelEmailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPweb.setOpaque(false);

        jLabel4.setText("Pagina web");

        txtPagWeb.setColumns(20);
        txtPagWeb.setRows(5);

        javax.swing.GroupLayout panelPwebLayout = new javax.swing.GroupLayout(panelPweb);
        panelPweb.setLayout(panelPwebLayout);
        panelPwebLayout.setHorizontalGroup(
            panelPwebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtPagWeb, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );
        panelPwebLayout.setVerticalGroup(
            panelPwebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPwebLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPagWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelDireccion.setOpaque(false);

        jLabel3.setText("Dirección");

        txtDireccion.setColumns(20);
        txtDireccion.setRows(5);

        javax.swing.GroupLayout panelDireccionLayout = new javax.swing.GroupLayout(panelDireccion);
        panelDireccion.setLayout(panelDireccionLayout);
        panelDireccionLayout.setHorizontalGroup(
            panelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtDireccion)
        );
        panelDireccionLayout.setVerticalGroup(
            panelDireccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDireccionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelTelefono.setOpaque(false);

        jLabel2.setText("Telefono");

        txtTelefono.setColumns(20);
        txtTelefono.setRows(5);

        javax.swing.GroupLayout panelTelefonoLayout = new javax.swing.GroupLayout(panelTelefono);
        panelTelefono.setLayout(panelTelefonoLayout);
        panelTelefonoLayout.setHorizontalGroup(
            panelTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtTelefono)
        );
        panelTelefonoLayout.setVerticalGroup(
            panelTelefonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTelefonoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelNombre.setOpaque(false);

        jLabel1.setText("Nombre");

        txtNombre.setColumns(20);
        txtNombre.setRows(5);

        javax.swing.GroupLayout panelNombreLayout = new javax.swing.GroupLayout(panelNombre);
        panelNombre.setLayout(panelNombreLayout);
        panelNombreLayout.setHorizontalGroup(
            panelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtNombre)
        );
        panelNombreLayout.setVerticalGroup(
            panelNombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNombreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAceptar.setBackground(new java.awt.Color(121, 53, 17));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(121, 53, 17));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(121, 53, 17));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelEditorialLayout = new javax.swing.GroupLayout(panelEditorial);
        panelEditorial.setLayout(panelEditorialLayout);
        panelEditorialLayout.setHorizontalGroup(
            panelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorialLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelEditorialLayout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEditar))
                    .addComponent(panelDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPweb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        panelEditorialLayout.setVerticalGroup(
            panelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEditorialLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelPweb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelEditorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEditar))
                .addGap(15, 15, 15))
        );

        bgPanel.add(panelEditorial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {

                PreparedStatement ps = cn.prepareStatement("INSERT INTO editorial (nombre,telefono,url,email,direccion) VALUES (?,?,?,?,?)");

                ps.setString(1, txtNombre.getText());
                ps.setInt(2, Integer.parseInt(txtTelefono.getText()));
                ps.setString(3, txtPagWeb.getText());
                ps.setString(4, txtEmail.getText());
                ps.setString(5, txtDireccion.getText());
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
                mostrarDatos();
                limpiarCampos();
            } catch (SQLException e) {
                System.out.println("Error al guardar los productos en la BD "+e);
            }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(fila > 0){
            try {
                int id = Integer.parseInt(JTEditorial.getValueAt(fila, 0).toString());

                PreparedStatement ps = cn.prepareStatement("UPDATE editorial SET nombre=?,telefono=?,url=?,email=?,direccion=? WHERE idEditorial=?");
                ps.setString(1, txtNombre.getText());
                ps.setInt(2, Integer.parseInt(txtTelefono.getText()));
                ps.setString(3, txtPagWeb.getText());
                ps.setString(4, txtEmail.getText());
                ps.setString(5, txtDireccion.getText());
                ps.setInt(6, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Datos actualizados correctamente.");
                mostrarDatos();
                limpiarCampos();
                fila = 0;
            } catch (SQLException e) {
                System.out.println("Error al actualizar los productos en la BD "+e);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un registro.");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void JTEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTEditorialMouseClicked
        fila = JTEditorial.getSelectedRow();
        txtNombre.setText(JTEditorial.getValueAt(fila, 1).toString());
        txtTelefono.setText(JTEditorial.getValueAt(fila, 2).toString());
        txtPagWeb.setText(JTEditorial.getValueAt(fila, 3).toString());
        txtEmail.setText(JTEditorial.getValueAt(fila, 4).toString());
        txtDireccion.setText(JTEditorial.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_JTEditorialMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(RegEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegEditorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegEditorial dialog = new RegEditorial(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable JTEditorial;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelDireccion;
    private javax.swing.JPanel panelEditorial;
    private javax.swing.JPanel panelEmail;
    private javax.swing.JPanel panelNombre;
    private javax.swing.JPanel panelPweb;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JPanel panelTelefono;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextArea txtEmail;
    private javax.swing.JTextArea txtNombre;
    private javax.swing.JTextArea txtPagWeb;
    private javax.swing.JTextArea txtTelefono;
    // End of variables declaration//GEN-END:variables
}
