package coursescheduler;

/** Entry-point for Course Scheduler system. */
public class CourseScheduler {
  public static void main(String[] args) {
    /* Create and display the form */
    java.awt.EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            new CourseSchedulerFrame().setVisible(true);
          }
        });
  }
}
