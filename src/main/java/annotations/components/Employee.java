package annotations.components;

import org.springframework.stereotype.Component;

@Component("myEmployee") // if want to leave the () blank, in main, define the Employee as employee otherwise, we need to specify the exact name which we have used in main, at the @Components.
public class Employee {
    private int salary;
    private String firstName;
    private String secondName;

    public void setSalary (int salary){
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }
    public String getSecondName(){
        return secondName;
    }

    public String toString(){
            return "Employee{" +
                    "salary'" + salary + '\'' +
                    "firstName='" + firstName + '\'' +
                    "secondName='" + secondName + '\'' +
                    "}";
    };
}
