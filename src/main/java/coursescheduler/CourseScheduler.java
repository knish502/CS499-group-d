package coursescheduler;

/**
 * Entry-point for Course Scheduler system.
 */
public class CourseScheduler {
  public static void main(String[] args) {
      java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
  }
}
