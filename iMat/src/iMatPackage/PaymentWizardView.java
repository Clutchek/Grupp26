/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.awt.Color;
import se.chalmers.ait.dat215.project.CreditCard;
import se.chalmers.ait.dat215.project.IMatDataHandler;

/**
 *
 * @author Alexander Kloutschek
 */
public class PaymentWizardView extends javax.swing.JPanel {

    /**
     * Creates new form PaymentWizadView
     */
    public PaymentWizardView() {
        backend = IMatDataHandler.getInstance();
        initComponents();
        refreshView();
        mainPanel.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        backButton1 = new javax.swing.JButton();
        progressPanel = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();
        billingAddressPanel1 = new javax.swing.JPanel();
        changeBillingAdressButton1 = new javax.swing.JButton();
        deliveryAddressPanel1 = new javax.swing.JPanel();
        changeDeliveryAddressButton1 = new javax.swing.JButton();
        buyPanel = new javax.swing.JPanel();
        priceLabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        buyButton = new javax.swing.JButton();
        totalAmountLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        deliveryMethodPanel1 = new javax.swing.JPanel();
        changeDeliveryMethodButton1 = new javax.swing.JButton();
        cardInfoPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        billingPicLabel = new javax.swing.JLabel();
        bankPicLabel = new javax.swing.JLabel();
        cartPicLabel = new javax.swing.JLabel();
        payPalLabel = new javax.swing.JLabel();
        cardNbrLabel = new javax.swing.JLabel();
        cardNbrField1 = new javax.swing.JTextField();
        expireTextLabel = new javax.swing.JLabel();
        dayTextField = new javax.swing.JTextField();
        slashTextLabel = new javax.swing.JLabel();
        monthTextField = new javax.swing.JTextField();
        cvcTextLabel = new javax.swing.JLabel();
        cvcTextField = new javax.swing.JTextField();
        visaTextLabel = new javax.swing.JLabel();
        masterCardTextLabel = new javax.swing.JLabel();
        amExTextLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        cardNbrField2 = new javax.swing.JTextField();
        cardNbrField3 = new javax.swing.JTextField();
        cardNbrField4 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1200, 699));

        mainPanel.setPreferredSize(new java.awt.Dimension(1200, 699));

        backButton1.setText("< Tillbaka");
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });

        iconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.png"))); // NOI18N

        javax.swing.GroupLayout progressPanelLayout = new javax.swing.GroupLayout(progressPanel);
        progressPanel.setLayout(progressPanelLayout);
        progressPanelLayout.setHorizontalGroup(
            progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        progressPanelLayout.setVerticalGroup(
            progressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        billingAddressPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        changeBillingAdressButton1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        changeBillingAdressButton1.setText("Ändra");
        changeBillingAdressButton1.setBorderPainted(false);

        javax.swing.GroupLayout billingAddressPanel1Layout = new javax.swing.GroupLayout(billingAddressPanel1);
        billingAddressPanel1.setLayout(billingAddressPanel1Layout);
        billingAddressPanel1Layout.setHorizontalGroup(
            billingAddressPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(billingAddressPanel1Layout.createSequentialGroup()
                .addComponent(changeBillingAdressButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        billingAddressPanel1Layout.setVerticalGroup(
            billingAddressPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, billingAddressPanel1Layout.createSequentialGroup()
                .addGap(0, 100, Short.MAX_VALUE)
                .addComponent(changeBillingAdressButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        deliveryAddressPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        changeDeliveryAddressButton1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        changeDeliveryAddressButton1.setText("Ändra");
        changeDeliveryAddressButton1.setBorderPainted(false);

        javax.swing.GroupLayout deliveryAddressPanel1Layout = new javax.swing.GroupLayout(deliveryAddressPanel1);
        deliveryAddressPanel1.setLayout(deliveryAddressPanel1Layout);
        deliveryAddressPanel1Layout.setHorizontalGroup(
            deliveryAddressPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliveryAddressPanel1Layout.createSequentialGroup()
                .addComponent(changeDeliveryAddressButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        deliveryAddressPanel1Layout.setVerticalGroup(
            deliveryAddressPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deliveryAddressPanel1Layout.createSequentialGroup()
                .addGap(0, 94, Short.MAX_VALUE)
                .addComponent(changeDeliveryAddressButton1))
        );

        priceLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        priceLabel.setText("Pris:");

        amountLabel.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        amountLabel.setText("Antal varor: ");

        buyButton.setBackground(new java.awt.Color(0, 204, 51));
        buyButton.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        buyButton.setText("Slutför köp");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        totalAmountLabel.setText("" + IMatDataHandler.getInstance().getShoppingCart().getItems().size());

        totalPriceLabel.setText("" + IMatDataHandler.getInstance().getShoppingCart().getTotal());

        javax.swing.GroupLayout buyPanelLayout = new javax.swing.GroupLayout(buyPanel);
        buyPanel.setLayout(buyPanelLayout);
        buyPanelLayout.setHorizontalGroup(
            buyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(buyPanelLayout.createSequentialGroup()
                        .addComponent(priceLabel)
                        .addGap(5, 5, 5)
                        .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(amountLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        buyPanelLayout.setVerticalGroup(
            buyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalAmountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(buyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(priceLabel)
                        .addComponent(amountLabel))
                    .addGroup(buyPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(totalPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        deliveryMethodPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        changeDeliveryMethodButton1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        changeDeliveryMethodButton1.setText("Ändra");
        changeDeliveryMethodButton1.setBorderPainted(false);

        javax.swing.GroupLayout deliveryMethodPanel1Layout = new javax.swing.GroupLayout(deliveryMethodPanel1);
        deliveryMethodPanel1.setLayout(deliveryMethodPanel1Layout);
        deliveryMethodPanel1Layout.setHorizontalGroup(
            deliveryMethodPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deliveryMethodPanel1Layout.createSequentialGroup()
                .addComponent(changeDeliveryMethodButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        deliveryMethodPanel1Layout.setVerticalGroup(
            deliveryMethodPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deliveryMethodPanel1Layout.createSequentialGroup()
                .addGap(0, 94, Short.MAX_VALUE)
                .addComponent(changeDeliveryMethodButton1))
        );

        cardInfoPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        billingPicLabel.setText("BILD - Faktura");

        bankPicLabel.setText("BILD - Banköverföring");

        cartPicLabel.setText("BILD - Kortköp");

        payPalLabel.setText("BILD - PayPal");

        cardNbrLabel.setText("Kortnummer: ");

        cardNbrField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cardNbrField1MousePressed(evt);
            }
        });
        cardNbrField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNbrField1ActionPerformed(evt);
            }
        });

        expireTextLabel.setText("Utgångsdatum");

        dayTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dayTextFieldMousePressed(evt);
            }
        });

        slashTextLabel.setText("/");

        monthTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                monthTextFieldMousePressed(evt);
            }
        });
        monthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthTextFieldActionPerformed(evt);
            }
        });

        cvcTextLabel.setText("CVC:");

        cvcTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cvcTextFieldMousePressed(evt);
            }
        });
        cvcTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cvcTextFieldActionPerformed(evt);
            }
        });

        visaTextLabel.setText("VISA");

        masterCardTextLabel.setText("MasterCard");

        amExTextLabel.setText("American Express");

        cardNbrField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cardNbrField2MousePressed(evt);
            }
        });
        cardNbrField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNbrField2ActionPerformed(evt);
            }
        });

        cardNbrField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cardNbrField3MousePressed(evt);
            }
        });
        cardNbrField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNbrField3ActionPerformed(evt);
            }
        });

        cardNbrField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cardNbrField4MousePressed(evt);
            }
        });
        cardNbrField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardNbrField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cardInfoPanelLayout = new javax.swing.GroupLayout(cardInfoPanel);
        cardInfoPanel.setLayout(cardInfoPanelLayout);
        cardInfoPanelLayout.setHorizontalGroup(
            cardInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardInfoPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(cardInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billingPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bankPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(cartPicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(payPalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(cardInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardInfoPanelLayout.createSequentialGroup()
                        .addComponent(expireTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(slashTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cvcTextLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cvcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cardInfoPanelLayout.createSequentialGroup()
                        .addComponent(visaTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(masterCardTextLabel)
                        .addGap(18, 18, 18)
                        .addComponent(amExTextLabel))
                    .addGroup(cardInfoPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(cardNbrLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cardNbrField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardNbrField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardNbrField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardNbrField4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(243, 243, 243))
        );
        cardInfoPanelLayout.setVerticalGroup(
            cardInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(cardInfoPanelLayout.createSequentialGroup()
                .addGroup(cardInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cardInfoPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(billingPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bankPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cartPicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(payPalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cardInfoPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(cardInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardNbrLabel)
                            .addComponent(cardNbrField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardNbrField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardNbrField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cardNbrField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(cardInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(visaTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(masterCardTextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amExTextLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cardInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(expireTextLabel)
                            .addComponent(dayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slashTextLabel)
                            .addComponent(monthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cvcTextLabel)
                            .addComponent(cvcTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(errorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(backButton1))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cardInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(deliveryMethodPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billingAddressPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deliveryAddressPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addComponent(progressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(cardInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(backButton1))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(billingAddressPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deliveryAddressPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deliveryMethodPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        MainWindow.showDeliveryWizardView();
    }//GEN-LAST:event_backButton1ActionPerformed

    private void cardNbrField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNbrField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNbrField1ActionPerformed

    private void monthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthTextFieldActionPerformed

    private void cvcTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cvcTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cvcTextFieldActionPerformed

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButtonActionPerformed
        if(cardNbrField1.getText().equals("") || monthTextField.getText().equals("") || dayTextField.getText().equals("") || cvcTextField.getText().equals("")){
            errorLabel.setForeground(Color.red);
            errorLabel.setText("Information saknas i någon utav fälten");
            
            
        }else if((cardNbrField1.getText()+cardNbrField2.getText()+cardNbrField3.getText()+cardNbrField4.getText()).length() < 16){
            errorLabel.setForeground(Color.red);
            errorLabel.setText("Ditt kortnummer måste ha 16 siffror");
        }
        else{
        IMatDataHandler backend = IMatDataHandler.getInstance();
        CreditCard card = backend.getCreditCard();
        boolean correctFormat = false;
        try{
            card.setValidMonth(Integer.valueOf(monthTextField.getText()).intValue());
            card.setValidYear(Integer.valueOf(dayTextField.getText()).intValue());
            card.setVerificationCode(Integer.valueOf(cvcTextField.getText()).intValue());
            correctFormat = true;
        }catch(NumberFormatException e){
            errorLabel.setForeground(Color.red);
            errorLabel.setText("Månad,cvc och år måste vara skrivet i siffror");
        }
        if(correctFormat){
            card.setCardNumber(cardNbrField1.getText()+cardNbrField2.getText()+cardNbrField3.getText()+cardNbrField4.getText());
            //System.out.println(cardNbrField1.getText()+cardNbrField2.getText()+cardNbrField3.getText()+cardNbrField4.getText());
            card.setCardType("Visa");
            card.setHoldersName(backend.getCustomer().getFirstName() + " " + backend.getCustomer().getLastName());

            backend.placeOrder(true);
            InformationGuestView.resetView();
            InformationRegisterView.resetView();
            StoreView.showConfirmationView();
            CategoryController.resetCategoriePanels();
            errorLabel.setText("");
            cardNbrField1.setText("");
            cardNbrField2.setText("");
            cardNbrField3.setText("");
            cardNbrField4.setText("");
            cvcTextField.setText("");
            dayTextField.setText("");
            monthTextField.setText("");
            mainPanel.repaint();
            MainWindow.showStoreView();
        }
        
        }
    }//GEN-LAST:event_buyButtonActionPerformed

    private void cardNbrField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNbrField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNbrField2ActionPerformed

    private void cardNbrField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNbrField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNbrField3ActionPerformed

    private void cardNbrField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardNbrField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardNbrField4ActionPerformed

    private void cardNbrField1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardNbrField1MousePressed
        cardNbrField1.setText("");
    }//GEN-LAST:event_cardNbrField1MousePressed

    private void cardNbrField2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardNbrField2MousePressed
        cardNbrField2.setText("");
    }//GEN-LAST:event_cardNbrField2MousePressed

    private void cardNbrField3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardNbrField3MousePressed
        cardNbrField3.setText("");
    }//GEN-LAST:event_cardNbrField3MousePressed

    private void cardNbrField4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardNbrField4MousePressed
        cardNbrField4.setText("");
    }//GEN-LAST:event_cardNbrField4MousePressed

    private void dayTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dayTextFieldMousePressed
        dayTextField.setText("");
    }//GEN-LAST:event_dayTextFieldMousePressed

    private void monthTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monthTextFieldMousePressed
       monthTextField.setText("");
    }//GEN-LAST:event_monthTextFieldMousePressed

    private void cvcTextFieldMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cvcTextFieldMousePressed
        cvcTextField.setText("");
    }//GEN-LAST:event_cvcTextFieldMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amExTextLabel;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JButton backButton1;
    private javax.swing.JLabel bankPicLabel;
    private javax.swing.JPanel billingAddressPanel1;
    private javax.swing.JLabel billingPicLabel;
    private javax.swing.JButton buyButton;
    private javax.swing.JPanel buyPanel;
    private javax.swing.JPanel cardInfoPanel;
    private static javax.swing.JTextField cardNbrField1;
    private static javax.swing.JTextField cardNbrField2;
    private static javax.swing.JTextField cardNbrField3;
    private static javax.swing.JTextField cardNbrField4;
    private javax.swing.JLabel cardNbrLabel;
    private javax.swing.JLabel cartPicLabel;
    private javax.swing.JButton changeBillingAdressButton1;
    private javax.swing.JButton changeDeliveryAddressButton1;
    private javax.swing.JButton changeDeliveryMethodButton1;
    private static javax.swing.JTextField cvcTextField;
    private javax.swing.JLabel cvcTextLabel;
    private static javax.swing.JTextField dayTextField;
    private javax.swing.JPanel deliveryAddressPanel1;
    private javax.swing.JPanel deliveryMethodPanel1;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel expireTextLabel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel masterCardTextLabel;
    private static javax.swing.JTextField monthTextField;
    private javax.swing.JLabel payPalLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JPanel progressPanel;
    private javax.swing.JLabel slashTextLabel;
    private javax.swing.JLabel totalAmountLabel;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JLabel visaTextLabel;
    // End of variables declaration//GEN-END:variables
    private static IMatDataHandler backend;
    protected static void refreshView() {
        if(MainWindow.isLoggedIn()){
            CreditCard card = backend.getCreditCard();
            
            String cardNumber = card.getCardNumber();
            System.out.println(cardNumber);
            if(cardNumber.length() >= 16){
                cardNbrField1.setText(cardNumber.substring(0, 4));
                cardNbrField2.setText(cardNumber.substring(4,8));
                cardNbrField3.setText(cardNumber.substring(8,12));
                cardNbrField4.setText(cardNumber.substring(12,16));
            }else{
                cardNbrField1.setText("1234");
                cardNbrField2.setText("1234");
                cardNbrField3.setText("1234");
                cardNbrField4.setText("1234");
            }
            cvcTextField.setText(""+card.getVerificationCode());
            dayTextField.setText(""+card.getValidYear());
            monthTextField.setText(""+card.getValidMonth());
        }else{
            cardNbrField1.setText("1234");
            cardNbrField2.setText("1234");
            cardNbrField3.setText("1234");
            cardNbrField4.setText("1234");
            cvcTextField.setText(""+"XXX");
            dayTextField.setText(""+"YY");
            monthTextField.setText(""+"MM");
        }
    }
}
