package use.autowire.byname;

public class ClassName {
    private StudentInfo studentInfo;

    public void setStudentInfo (StudentInfo studentInfo){
        this.studentInfo = studentInfo;
    }

    public void displayDetails(){
        System.out.println ("Class details are: " + studentInfo.toString());
    }


}
