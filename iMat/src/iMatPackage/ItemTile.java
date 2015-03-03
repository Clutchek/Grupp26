/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import javax.swing.ImageIcon;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import se.chalmers.ait.dat215.project.*;
/**
 *
 * @author Poya
 */
public class ItemTile extends javax.swing.JPanel implements ChangeListener {

    /**
     * Creates new form ItemTile
     */
    public ItemTile(Product p) {
        initComponents();
        shoppingItem = new ShoppingItem(p);
        
        
    }
    
    public void stateChanged(ChangeEvent e){
        shoppingItem.setAmount((double) amountSpinner.getValue());
        if((double)amountSpinner.getValue() > 0){
        itemPriceLabel.setText(String.valueOf(shoppingItem.getTotal()));
        }
        if(addProductButton == e.getSource()){
            store.getShoppingCart().addProduct(shoppingItem.getProduct(), shoppingItem.getAmount());
        }
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

        itemPriceLabel.setText(String.valueOf(p.getPrice()));

        amountSpinner.addChangeListener(this);

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

        foodPicLabel.setText("FOOD PIC LOL");

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
                .addComponent(foodPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

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
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(itemPicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(itemButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    
    Product p;
    ShoppingItem shoppingItem;
    StoreModel store;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductButton;
    private javax.swing.JSpinner amountSpinner;
    private javax.swing.JLabel foodPicLabel;
    private javax.swing.JPanel itemButtonsPanel;
    private javax.swing.JPanel itemPicPanel;
    private javax.swing.JLabel itemPriceLabel;
    // End of variables declaration//GEN-END:variables
}
