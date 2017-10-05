package CB.SoftwareEng ;

public class Student {
    private String Name;
    private int Age;
    private String Birthdate;
    private String UserName;
    
    public Student(String name, int age, String dob){
        this.Name = name;
        this.Age = age;
        this.Birthdate = dob;
        genUserName();
    }
    
    public void setName(String name){
        Name = name;
    }

    public String getName(){
        return this.Name;
    }
    
    public void setAge(int age){
        Age = age;
    }
    public int getAge(){
        return this.Age;
    }
    
    public void setDOB(String dob){
        Birthdate = dob;
    }
    
    public String getDOB(){
        return this.Birthdate;
    }
    
    public void genUserName(){
        String Tmp = Name.replaceAll("\\s+","");
        UserName = (Tmp + Age);
    }
    
    public String getUserName(){
        return this.UserName;
    }
    
}