package car.usage.injections.setter;

public class Car {
    private Specifications specifications;

    public void displayDetails(){
        System.out.println ("Details: " + specifications.toString());
    }
//    calling setter

    public void setSpecifications (Specifications specifications){
        this.specifications = specifications;
    }
}
