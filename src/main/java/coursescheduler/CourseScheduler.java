package coursescheduler;

import coursescheduler.views.pages.LoginPage;
import java.awt.CardLayout;

/** Entry-point for the Course Scheduler desktop application. */
class CourseScheduler {
  public static void main(String[] args) {
    CourseSchedulerFrame courseSchedulerFrame = new CourseSchedulerFrame();
    courseSchedulerFrame.setLayout(new CardLayout());
    PanelManagerI panelManager = new PanelManager(courseSchedulerFrame);
    panelManager.updatePage(new LoginPage(panelManager));
  }
}
