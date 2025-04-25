package proyectoprogramacion;
import vista.VentanaLogin;
import proyectoprogramacion.ventanas.VentanaCliente;
import proyectoprogramacion.ventanas.VentanaRepuestos;
import proyectoprogramacion.ventanas.VentanaVentas;
import java.sql.*;
import proyectoprogramacion.ventanas.VentanaGenerarVentas;
public class Menu extends javax.swing.JFrame {
    public Menu() {
        initComponents();
        setIconImage(getIconImage());
         this.setLocationRelativeTo(null);
        NombreUsuario.setText(ObtenerNombre.getNombre());
    }
    public static Connection getConeccion(){
        String url = "jdbc:mysql://localhost/";
        String nombreBase = "datos_taller";
        String usuario = "root";
        String password = "";
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(url+nombreBase,usuario,password);
        }catch(SQLException e){
            System.out.println(e);
        }
        return connection;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonClientes = new javax.swing.JButton();
        BotonGenerarVentas = new javax.swing.JButton();
        BotonRepuestos = new javax.swing.JButton();
        BotonVentas = new javax.swing.JButton();
        BotonCerrarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JLabel();
        wall3 = new javax.swing.JLabel();
        Menu = new javax.swing.JLabel();
        Wall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonClientes.setBackground(new java.awt.Color(0, 0, 0));
        BotonClientes.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BotonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Clientes.png"))); // NOI18N
        BotonClientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        BotonClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClientesActionPerformed(evt);
            }
        });
        getContentPane().add(BotonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 170, 30));

        BotonGenerarVentas.setBackground(new java.awt.Color(0, 0, 0));
        BotonGenerarVentas.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BotonGenerarVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_GenerarVentas.png"))); // NOI18N
        BotonGenerarVentas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        BotonGenerarVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonGenerarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGenerarVentasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGenerarVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 170, 30));

        BotonRepuestos.setBackground(new java.awt.Color(0, 0, 0));
        BotonRepuestos.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BotonRepuestos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Repuestos.png"))); // NOI18N
        BotonRepuestos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        BotonRepuestos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonRepuestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRepuestosActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRepuestos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 170, 30));

        BotonVentas.setBackground(new java.awt.Color(0, 0, 0));
        BotonVentas.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        BotonVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Ventas.png"))); // NOI18N
        BotonVentas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        BotonVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVentasActionPerformed(evt);
            }
        });
        getContentPane().add(BotonVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 170, 30));

        BotonCerrarSesion.setBackground(new java.awt.Color(204, 0, 0));
        BotonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_CerrarSesion.png"))); // NOI18N
        BotonCerrarSesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        BotonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 170, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Dashboard.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 140, -1));

        NombreUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        NombreUsuario.setForeground(new java.awt.Color(204, 204, 204));
        NombreUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 190, 40));

        wall3.setBackground(new java.awt.Color(31, 65, 169));
        wall3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Wall_Register.png"))); // NOI18N
        getContentPane().add(wall3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Navigation.png"))); // NOI18N
        Menu.setPreferredSize(new java.awt.Dimension(221, 548));
        getContentPane().add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 227, 521));

        Wall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/WallMenu.png"))); // NOI18N
        Wall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(Wall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BotonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClientesActionPerformed
        VentanaCliente v = new VentanaCliente();
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonClientesActionPerformed
    private void BotonRepuestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRepuestosActionPerformed
        VentanaRepuestos v = new VentanaRepuestos();
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonRepuestosActionPerformed
    private void BotonVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVentasActionPerformed
        VentanaVentas v = new VentanaVentas();
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonVentasActionPerformed
    private void BotonGenerarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGenerarVentasActionPerformed
        VentanaGenerarVentas v = new VentanaGenerarVentas();
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonGenerarVentasActionPerformed

    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
        VentanaLogin v = new VentanaLogin();
        v.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonCerrarSesionActionPerformed
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonClientes;
    private javax.swing.JButton BotonGenerarVentas;
    private javax.swing.JButton BotonRepuestos;
    private javax.swing.JButton BotonVentas;
    private javax.swing.JLabel Menu;
    private javax.swing.JLabel NombreUsuario;
    private javax.swing.JLabel Wall;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel wall3;
    // End of variables declaration//GEN-END:variables
}
