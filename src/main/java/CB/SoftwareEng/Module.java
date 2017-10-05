package CB.SoftwareEng;

import java.util.*;

public class Module {
    private String Module_Name;
    private String Module_ID;
    private List<Student> Students = new ArrayList<Student>();
    
    public Module(String modName, String id, List<Student> StudentList){
        this.Module_Name = modName;
        this.Module_ID = id;
        this.Students = StudentList;
    }
    
    public void setModule_Name(String name){
        Module_Name = name;
    }

    public String getModule_Name(){
        return this.Module_Name;
    }
    
    public void setModule_ID(String id){
        Module_ID = id;
    }

    public String getModule_ID(){
        return this.Module_ID;
    }
    
    public void addStudent(Student newStudent){
        Students.add(newStudent);
    }
    
    public List<Student> getStudentList(){
        return Students;
    }
    
}