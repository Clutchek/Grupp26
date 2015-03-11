/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

/**
 *
 * @author Alexander Kloutschek
 */
public class DeliveryWizardView extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryWizardView
     */
    public DeliveryWizardView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        progressPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        billingAddress = new javax.swing.JLabel();
        deliveryAlternativeLabel = new javax.swing.JLabel();
        deliveryRadioButton = new javax.swing.JRadioButton();
        pickupRadioButton = new javax.swing.JRadioButton();
        cardPanel = new javax.swing.JPanel();
        deliveryAddressPanel = new javax.swing.JPanel();
        deliveryAddressLabel = new javax.swing.JLabel();
        billingRadioButton = new javax.swing.JRadioButton();
        differentAdressRadioButton = new javax.swing.JRadioButton();
        cardAddressPanel = new javax.swing.JPanel();
        otherAddressPanel = new javax.swing.JPanel();
        otherAdressField = new javax.swing.JTextField();
        emptyAdressPanel = new javax.swing.JPanel();
        emptyPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();

        javax.swing.GroupLayout progressPanelLayout = new javax.swing.GroupLayout(progressPanel);
        progressPanel.setLayout(progressPanelLayout);
        progressPanelLayout.setHorizontalGroup(
            progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        progressPanelLayout.setVerticalGroup(
            progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        billingAddress.setText("1. Faktureringsaddress");

        deliveryAlternativeLabel.setText("2. Leveransalternativ");

        deliveryRadioButton.setText("Leverans");

        pickupRadioButton.setText("Hämta i Butik");

        cardPanel.setLayout(new java.awt.CardLayout());

        deliveryAddressLabel.setText("3. Leveransaddress");

        billingRadioButton.setText("Leverera till faktureringsadress");

        differentAdressRadioButton.setText("Leverera till annan adress");

        cardAddressPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout otherAddressPanelLayout = new javax.swing.GroupLayout(otherAddressPanel);
        otherAddressPanel.setLayout(otherAddressPanelLayout);
        otherAddressPanelLayout.setHorizontalGroup(
            otherAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(otherAdressField, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
        );
        otherAddressPanelLayout.setVerticalGroup(
            otherAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, otherAddressPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(otherAdressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardAddressPanel.add(otherAddressPanel, "card3");

        javax.swing.GroupLayout emptyAdressPanelLayout = new javax.swing.GroupLayout(emptyAdressPanel);
        emptyAdressPanel.setLayout(emptyAdressPanelLayout);
        emptyAdressPanelLayout.setHorizontalGroup(
            emptyAdressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        emptyAdressPanelLayout.setVerticalGroup(
            emptyAdressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        cardAddressPanel.add(emptyAdressPanel, "card2");

        javax.swing.GroupLayout deliveryAddressPanelLayout = new javax.swing.GroupLayout(deliveryAddressPanel);
        deliveryAddressPanel.setLayout(deliveryAddressPanelLayout);
        deliveryAddressPanelLayout.setHorizontalGroup(
            deliveryAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliveryAddressPanelLayout.createSequentialGroup()
                .addComponent(deliveryAddressLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(deliveryAddressPanelLayout.createSequentialGroup()
                .addGroup(deliveryAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billingRadioButton)
                    .addComponent(differentAdressRadioButton)
                    .addComponent(cardAddressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        deliveryAddressPanelLayout.setVerticalGroup(
            deliveryAddressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliveryAddressPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deliveryAddressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(billingRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(differentAdressRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cardAddressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        cardPanel.add(deliveryAddressPanel, "card2");

        javax.swing.GroupLayout emptyPanelLayout = new javax.swing.GroupLayout(emptyPanel);
        emptyPanel.setLayout(emptyPanelLayout);
        emptyPanelLayout.setHorizontalGroup(
            emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        emptyPanelLayout.setVerticalGroup(
            emptyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 147, Short.MAX_VALUE)
        );

        cardPanel.add(emptyPanel, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pickupRadioButton)
                    .addComponent(deliveryRadioButton)
                    .addComponent(deliveryAlternativeLabel)
                    .addComponent(billingAddress)
                    .addComponent(jTextField1)
                    .addComponent(cardPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(billingAddress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deliveryAlternativeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deliveryRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pickupRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        backButton.setText("< Tillbaka");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Nästa >");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(392, 392, 392))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(progressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(nextButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainWindow.showPrevious();
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        MainWindow.showPaymentWizardView();
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel billingAddress;
    private javax.swing.JRadioButton billingRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel cardAddressPanel;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel deliveryAddressLabel;
    private javax.swing.JPanel deliveryAddressPanel;
    private javax.swing.JLabel deliveryAlternativeLabel;
    private javax.swing.JRadioButton deliveryRadioButton;
    private javax.swing.JRadioButton differentAdressRadioButton;
    private javax.swing.JPanel emptyAdressPanel;
    private javax.swing.JPanel emptyPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton nextButton;
    private javax.swing.JPanel otherAddressPanel;
    private javax.swing.JTextField otherAdressField;
    private javax.swing.JRadioButton pickupRadioButton;
    private javax.swing.JPanel progressPanel;
    // End of variables declaration//GEN-END:variables
}
