package com.student.details;

public class GatePass {
    private studentDetails StudentDetails;

    public void displayDetails(){
        System.out.println ("Student details: " + StudentDetails.toString());
    }

//    studentDetails are injected in the GatePass class by using the below class constructor.
    public GatePass(studentDetails StudentDetails){
        this.StudentDetails = StudentDetails;
    }
}