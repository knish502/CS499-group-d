package coursescheduler.pages;

import java.awt.event.KeyEvent;

/** @author juwuanturnerhoward */
public class LoginPage extends javax.swing.JPanel {

  // TODO: Add model (database) here.
  PanelManagerI panelManager;

  /** Creates new form LoginPage */
  public LoginPage(PanelManagerI panelManager) {
    this.panelManager = panelManager;
    initComponents();
  }

  /** Method to simulate user logging in with password-less accounts. */
  private void login(String username, char[] password) {
    // TODO: Add in Credentials logic/Pull credential data from database.

    switch (username) {
      case "faculty":
        panelManager.updatePage(new FacultyPage(panelManager));
        break;
      case "chair":
        panelManager.updatePage(new DepartmentChairPage(panelManager));
        break;
      case "registrar":
        panelManager.updatePage(new RegistrarPage(panelManager));
        break;
        // TODO: Add other login pages.
      default:
        break;
    }
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    courseSchedulerLabel = new javax.swing.JLabel();
    emailLabel = new javax.swing.JLabel();
    passwordLabel = new javax.swing.JLabel();
    emailField = new javax.swing.JTextField();
    passwordField = new javax.swing.JPasswordField();
    createAccountLabel = new javax.swing.JLabel();

    courseSchedulerLabel.setText("Course Scheduler");

    emailLabel.setText("Email:");

    passwordLabel.setText("Password:");

    emailField.addKeyListener(
        new java.awt.event.KeyAdapter() {
          public void keyPressed(java.awt.event.KeyEvent evt) {
            emailFieldEnterPressed(evt);
          }
        });

    passwordField.addKeyListener(
        new java.awt.event.KeyAdapter() {
          public void keyPressed(java.awt.event.KeyEvent evt) {
            passwordFieldEnterPressed(evt);
          }
        });

    createAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    createAccountLabel.setText("create account");
    createAccountLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    createAccountLabel.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            createAccountLabelClicked();
          }
        });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap(180, Short.MAX_VALUE)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(
                                courseSchedulerLabel,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                237,
                                Short.MAX_VALUE)
                            .addComponent(
                                createAccountLabel,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                            .addGroup(
                                javax.swing.GroupLayout.Alignment.LEADING,
                                layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(passwordLabel)
                                            .addComponent(emailLabel))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(emailField)
                                            .addComponent(passwordField))))
                    .addContainerGap(174, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addContainerGap(86, Short.MAX_VALUE)
                    .addComponent(courseSchedulerLabel)
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
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(emailLabel)
                                            .addComponent(
                                                emailField,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(28, 28, 28))
                            .addGroup(
                                layout
                                    .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(
                                        passwordField,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordLabel)))
                    .addComponent(createAccountLabel)
                    .addContainerGap(294, Short.MAX_VALUE)));
  } // </editor-fold>//GEN-END:initComponents

  private void emailFieldEnterPressed(
      java.awt.event.KeyEvent evt) { // GEN-FIRST:event_emailFieldEnterPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      login(emailField.getText(), passwordField.getPassword());
    }
  } // GEN-LAST:event_emailFieldEnterPressed

  private void createAccountLabelClicked() { // GEN-FIRST:event_createAccountLabelClicked
    panelManager.updatePage(new AccountCreationPage(panelManager));
  } // GEN-LAST:event_createAccountLabelClicked

  private void passwordFieldEnterPressed(
      java.awt.event.KeyEvent evt) { // GEN-FIRST:event_passwordFieldEnterPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
      login(emailField.getText(), passwordField.getPassword());
    }
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel courseSchedulerLabel;
  private javax.swing.JLabel createAccountLabel;
  private javax.swing.JTextField emailField;
  private javax.swing.JLabel emailLabel;
  private javax.swing.JPasswordField passwordField;
  private javax.swing.JLabel passwordLabel;
  // End of variables declaration//GEN-END:variables
}
