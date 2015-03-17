/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iMatPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import se.chalmers.ait.dat215.project.IMatDataHandler;
import se.chalmers.ait.dat215.project.User;

/**
 *
 * @author Alexander Kloutschek
 */
public class InformationUserView extends javax.swing.JPanel {

    /**
     * Creates new form InformationUserView
     */
    public InformationUserView() {
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

        progressPanel = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        errorPanel = new javax.swing.JPanel();
        passwordField = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();

        progressPanel.setBackground(new java.awt.Color(0, 153, 255));

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

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        titleLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Logga in");

        passwordLabel.setText("Lösenord");
        passwordLabel.setToolTipText("");

        userNameLabel.setText("Användarnamn");

        errorPanel.setLayout(new java.awt.BorderLayout());

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userNameLabel)
                            .addComponent(passwordLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                            .addComponent(errorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(passwordField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(errorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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
            .addComponent(progressPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
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
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(nextButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        errorPanel.removeAll();
        User user = IMatDataHandler.getInstance().getUser();
        String username;
        String password;
        username = userNameField.getText();
        password = passwordField.getText();

        if((!(username.equals(user.getUserName()))) || (!(password.equals(user.getPassword()))) || user.getUserName().equals("") || user.getPassword().equals("")){
            errorPanel.removeAll();
            JLabel errorLabel = new JLabel("Fel Inloggningsuppgifter");
            errorLabel.setForeground(Color.red);
            errorPanel.add(errorLabel, BorderLayout.CENTER);
            errorPanel.repaint();
            errorLabel.repaint();
            errorPanel.revalidate();
        }else{
            userNameField.setText("");
            passwordField.setText("");
            errorPanel.removeAll();
            StoreView.login();
            MainWindow.showDeliveryWizardView();
            DeliveryWizardView.setOriginToUser();
        }
        /*
            errorPanel.removeAll();
            JLabel errorLabel = new JLabel("Fyll i alla fält");
            errorLabel.setForeground(Color.red);
            errorPanel.add(errorLabel, BorderLayout.CENTER);
        }*/
    }//GEN-LAST:event_nextButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainWindow.showInformationChooseView();
    }//GEN-LAST:event_backButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        errorPanel.removeAll();
        User user = IMatDataHandler.getInstance().getUser();
        String username;
        String password;
        username = userNameField.getText();
        password = passwordField.getText();

        if((!(username.equals(user.getUserName()))) || (!(password.equals(user.getPassword()))) || user.getUserName().equals("") || user.getPassword().equals("")){
            errorPanel.removeAll();
            JLabel errorLabel = new JLabel("Fel Inloggningsuppgifter");
            errorLabel.setForeground(Color.red);
            errorPanel.add(errorLabel, BorderLayout.CENTER);
            errorPanel.repaint();
            errorLabel.repaint();
            errorLabel.setVisible(true);
        }else{
            userNameField.setText("");
            passwordField.setText("");
            errorPanel.removeAll();
            MainWindow.showDeliveryWizardView();
            DeliveryWizardView.setOriginToUser();
        }
    }//GEN-LAST:event_passwordFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel errorPanel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPanel progressPanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
