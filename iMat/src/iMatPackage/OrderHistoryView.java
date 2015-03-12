/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Order;

/**
 *
 * @author Poya
 */
public class OrderHistoryView extends javax.swing.JPanel{

    private  static List<Order> orders;
    
    
    
    public OrderHistoryView() {
        initComponents();
        
        //orders = backend.getOrders();
    }
    
    public static void importOrders(){
        //orders = backend.getOrders();
        orderIDPanel.removeAll();
        for(Order e: IMatDataHandler.getInstance().getOrders()){
            orderIDPanel.add(new OrderItemButton(e));
        }
        orderIDPanel.repaint();
    }
    public static void clearOrderList(){
        orderResultPanel.removeAll();
        orderResultPanel.repaint();
        
    }
    
    public static void showOrderInfo(Order e){
        ItemInfoPanel itemInfo = new ItemInfoPanel(e);
        
        orderResultPanel.removeAll();
        
        orderResultPanel.add(itemInfo);
        itemInfo.listOrderInfo();
        
        orderResultPanel.repaint();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orderIDPane = new javax.swing.JScrollPane();
        orderIDPanel = new javax.swing.JPanel();
        orderResultScrollPane = new javax.swing.JScrollPane();
        orderResultPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();

        orderIDPanel.setLayout(new java.awt.GridLayout(0, 1));
        orderIDPane.setViewportView(orderIDPanel);

        orderResultPanel.setPreferredSize(new java.awt.Dimension(270, 200));
        orderResultPanel.setLayout(new java.awt.GridLayout(0, 1));
        orderResultScrollPane.setViewportView(orderResultPanel);

        backButton.setText("Tillbaka");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderIDPane, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(orderResultScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(orderResultScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 52, Short.MAX_VALUE))
                    .addComponent(orderIDPane))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainWindow.showStoreView();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JScrollPane orderIDPane;
    private static javax.swing.JPanel orderIDPanel;
    private static javax.swing.JPanel orderResultPanel;
    private javax.swing.JScrollPane orderResultScrollPane;
    // End of variables declaration//GEN-END:variables

    
}
