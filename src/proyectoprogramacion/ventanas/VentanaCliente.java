package proyectoprogramacion.ventanas;
import java.awt.Color;
import java.sql.*;
import proyectoprogramacion.Menu;
import static proyectoprogramacion.Menu.getConeccion;
public class VentanaCliente extends javax.swing.JFrame {
    public VentanaCliente() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        txt_id.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_identificacion = new javax.swing.JTextField();
        btn_eliminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        txt_telefono = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        notificacion = new javax.swing.JLabel();
        btn_volver = new javax.swing.JButton();
        img_icono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/TELEFONO.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, -1, 30));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/NOMBRE.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, 30));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/APELLIDO.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/IDENTIFICACION.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Usuario.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 280, 270));

        txt_buscar.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscar.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 250, 30));

        txt_nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_nombre.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(102, 102, 102));
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_nombre.setToolTipText("");
        txt_nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        txt_nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 380, 30));

        txt_apellido.setBackground(new java.awt.Color(255, 255, 255));
        txt_apellido.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(102, 102, 102));
        txt_apellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_apellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 380, 30));

        txt_identificacion.setBackground(new java.awt.Color(255, 255, 255));
        txt_identificacion.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_identificacion.setForeground(new java.awt.Color(102, 102, 102));
        txt_identificacion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_identificacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 380, 30));

        btn_eliminar.setBackground(new java.awt.Color(204, 0, 0));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Eliminar.png"))); // NOI18N
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, -1));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/ID.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, 30));

        btn_buscar.setBackground(new java.awt.Color(0, 204, 204));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/lupa.png"))); // NOI18N
        btn_buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 50, 30));

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

        txt_telefono.setBackground(new java.awt.Color(255, 255, 255));
        txt_telefono.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(102, 102, 102));
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txt_telefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 380, 30));

        txt_id.setEditable(false);
        txt_id.setBackground(new java.awt.Color(0, 0, 153));
        txt_id.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_id.setForeground(new java.awt.Color(255, 255, 255));
        txt_id.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 50, 30));

        notificacion.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        notificacion.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(notificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, 390, 30));

        btn_volver.setBackground(new java.awt.Color(255, 255, 255));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Volver.png"))); // NOI18N
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, -1, -1));

        img_icono.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        img_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.jpg"))); // NOI18N
        img_icono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(img_icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String n=txt_nombre.getText().trim(),a=txt_apellido.getText().trim(),c=txt_identificacion.getText().trim(),t=txt_telefono.getText().trim();
        if(txt_nombre.getText().equals("") || txt_apellido.getText().equals("") || txt_identificacion.getText().equals("") || txt_telefono.getText().equals("")){
            notificacion.setText("Rellene todos los campos");
        }else{
            try{
                Connection cn = getConeccion();
                PreparedStatement pt = cn.prepareStatement("INSERT INTO customers VALUES (?,?,?,?,?)");
                pt.setString(1, "0");
                pt.setString(2, n);
                pt.setString(3, a);
                pt.setString(4, c);
                pt.setString(5, t);
                pt.executeUpdate();
                txt_nombre.setText("");
                txt_apellido.setText("");
                txt_identificacion.setText("");
                txt_telefono.setText("");
                notificacion.setForeground(Color.GREEN);
                notificacion.setText("Registro exitoso");
            } catch (SQLException e){
                if (e.getErrorCode() == 1062){
                    notificacion.setForeground(Color.RED);
                    notificacion.setText("La identificacion ya existe");
                } else{
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed
    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if(txt_id.getText().trim().equalsIgnoreCase("") || txt_nombre.getText().equals("") || txt_apellido.getText().equals("") || txt_identificacion.getText().equals("") || txt_telefono.getText().equals("")){
            notificacion.setText("Rellene todos los campos");
        }else{
            try{
                String ID = txt_id.getText().trim();
                Connection cn = getConeccion();
                PreparedStatement pst = cn.prepareStatement("update customers set customer_name = ?, customer_lastname = ?, customer_identification = ?, customer_number = ? where customer_id = "+ID);
                pst.setString(1, txt_nombre.getText().trim());
                pst.setString(2, txt_apellido.getText().trim());
                pst.setString(3, txt_identificacion.getText().trim());
                pst.setString(4, txt_telefono.getText().trim());
                pst.executeUpdate();
                notificacion.setForeground(Color.GREEN);
                notificacion.setText("Modificacion Exitosa");
            } catch (SQLException e){
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try{
            Connection cn = getConeccion();
            PreparedStatement pst = cn.prepareStatement("select * from customers where customer_id = ?");
            pst.setString(1, txt_buscar.getText().trim());
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                txt_id.setText(rs.getString("customer_id"));
                txt_nombre.setText(rs.getString("customer_name"));
                txt_apellido.setText(rs.getString("customer_lastname"));
                txt_identificacion.setText(rs.getString("customer_identification"));
                txt_telefono.setText(rs.getString("customer_number"));
                notificacion.setText("");
            }else{
                notificacion.setForeground(Color.RED);
                notificacion.setText("Cliente no registrado");
            }
        } catch (SQLException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        if(txt_id.getText().trim().equalsIgnoreCase("") || txt_nombre.getText().equals("") || txt_apellido.getText().equals("") || txt_identificacion.getText().equals("") || txt_telefono.getText().equals("")){
            notificacion.setText("Compruebe que los campos esten llenos");
        }else{
            try{
                Connection cn = getConeccion();
                PreparedStatement pst = cn.prepareStatement("delete from customers where customer_id = ?");
                pst.setString(1, txt_id.getText().trim());
                pst.executeUpdate();
                txt_id.setText("");
                txt_nombre.setText("");
                txt_apellido.setText("");
                txt_identificacion.setText("");
                txt_telefono.setText("");
                notificacion.setForeground(Color.GREEN);
                notificacion.setText("Eliminacion exitosa");
            } catch (SQLException e){
                System.out.println(e);
            }  
        }
        
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed
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
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel img_icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel notificacion;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_identificacion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
