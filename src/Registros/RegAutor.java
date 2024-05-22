/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Registros;

import Conector.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zaidc
 */
public class RegAutor extends javax.swing.JDialog {

    Conexion con = new Conexion();
    Connection cn = con.conectar();
    private int fila = 0;
    
    public RegAutor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mostrarDatos();
    }

   private void mostrarDatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        String [] cabeceras = {"ID","Nombre","Pais","Idioma","Pagina web"};
        
        for(int i = 0; i < cabeceras.length; i++)
            modelo.addColumn(cabeceras[i]);
        
        
        JTAutores.setModel(modelo);
        String consulta = "SELECT * FROM autor";
        String data[] = new String[5];
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
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPanel = new javax.swing.JPanel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTAutores = new javax.swing.JTable();
        panelAutor = new javax.swing.JPanel();
        panelPweb = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPagWeb = new javax.swing.JTextArea();
        panelIdioma = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtIdioma = new javax.swing.JTextArea();
        panelPais = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPais = new javax.swing.JTextArea();
        panelNombre = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextArea();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 196, 167));

        bgPanel.setBackground(new java.awt.Color(255, 196, 167));
        bgPanel.setLayout(new java.awt.GridLayout(1, 3));

        panelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de autores"));
        panelTabla.setOpaque(false);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        JTAutores.setBackground(new java.awt.Color(241, 240, 226));
        JTAutores.setModel(new javax.swing.table.DefaultTableModel(
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
        JTAutores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTAutores.setOpaque(false);
        JTAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTAutoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTAutores);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
            .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
            .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
        );

        bgPanel.add(panelTabla);

        panelAutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Introduzca la información del autor"));
        panelAutor.setOpaque(false);

        panelPweb.setOpaque(false);

        jLabel4.setText("Pagina web");

        txtPagWeb.setColumns(20);
        txtPagWeb.setRows(5);

        javax.swing.GroupLayout panelPwebLayout = new javax.swing.GroupLayout(panelPweb);
        panelPweb.setLayout(panelPwebLayout);
        panelPwebLayout.setHorizontalGroup(
            panelPwebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtPagWeb, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
        );
        panelPwebLayout.setVerticalGroup(
            panelPwebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPwebLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPagWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelIdioma.setOpaque(false);

        jLabel3.setText("Idioma");

        txtIdioma.setColumns(20);
        txtIdioma.setRows(5);

        javax.swing.GroupLayout panelIdiomaLayout = new javax.swing.GroupLayout(panelIdioma);
        panelIdioma.setLayout(panelIdiomaLayout);
        panelIdiomaLayout.setHorizontalGroup(
            panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtIdioma)
        );
        panelIdiomaLayout.setVerticalGroup(
            panelIdiomaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIdiomaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelPais.setOpaque(false);

        jLabel2.setText("País");

        txtPais.setColumns(20);
        txtPais.setRows(5);

        javax.swing.GroupLayout panelPaisLayout = new javax.swing.GroupLayout(panelPais);
        panelPais.setLayout(panelPaisLayout);
        panelPaisLayout.setHorizontalGroup(
            panelPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtPais)
        );
        panelPaisLayout.setVerticalGroup(
            panelPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        btnAceptar.setBackground(new java.awt.Color(140, 39, 30));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(140, 39, 30));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(140, 39, 30));
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAutorLayout = new javax.swing.GroupLayout(panelAutor);
        panelAutor.setLayout(panelAutorLayout);
        panelAutorLayout.setHorizontalGroup(
            panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panelIdioma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelPweb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelAutorLayout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        panelAutorLayout.setVerticalGroup(
            panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAutorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(panelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(panelPweb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(panelAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar)
                    .addComponent(btnEditar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        bgPanel.add(panelAutor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void limpiarCampos() {
        txtIdioma.setText("");
        txtNombre.setText("");
        txtPagWeb.setText("");
        txtPais.setText("");
    }
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO autor (nombre,pais,idiomaOrigen,url) VALUES (?,?,?,?)");
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtPais.getText());
            ps.setString(3, txtIdioma.getText());
            ps.setString(4, txtPagWeb.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
            mostrarDatos();
            limpiarCampos();
        } catch (SQLException e) {
            System.out.println("Error al insertar los productos en la BD "+e);
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void JTAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTAutoresMouseClicked
        fila = JTAutores.getSelectedRow();
        txtNombre.setText(JTAutores.getValueAt(fila, 1).toString());
        txtPais.setText(JTAutores.getValueAt(fila, 2).toString());
        txtIdioma.setText(JTAutores.getValueAt(fila, 3).toString());
        txtPagWeb.setText(JTAutores.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_JTAutoresMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if(fila > 0){
            try {
                int id = Integer.parseInt(JTAutores.getValueAt(fila, 0).toString());
                
                PreparedStatement ps = cn.prepareStatement("UPDATE autor SET nombre=?,pais=?,idiomaOrigen=?,url=? WHERE idAutor=?");
                ps.setString(1, txtNombre.getText());
                ps.setString(2, txtPais.getText());
                ps.setString(3, txtIdioma.getText());
                ps.setString(4, txtPagWeb.getText());
                ps.setInt(5, id);
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
            java.util.logging.Logger.getLogger(RegAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegAutor dialog = new RegAutor(new javax.swing.JFrame(), true);
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
    private javax.swing.JTable JTAutores;
    private javax.swing.JPanel bgPanel;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelAutor;
    private javax.swing.JPanel panelIdioma;
    private javax.swing.JPanel panelNombre;
    private javax.swing.JPanel panelPais;
    private javax.swing.JPanel panelPweb;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTextArea txtIdioma;
    private javax.swing.JTextArea txtNombre;
    private javax.swing.JTextArea txtPagWeb;
    private javax.swing.JTextArea txtPais;
    // End of variables declaration//GEN-END:variables
}
