/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_scheduler;

/** @author evilc */
public class createAccountJpanel extends javax.swing.JPanel {
  String tempUsername = "";
  String tempEmail = "";
  String tempPassword = "";
  String tempRole = "";
  PanelManager controller;
  String page = "CREATE_ACCOUNT";
  /** Creates new form createAccountJpanel */
  public createAccountJpanel() {
    initComponents();
  }

  public void setController(PanelManager input) {
    controller = input;
  }

  public String returnPage() {
    return page;
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    createAccountCancel = new javax.swing.JButton();
    createAccountSubmit = new javax.swing.JButton();
    createAccountUsernameInput = new javax.swing.JTextField();
    createAccountPasswordInput = new javax.swing.JTextField();
    createAccountPasswordInputCheck = new javax.swing.JTextField();
    jSeparator1 = new javax.swing.JSeparator();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    createAccountSelectRole = new javax.swing.JComboBox<>();
    jLabel4 = new javax.swing.JLabel();
    error1 = new javax.swing.JLabel();
    error2 = new javax.swing.JLabel();
    error3 = new javax.swing.JLabel();
    error4 = new javax.swing.JLabel();
    errorDisplay = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    createAccountEmailInput = new javax.swing.JTextField();
    error5 = new javax.swing.JLabel();
    error0 = new javax.swing.JLabel();

    createAccountCancel.setText("Cancel");

    createAccountSubmit.setText("Submit");
    createAccountSubmit.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            createAccountSubmitActionPerformed(evt);
          }
        });

    jLabel1.setText("Retype Password:");

    jLabel2.setText("Password:");

    jLabel3.setText("Username:");

    createAccountSelectRole.setModel(
        new javax.swing.DefaultComboBoxModel<>(
            new String[] {"Select Role", "Faculty", "Chair", "Registrar"}));

    jLabel4.setText("Role:");

    jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel5.setText("Create Account:");

    jLabel6.setText("Email:");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(createAccountCancel)
                                            .addComponent(
                                                jLabel1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                101,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                jLabel2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                101,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                jLabel4,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                jLabel3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                66,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addComponent(
                                                        jLabel6,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        66,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .RELATED,
                                                        37,
                                                        Short.MAX_VALUE)
                                                    .addComponent(
                                                        error5,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                errorDisplay,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                            .addGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(createAccountSubmit))
                                            .addComponent(createAccountPasswordInputCheck)
                                            .addComponent(createAccountPasswordInput)
                                            .addComponent(
                                                createAccountSelectRole,
                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                0,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                error4,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                error3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                error0,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(createAccountUsernameInput)
                                            .addGroup(
                                                layout
                                                    .createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addComponent(
                                                        createAccountEmailInput,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        128,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(
                                                error2,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                error1,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                31,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(36, 36, 36)));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(
                                errorDisplay,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(18, 18, 18)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(
                                error0,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                21,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                createAccountSelectRole,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(
                                error1,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                21,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                createAccountEmailInput,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                    .addGap(4, 4, 4)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(
                                error2,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                21,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                createAccountUsernameInput,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(
                                error3,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                21,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                createAccountPasswordInput,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                    .addGap(11, 11, 11)
                    .addComponent(
                        jSeparator1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        10,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(
                                error4,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                21,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                createAccountPasswordInputCheck,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                    .addGap(40, 40, 40)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(createAccountCancel)
                            .addComponent(createAccountSubmit))
                    .addGap(34, 34, 34))
            .addGroup(
                javax.swing.GroupLayout.Alignment.CENTER,
                layout
                    .createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(
                        error5,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        21,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(195, 195, 195)));
  } // </editor-fold>//GEN-END:initComponents

  private void createAccountSubmitActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_createAccountSubmitActionPerformed
    // TODO add your handling code here:
    tempRole = createAccountSelectRole.getSelectedItem().toString();
    tempEmail = createAccountEmailInput.getText();
    tempPassword = createAccountPasswordInput.getText();
    tempUsername = createAccountUsernameInput.getText();
    boolean invalidRole = false;
    boolean invalidEmail = false;
    boolean invalidUsername = false;
    boolean invalidPassword = false;
    boolean invalidPasswordCheck = false;

    if ("Select Role".equals(tempRole)) {
      errorDisplay.setText("Field(s) cannot be empty.");
      error0.setText("*");
      invalidRole = true;
    } else {
      errorDisplay.setText("");
      error0.setText("");
    }

    if ("".equals(tempEmail)) {
      errorDisplay.setText("Field(s) cannot be empty.");
      error1.setText("*");
      invalidEmail = true;
    } else {
      errorDisplay.setText("");
      error1.setText("");
    }

    if ("".equals(tempUsername)) {
      errorDisplay.setText("Field(s) cannot be empty.");
      error2.setText("*");
      invalidUsername = true;
    } else {
      errorDisplay.setText("");
      error2.setText("");
    }

    if ("".equals(tempPassword)) {
      errorDisplay.setText("Field(s) cannot be empty.");
      error3.setText("*");
      invalidPassword = true;
    } else {
      errorDisplay.setText("");
      error3.setText("");
    }

    if (!invalidPassword) {
      if (!tempPassword.equals(createAccountPasswordInputCheck.getText())) {
        errorDisplay.setText("Passwords must patch");
        error3.setText("*");
        error4.setText("*");
        invalidPasswordCheck = true;
      } else {
        errorDisplay.setText("");
        error3.setText("");
        error4.setText("");
      }
    }

    if (!invalidRole
        && !invalidEmail
        && !invalidUsername
        && !invalidPassword
        && !invalidPasswordCheck) {
      tempRole = createAccountSelectRole.getSelectedItem().toString();
      tempEmail = createAccountEmailInput.getText();
      tempPassword = createAccountPasswordInput.getText();
      tempUsername = createAccountUsernameInput.getText();
      errorDisplay.setText("");
      error0.setText("");
      error1.setText("");
      error2.setText("");
      error3.setText("");
      error4.setText("");
    }
  } // GEN-LAST:event_createAccountSubmitActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton createAccountCancel;
  private javax.swing.JTextField createAccountEmailInput;
  private javax.swing.JTextField createAccountPasswordInput;
  private javax.swing.JTextField createAccountPasswordInputCheck;
  private javax.swing.JComboBox<String> createAccountSelectRole;
  private javax.swing.JButton createAccountSubmit;
  private javax.swing.JTextField createAccountUsernameInput;
  private javax.swing.JLabel error0;
  private javax.swing.JLabel error1;
  private javax.swing.JLabel error2;
  private javax.swing.JLabel error3;
  private javax.swing.JLabel error4;
  private javax.swing.JLabel error5;
  private javax.swing.JLabel errorDisplay;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JSeparator jSeparator1;
  // End of variables declaration//GEN-END:variables
}
