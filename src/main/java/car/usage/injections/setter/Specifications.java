package car.usage.injections.setter;

public class Specifications {
    private String make;
    private String model;

    public void setMake (String make){
        this.make = make;
    }
    public String getMake (){
        return make;
    }
    public void setModel (String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    @Override
    public String toString(){
        return "Specifications{" +
                "make='" + make + '\'' +
                "model='" + model + '\'' +
                '}';
    }
}
