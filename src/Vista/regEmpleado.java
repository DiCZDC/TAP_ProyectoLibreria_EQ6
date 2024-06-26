/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import Modelo.Conexion;
import Ventanas.registroCapacitaciones;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.registroFunciones;
import java.util.ArrayList;

public class regEmpleado extends javax.swing.JDialog {

    Conexion con = new Conexion();
    Connection cn = con.conectar();
    
    public regEmpleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        mostrarUsuarios();
        cargarAlmacenes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        calendarioFechaNac = new calcFechas.panelCalendario();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cboTipoUsuario = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        calendarioFechaContrato = new calcFechas.panelCalendario();
        cboMeses = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtHorario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtNumCaja = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cboIdAlmacen = new javax.swing.JComboBox<>();
        scrollPane = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("registro de empleado"));

        jLabel1.setText("nombre *");

        jLabel2.setText("telefono *");

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel3.setText("RFC *");

        txtRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRFCActionPerformed(evt);
            }
        });

        txtSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoActionPerformed(evt);
            }
        });

        jLabel4.setText("sueldo *");

        jLabel5.setText("fecha de nacimiento *");

        jLabel6.setText("meses de contrato *");

        jLabel7.setText("tipo de usuario *");

        cboTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente", "Cajero", "Empleado de bodega", "Otro" }));
        cboTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTipoUsuarioActionPerformed(evt);
            }
        });

        jLabel8.setText("fecha de inicio del contrato *");

        cboMeses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel9.setText("horario *");

        jLabel10.setText("usuario");

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel11.setText("contraseña");

        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });

        jLabel12.setText("numero de caja");

        txtNumCaja.setEnabled(false);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");

        jLabel13.setText("id de Almacen");

        cboIdAlmacen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cboIdAlmacen.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendarioFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(calendarioFechaContrato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(241, 241, 241))
                                .addComponent(jLabel9)
                                .addComponent(txtHorario)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtContrasenia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                                            .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                        .addComponent(txtNumCaja)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboIdAlmacen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendarioFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendarioFechaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboIdAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(29, 29, 29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        scrollPane.setBorder(javax.swing.BorderFactory.createTitledBorder("tabla de empleados"));

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaEmpleados.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        scrollPane.setViewportView(tablaEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRFCActionPerformed

    private void txtSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoActionPerformed

    private void cboTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTipoUsuarioActionPerformed
        if(cboTipoUsuario.getSelectedItem().toString().equals("Cajero")){
            txtNumCaja.setEnabled(true);
        }else{
            txtNumCaja.setText("");
            txtNumCaja.setEnabled(false);
        }
        
        if(cboTipoUsuario.getSelectedItem().toString().equals("Otro")){
            txtContrasenia.setEnabled(false);
            txtContrasenia.setText("");
            txtUsuario.setEnabled(false);
            txtUsuario.setText("");
        }else{
            txtContrasenia.setEnabled(true);
            txtUsuario.setEnabled(true);
        }
        
        if(cboTipoUsuario.getSelectedItem().toString().equals("Empleado de bodega")){
            cboIdAlmacen.setEnabled(true);
        }else{
            cboIdAlmacen.setEnabled(false);
            cboIdAlmacen.setSelectedIndex(0);
        }
        
    }//GEN-LAST:event_cboTipoUsuarioActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if( txtNombre.getText().isEmpty() || txtRFC.getText().isEmpty() || txtSueldo.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtHorario.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null, "rellene los campos obligatorios");
            return;
        }
        if(cboTipoUsuario.getSelectedItem().toString().equals("Cajero") && txtNumCaja.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "introduzca el numero de la caja");
            return;
        }
        if(cboTipoUsuario.getSelectedItem().toString().equals("Cajero")){
            if(txtNumCaja.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "introduzca el numero de la caja");
                return;
            }
            
            try {
                Integer.parseInt(txtNumCaja.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "introduzca solo numeros a el cuadro de numero de caja");
                return;
            }
        }
        
        try {
            Integer.parseInt(txtSueldo.getText());
            Long.parseLong(txtTelefono.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "introduzca solo letras en los campos numericos");
        }
        
        if(!cboTipoUsuario.getSelectedItem().toString().equals("Otro") && (txtUsuario.getText().isEmpty() || txtContrasenia.getText().isEmpty() ) ){
            JOptionPane.showMessageDialog(null, "introduzca el usuario y la contraseña");
            return;
        }
        
        if(cboTipoUsuario.getSelectedItem().toString().equals("Empleado de bodega") && cboIdAlmacen.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "introduzca el id del almacen al que pertenece el empleado");
            return;
        }
        
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO empleado (telefono,fechaNac,nombre,RFC,sueldo,mesesContrato,fechaContrato,horario,usuario,contraseña,tipoEmpleado) VALUES (?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, Long.parseLong(txtTelefono.getText()));
            String fechaNac = calendarioFechaNac.getAnio() +"-"+calendarioFechaNac.getMes()+"-"+calendarioFechaNac.getDia();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
            java.sql.Date DateFechaNac = new Date(sdf.parse(fechaNac).getTime());
            
            ps.setDate(2,   DateFechaNac);
            ps.setString(3, txtNombre.getText());
            ps.setString(4, txtRFC.getText());
            ps.setInt(5, Integer.parseInt(txtSueldo.getText()));
            ps.setInt(6, Integer.parseInt(cboMeses.getSelectedItem().toString()));
            
            String fechaContrato = calendarioFechaContrato.getAnio() + "-" + calendarioFechaContrato.getMes() + "-" + calendarioFechaContrato.getDia();
            java.sql.Date DateFechaContrato = new Date(sdf.parse(fechaContrato).getTime());
            
            ps.setDate(7, DateFechaContrato);
            ps.setString(8, txtHorario.getText());
            if(cboTipoUsuario.getSelectedItem().equals("Otro")){
                ps.setString(9, null);
                ps.setString(10, null);
            }else{
                ps.setString(9, txtContrasenia.getText());
                ps.setString(10, txtUsuario.getText());
            }
            String tipoUsuario = cboTipoUsuario.getSelectedItem().toString();
            switch (tipoUsuario) {
                case "Gerente":
                        ps.setInt(11,0);
                    break;
                case "Cajero":
                        ps.setInt(11,1);
                        break;
                case "Empleado de bodega":
                        ps.setInt(11,2);
                        break;
                case "Otro":
                        ps.setInt(11,3);
                        break;
                default:
                    throw new AssertionError();
            }
            ps.executeUpdate();
            ResultSet result = ps.getGeneratedKeys();
            result.next();
            int idEmpleado = result.getInt(1);
            
            switch (tipoUsuario) {
                case "Gerente":
                        agregarGerente(idEmpleado);
                    break;
                case "Cajero":
                        agregarCajero(idEmpleado, Integer.parseInt(txtNumCaja.getText()));
                        break;
                case "Empleado de bodega":
                        agregarEmpleadoBodega(idEmpleado,Integer.parseInt(cboIdAlmacen.getSelectedItem().toString()));
                        new registroCapacitaciones(null, rootPaneCheckingEnabled,idEmpleado).setVisible(true);
                        break;
                case "Otro":
                        break;
                default:
                    throw new AssertionError();
            }
            
            
        }catch (SQLException e) {
            System.out.println("error al agregar el registro "+e);
        }catch(NumberFormatException | ParseException e){
            System.out.println(e);
        }
        limpiarCampos();
        mostrarUsuarios();
    }//GEN-LAST:event_btnAceptarActionPerformed
    
    private void mostrarUsuarios(){
        DefaultTableModel modelo = new DefaultTableModel();
        String [] cabeceras = {"ID","Nombre","RFC","Sueldo","Meses de contrato","Fecha de contrato","Tipo de empleado"};
        for (String cabecera : cabeceras) {
            modelo.addColumn(cabecera);
        }
        
        tablaEmpleados.setModel(modelo);
        String consulta = "SELECT idEmpleado,nombre,RFC,sueldo,mesesContrato,fechaContrato,tipoEmpleado FROM empleado";
        String data[] = new String[7];
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
            System.out.println("Error al conectar con la BD "+e);
        }
        
        
    }
    
    private boolean agregarGerente(int idEmpleado){
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO encargado(idencargado) VALUES(?)");
            ps.setInt(1, idEmpleado);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("error al agregar al gerente "+e);
            return false;
        }
        
    }
    
    private boolean agregarCajero(int idEmpleado, int numCaja){
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO cajero(idCajero,num_caja) VALUES(?,?)");
            ps.setInt(1, idEmpleado);
            ps.setInt(2,numCaja);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("error al agregar al cajero "+e);
            return false;
        }
    }
    
    private boolean agregarEmpleadoBodega(int idEmpleado,int idAlmacen){
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO empleadoBodega(idEmpleadoBodega,idAlmacen) VALUES(?,?)");
            ps.setInt(1, idEmpleado);
            ps.setInt(2, idAlmacen);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("error al agregar al empleado de bodega "+e);
            return false;
        }
    }
    
    private void limpiarCampos(){
        txtContrasenia.setText("");
        txtHorario.setText("");
        txtNombre.setText("");
        txtNumCaja.setText("");
        txtRFC.setText("");
        txtSueldo.setText("");
        txtTelefono.setText("");
        txtUsuario.setText("");
        cboMeses.setSelectedIndex(0);
        cboTipoUsuario.setSelectedIndex(0);
    }
    
    private void cargarAlmacenes(){
        registroFunciones rf = new registroFunciones();
        ArrayList<String> idAlmacenes = rf.cboArray("almacen", 1);
        for (int i = 0; i < idAlmacenes.size(); i++) {
            cboIdAlmacen.addItem(idAlmacenes.get(i));
        }
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
            java.util.logging.Logger.getLogger(regEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                regEmpleado dialog = new regEmpleado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private calcFechas.panelCalendario calendarioFechaContrato;
    private calcFechas.panelCalendario calendarioFechaNac;
    private javax.swing.JComboBox<String> cboIdAlmacen;
    private javax.swing.JComboBox<String> cboMeses;
    private javax.swing.JComboBox<String> cboTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCaja;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtSueldo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
