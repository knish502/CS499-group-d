package coursescheduler.views.pages;

import coursescheduler.PanelManager;

/** @author evilc */
public final class FacultyPage extends javax.swing.JPanel {
  private final PanelManager panelManager;

  public FacultyPage(PanelManager panelManager) {
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
    scheduleGeneratorButton = new javax.swing.JButton();
    loadCSVFileButton = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    currentCoursesTable = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    saveCSVFileButton = new javax.swing.JButton();
    addCourseButton = new javax.swing.JButton();
    removeCourseButton = new javax.swing.JButton();
    jButton7 = new javax.swing.JButton();
    backToLoginButton = new javax.swing.JButton();

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
    jLabel1.setText("Faculty");

    scheduleGeneratorButton.setText("Schedule Generator");
    scheduleGeneratorButton.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            scheduleGeneratorButtonActionPerformed(evt);
          }
        });

    loadCSVFileButton.setText("Load CSV File");
    loadCSVFileButton.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            loadCSVFileButtonActionPerformed(evt);
          }
        });

    currentCoursesTable.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null}
            },
            new String[] {
              "College", "ID", "Name", "Professor", "Room(s)", "Times", "Days", "Seats"
            }) {
          boolean[] canEdit =
              new boolean[] {false, false, false, false, false, false, false, false};

          public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
          }
        });
    jScrollPane1.setViewportView(currentCoursesTable);

    jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
    jLabel2.setText("Current Courses Loaded:");

    saveCSVFileButton.setText("Save as CSV File");
    saveCSVFileButton.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            saveCSVFileButtonActionPerformed(evt);
          }
        });

    addCourseButton.setText("Add Course");
    addCourseButton.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            addCourseButtonActionPerformed(evt);
          }
        });

    removeCourseButton.setText("Remove Course");
    removeCourseButton.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            removeCourseButtonActionPerformed(evt);
          }
        });

    jButton7.setText("Exit");
    jButton7.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton7ActionPerformed(evt);
          }
        });

    backToLoginButton.setText("Back to Login");
    backToLoginButton.addMouseListener(
        new java.awt.event.MouseAdapter() {
          public void mouseClicked(java.awt.event.MouseEvent evt) {
            backToLoginButtonMouseClicked(evt);
          }
        });
    backToLoginButton.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            backToLoginButtonActionPerformed(evt);
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
                    .addGap(33, 33, 33)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(
                                layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(
                                                loadCSVFileButton,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                130,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                scheduleGeneratorButton,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                130,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(
                                        layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(
                                                addCourseButton,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                130,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                saveCSVFileButton,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                130,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(
                                        removeCourseButton,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        130,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(
                                layout
                                    .createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(
                                        layout
                                            .createSequentialGroup()
                                            .addComponent(backToLoginButton)
                                            .addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                            .addComponent(jButton7))
                                    .addComponent(
                                        jScrollPane1,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        657,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                scheduleGeneratorButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                47,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                addCourseButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                47,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                removeCourseButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                47,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                loadCSVFileButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                47,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                saveCSVFileButton,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                47,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(
                        jScrollPane1,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        286,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(backToLoginButton)
                            .addComponent(jButton7))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
  } // </editor-fold>//GEN-END:initComponents

  private void backToLoginButtonMouseClicked(
      java.awt.event.MouseEvent evt) { // GEN-FIRST:event_backToLoginButtonMouseClicked
    panelManager.updatePage(new LoginPage(panelManager));
  } // GEN-LAST:event_backToLoginButtonMouseClicked

  private void scheduleGeneratorButtonActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_scheduleGeneratorButtonActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_scheduleGeneratorButtonActionPerformed

  private void loadCSVFileButtonActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_loadCSVFileButtonActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_loadCSVFileButtonActionPerformed

  private void saveCSVFileButtonActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_saveCSVFileButtonActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_saveCSVFileButtonActionPerformed

  private void addCourseButtonActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_addCourseButtonActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_addCourseButtonActionPerformed

  private void removeCourseButtonActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_removeCourseButtonActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_removeCourseButtonActionPerformed

  private void jButton7ActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_jButton7ActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_jButton7ActionPerformed

  private void backToLoginButtonActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_backToLoginButtonActionPerformed
    // TODO add your handling code here:
  } // GEN-LAST:event_backToLoginButtonActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton addCourseButton;
  private javax.swing.JButton backToLoginButton;
  private javax.swing.JTable currentCoursesTable;
  private javax.swing.JButton jButton7;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JButton loadCSVFileButton;
  private javax.swing.JButton removeCourseButton;
  private javax.swing.JButton saveCSVFileButton;
  private javax.swing.JButton scheduleGeneratorButton;
  // End of variables declaration//GEN-END:variables
}
