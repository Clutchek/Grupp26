/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListModel;
import se.chalmers.ait.dat215.project.Order;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Poya
 */
public class ItemInfoPanel extends javax.swing.JPanel {

    private Order order;
    private static DefaultListModel listModel;
    
    
    public ItemInfoPanel(Order o) {
       
         this.order = o;
        listModel = new DefaultListModel();
        initComponents();
       
        
    }
    
    public double getOrderTotal(){
        double temp = 0;
      for(ShoppingItem x : order.getItems()){
          temp = temp + x.getTotal();
      }  
      return temp;
    }
    
    public double getOrderAmount(){
        double temp = 0;
      for(ShoppingItem x : order.getItems()){
          temp = temp + x.getAmount();
      }  
      return temp;
    }
    
    public void listOrderInfo(){
        for(int i = 0; i < order.getItems().size(); i++){
           listModel.addElement(order.getItems().get(i).getProduct().getName() + ("       "
                   + order.getItems().get(i).getAmount()) + (" st        " + order.getItems().get(i).getTotal() + " kr"));
           
        }
        
        
        listModel.addElement("                         " + getOrderAmount() + " st    " + getOrderTotal() + " kr");
        itemInfoPanel.repaint();
           itemInfoPanel.revalidate();
           orderList.repaint();
           orderList.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemInfoPanel = new javax.swing.JPanel();
        orderScrollPane = new javax.swing.JScrollPane();
        orderList = new javax.swing.JList();

        setLayout(new java.awt.GridLayout(0, 1));

        orderList.setModel(listModel);
        orderList.setToolTipText("");
        orderScrollPane.setViewportView(orderList);

        javax.swing.GroupLayout itemInfoPanelLayout = new javax.swing.GroupLayout(itemInfoPanel);
        itemInfoPanel.setLayout(itemInfoPanelLayout);
        itemInfoPanelLayout.setHorizontalGroup(
            itemInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );
        itemInfoPanelLayout.setVerticalGroup(
            itemInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemInfoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(itemInfoPanel);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel itemInfoPanel;
    private javax.swing.JList orderList;
    private javax.swing.JScrollPane orderScrollPane;
    // End of variables declaration//GEN-END:variables
}
