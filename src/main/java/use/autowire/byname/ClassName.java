package use.autowire.byname;

public class ClassName {
    private StudentInfo studentInfo; // name of attribute defined in the xml is matched with the bean name in "byname". Upon matching, it uses setters to initialize it.

    public void setStudentInfo (StudentInfo studentInfo){
        this.studentInfo = studentInfo;
    }

    public void displayDetails(){
        System.out.println ("Class details are: " + studentInfo.toString());
    }


}
