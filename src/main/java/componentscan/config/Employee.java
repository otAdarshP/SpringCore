package componentscan.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private String name;
    private String address;
    private String about;

    public void setAbout(String about) {
        this.about = about;
    }
    public String getAbout(){
        return about;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString (){
        return "Employee{" +
                "name='" + name + '\'' +
                "about='" + about + '\'' +
                "address='" + address + '\'' +
                "}";
    }
}
