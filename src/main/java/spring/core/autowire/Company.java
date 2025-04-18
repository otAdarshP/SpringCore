package spring.core.autowire;

public class Company {
    private Car car;

    public void setCar (Car car){
        this.car = car;
    }
    public void displayDetails(){
        System.out.println ("Details: " + car.toString());
    }
}
