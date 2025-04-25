package proyectoprogramacion.ventanas;
import java.awt.Color;
import java.sql.*;
import proyectoprogramacion.Menu;
import static proyectoprogramacion.Menu.getConeccion;
public class VentanaRepuestos extends javax.swing.JFrame {
    public VentanaRepuestos() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_costo_unidad = new javax.swing.JTextField();
        txt_buscar = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        txt_producto = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        txt_marca = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();
        notificacion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/MARCA.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/ID.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/CANTIDAD.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/COSTO_UNIDAD.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/PRODUCTO.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, 30));

        txt_id.setEditable(false);
        txt_id.setBackground(new java.awt.Color(0, 0, 153));
        txt_id.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 50, 30));

        txt_costo_unidad.setBackground(new java.awt.Color(255, 255, 255));
        txt_costo_unidad.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_costo_unidad.setForeground(new java.awt.Color(102, 102, 102));
        txt_costo_unidad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_costo_unidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_costo_unidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 380, 30));

        txt_buscar.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscar.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_buscar.setForeground(new java.awt.Color(102, 102, 102));
        txt_buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 250, 30));

        txt_cantidad.setBackground(new java.awt.Color(255, 255, 255));
        txt_cantidad.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_cantidad.setForeground(new java.awt.Color(102, 102, 102));
        txt_cantidad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_cantidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 380, 30));

        txt_producto.setBackground(new java.awt.Color(255, 255, 255));
        txt_producto.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_producto.setForeground(new java.awt.Color(102, 102, 102));
        txt_producto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_producto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 380, 30));

        btn_eliminar.setBackground(new java.awt.Color(204, 0, 0));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Eliminar.png"))); // NOI18N
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, -1));

        btn_volver.setBackground(new java.awt.Color(255, 255, 255));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Volver.png"))); // NOI18N
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, -1, -1));

        btn_modificar.setBackground(new java.awt.Color(255, 153, 0));
        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Modificar.png"))); // NOI18N
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, -1, -1));

        btn_guardar.setBackground(new java.awt.Color(0, 204, 51));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Guardar.png"))); // NOI18N
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, -1, -1));

        txt_marca.setBackground(new java.awt.Color(255, 255, 255));
        txt_marca.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_marca.setForeground(new java.awt.Color(102, 102, 102));
        txt_marca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_marca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 380, 30));

        btn_buscar.setBackground(new java.awt.Color(0, 204, 204));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/lupa.png"))); // NOI18N
        btn_buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 50, 30));

        notificacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        notificacion.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(notificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 390, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Repuestos.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 280, 270));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.jpg"))); // NOI18N
        Wallpaper.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String n=txt_producto.getText().trim(),a=txt_cantidad.getText().trim(),c=txt_costo_unidad.getText().trim(),t=txt_marca.getText().trim();
        try{
            Connection cn = getConeccion();
            PreparedStatement pt = cn.prepareStatement("INSERT INTO parts VALUES (?,?,?,?,?)");
            pt.setString(1, "0");
            pt.setString(2, n);
            pt.setString(3, a);
            pt.setString(4, c);
            pt.setString(5, t);
            pt.executeUpdate();
            txt_producto.setText("");txt_cantidad.setText("");txt_costo_unidad.setText("");txt_marca.setText("");
            notificacion.setForeground(Color.GREEN);
            notificacion.setText("Registro exitoso");
        }catch(SQLException e){
                System.out.println(e);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        try{
            String ID = txt_id.getText().trim();
            Connection cn = getConeccion();
            PreparedStatement pst = cn.prepareStatement("update parts set part_description = ?, part_quantity = ?, part_unit_cost = ?, part_brand = ? where part_id = "+ID);
            pst.setString(1, txt_producto.getText().trim());
            pst.setString(2, txt_cantidad.getText().trim());
            pst.setString(3, txt_costo_unidad.getText().trim());
            pst.setString(4, txt_marca.getText().trim());
            pst.executeUpdate();
            notificacion.setForeground(Color.BLUE);
            notificacion.setText("Modificacion Exitosa");
        } catch (SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_modificarActionPerformed
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try{
            Connection cn = getConeccion();
            PreparedStatement pst = cn.prepareStatement("select * from parts where part_id = ?");
            pst.setString(1, txt_buscar.getText().trim());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                txt_id.setText(rs.getString("part_id"));
                txt_producto.setText(rs.getString("part_description"));
                txt_cantidad.setText(rs.getString("part_quantity"));
                txt_costo_unidad.setText(rs.getString("part_unit_cost"));
                txt_marca.setText(rs.getString("part_brand"));
                notificacion.setText("");
            }else{
                notificacion.setForeground(Color.RED);
                notificacion.setText("Repuesto no registrado");
            }
        } catch (SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
            try{
            Connection cn = getConeccion();
            PreparedStatement pst = cn.prepareStatement("delete from parts where part_id = ?");
            pst.setString(1, txt_id.getText().trim());
            pst.executeUpdate();
            txt_id.setText("");
            txt_producto.setText("");
            txt_cantidad.setText("");
            txt_costo_unidad.setText("");
            txt_marca.setText("");
            notificacion.setForeground(Color.GREEN);
            notificacion.setText("Eliminacion exitosa");
        } catch (SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaRepuestos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new VentanaRepuestos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel notificacion;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_costo_unidad;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_marca;
    private javax.swing.JTextField txt_producto;
    // End of variables declaration//GEN-END:variables
}
