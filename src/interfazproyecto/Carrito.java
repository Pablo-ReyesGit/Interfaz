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
    private DefaultTableModel modelo = new DefaultTableModel();
    private ArrayList<FacturaCarrito> compra;
    
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
    while (getModelo().getRowCount()>0){
            getModelo().removeRow(0);
    }
       
    double subtotal=0;
    for(FacturaCarrito FC : getCompra()){
        Object x[] = new Object[4];
        x[0] = FC.getCombo();
        x[1] = FC.getInicioEstadia();
        x[2] = FC.getNoches();
        x[3] = FC.getPrecio();
            getModelo().addRow(x);
        subtotal += FC.getPrecio();
    }
    
        getTotal().setText(aMoneda(subtotal));
    double iva = subtotal*0.12;
        getIVA().setText(aMoneda(iva));
    
        getTblCombos().setModel(getModelo());
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
    Seleccion abrir = new Seleccion(getCompra());
    abrir.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed
    
    
    
    private void Imprimir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir
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
        for (int i = 0; i < getTblCombos().getRowCount(); i++) {
    String ComboF, fechaEstadiaF, nochesF, precioF;
    ComboF = getTblCombos().getValueAt(i, 0).toString();
    fechaEstadiaF = getTblCombos().getValueAt(i, 1).toString();
    nochesF = getTblCombos().getValueAt(i, 2).toString();
    precioF = getTblCombos().getValueAt(i, 3).toString();

    String datos [] = {ComboF, fechaEstadiaF, nochesF, precioF};
    
    Reserva abrir = new Reserva(datos);
    abrir.setVisible(true);
    this.setVisible(false); 
    
}
    }//GEN-LAST:event_Imprimir
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        getCompra().clear();
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
        Reserva abrir = new Reserva(getCompra());
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
        
        getPanelFactura().print(graf);
        return PAGE_EXISTS;
    }

    /**
     * @return the modelo
     */
    public DefaultTableModel getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(DefaultTableModel modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the compra
     */
    public ArrayList<FacturaCarrito> getCompra() {
        return compra;
    }

    /**
     * @param compra the compra to set
     */
    public void setCompra(ArrayList<FacturaCarrito> compra) {
        this.compra = compra;
    }

    /**
     * @return the CarritoComprasPNG
     */
    public javax.swing.JLabel getCarritoComprasPNG() {
        return CarritoComprasPNG;
    }

    /**
     * @param CarritoComprasPNG the CarritoComprasPNG to set
     */
    public void setCarritoComprasPNG(javax.swing.JLabel CarritoComprasPNG) {
        this.CarritoComprasPNG = CarritoComprasPNG;
    }

    /**
     * @return the IVA
     */
    public javax.swing.JLabel getIVA() {
        return IVA;
    }

    /**
     * @param IVA the IVA to set
     */
    public void setIVA(javax.swing.JLabel IVA) {
        this.IVA = IVA;
    }

    /**
     * @return the PanelFactura
     */
    public javax.swing.JPanel getPanelFactura() {
        return PanelFactura;
    }

    /**
     * @param PanelFactura the PanelFactura to set
     */
    public void setPanelFactura(javax.swing.JPanel PanelFactura) {
        this.PanelFactura = PanelFactura;
    }

    /**
     * @return the Reservar
     */
    public javax.swing.JButton getReservar() {
        return Reservar;
    }

    /**
     * @param Reservar the Reservar to set
     */
    public void setReservar(javax.swing.JButton Reservar) {
        this.Reservar = Reservar;
    }

    /**
     * @return the TblCombos
     */
    public javax.swing.JTable getTblCombos() {
        return TblCombos;
    }

    /**
     * @param TblCombos the TblCombos to set
     */
    public void setTblCombos(javax.swing.JTable TblCombos) {
        this.TblCombos = TblCombos;
    }

    /**
     * @return the Total
     */
    public javax.swing.JLabel getTotal() {
        return Total;
    }

    /**
     * @param Total the Total to set
     */
    public void setTotal(javax.swing.JLabel Total) {
        this.Total = Total;
    }

    /**
     * @return the jButton2
     */
    public javax.swing.JButton getjButton2() {
        return jButton2;
    }

    /**
     * @param jButton2 the jButton2 to set
     */
    public void setjButton2(javax.swing.JButton jButton2) {
        this.jButton2 = jButton2;
    }

    /**
     * @return the jButton4
     */
    public javax.swing.JButton getjButton4() {
        return jButton4;
    }

    /**
     * @param jButton4 the jButton4 to set
     */
    public void setjButton4(javax.swing.JButton jButton4) {
        this.jButton4 = jButton4;
    }

    /**
     * @return the jButton5
     */
    public javax.swing.JButton getjButton5() {
        return jButton5;
    }

    /**
     * @param jButton5 the jButton5 to set
     */
    public void setjButton5(javax.swing.JButton jButton5) {
        this.jButton5 = jButton5;
    }

    /**
     * @return the jButton6
     */
    public javax.swing.JButton getjButton6() {
        return jButton6;
    }

    /**
     * @param jButton6 the jButton6 to set
     */
    public void setjButton6(javax.swing.JButton jButton6) {
        this.jButton6 = jButton6;
    }

    /**
     * @return the jButton7
     */
    public javax.swing.JButton getjButton7() {
        return jButton7;
    }

    /**
     * @param jButton7 the jButton7 to set
     */
    public void setjButton7(javax.swing.JButton jButton7) {
        this.jButton7 = jButton7;
    }

    /**
     * @return the jLabel1
     */
    public javax.swing.JLabel getjLabel1() {
        return jLabel1;
    }

    /**
     * @param jLabel1 the jLabel1 to set
     */
    public void setjLabel1(javax.swing.JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    /**
     * @return the jLabel10
     */
    public javax.swing.JLabel getjLabel10() {
        return jLabel10;
    }

    /**
     * @param jLabel10 the jLabel10 to set
     */
    public void setjLabel10(javax.swing.JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    /**
     * @return the jLabel2
     */
    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    /**
     * @param jLabel2 the jLabel2 to set
     */
    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    /**
     * @return the jLabel3
     */
    public javax.swing.JLabel getjLabel3() {
        return jLabel3;
    }

    /**
     * @param jLabel3 the jLabel3 to set
     */
    public void setjLabel3(javax.swing.JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    /**
     * @return the jLabel4
     */
    public javax.swing.JLabel getjLabel4() {
        return jLabel4;
    }

    /**
     * @param jLabel4 the jLabel4 to set
     */
    public void setjLabel4(javax.swing.JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    /**
     * @return the jLabel5
     */
    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    /**
     * @param jLabel5 the jLabel5 to set
     */
    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    /**
     * @return the jLabel6
     */
    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    /**
     * @param jLabel6 the jLabel6 to set
     */
    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    /**
     * @return the jLabel7
     */
    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     * @param jLabel7 the jLabel7 to set
     */
    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    /**
     * @return the jLabel8
     */
    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    /**
     * @param jLabel8 the jLabel8 to set
     */
    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    /**
     * @return the jLabel9
     */
    public javax.swing.JLabel getjLabel9() {
        return jLabel9;
    }

    /**
     * @param jLabel9 the jLabel9 to set
     */
    public void setjLabel9(javax.swing.JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    /**
     * @return the jPanel1
     */
    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    /**
     * @param jPanel1 the jPanel1 to set
     */
    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    /**
     * @return the jPanel5
     */
    public javax.swing.JPanel getjPanel5() {
        return jPanel5;
    }

    /**
     * @param jPanel5 the jPanel5 to set
     */
    public void setjPanel5(javax.swing.JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    /**
     * @return the jScrollPane1
     */
    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    /**
     * @param jScrollPane1 the jScrollPane1 to set
     */
    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    /**
     * @return the jSeparator1
     */
    public javax.swing.JSeparator getjSeparator1() {
        return jSeparator1;
    }

    /**
     * @param jSeparator1 the jSeparator1 to set
     */
    public void setjSeparator1(javax.swing.JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }
}
