/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_scheduler;

/**
 *
 * @author evilc
 */
public class PanelManager 
{
        public enum panel
    { 
        LOGIN, CREATE_ACCOUNT, MAIN_MENU, FILE_INPUT, ADD_COURSE_DEPARTMENT_CHAIR, 
        ADD_COURSE_FACULTY, REMOVE_COURSE, EDIT_COURSE, SCHEDULE_GENERATOR, DEBUG, 
        DEPARTMENT_CHAIR, FACULTY, REGISTRAR
        
    }
    
    //All pages must be defined here and also passed into the default constructor below:
    LoginPage loginPanel;
    createAccountJpanel createAccountPanel;
    AddCourseDepartmentChair addCourseDepartmentChairPanel;
    AddCoursePageFaculty addCourseFacultyPanel;
    DepartmentChairPage departmentChairPanel;
    RegistrarPage registrarPanel;
    EditCourse editCoursePanel;
    FacultyPage facultyPanel;
    RemoveCoursePage removeCoursePanel;
    
    public PanelManager(LoginPage loginInput, createAccountJpanel createAccountInput, AddCourseDepartmentChair addCourseDepartmentChairInput, 
            AddCoursePageFaculty addCoursePageFacultyInput, EditCourse editCoursePageInput, RegistrarPage registrarPageInput, FacultyPage facultyPageInput,
            DepartmentChairPage departmentChairPageInput, RemoveCoursePage removeCourseInput) //Default constructor
    {
        loginPanel = loginInput;
        createAccountPanel = createAccountInput;
        addCourseDepartmentChairPanel = addCourseDepartmentChairInput;
        addCourseFacultyPanel = addCoursePageFacultyInput;
        departmentChairPanel = departmentChairPageInput;
        facultyPanel = facultyPageInput;
        registrarPanel = registrarPageInput;
        editCoursePanel = editCoursePageInput;
        removeCoursePanel = removeCourseInput;
        
        loginPanel.setController(this);
        createAccountPanel.setController(this);
        addCourseDepartmentChairPanel.setController(this);
        addCourseFacultyPanel.setController(this);
        departmentChairPanel.setController(this);
        facultyPanel.setController(this);
        registrarPanel.setController(this);
        editCoursePanel.setController(this);
        removeCoursePanel.setController(this);
        
        addCourseDepartmentChairPanel.hide();
        addCourseFacultyPanel.hide();
        departmentChairPanel.hide();
        facultyPanel.hide();
        registrarPanel.hide();
        editCoursePanel.hide();
        removeCoursePanel.hide();
        createAccountPanel.hide();
    }
    
    void switchPage(String currentPageSt, String nextPageSt)
    {
        panel currentPage = panel.valueOf(currentPageSt);
        panel nextPage = panel.valueOf(nextPageSt);
        switch (currentPage)
        {
            case LOGIN:
                loginPanel.hide();
                break;
            case CREATE_ACCOUNT:
                createAccountPanel.hide();
                break;
            case FACULTY:
                facultyPanel.hide();
                break;
            case DEPARTMENT_CHAIR:
                departmentChairPanel.hide();
                break;
            case REGISTRAR:
                registrarPanel.hide();
                break;
            case FILE_INPUT:
                break;
            case ADD_COURSE_DEPARTMENT_CHAIR:
                addCourseDepartmentChairPanel.hide();
                break;
            case ADD_COURSE_FACULTY:
                addCourseFacultyPanel.hide();
                break;
            case REMOVE_COURSE:
                removeCoursePanel.hide();
                break;
            case EDIT_COURSE:
                editCoursePanel.hide();
                break;
            case SCHEDULE_GENERATOR:
                //To do
                break;
            case DEBUG:
                loginPanel.hide();
                createAccountPanel.hide();
                registrarPanel.hide();
                editCoursePanel.hide();
                addCourseDepartmentChairPanel.hide();
                addCourseFacultyPanel.hide();
                removeCoursePanel.hide();
                departmentChairPanel.hide();
                facultyPanel.hide();
        }
        
        
        switch (nextPage)
        {
            case LOGIN:
                loginPanel.show();
                break;
            case CREATE_ACCOUNT:
                createAccountPanel.show();
                break;
            case FILE_INPUT:
                //To do
                break;
            case ADD_COURSE_DEPARTMENT_CHAIR:
                addCourseDepartmentChairPanel.show();
                break;
            case ADD_COURSE_FACULTY:
                addCourseFacultyPanel.show();
                break;
            case DEPARTMENT_CHAIR:
                departmentChairPanel.show();
                break;
            case FACULTY:
                facultyPanel.show();
                break;
            case REGISTRAR:
                registrarPanel.show();
                break;
            case REMOVE_COURSE:
                removeCoursePanel.show();
                break;
            case EDIT_COURSE:
                editCoursePanel.show();
                break;
            case SCHEDULE_GENERATOR:
                //To do
                break;
        }
    }
            
    
}
