package proyectoprogramacion.ventanas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.*;
import java.util.ArrayList;
import proyectoprogramacion.Menu;
import proyectoprogramacion.llenarJson;
public class VentanaFactura extends javax.swing.JFrame {
    public static int contador = 1;
    public VentanaFactura() {
        initComponents();
        setIconImage(getIconImage());
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_precioTotal = new javax.swing.JLabel();
        label_fechaVenta = new javax.swing.JLabel();
        label_idfactura = new javax.swing.JLabel();
        label_nombrecliente = new javax.swing.JLabel();
        label_identidicacioncliente = new javax.swing.JLabel();
        label_telefonocliente = new javax.swing.JLabel();
        label_nombreRepuesto = new javax.swing.JLabel();
        label_precioRepuesto = new javax.swing.JLabel();
        label_nombreReparacion = new javax.swing.JLabel();
        label_precioReparacion = new javax.swing.JLabel();
        label_SubtotalRepuesto = new javax.swing.JLabel();
        label_SubtotalReparacion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_generar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_idventa = new javax.swing.JTextField();
        Notificacion = new javax.swing.JLabel();
        Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_precioTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_precioTotal.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(label_precioTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 415, 160, 22));

        label_fechaVenta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_fechaVenta.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(label_fechaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 230, 22));

        label_idfactura.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_idfactura.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(label_idfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 50, 22));

        label_nombrecliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_nombrecliente.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(label_nombrecliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 160, 22));

        label_identidicacioncliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_identidicacioncliente.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(label_identidicacioncliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 160, 22));

        label_telefonocliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_telefonocliente.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(label_telefonocliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 160, 22));

        label_nombreRepuesto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_nombreRepuesto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(label_nombreRepuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 277, 250, 22));

        label_precioRepuesto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_precioRepuesto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(label_precioRepuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 277, 160, 22));

        label_nombreReparacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_nombreReparacion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(label_nombreReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 302, 250, 22));

        label_precioReparacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_precioReparacion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(label_precioReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 302, 160, 22));

        label_SubtotalRepuesto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_SubtotalRepuesto.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(label_SubtotalRepuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 277, 160, 22));

        label_SubtotalReparacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label_SubtotalReparacion.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(label_SubtotalReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 302, 160, 22));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Factura.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 900, 470));

        btn_generar.setBackground(new java.awt.Color(0, 204, 51));
        btn_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/GENERAR.png"))); // NOI18N
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 22, -1, -1));

        btn_volver.setBackground(new java.awt.Color(255, 255, 255));
        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Btn_Volver.png"))); // NOI18N
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        getContentPane().add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/FACTURA_A.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 30));

        txt_idventa.setBackground(new java.awt.Color(255, 255, 255));
        txt_idventa.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_idventa.setForeground(new java.awt.Color(102, 102, 102));
        txt_idventa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        getContentPane().add(txt_idventa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 150, 30));

        Notificacion.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        Notificacion.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(Notificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 280, 22));

        Wallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Wall_factura.png"))); // NOI18N
        Wallpaper.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        getContentPane().add(Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        Menu m = new Menu();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_volverActionPerformed
    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        try{
            Connection cn = Menu.getConeccion();
            PreparedStatement ventas = cn.prepareStatement("Select * from sales where sale_id = ?");
            ventas.setString(1, txt_idventa.getText().trim());
            ResultSet resultado = ventas.executeQuery();
            if(resultado.next()){
                label_fechaVenta.setText(resultado.getString("sale_date"));
                label_precioTotal.setText(resultado.getString("sale_total_cost"));
                PreparedStatement cliente = cn.prepareStatement("select * from customers where customer_identification = ?");
                cliente.setString(1, resultado.getString("sale_customer_identification"));
                ResultSet resultadoCliente = cliente.executeQuery();
                if(resultadoCliente.next()){
                    label_nombrecliente.setText(resultadoCliente.getString("customer_name")+" "+resultadoCliente.getString("customer_lastname"));
                    label_identidicacioncliente.setText(resultadoCliente.getString("customer_identification"));
                    label_telefonocliente.setText(resultadoCliente.getString("customer_number"));
                }
                PreparedStatement repuesto = cn.prepareStatement("select * from parts where part_id = ?");
                repuesto.setString(1, resultado.getString("sale_part_id"));
                ResultSet resultadoRepuesto = repuesto.executeQuery();
                if(resultadoRepuesto.next()){
                    label_nombreRepuesto.setText(resultadoRepuesto.getString("part_description"));
                    label_precioRepuesto.setText(resultadoRepuesto.getString("part_unit_cost"));
                    label_SubtotalRepuesto.setText(resultadoRepuesto.getString("part_unit_cost"));
                }
                PreparedStatement reparacion = cn.prepareStatement("select * from repairs where repair_id = ?");
                reparacion.setString(1, resultado.getString("sale_repair_id"));
                ResultSet resultadoReparacion = reparacion.executeQuery();
                if(resultadoReparacion.next()){
                    label_nombreReparacion.setText(resultadoReparacion.getString("repair_description"));
                    label_precioReparacion.setText(resultadoReparacion.getString("repair_cost"));
                    label_SubtotalReparacion.setText(resultadoReparacion.getString("repair_cost"));
                }
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        ArrayList<factura> factura = new ArrayList();
        if (label_fechaVenta.getText().trim().equalsIgnoreCase("")){
            Notificacion.setText("No se encontro la venta");
        }else{
            int lineas = 0;
            try(BufferedReader br = new BufferedReader(new FileReader("Facturas.json"))){
                String linea;
                while((linea = br.readLine()) != null){
                    lineas++;
                }
            }catch(Exception e){
                System.out.println(e);
            }
            contador = (lineas+1);
            label_idfactura.setText(String.valueOf(contador));
            factura.add(new factura(contador,label_fechaVenta.getText(),label_nombrecliente.getText(),label_identidicacioncliente.getText(),label_telefonocliente.getText(),label_nombreRepuesto.getText(),label_nombreReparacion.getText(),label_precioTotal.getText()));
            llenarJson llenarJson = new llenarJson();
            llenarJson.tratarJson(factura);
        }
        
    }//GEN-LAST:event_btn_generarActionPerformed
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
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VentanaFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->{
            new VentanaFactura().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Notificacion;
    private javax.swing.JLabel Wallpaper;
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_SubtotalReparacion;
    private javax.swing.JLabel label_SubtotalRepuesto;
    private javax.swing.JLabel label_fechaVenta;
    private javax.swing.JLabel label_identidicacioncliente;
    private javax.swing.JLabel label_idfactura;
    private javax.swing.JLabel label_nombreReparacion;
    private javax.swing.JLabel label_nombreRepuesto;
    private javax.swing.JLabel label_nombrecliente;
    private javax.swing.JLabel label_precioReparacion;
    private javax.swing.JLabel label_precioRepuesto;
    private javax.swing.JLabel label_precioTotal;
    private javax.swing.JLabel label_telefonocliente;
    private javax.swing.JTextField txt_idventa;
    // End of variables declaration//GEN-END:variables
}
