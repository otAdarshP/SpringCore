package spring.core.autowire;

public class Car{
    private String model;
    private String type;

    public void setModel (String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model'" + model + '\'' +
                "type'" + type + '\'' +
                "}";
    }
}
