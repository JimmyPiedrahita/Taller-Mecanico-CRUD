package proyectoprogramacion.ventanas;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JComboBox;
import proyectoprogramacion.Menu;
public class VentanaGenerarVentas extends javax.swing.JFrame {
    public static void listaReparaciones(String tabla,String filtro, JComboBox combo){
        Connection cn = Menu.getConeccion();
        try{
            PreparedStatement ps = cn.prepareStatement("SELECT * FROM "+tabla);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                combo.addItem(rs.getString(filtro));
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public VentanaGenerarVentas() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        listaReparaciones("repairs","repair_id",Box_Reparaciones);
        listaReparaciones("parts","part_id",Box_repuestos);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Notificacion = new javax.swing.JLabel();
        txt_adicional = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        Box_repuestos = new javax.swing.JComboBox<>();
        txt_id = new javax.swing.JTextField();
        txt_cliente_identidad = new javax.swing.JTextField();
        txt_placa = new javax.swing.JTextField();
        txt_marca = new javax.swing.JTextField();
        Box_Reparaciones = new javax.swing.JComboBox<>();
        txt_color = new javax.swing.JTextField();
        txt_cilindraje = new javax.swing.JTextField();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        txt_modelo = new com.toedter.calendar.JYearChooser();
        jLabel12 = new javax.swing.JLabel();
        btn_generar_factura = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Notificacion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        getContentPane().add(Notificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 400, 30));

        txt_adicional.setBackground(new java.awt.Color(255, 255, 255));
        txt_adicional.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_adicional.setForeground(new java.awt.Color(102, 102, 102));
        txt_adicional.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_adicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 310, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Datos de la motocicleta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/ID.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/CLIENTE.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/PLACA.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, 30));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/MODELO.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/MARCA.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 30));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/CILINDRAJE.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, -1, 30));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/COLOR.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/REPARACIÓN.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, 30));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/REPUESTO.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, 30));

        btn_volver.setBackground(new java.awt.Color(255, 255, 255));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Volver.png"))); // NOI18N
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, -1, -1));

        btn_guardar.setBackground(new java.awt.Color(0, 204, 51));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Guardar.png"))); // NOI18N
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, -1, -1));

        Box_repuestos.setBackground(new java.awt.Color(255, 255, 255));
        Box_repuestos.setEditable(true);
        Box_repuestos.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        Box_repuestos.setForeground(new java.awt.Color(102, 102, 102));
        Box_repuestos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        Box_repuestos.setRequestFocusEnabled(true);
        Box_repuestos.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(Box_repuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 100, 30));

        txt_id.setEditable(false);
        txt_id.setBackground(new java.awt.Color(0, 0, 153));
        txt_id.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 50, 30));

        txt_cliente_identidad.setBackground(new java.awt.Color(255, 255, 255));
        txt_cliente_identidad.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_cliente_identidad.setForeground(new java.awt.Color(102, 102, 102));
        txt_cliente_identidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_cliente_identidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 230, 30));

        txt_placa.setBackground(new java.awt.Color(255, 255, 255));
        txt_placa.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_placa.setForeground(new java.awt.Color(102, 102, 102));
        txt_placa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 190, 30));

        txt_marca.setBackground(new java.awt.Color(255, 255, 255));
        txt_marca.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_marca.setForeground(new java.awt.Color(102, 102, 102));
        txt_marca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 190, 30));

        Box_Reparaciones.setBackground(new java.awt.Color(255, 255, 255));
        Box_Reparaciones.setEditable(true);
        Box_Reparaciones.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        Box_Reparaciones.setForeground(new java.awt.Color(102, 102, 102));
        Box_Reparaciones.setToolTipText("");
        Box_Reparaciones.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        Box_Reparaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Box_ReparacionesActionPerformed(evt);
            }
        });
        getContentPane().add(Box_Reparaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 100, 30));

        txt_color.setBackground(new java.awt.Color(255, 255, 255));
        txt_color.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_color.setForeground(new java.awt.Color(102, 102, 102));
        txt_color.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 310, 30));

        txt_cilindraje.setBackground(new java.awt.Color(255, 255, 255));
        txt_cilindraje.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_cilindraje.setForeground(new java.awt.Color(102, 102, 102));
        txt_cilindraje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_cilindraje, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 90, 30));

        txt_fecha.setBackground(new java.awt.Color(255, 255, 255));
        txt_fecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        txt_fecha.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_fecha.setMaxSelectableDate(new java.util.Date(253370786479000L));
        getContentPane().add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 170, 30));

        txt_modelo.setBackground(new java.awt.Color(255, 255, 255));
        txt_modelo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 100, 30));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/DESCRIPCION_ADICIONAL.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, 30));

        btn_generar_factura.setBackground(new java.awt.Color(0, 204, 204));
        btn_generar_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/GENERAR_FACTURA.png"))); // NOI18N
        btn_generar_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generar_facturaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_generar_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/FECHA_VENTA.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/datos_moto.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Icono_Ventas.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Wall_Ventas.png"))); // NOI18N
        Wallpaper.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        Connection cn = Menu.getConeccion();
        try{
            if (txt_cliente_identidad.getText().equalsIgnoreCase("") || txt_placa.getText().equalsIgnoreCase("") || String.valueOf(txt_modelo.getYear()).equalsIgnoreCase("") || txt_marca.getText().equalsIgnoreCase("") || txt_cilindraje.getText().equalsIgnoreCase("") || txt_color.getText().equalsIgnoreCase("") || Box_Reparaciones.getSelectedItem().toString().equalsIgnoreCase("") || Box_repuestos.getSelectedItem().toString().equalsIgnoreCase("")){
                Notificacion.setText("Rellene todos los campos");
            } else{
               String idencli =  txt_cliente_identidad.getText().trim();
                PreparedStatement cc = cn.prepareStatement("SELECT customer_id FROM customers WHERE customer_identification = "+idencli);
                ResultSet rc = cc.executeQuery();
                if (rc.next()){
                    PreparedStatement pt = cn.prepareStatement("INSERT INTO sales VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
                    pt.setString(1, "0");
                    pt.setString(2, txt_cliente_identidad.getText().trim());
                    pt.setString(3, txt_placa.getText().trim());
                    pt.setString(4, String.valueOf(txt_modelo.getYear()));
                    pt.setString(5, txt_marca.getText().trim());
                    pt.setInt(6, Integer.parseInt(txt_cilindraje.getText()));
                    pt.setString(7, txt_color.getText().trim());
                    pt.setInt(8, Integer.parseInt(Box_Reparaciones.getSelectedItem().toString()));
                    pt.setInt(9, Integer.parseInt(Box_repuestos.getSelectedItem().toString()));
                    pt.setString(10, txt_adicional.getText().trim());
                    pt.setString(11, txt_fecha.getDate().toString());
                    PreparedStatement px = cn.prepareStatement("SELECT repair_cost FROM repairs WHERE repair_id = ?");
                    PreparedStatement pc = cn.prepareStatement("SELECT part_unit_cost FROM parts WHERE part_id = ?");
                    px.setString(1, Box_Reparaciones.getSelectedItem().toString());
                    pc.setString(1, Box_repuestos.getSelectedItem().toString());
                    ResultSet r = px.executeQuery();
                    ResultSet rr = pc.executeQuery();
                    if (r.next() && rr.next())
                    {
                        double costoRepa = Double.parseDouble(r.getString("repair_cost"));
                        double costoRepu = Double.parseDouble(rr.getString("part_unit_cost"));
                        pt.setDouble(12, (costoRepa + costoRepu));
                    } else
                    {
                        System.out.println("no");
                    }
                    pt.executeUpdate();
                    Notificacion.setText("Registro exisoto");
                } else
                {
                    Notificacion.setText("No se encontro el cliente");
                }
            }
        } catch (SQLException e){
            if (e.getErrorCode() == 1452){
                Notificacion.setText("No se encontro el cliente");
            }
            if (e.getErrorCode() == 1062){
                Notificacion.setText("Placa repetida");
            }
            if (e.getErrorCode() == 0){
                Notificacion.setText("Selecione repuesto y reparacion");
            } else{
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_generar_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generar_facturaActionPerformed
        VentanaFactura vf = new VentanaFactura();
        vf.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_generar_facturaActionPerformed

    private void Box_ReparacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Box_ReparacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Box_ReparacionesActionPerformed
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VentanaGenerarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaGenerarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaGenerarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaGenerarVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new VentanaGenerarVentas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Box_Reparaciones;
    private javax.swing.JComboBox<String> Box_repuestos;
    private javax.swing.JLabel Notificacion;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton btn_generar_factura;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_adicional;
    private javax.swing.JTextField txt_cilindraje;
    private javax.swing.JTextField txt_cliente_identidad;
    private javax.swing.JTextField txt_color;
    private com.toedter.calendar.JDateChooser txt_fecha;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_marca;
    private com.toedter.calendar.JYearChooser txt_modelo;
    private javax.swing.JTextField txt_placa;
    // End of variables declaration//GEN-END:variables
}
