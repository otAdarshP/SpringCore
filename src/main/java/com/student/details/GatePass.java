package com.student.details;

public class GatePass {
    private studentDetails StudentDetails;

    public void displayDetails(){
        System.out.println ("Student details: " + StudentDetails.toString());
    }

    public GatePass(studentDetails StudentDetails){
        this.StudentDetails = StudentDetails;
    }
}