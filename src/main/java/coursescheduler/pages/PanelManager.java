package coursescheduler.pages;

import java.util.Optional;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** @author evilc */
public final class PanelManager implements PanelManagerI {

  private JPanel currentPage;
  private final JFrame courseSchedulerFrame;

  /** @param courseSchedulerFrame */
  public PanelManager(JFrame courseSchedulerFrame) {
    this.courseSchedulerFrame = courseSchedulerFrame;
    currentPage = null;
  }

  @Override
  public void updatePage(JPanel nextPage) {
    Optional.ofNullable(currentPage)
        .ifPresent(
            page -> {
              courseSchedulerFrame.remove(currentPage);
            });
    currentPage = nextPage;
    courseSchedulerFrame.add(currentPage);
    courseSchedulerFrame.setVisible(true);
    currentPage = nextPage;
  }
}
