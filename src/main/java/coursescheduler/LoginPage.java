package coursescheduler;

<<<<<<< HEAD
=======
<<<<<<< HEAD
import java.awt.event.KeyEvent;

public class LoginPage extends javax.swing.JFrame {

=======
>>>>>>> TSK-29 Merge main branch via rebasing
/** @author evilc */
public class LoginPage extends javax.swing.JPanel {
  String page = "CREATE_ACCOUNT";
  PanelManager controller;
<<<<<<< HEAD
=======
>>>>>>> TSK-29 Merge main branch via rebasing
>>>>>>> TSK-29 Merge main branch via rebasing
  /** Creates new form LoginPage */
  public LoginPage() {
    initComponents();
  }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
>>>>>>> TSK-29 Merge main branch via rebasing
  public void setController(PanelManager input) {
    controller = input;
  }

  public String returnPage() {
    return page;
  }

<<<<<<< HEAD
=======
>>>>>>> TSK-29 Merge main branch via rebasing
>>>>>>> TSK-29 Merge main branch via rebasing
  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

<<<<<<< HEAD
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    loginSubmit = new javax.swing.JButton();
    jTextField1 = new javax.swing.JTextField();
    jTextField2 = new javax.swing.JTextField();
=======
<<<<<<< HEAD
    passwordField = new javax.swing.JPasswordField();
    emailField = new javax.swing.JTextField();
    createAccountLabel = new javax.swing.JLabel();
    courseSchedulerTitle = new javax.swing.JLabel();
    emailLabel = new javax.swing.JLabel();
    passwordLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    passwordField.addKeyListener(
        new java.awt.event.KeyAdapter() {
          public void keyPressed(java.awt.event.KeyEvent evt) {
            passwordFieldKeyPressed(evt);
          }
        });
>>>>>>> TSK-29 Merge main branch via rebasing

    jLabel1.setText("Course Scheduler");

    jLabel2.setText("Email:");

    jLabel3.setText("Password:");

    loginSubmit.setText("Submit");

<<<<<<< HEAD
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
=======
    passwordLabel.setLabelFor(passwordField);
    passwordLabel.setText("password");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
=======
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    loginSubmit = new javax.swing.JButton();
    jTextField1 = new javax.swing.JTextField();
    jTextField2 = new javax.swing.JTextField();

    jLabel1.setText("Course Scheduler");

    jLabel2.setText("Email:");

    jLabel3.setText("Password:");

    loginSubmit.setText("Submit");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
>>>>>>> TSK-29 Merge main branch via rebasing
>>>>>>> TSK-29 Merge main branch via rebasing
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
<<<<<<< HEAD
                javax.swing.GroupLayout.Alignment.TRAILING,
=======
<<<<<<< HEAD
>>>>>>> TSK-29 Merge main branch via rebasing
                layout
                    .createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(
                                layout
                                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(17, 17, 17)))
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginSubmit)
                            .addComponent(
                                jTextField1,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                90,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
=======
                            .addGroup(
                                layout
                                    .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(
                                        courseSchedulerTitle,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        204,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(
                                        layout
                                            .createSequentialGroup()
                                            .addGroup(
                                                layout
                                                    .createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(passwordLabel)
                                                    .addComponent(emailLabel))
                                            .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement
                                                    .UNRELATED)
                                            .addGroup(
                                                layout
                                                    .createParallelGroup(
                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                        false)
                                                    .addComponent(
                                                        emailField,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        132,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(
                                                        passwordField,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        132,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(418, Short.MAX_VALUE)));
=======
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(
                                layout
                                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(17, 17, 17)))
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginSubmit)
                            .addComponent(
                                jTextField1,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                90,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> TSK-29 Merge main branch via rebasing
                            .addComponent(
                                jTextField2,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                90,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(97, 97, 97)));
<<<<<<< HEAD
=======
>>>>>>> TSK-29 Merge main branch via rebasing
>>>>>>> TSK-29 Merge main branch via rebasing
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
<<<<<<< HEAD
                    .addGap(77, 77, 77)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(
                                jTextField2,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
=======
<<<<<<< HEAD
                    .addContainerGap(275, Short.MAX_VALUE)
                    .addComponent(courseSchedulerTitle)
>>>>>>> TSK-29 Merge main branch via rebasing
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(
                                jTextField1,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addComponent(loginSubmit)
                    .addContainerGap(97, Short.MAX_VALUE)));
  } // </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
=======
  private javax.swing.JLabel courseSchedulerTitle;
  private javax.swing.JLabel createAccountLabel;
  private javax.swing.JTextField emailField;
  private javax.swing.JLabel emailLabel;
  private javax.swing.JPasswordField passwordField;
  private javax.swing.JLabel passwordLabel;
=======
                    .addGap(77, 77, 77)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(
                                jTextField2,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(
                                jTextField1,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addComponent(loginSubmit)
                    .addContainerGap(97, Short.MAX_VALUE)));
  } // </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
>>>>>>> TSK-29 Merge main branch via rebasing
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JTextField jTextField1;
  private javax.swing.JTextField jTextField2;
  private javax.swing.JButton loginSubmit;
<<<<<<< HEAD
=======
>>>>>>> TSK-29 Merge main branch via rebasing
>>>>>>> TSK-29 Merge main branch via rebasing
  // End of variables declaration//GEN-END:variables
}
