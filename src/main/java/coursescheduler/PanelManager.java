package coursescheduler;

import java.util.Optional;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** Manages {@linkplain JPanel panels} on a {@link JFrame}. */
final class PanelManager implements PanelManagerI {

  private JPanel currentPage;

  private final JFrame courseSchedulerFrame;

  /** @param courseSchedulerFrame frame for panels to be displayed on. */
  public PanelManager(JFrame courseSchedulerFrame) {
    this.courseSchedulerFrame = courseSchedulerFrame;
    currentPage = null;
  }

  @Override
  public void updatePage(JPanel page) {
    Optional.ofNullable(currentPage).ifPresent(courseSchedulerFrame::remove);
    currentPage = page;
    courseSchedulerFrame.add(currentPage);
    courseSchedulerFrame.setVisible(true);
  }
}
