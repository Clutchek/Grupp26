/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author Alexander
 */
public class SubCategoryPanel extends javax.swing.JPanel implements MouseListener{
    private List<SubCategory> subCategories;

    /**
     * Creates new form SubCategoriePanel
     */
    public SubCategoryPanel(List<SubCategory> subCategories){
        initComponents();
        this.subCategories = subCategories;
        this.setLayout(new GridLayout(1,subCategories.size()));
        for(SubCategory subCategorie : subCategories){
            JLabel categorieLabel = new JLabel(subCategorie.getName());
            categorieLabel.addMouseListener(this);
            this.add(categorieLabel);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for(SubCategory subCategorie : subCategories){
            if(e.getSource().toString() == subCategorie.getName()){
                //skicka produkter till result panel :D
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
