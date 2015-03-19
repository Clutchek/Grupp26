/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import se.chalmers.ait.dat215.project.Order;

/**
 *
 * @author Poya
 */
public class OrderItemButton extends javax.swing.JPanel {

    private Order order;
    private ItemInfoPanel itemInfoPanel;
    
    public OrderItemButton(Order e) {
        initComponents();
        this.order = e;
        this.itemInfoPanel = new ItemInfoPanel(e);
        orderIDButton.setText("" + e.getDate());
        
    }
    
   /* @Override
    public void actionPerformed(ActionEvent e) {
        //clearOrderList metoden rensar info om eventuell tidigare order
        OrderHistoryView.clearOrderList();
        itemInfoPanel.listOrderInfo();
        OrderHistoryView.showOrderInfo(order);
    }
    */
    public ItemInfoPanel getItemInfoPanel(){
        return itemInfoPanel;
    }
    
    public Order getOrder(){
        return order;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderIDButton = new javax.swing.JButton();

        orderIDButton.setBackground(new java.awt.Color(51, 153, 255));
        orderIDButton.setForeground(new java.awt.Color(255, 255, 255));
        orderIDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderIDButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(orderIDButton, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(orderIDButton))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderIDButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderIDButtonActionPerformed
        OrderHistoryView.clearOrderList();
        OrderHistoryView.showOrderInfo(order);
    }//GEN-LAST:event_orderIDButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton orderIDButton;
    // End of variables declaration//GEN-END:variables

    
}
