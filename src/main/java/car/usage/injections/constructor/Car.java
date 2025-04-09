package car.usage.injections.constructor;

public class Car { // car class is dependent on specifications
    private Specifications specifications;

    public void displayDetails(){
        System.out.println ("Car details: " + specifications.toString()); // taking the "string" values of the specifications
    }

    // creating constructor
    public Car (Specifications specifications){
        this.specifications = specifications;
    }
}
