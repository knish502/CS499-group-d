package coursescheduler;

import coursescheduler.pages.LoginPage;
import coursescheduler.pages.PanelManager;
import coursescheduler.pages.PanelManagerI;
import java.awt.CardLayout;

/** @author juwuanturnerhoward */
public class CourseScheduler {
  public static void main(String[] args) {
    CourseSchedulerFrame courseSchedulerFrame = new CourseSchedulerFrame();
    courseSchedulerFrame.setLayout(new CardLayout());
    PanelManagerI panelManager = new PanelManager(courseSchedulerFrame);
    panelManager.updatePage(new LoginPage(panelManager));
  }
}
