package coursescheduler;

import javax.swing.JPanel;

/** Manages {@linkplain JPanel panels} for a container. */
public interface PanelManagerI {
  /**
   * Updates {@link JPanel} shown by {@link PanelManagerI} object.
   *
   * @param page {@link JPanel} to show.
   */
  void updatePage(JPanel page);
}
