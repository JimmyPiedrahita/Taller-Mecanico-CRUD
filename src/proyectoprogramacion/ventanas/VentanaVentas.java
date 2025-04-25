package proyectoprogramacion.ventanas;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import proyectoprogramacion.Menu;
public class VentanaVentas extends javax.swing.JFrame {
    private DefaultTableModel modelo;
    private final Object [] ventas = new Object[8];
    public DefaultTableModel buscarPersonas(String buscar){   
        String []  nombresColumnas = {"ID","CLIENTE","PLACA","REPARACION","REPUESTO","DESCRIPCION","TOTAL","FECHA"};
        String [] registros = new String[8];
        DefaultTableModel modelo1 = new DefaultTableModel(null, nombresColumnas);
        String sql = "SELECT * FROM sales WHERE sale_id LIKE '%"+buscar+"%' OR sale_customer_identification LIKE '%"+buscar+"%'";
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;                           
        try{
            cn = Menu.getConeccion();
            pst = cn.prepareStatement(sql);                        
            rs = pst.executeQuery();
            while(rs.next()){
                registros[0] = rs.getString("sale_id");
                registros[1] = rs.getString("sale_customer_identification");
                registros[2] = rs.getString("sale_vehicle_registration");
                registros[3] = rs.getString("sale_repair_id");
                registros[4] = rs.getString("sale_part_id");
                registros[5] = rs.getString("sale_description");
                registros[6] = rs.getString("sale_total_cost");
                registros[7] = rs.getString("sale_date");
                modelo1.addRow(registros);
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            }
            catch(SQLException e){
                System.out.println(e);
            }
        }
         return modelo1;
    }
    //==============================
    public final void tablaSql(){
        Connection cn = Menu.getConeccion();
        try
        {
            PreparedStatement pt = cn.prepareStatement("SELECT * FROM sales");
            ResultSet rs = pt.executeQuery();
            
            modelo = (DefaultTableModel) tabla_ventas.getModel();
            while(rs.next()){
                ventas[0] = rs.getInt("sale_id");
                ventas[1] = rs.getString("sale_customer_identification");
                ventas[2] = rs.getString("sale_vehicle_registration");
                ventas[3] = rs.getString("sale_repair_id");
                ventas[4] = rs.getString("sale_part_id");
                ventas[5] = rs.getString("sale_description");
                ventas[6] = rs.getInt("sale_total_cost");
                ventas[7] = rs.getString("sale_date");
                modelo.addRow(ventas);
            }
        } catch (SQLException e){
            System.out.println(e);
        }
    }
    public VentanaVentas() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
        tablaSql();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_buscar = new javax.swing.JTextField();
        btn_volver = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_ventas = new javax.swing.JTable();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(948, 582));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_buscar.setBackground(new java.awt.Color(255, 255, 255));
        txt_buscar.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_buscar.setForeground(new java.awt.Color(0, 0, 51));
        txt_buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 280, 30));

        btn_volver.setBackground(new java.awt.Color(255, 255, 255));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Volver.png"))); // NOI18N
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 510, -1, -1));

        btn_buscar.setBackground(new java.awt.Color(0, 204, 204));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/lupa.png"))); // NOI18N
        btn_buscar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 30));

        tabla_ventas.setBackground(new java.awt.Color(204, 204, 204));
        tabla_ventas.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tabla_ventas.setForeground(new java.awt.Color(0, 0, 0));
        tabla_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CLIENTE", "PLACA", "REPARACION", "REPUESTO", "DESCRIPCION", "TOTAL", "FECHA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_ventas.setGridColor(new java.awt.Color(0, 0, 0));
        tabla_ventas.setSelectionBackground(new java.awt.Color(0, 0, 153));
        tabla_ventas.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabla_ventas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 900, 440));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.jpg"))); // NOI18N
        Wallpaper.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Wallpaper.setMinimumSize(new java.awt.Dimension(950, 552));
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        DefaultTableModel modelo1 = buscarPersonas(txt_buscar.getText());
        tabla_ventas.setModel(modelo1);
    }//GEN-LAST:event_btn_buscarActionPerformed
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
            java.util.logging.Logger.getLogger(VentanaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->{
            new VentanaVentas().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_ventas;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
