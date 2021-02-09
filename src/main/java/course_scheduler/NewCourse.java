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
public class NewCourse 
{
    private String course_ID;
    private String course_Name;
    private String course_Professor;
    private String course_Times;
    private String course_Days;
    
    public NewCourse()
    {
        
    }
    
    public void setVariables(String course_input, String name_input, String professor_input, String times_input, String days_input)
    {
        course_ID = course_input;
        course_Name = name_input;
        course_Professor = professor_input;
        course_Times = times_input;
        course_Days = days_input;
        
    }
    
    public String returnCourseID()
    {
        return course_ID;
    }
    
    public String returnCourseName()
    {
        return course_Name;
    }
    
    public String returnCourseProfessor()
    {
        return course_Professor;
    }
    
    public String returnCourseTimes()
    {
        return course_Times;
    }
    
    public String returnCourseDays()
    {
        return course_Days;
    }
}
