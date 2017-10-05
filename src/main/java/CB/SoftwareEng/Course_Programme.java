package CB.SoftwareEng;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Course_Programme {
    private String Course_Name;
    private List<Module> Modules = new ArrayList<Module>();
    private LocalDate Start_Date;
    private LocalDate End_Date;
    
    public Course_Programme(String CourseName, List<Module> moduleList, LocalDate start, LocalDate end){
        this.Course_Name = CourseName;
        this.Modules = moduleList;
        this.Start_Date = start;
        this.End_Date = end;
    }    
    
    public void setCourse_Name(String name){
        Course_Name = name;
    }

    public String getCourse_Name(){
        return this.Course_Name;
    }
    
    public void addModule(Module newModule){
        Modules.add(newModule);
    }
    
    public List<Module> getModuleList(){
        return Modules;
    }
    
    public void setStart_Date(LocalDate date){
        Start_Date = date;
    }
    
    public LocalDate getStart_Date(){
        return this.Start_Date;
    }
    
    public void setEnd_Date(LocalDate date){
        End_Date = date;
    }
    
    public LocalDate getEnd_Date(){
        return this.End_Date;
    }
    
    public void printINFO(){
        List<Student> StudentsList = new ArrayList<Student>();
        
        List<Module> ModulesList = new ArrayList<Module>();
        ModulesList = this.getModuleList();
        System.out.println("Students registered for " + this.getCourse_Name() + ":");
        for (int i =0; i<ModulesList.size(); i++){
            Module mod = ModulesList.get(i);
            //System.out.println("Module: " + mod.getModule_Name() + " | " + mod.getModule_ID());
            List<Student> ModStudents = new ArrayList<Student>();
            ModStudents = mod.getStudentList();
            for (int j=0; j<ModStudents.size(); j++){
                Student s = ModStudents.get(j);
                if (StudentsList.contains(s)){
                    //Do Nothing
                }
                else {
                    StudentsList.add(s);
                    System.out.println(s.getName() + "\tModules: ");
                    for (int l=0; l<ModulesList.size(); l++){
                        System.out.print(Modules.get(l).getModule_Name() + "\t");
                    }
                    System.out.println();
                }
            } 
        }
    }
}