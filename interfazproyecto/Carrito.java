/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazproyecto;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
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
public class Carrito extends javax.swing.JFrame implements Printable{
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<FacturaCarrito> compra;
    
    /**
     * Creates new form Carrito
     */
    public Carrito() {
        initComponents();
        compra = new ArrayList();
    }
    public Carrito(ArrayList listaVenta){
        initComponents();
        
        compra = listaVenta;
        
        modelo.addColumn("Combo");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Noches de estadia");
        modelo.addColumn("precio");
        
        ActualizarTabla();
        
        setImageLabel(CarritoComprasPNG, "C:src\\imagen_interfaz\\carrito-de-compras.png");
    }

    public void ActualizarTabla(){
    while (modelo.getRowCount()>0){
        modelo.removeRow(0);
    }
       
    double subtotal=0;
    for(FacturaCarrito FC : compra){
        Object x[] = new Object[4];
        x[0] = FC.getCombo();
        x[1] = FC.getInicioEstadia();
        x[2] = FC.getNoches();
        x[3] = FC.getPrecio();
        modelo.addRow(x);
        subtotal += FC.getPrecio();
    }
    
    Total.setText(aMoneda(subtotal));
    double iva = subtotal*0.12;
    IVA.setText(aMoneda(iva));
    
    TblCombos.setModel(modelo);
    }
    public String aMoneda(double precio){
        return Math.round(precio*100.0)/100.0 + " Q";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Reservar = new javax.swing.JButton();
        CarritoComprasPNG = new javax.swing.JLabel();
        PanelFactura = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCombos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        IVA = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
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

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Carrito");

        jButton5.setBackground(new java.awt.Color(255, 153, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Nosotros");

        jButton7.setBackground(new java.awt.Color(255, 153, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Tus reservas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        Reservar.setBackground(new java.awt.Color(51, 204, 0));
        Reservar.setForeground(new java.awt.Color(255, 255, 255));
        Reservar.setText("Reservar");
        Reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir(evt);
            }
        });
        jPanel1.add(Reservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 110, 50));

        CarritoComprasPNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen_interfaz/carrito-de-compras.png"))); // NOI18N
        CarritoComprasPNG.setText("jLabel7");
        jPanel1.add(CarritoComprasPNG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 190, 160));

        PanelFactura.setBackground(new java.awt.Color(0, 0, 0));
        PanelFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        PanelFactura.setForeground(new java.awt.Color(51, 51, 51));
        PanelFactura.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(51, 0, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        TblCombos.setBackground(new java.awt.Color(0, 0, 0));
        TblCombos.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        TblCombos.setForeground(new java.awt.Color(255, 255, 255));
        TblCombos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Combo", "Fecha de Ingreso", "Noches", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblCombos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TblCombos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblCombosMouseClicked(evt);
            }
        });
        TblCombos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TblCombosKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TblCombosKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(TblCombos);

        PanelFactura.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 129, -1, 170));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        PanelFactura.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 92, 430, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel5");
        PanelFactura.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 60, 104, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");
        PanelFactura.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 56, 82, 24));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DIP");
        PanelFactura.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 31, 87, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        PanelFactura.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 31, 60, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Factura");
        PanelFactura.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("asdfg");
        PanelFactura.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 9, -1, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente");
        PanelFactura.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 28, 73, 25));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Precio Total");
        PanelFactura.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 300, 82, 28));

        Total.setBackground(new java.awt.Color(0, 0, 0));
        Total.setForeground(new java.awt.Color(255, 255, 255));
        Total.setText("jLabel10");
        PanelFactura.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 306, 48, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("IVA");
        PanelFactura.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 70, -1));

        IVA.setBackground(new java.awt.Color(0, 0, 0));
        IVA.setForeground(new java.awt.Color(255, 255, 255));
        IVA.setText("jLabel11");
        PanelFactura.add(IVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jPanel1.add(PanelFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 470, 400));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel4");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 110, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    Seleccion abrir = new Seleccion(compra);
    abrir.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed
    
    
    
    private void Imprimir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir
    if (TblCombos.getRowCount() == 0) {
    JOptionPane.showMessageDialog(null, "No Existen Datos", "Advertencia", JOptionPane.WARNING_MESSAGE);
} else {
    try {
        PrinterJob gap = PrinterJob.getPrinterJob();
        gap.setPrintable(this);
        boolean top = gap.printDialog();
        if (top) {
            gap.print();
        }
    } catch (PrinterException pex) {
        JOptionPane.showMessageDialog(null, "Lo sentimos, hubo un error en el programa. Error: " + pex, "Error", JOptionPane.INFORMATION_MESSAGE);
    }
        for (int i = 0; i < TblCombos.getRowCount(); i++) {
    String ComboF, fechaEstadiaF, nochesF, precioF;
    ComboF = TblCombos.getValueAt(i, 0).toString();
    fechaEstadiaF = TblCombos.getValueAt(i, 1).toString();
    nochesF = TblCombos.getValueAt(i, 2).toString();
    precioF = TblCombos.getValueAt(i, 3).toString();

    String datos [] = {ComboF, fechaEstadiaF, nochesF, precioF};
    
    Reserva abrir = new Reserva(datos);
    abrir.setVisible(true);
    this.setVisible(false); 
    
}
    }
    }//GEN-LAST:event_Imprimir
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    compra.clear();
    ActualizarTabla();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TblCombosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblCombosMouseClicked
    ActualizarTabla();
    }//GEN-LAST:event_TblCombosMouseClicked

    private void TblCombosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TblCombosKeyTyped
    ActualizarTabla();
    }//GEN-LAST:event_TblCombosKeyTyped

    private void TblCombosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TblCombosKeyPressed
    ActualizarTabla();
    }//GEN-LAST:event_TblCombosKeyPressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Reserva abrir = new Reserva(compra);
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

     private void setImageLabel(JLabel labelname, String root ){
            ImageIcon image = new ImageIcon(root);
            Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelname.getWidth(), labelname.getHeight(), Image.SCALE_DEFAULT));
            labelname.setIcon(icon);
            this.repaint();
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
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CarritoComprasPNG;
    private javax.swing.JLabel IVA;
    private javax.swing.JPanel PanelFactura;
    private javax.swing.JButton Reservar;
    private javax.swing.JTable TblCombos;
    private javax.swing.JLabel Total;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    @Override
    public int print(Graphics graf, PageFormat pagfor, int Index) throws PrinterException {
        if(Index > 0){
            return NO_SUCH_PAGE;
        }
        Graphics2D hub = (Graphics2D) graf;
        hub.translate(pagfor.getImageableX() * 30, pagfor.getImageableY() * 30);
        hub.scale(1.0, 1.0);
        
        PanelFactura.print(graf);
        return PAGE_EXISTS;
    }
}
