/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import se.chalmers.ait.dat215.project.CreditCard;
import se.chalmers.ait.dat215.project.Customer;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.User;

/**
 *
 * @author Alexander Kloutschek
 */
public class InformationRegisterView extends javax.swing.JPanel {

    /**
     * Creates new form InformationRegisterView
     */
    public InformationRegisterView() {
        initComponents();
        resetView();
        customer = IMatDataHandler.getInstance().getCustomer();
        user = IMatDataHandler.getInstance().getUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoPanel = new javax.swing.JPanel();
        countryLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        countryComboBox = new javax.swing.JComboBox();
        postCodeField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        postCodeLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        postAddressField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        postAddressLabel = new javax.swing.JLabel();
        mobileNumberLabel = new javax.swing.JLabel();
        mobileNumberField = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        userNameLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        requirementLabel = new javax.swing.JLabel();
        adressField = new javax.swing.JTextField();
        adressLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        errorPanel = new javax.swing.JPanel();
        progressPanel = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(207, 219, 231));
        setMaximumSize(new java.awt.Dimension(1200, 699));
        setPreferredSize(new java.awt.Dimension(1200, 699));

        infoPanel.setBackground(new java.awt.Color(51, 153, 255));
        infoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        countryLabel.setForeground(new java.awt.Color(255, 255, 255));
        countryLabel.setText("Land");

        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        emailLabel.setText("Email");

        countryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Danmark", "Finland", "Norge", "Sverige" }));
        countryComboBox.setSelectedIndex(3);
        countryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryComboBoxActionPerformed(evt);
            }
        });

        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("Förnamn*");

        postCodeLabel.setForeground(new java.awt.Color(255, 255, 255));
        postCodeLabel.setText("Postkod");

        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Efternamn*");

        postAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postAddressFieldActionPerformed(evt);
            }
        });

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        postAddressLabel.setForeground(new java.awt.Color(255, 255, 255));
        postAddressLabel.setText("Postadress ");

        mobileNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        mobileNumberLabel.setText("Mobilnummer*");

        phoneNumberLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneNumberLabel.setText("Telefonnummer*");
        phoneNumberLabel.setToolTipText("");

        phoneNumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberFieldActionPerformed(evt);
            }
        });

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        confirmPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordFieldActionPerformed(evt);
            }
        });

        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("Användarnamn*");

        confirmPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordLabel.setText("Bekräfta lösenord*");

        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Lösenord*");

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Registrera Användare");
        titleLabel.setToolTipText("");

        requirementLabel.setForeground(new java.awt.Color(255, 255, 255));
        requirementLabel.setText("* Användarnamn, Lösenord, Namn, Adress och minst ett telefonnummer måste fyllas i.");

        adressLabel.setForeground(new java.awt.Color(255, 255, 255));
        adressLabel.setText("Adress*");

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneNumberLabel)
                            .addComponent(emailLabel)
                            .addComponent(mobileNumberLabel)
                            .addComponent(firstNameLabel)
                            .addComponent(countryLabel)
                            .addComponent(userNameLabel)
                            .addComponent(confirmPasswordLabel)
                            .addComponent(passwordLabel))
                        .addGap(39, 39, 39)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(lastNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lastNameField))
                            .addComponent(phoneNumberField)
                            .addComponent(mobileNumberField)
                            .addComponent(emailField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(countryComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField)
                            .addComponent(confirmPasswordField)
                            .addComponent(userNameField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, infoPanelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(postAddressLabel)
                            .addComponent(adressLabel)
                            .addComponent(postCodeLabel))
                        .addGap(23, 23, 23)
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(requirementLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                            .addGroup(infoPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(postCodeField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(postAddressField)
                                    .addComponent(adressField))))))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(188, 188, 188))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameLabel))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmPasswordLabel))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobileNumberLabel)
                    .addComponent(mobileNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countryLabel)
                    .addComponent(countryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adressLabel))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postAddressLabel)
                    .addComponent(postAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postCodeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(requirementLabel)
                .addGap(16, 16, 16))
        );

        nextButton.setBackground(new java.awt.Color(51, 153, 255));
        nextButton.setText("Nästa >");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(51, 153, 255));
        backButton.setText("< Tillbaka");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        errorPanel.setBackground(new java.awt.Color(207, 219, 231));
        errorPanel.setLayout(new java.awt.BorderLayout());

        progressPanel.setBackground(new java.awt.Color(51, 153, 255));

        iconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.png"))); // NOI18N

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(backButton)
                .addGap(41, 41, 41)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton)
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(progressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(errorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backButton)
                            .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void postAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postAddressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_postAddressFieldActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void phoneNumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void confirmPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainWindow.showInformationChooseView();
    }//GEN-LAST:event_backButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        boolean passWordFieldsMatched = false;
        
        if(!passwordField.getText().equals(confirmPasswordField.getText())){
            errorPanel.removeAll();
            JLabel errorLabel = new JLabel("Lösenorden överrenstämmer inte");
            errorLabel.setForeground(Color.red);
            errorPanel.add(errorLabel, BorderLayout.CENTER);
            errorPanel.repaint();
            errorLabel.repaint();
            errorPanel.revalidate();
        }else{
            passWordFieldsMatched = true;
            user.setUserName(userNameField.getText());
            user.setPassword(passwordField.getText());
        }
        
        if(passWordFieldsMatched){
            customer.setAddress(adressField.getText());
            customer.setPostAddress(postAddressField.getText());
            customer.setEmail(emailField.getText());
            customer.setFirstName(firstNameField.getText());
            customer.setLastName(lastNameField.getText());
            customer.setPostCode(postCodeField.getText());
            customer.setMobilePhoneNumber(mobileNumberField.getText());
            customer.setPhoneNumber(phoneNumberField.getText());

           if(isCustomerComplete() && isUserComplete()){
                CreditCard card = IMatDataHandler.getInstance().getCreditCard();
                card.setCardNumber("");
                card.setCardType("");
                card.setHoldersName("");
                card.setValidMonth(0);
                card.setValidYear(0);
                card.setVerificationCode(0);
                StoreView.logout();
                
                MainWindow.showDeliveryWizardView();
                DeliveryWizardView.setOriginToRegister();
            }else{
                passWordFieldsMatched = false;
                errorPanel.removeAll();
                JLabel errorLabel = new JLabel("Information saknas");
                errorLabel.setForeground(Color.red);
                errorPanel.add(errorLabel, BorderLayout.CENTER);
                errorPanel.repaint();
                errorLabel.repaint();
                errorPanel.revalidate();
            }
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void countryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryComboBoxActionPerformed

    public static void resetView(){
        adressField.setText("");
        userNameField.setText("");
        passwordField.setText("");
        confirmPasswordField.setText("");
        postAddressField.setText("");
        emailField.setText("");
        firstNameField.setText("");
        lastNameField.setText("");
        postCodeField.setText("");
        mobileNumberField.setText("");
        phoneNumberField.setText("");
        countryComboBox.setSelectedIndex(3);
    }
    private boolean isUserComplete(){
        if(user.getUserName().equals("") || user.getPassword().equals("")){
            return false;
        }else{
            return true;
        }
    }
    
    private boolean isCustomerComplete() {
        if(customer.getFirstName().equals("") || customer.getLastName().equals("") || customer.getAddress().equals("")){
            return false;
        }else if(customer.getMobilePhoneNumber().equals("") && customer.getPhoneNumber().equals("")){
            return false;
        }else{
            return true;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField adressField;
    private javax.swing.JLabel adressLabel;
    private javax.swing.JButton backButton;
    private static javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JLabel confirmPasswordLabel;
    private static javax.swing.JComboBox countryComboBox;
    private javax.swing.JLabel countryLabel;
    private static javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPanel errorPanel;
    private static javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JPanel infoPanel;
    private static javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private static javax.swing.JTextField mobileNumberField;
    private javax.swing.JLabel mobileNumberLabel;
    private javax.swing.JButton nextButton;
    private static javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private static javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel phoneNumberLabel;
    private static javax.swing.JTextField postAddressField;
    private javax.swing.JLabel postAddressLabel;
    private static javax.swing.JTextField postCodeField;
    private javax.swing.JLabel postCodeLabel;
    private javax.swing.JPanel progressPanel;
    private javax.swing.JLabel requirementLabel;
    private javax.swing.JLabel titleLabel;
    private static javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
    private static Customer customer;
    private static User user;
}
