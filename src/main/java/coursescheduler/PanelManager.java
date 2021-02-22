package coursescheduler;

import javax.swing.JPanel;

/** Manages {@linkplain JPanel panels} for a container. */
public interface PanelManager {
  /**
   * Updates {@link JPanel} shown by {@link PanelManager} object.
   *
   * @param page {@link JPanel} to show.
   */
  void updatePage(JPanel page);
}
