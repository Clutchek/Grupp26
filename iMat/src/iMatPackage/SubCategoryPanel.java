/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Alexander
 */
public class SubCategoryPanel extends javax.swing.JPanel implements MouseListener, ActionListener{
    private List<SubCategory> subCategories;
    private JPanel titlePanel;
    private JPanel buttonPanel;
    private Category category;

    /**
     * Creates new form SubCategoriePanel
     */
    public SubCategoryPanel(Category c,List<SubCategory> subCategories){
        initComponents();
        titlePanel = new JPanel();
        this.setForeground(new Color(51,153,255));
        titlePanel.setForeground(new Color(51,153,255));
        titlePanel.setBackground(new Color(51,153,255));
        buttonPanel = new JPanel();
        buttonPanel.setForeground(new Color(51,153,255));
        category = c;
        this.subCategories = subCategories;
        this.setLayout(new GridLayout(0, 1));
        this.add(titlePanel);
        JLabel label = new JLabel(category.getName());
        label.setForeground(Color.WHITE);
        titlePanel.add(label);
        titlePanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        titlePanel.addMouseListener(this);
        this.add(buttonPanel);
        
        
        buttonPanel.setLayout(new GridLayout(0, 1));
        for(SubCategory subCategorie : subCategories){
            JButton subButton = new JButton("-"+subCategorie.getName());
            subButton.addActionListener(this);
            subButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
            subButton.setBackground(Color.WHITE);
            buttonPanel.add(subButton);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(51, 153, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(null, java.awt.Color.black));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 121, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        for(SubCategory subCategorie : subCategories){
            if(((JButton)e.getSource()).getText().equals("-"+subCategorie.getName())){
                StoreView.updateView(subCategorie.getProducts());
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        StoreView.updateView(category.getProducts());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
