package vista;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import proyectoprogramacion.Menu;
import proyectoprogramacion.ObtenerNombre;
import proyectoprogramacion.TextPrompt;
import proyectoprogramacion.VentanaRegistro;
public final class VentanaLogin extends javax.swing.JFrame {
    public VentanaLogin() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        Font poppinsFont = null;
        try {
            // Cargar la fuente desde el archivo en la carpeta "fonts" del proyecto
             poppinsFont = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Poppins-Thin.ttf"));
            GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(poppinsFont);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
            System.out.println("Error en la carga de la fuente de poppins");
            // Manejo de excepciones en caso de que haya problemas al cargar la fuente
        }

        lbl_login.setFont(poppinsFont.deriveFont(Font.BOLD, 50));
        lbl_text.setFont(poppinsFont.deriveFont(Font.BOLD, 16));
        lbl_login.setAlignmentX(CENTER_ALIGNMENT);
        TextPrompt holderUsuarioLogin = new TextPrompt("Correo", Campo_email_login);
        TextPrompt holderContraseñaLogin = new TextPrompt("Contraseña", Campo_password_login);
    }
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("img/logo.png"));
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Campo_email_login = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Campo_password_login = new javax.swing.JPasswordField();
        BotonIniciarSesion = new javax.swing.JButton();
        BotonRegistrarse = new javax.swing.JButton();
        BotonCerrar = new javax.swing.JButton();
        TextoAlerta = new javax.swing.JLabel();
        lbl_login = new javax.swing.JLabel();
        lbl_text = new javax.swing.JLabel();
        img_icono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(31, 65, 169));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_user.png"))); // NOI18N

        Campo_email_login.setBackground(new java.awt.Color(31, 65, 169));
        Campo_email_login.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        Campo_email_login.setForeground(new java.awt.Color(255, 255, 255));
        Campo_email_login.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Campo_email_login, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(Campo_email_login)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 352, 45));

        jPanel2.setBackground(new java.awt.Color(31, 65, 169));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icono_pass.png"))); // NOI18N

        Campo_password_login.setBackground(new java.awt.Color(31, 65, 169));
        Campo_password_login.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        Campo_password_login.setForeground(new java.awt.Color(255, 255, 255));
        Campo_password_login.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Campo_password_login, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
            .addComponent(Campo_password_login)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 352, 45));

        BotonIniciarSesion.setBackground(new java.awt.Color(39, 79, 199));
        BotonIniciarSesion.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        BotonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BotonIniciarSesion.setText("Iniciar sesión");
        BotonIniciarSesion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        BotonIniciarSesion.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BotonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIniciarSesionMouseClicked(evt);
            }
        });
        getContentPane().add(BotonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 352, 45));

        BotonRegistrarse.setBackground(new java.awt.Color(26, 27, 34));
        BotonRegistrarse.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        BotonRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarse.setText("Registrarme");
        BotonRegistrarse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        BotonRegistrarse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BotonRegistrarse.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BotonRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarseMouseClicked(evt);
            }
        });
        getContentPane().add(BotonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, 352, 45));

        BotonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BotonCerrar.png"))); // NOI18N
        BotonCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseClicked(evt);
            }
        });
        getContentPane().add(BotonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 28, 28));

        TextoAlerta.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        TextoAlerta.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(TextoAlerta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 270, -1));

        lbl_login.setFont(new java.awt.Font("Arial", 0, 50)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(255, 255, 255));
        lbl_login.setText("Login");
        getContentPane().add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        lbl_text.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbl_text.setForeground(new java.awt.Color(255, 255, 255));
        lbl_text.setText("Por favor ingrese el usuario y contraseña");
        getContentPane().add(lbl_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, -1));

        img_icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.jpg"))); // NOI18N
        img_icono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(img_icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void BotonIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarSesionMouseClicked
        try{
            Connection cn = Menu.getConeccion();
            PreparedStatement pst = cn.prepareStatement("select * from users where user_email = ?");
            pst.setString(1,  Campo_email_login.getText().trim());
            ResultSet rs = pst.executeQuery();
            if (rs.next()){
                setNombreusuario(rs.getString(2)); 
                if (rs.getString(4).equals(String.valueOf(Campo_password_login.getPassword()).trim())){
                    Menu mn = new Menu();
                    mn.setVisible(true);
                    dispose();
                } else{
                    TextoAlerta.setText("Contraseña incorrecta");
                }
            } else{
                TextoAlerta.setText("Usuario no existe");
            }
        } catch (SQLException e){
            System.out.println("Error de conexion");
        }
    }//GEN-LAST:event_BotonIniciarSesionMouseClicked
    private void BotonRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarseMouseClicked
        VentanaRegistro ventana = new VentanaRegistro();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonRegistrarseMouseClicked
    private void BotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_BotonCerrarMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() ->
        {
            new VentanaLogin().setVisible(true);
        });
    }
    public static void setNombreusuario(String nombre){
        ObtenerNombre.setNombre(nombre);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonIniciarSesion;
    private javax.swing.JButton BotonRegistrarse;
    private javax.swing.JTextField Campo_email_login;
    private javax.swing.JPasswordField Campo_password_login;
    private javax.swing.JLabel TextoAlerta;
    private javax.swing.JLabel img_icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_text;
    // End of variables declaration//GEN-END:variables
}