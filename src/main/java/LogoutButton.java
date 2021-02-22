import coursescheduler.pages.LoginPage;
import coursescheduler.pages.PanelManagerI;
import javax.swing.JButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** @author juwuanturnerhoward */
public class LogoutButton extends JButton {
  LogoutButton(PanelManagerI panelManager) {
    addActionListener(
        e -> {
          panelManager.updatePage(new LoginPage(panelManager));
        });
  }
}
