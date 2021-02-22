package coursescheduler;

import coursescheduler.views.pages.LoginPage;
import java.awt.CardLayout;

/** Entry-point for the Course Scheduler desktop application. */
class CourseScheduler {
  private static void startApplication() {
    CourseSchedulerFrame courseSchedulerFrame = new CourseSchedulerFrame();
    courseSchedulerFrame.setLayout(new CardLayout());
    PanelManager panelManager = new BasePanelManager(courseSchedulerFrame);
    panelManager.updatePage(new LoginPage(panelManager));
  }

  public static void main(String[] args) {
    startApplication();
  }
}
