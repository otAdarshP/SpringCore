package annotations.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myEmployee") // if you want to leave the () blank, in main, define the Employee as employee otherwise, we need to specify the exact name which we have used in main, at the @Components.
public class Employee {

    @Value("#{25,000}")
    private double salary;
    @Value("Sanjaya")
    private String firstName;
    @Value("Kumara")
    private String secondName;

    public void setSalary (int salary){
        this.salary = salary;
    }
    public double getSalary(){
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
                    "salary = '" + salary + '\'' +
                    "firstName = '" + firstName + '\'' +
                    "secondName = '" + secondName + '\'' +
                    "}";
    };
}
