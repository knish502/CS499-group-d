/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_scheduler;

/** @author evilc */
public class PanelManager {
  public enum panel {
    LOGIN,
    CREATE_ACCOUNT,
    MAIN_MENU,
    FILE_INPUT,
    ADD_COURSE,
    REMOVE_COURSE,
    EDIT_COURSE,
    SCHEDULE_GENERATOR,
    DEBUG
  }

  // All pages must be defined here and also passed into the default constructor below:
  LoginPage loginPanel;
  createAccountJpanel createAccountPanel;

  public PanelManager(
      LoginPage loginInput, createAccountJpanel createAccountInput) // Default constructor
      {
    loginPanel = loginInput;
    createAccountPanel = createAccountInput;
    loginPanel.setController(this);
    createAccountPanel.setController(this);
    createAccountPanel.hide();
  }

  void switchPage(String currentPageSt, String nextPageSt) {
    panel currentPage = panel.valueOf(currentPageSt);
    panel nextPage = panel.valueOf(nextPageSt);
    switch (currentPage) {
      case LOGIN:
        loginPanel.hide();
        break;
      case CREATE_ACCOUNT:
        createAccountPanel.hide();
        break;
      case MAIN_MENU:
        // To do
        break;
      case FILE_INPUT:
        // To do
        break;
      case ADD_COURSE:
        // To do
        break;
      case REMOVE_COURSE:
        // To do
        break;
      case EDIT_COURSE:
        // To do
        break;
      case SCHEDULE_GENERATOR:
        // To do
        break;
      case DEBUG:
        loginPanel.hide();
        createAccountPanel.hide();
    }

    switch (nextPage) {
      case LOGIN:
        loginPanel.show();
        break;
      case CREATE_ACCOUNT:
        createAccountPanel.show();
        break;
      case MAIN_MENU:
        // To do
        break;
      case FILE_INPUT:
        // To do
        break;
      case ADD_COURSE:
        // To do
        break;
      case REMOVE_COURSE:
        // To do
        break;
      case EDIT_COURSE:
        // To do
        break;
      case SCHEDULE_GENERATOR:
        // To do
        break;
    }
  }
}
