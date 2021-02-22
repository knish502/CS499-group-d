package coursescheduler.views.pages;

import coursescheduler.PanelManagerI;

/** @author evilc */
public final class AccountCreationPage extends javax.swing.JPanel {

  private final PanelManagerI panelManager;

  public AccountCreationPage(PanelManagerI panelManager) {
    this.panelManager = panelManager;
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();

    jLabel1.setText("Create Account");

    jButton1.setText("Cancel");
    jButton1.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            jButton1MouseClicked(evt);
          }
        });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jLabel1))
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jButton1)))
                    .addContainerGap(403, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel1)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 366, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(40, 40, 40)));
  } // </editor-fold>//GEN-END:initComponents

  private void jButton1MouseClicked(
      java.awt.event.MouseEvent evt) { // GEN-FIRST:event_jButton1MouseClicked
    panelManager.updatePage(new LoginPage(panelManager));
  } // GEN-LAST:event_jButton1MouseClicked

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables
}
