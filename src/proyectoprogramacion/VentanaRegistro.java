package proyectoprogramacion;
import vista.VentanaLogin;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
public final class VentanaRegistro extends javax.swing.JFrame {
    public VentanaRegistro() {
        initComponents();
        setIconImage(getIconImage());
        AlertExito.setVisible(false);
        this.setLocationRelativeTo(null);
        TextPrompt HolderUsuarioRegister = new TextPrompt("Usuario", Campo_registro_usuario);
        TextPrompt HolderEmailRegister = new TextPrompt("Email", Campo_registro_email);
        TextPrompt HolderPasswordRegister = new TextPrompt("Contraseña", Campo_registro_password);
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AlertExito = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Campo_registro_usuario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Campo_registro_email = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Campo_registro_password = new javax.swing.JPasswordField();
        BotonRegistrarUsuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        RegresarLogin = new javax.swing.JLabel();
        BotonCerrarVentana = new javax.swing.JButton();
        TextoAlerta = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AlertExito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/AlertExito.png"))); // NOI18N
        getContentPane().add(AlertExito, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/texRegistro.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 380, -1));

        jPanel1.setBackground(new java.awt.Color(31, 65, 169));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_registro.png"))); // NOI18N

        Campo_registro_usuario.setBackground(new java.awt.Color(31, 65, 169));
        Campo_registro_usuario.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        Campo_registro_usuario.setForeground(new java.awt.Color(255, 255, 255));
        Campo_registro_usuario.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_registro_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(Campo_registro_usuario)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 352, 45));

        jPanel2.setBackground(new java.awt.Color(31, 65, 169));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/email.png"))); // NOI18N

        Campo_registro_email.setBackground(new java.awt.Color(31, 65, 169));
        Campo_registro_email.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        Campo_registro_email.setForeground(new java.awt.Color(255, 255, 255));
        Campo_registro_email.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_registro_email, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(Campo_registro_email)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 352, -1));

        jPanel3.setBackground(new java.awt.Color(31, 65, 169));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lock.png"))); // NOI18N

        Campo_registro_password.setBackground(new java.awt.Color(31, 65, 169));
        Campo_registro_password.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        Campo_registro_password.setForeground(new java.awt.Color(255, 255, 255));
        Campo_registro_password.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_registro_password, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(Campo_registro_password)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 354, -1));

        BotonRegistrarUsuario.setBackground(new java.awt.Color(39, 79, 199));
        BotonRegistrarUsuario.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        BotonRegistrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarUsuario.setText("Registrar");
        BotonRegistrarUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        BotonRegistrarUsuario.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BotonRegistrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarUsuarioMouseClicked(evt);
            }
        });
        BotonRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 352, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tengocuenta.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, -1, -1));

        RegresarLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N
        RegresarLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarLoginMouseClicked(evt);
            }
        });
        getContentPane().add(RegresarLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, -1, -1));

        BotonCerrarVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BotonCerrar.png"))); // NOI18N
        BotonCerrarVentana.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCerrarVentana.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrarVentanaMouseClicked(evt);
            }
        });
        getContentPane().add(BotonCerrarVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 28, 28));

        TextoAlerta.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        TextoAlerta.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(TextoAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 310, 30));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.jpg"))); // NOI18N
        Wallpaper.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BotonRegistrarUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarUsuarioMouseClicked
        String user = Campo_registro_usuario.getText();
        String email = Campo_registro_email.getText();
        String pass = new String(Campo_registro_password.getPassword());
        if (user.equals("") || email.equals("") || pass.equals("")){
            TextoAlerta.setText("Todos los campos son obligatorios");
        } else{
            try{
                Connection cn = Menu.getConeccion();
                PreparedStatement pst = cn.prepareStatement("insert into users values(?,?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, user.trim());
                pst.setString(3, email.trim());
                pst.setString(4, pass.trim());
                pst.executeUpdate();
                Campo_registro_usuario.setText("");
                Campo_registro_email.setText("");
                Campo_registro_password.setText("");
                AlertExito.setVisible(true);
                TextoAlerta.setText("");
            } catch (SQLException e){
                if(e.getErrorCode() == 1062){
                    TextoAlerta.setText("El usuario ya existe");
                }else{
                    System.out.println(e);
                }
            }
        }
    }//GEN-LAST:event_BotonRegistrarUsuarioMouseClicked
    private void BotonRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarUsuarioActionPerformed
    }//GEN-LAST:event_BotonRegistrarUsuarioActionPerformed
    private void RegresarLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarLoginMouseClicked
        VentanaLogin ventana = new VentanaLogin();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegresarLoginMouseClicked
    private void BotonCerrarVentanaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarVentanaMouseClicked
        VentanaRegistro ven = new VentanaRegistro();
        ven.setVisible(false);
        dispose();
        VentanaLogin veng = new VentanaLogin();
        veng.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonCerrarVentanaMouseClicked
    public static void main(String args[]) {
        try{
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()){
                if ("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex){
            java.util.logging.Logger.getLogger(VentanaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() ->{
            new VentanaRegistro().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlertExito;
    private javax.swing.JButton BotonCerrarVentana;
    private javax.swing.JButton BotonRegistrarUsuario;
    private javax.swing.JTextField Campo_registro_email;
    private javax.swing.JPasswordField Campo_registro_password;
    private javax.swing.JTextField Campo_registro_usuario;
    private javax.swing.JLabel RegresarLogin;
    private javax.swing.JLabel TextoAlerta;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}