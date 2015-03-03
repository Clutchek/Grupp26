/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import se.chalmers.ait.dat215.project.*;
/**
 *
 * @author Poya
 */
public class ItemTile extends javax.swing.JPanel implements ChangeListener, ActionListener{

    /**
     * Creates new form ItemTile
     */
    public ItemTile(Product p) {
        this.p = p;
        shoppingItem = new ShoppingItem(p);
        backend = IMatDataHandler.getInstance();
        initComponents();  
        amountSpinner.addChangeListener(this);
        addProductButton.addActionListener(this);
        foodPicLabel.setIcon(backend.getImageIcon(p, 80, 60));
        foodNameLabel.setText(p.getName());
        itemPriceLabel.setText("Pris: " + String.valueOf(shoppingItem.getTotal()));
    }
    
    public void actionPerformed(ActionEvent e){
        temp = shoppingItem.getAmount();
        amount = amount + temp;
        shoppingItem.setAmount(amount);
        backend.getShoppingCart().addItem(shoppingItem);
        
        System.out.println(shoppingItem.getAmount());
    }
    
    
    public void stateChanged(ChangeEvent e){
        
            shoppingItem.setAmount(((Integer)(amountSpinner.getValue())).doubleValue());
            itemPriceLabel.setText("Pris: " + String.valueOf(shoppingItem.getTotal()));
        
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemButtonsPanel = new javax.swing.JPanel();
        itemPriceLabel = new javax.swing.JLabel();
        amountSpinner = new javax.swing.JSpinner();
        addProductButton = new javax.swing.JButton();
        itemPicPanel = new javax.swing.JPanel();
        foodPicLabel = new javax.swing.JLabel();
        foodNameLabel = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        amountSpinner.addChangeListener(this);
        amountSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

        addProductButton.setText("+");

        javax.swing.GroupLayout itemButtonsPanelLayout = new javax.swing.GroupLayout(itemButtonsPanel);
        itemButtonsPanel.setLayout(itemButtonsPanelLayout);
        itemButtonsPanelLayout.setHorizontalGroup(
            itemButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(itemButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemPriceLabel)
                    .addGroup(itemButtonsPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addProductButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        itemButtonsPanelLayout.setVerticalGroup(
            itemButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemButtonsPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(itemPriceLabel)
                .addGap(1, 1, 1)
                .addGroup(itemButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addProductButton))
                .addContainerGap())
        );

        itemPicPanel.setPreferredSize(new java.awt.Dimension(80, 70));

        javax.swing.GroupLayout itemPicPanelLayout = new javax.swing.GroupLayout(itemPicPanel);
        itemPicPanel.setLayout(itemPicPanelLayout);
        itemPicPanelLayout.setHorizontalGroup(
            itemPicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, itemPicPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foodPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        itemPicPanelLayout.setVerticalGroup(
            itemPicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemPicPanelLayout.createSequentialGroup()
                .addComponent(foodPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        foodNameLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(itemPicPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                    .addComponent(itemButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(foodNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(itemPicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(itemButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    double temp;
    double amount;
    Product p;
    ShoppingItem shoppingItem;
    IMatDataHandler backend;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductButton;
    private javax.swing.JSpinner amountSpinner;
    private javax.swing.JLabel foodNameLabel;
    private javax.swing.JLabel foodPicLabel;
    private javax.swing.JPanel itemButtonsPanel;
    private javax.swing.JPanel itemPicPanel;
    private javax.swing.JLabel itemPriceLabel;
    // End of variables declaration//GEN-END:variables

    

}
