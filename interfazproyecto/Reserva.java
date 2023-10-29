/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazproyecto;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pablo
 */
public class Reserva extends javax.swing.JFrame {
    ArrayList<FacturaCarrito> compra;
    ArrayList<FacturaCarrito> Reserva;
    static String datosR[];
    private int fila;
    
    public static DefaultTableModel modelo2 = new DefaultTableModel();
    /**
     * Creates new form Reserva
     */
    public Reserva() {
        initComponents();
    }
    
    public Reserva(ArrayList listaVenta) {
        initComponents();
        modelo2 = new DefaultTableModel();
        
        modelo2.addColumn("Combo");
        modelo2.addColumn("Fecha Inicio");
        modelo2.addColumn("Noches de estadia");
        modelo2.addColumn("precio");
        
        compra = new ArrayList();
        compra = listaVenta;
        Reserva = new ArrayList();
        Reserva = listaVenta;
        
        setImageLabel(Hojas, "C:src\\imagen_interfaz\\HojasVerdes.jpg");
        DefaultTableModel reservas = (DefaultTableModel)ReservacionA.getModel();
        reservas.addRow(datosR); 
    }
    
    public Reserva(String[] listaVenta) {
        initComponents();
        modelo2 = new DefaultTableModel();
        
        modelo2.addColumn("Combo");
        modelo2.addColumn("Fecha Inicio");
        modelo2.addColumn("Noches de estadia");
        modelo2.addColumn("precio"); 
        
        datosR = listaVenta;
        setImageLabel(Hojas, "C:src\\imagen_interfaz\\HojasVerdes.jpg");
        DefaultTableModel reservas = (DefaultTableModel)ReservacionA.getModel();
        reservas.addRow(datosR); 
    }
    
    public String aMoneda(double precio){
        return Math.round(precio*100.0)/100.0 + " Q";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReservacionA = new javax.swing.JTable();
        Hotel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        Hojas = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        IVA = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setForeground(new java.awt.Color(102, 102, 102));

        jButton6.setBackground(new java.awt.Color(255, 153, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Inicio");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Carrito");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Nosotros");

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Tus Reservas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setForeground(new java.awt.Color(255, 255, 255));

        ReservacionA.setBackground(new java.awt.Color(0, 0, 0));
        ReservacionA.setForeground(new java.awt.Color(255, 255, 255));
        ReservacionA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Combo", "Fecha de Inicio", "Noches", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ReservacionA);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, 180));

        Hotel.setBackground(new java.awt.Color(255, 204, 204));
        Hotel.setFont(new java.awt.Font("Vladimir Script", 0, 36)); // NOI18N
        Hotel.setForeground(new java.awt.Color(255, 255, 255));
        Hotel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hotel.setText("hotel generico");
        Hotel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.add(Hotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 320, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 300, 10));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Precio ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Noches ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, -1, -1));

        Total.setBackground(new java.awt.Color(0, 0, 0));
        Total.setForeground(new java.awt.Color(255, 255, 255));
        Total.setText("jLabel5");
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, -1, -1));

        Hojas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_interfaz/HojasVerdes.jpg"))); // NOI18N
        Hojas.setText("jLabel6");
        jPanel1.add(Hojas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 700, 90));

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 110, 30));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("IVA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, -1, -1));

        IVA.setBackground(new java.awt.Color(0, 0, 0));
        IVA.setForeground(new java.awt.Color(255, 255, 255));
        IVA.setText("jLabel5");
        jPanel1.add(IVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 70, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cliente");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, 20));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha de inicio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 20));

        jButton7.setBackground(new java.awt.Color(0, 204, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Seleccionar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 110, 30));

        jTextField1.setText("jTextField1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 40, -1));

        jTextField2.setText("jTextField2");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 40, -1));

        jTextField3.setText("jTextField3");
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 40, -1));

        jTextField4.setText("jTextField4");
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 40, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    Seleccion abrir = new Seleccion(compra);
    abrir.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Reserva.clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    Carrito abrir = new Carrito(compra);
    abrir.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    if(ReservacionA.getSelectedRow() == -1){
        JOptionPane.showMessageDialog(null, "debe seleccionar una fila para utilizar esta opcion ","ERROR AL MODIFICAR RESERVACION", JOptionPane.WARNING_MESSAGE);
    } else {
    fila = ReservacionA.getSelectedRow();
    //TxTFechaI.setText(modelo2.getValueAt(ReservacionA.getSelectedRow(), 1).toString());
    //TxTNoches.setText(modelo2.getValueAt(ReservacionA.getSelectedRow(), 2).toString());
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    //modelo2.setValueAt(TxTFechaI.getText().trim(), fila, 1);
    //modelo2.setValueAt(TxTNoches.getText().trim(), fila, 2);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reserva().setVisible(true);
            }
        });
    }
     private void setImageLabel(JLabel labelname, String root ){
            ImageIcon image = new ImageIcon(root);
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
            labelname.setIcon(icon);
            this.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Hojas;
    private javax.swing.JLabel Hotel;
    private javax.swing.JLabel IVA;
    public static javax.swing.JTable ReservacionA;
    private javax.swing.JLabel Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}