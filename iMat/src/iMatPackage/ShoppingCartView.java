/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import se.chalmers.ait.dat215.project.CartEvent;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.Product;
import se.chalmers.ait.dat215.project.ShoppingCart;
import se.chalmers.ait.dat215.project.ShoppingCartListener;
import se.chalmers.ait.dat215.project.ShoppingItem;

/**
 *
 * @author Poya
 */
public class ShoppingCartView extends javax.swing.JPanel implements ShoppingCartListener,ActionListener {

	/**
	 * Creates new form ShoppingCartView
	 */
	public ShoppingCartView() {
		initComponents();
                itemList.setLayout(new BoxLayout(itemList, BoxLayout.Y_AXIS));
                this.cart = IMatDataHandler.getInstance().getShoppingCart();
                cart.addShoppingCartListener(this);
                updateView();
                
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        favoriteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        buyButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        itemList = new javax.swing.JPanel();

        setBackground(new java.awt.Color(51, 153, 255));
        setPreferredSize(new java.awt.Dimension(272, 367));

        favoriteButton.setBackground(new java.awt.Color(51, 102, 255));
        favoriteButton.setForeground(new java.awt.Color(255, 255, 255));
        favoriteButton.setText("Spara lista");

        clearButton.setBackground(new java.awt.Color(51, 102, 255));
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Rensa");
        clearButton.addActionListener(this);

        buyButton.setBackground(new java.awt.Color(255, 0, 0));
        buyButton.setForeground(new java.awt.Color(255, 255, 255));
        buyButton.setText("Köp");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        itemList.setBackground(new java.awt.Color(255, 255, 255));
        itemList.setMinimumSize(new java.awt.Dimension(270, 0));
        itemList.setLayout(new java.awt.GridLayout(0, 1));
        scrollPane.setViewportView(itemList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(favoriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(favoriteButton)
                    .addComponent(clearButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        StoreView.clearErrorPanel();
        MainWindow.showCartWizardView();
        CartWizardView.updateView();
    }//GEN-LAST:event_buyButtonActionPerformed
	

    public void updateView(){
        itemList.removeAll();
        List<ShoppingItem> items = cart.getItems();
        for(ShoppingItem item : items){
            addProduct(item);
        }
        itemList.repaint();
        scrollPane.repaint();
        repaint();
    }
    
    private void addProduct(ShoppingItem item){
        CartItem cartItem = new CartItem(item);
        itemList.add(cartItem);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == clearButton){
            cart.clear();
            updateView();
        }
    }
    @Override
    public void shoppingCartChanged(CartEvent ce) {
        updateView();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buyButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton favoriteButton;
    private javax.swing.JPanel itemList;
    private static javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables

    private ShoppingCart cart;

  

}
