package use.autowire.byname;

public class StudentInfo {
    private String name;
    private String about;

    public void setName(String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }

    public void setAbout(String about){
        this.about = about;
    }
    public String getAbout (){
        return about;
    }

    @Override
    public String toString(){
        return "StudentInfo{" +
                "name='" + name + '\'' +
                "about='" + about + '\'' +
                "}";
    }
}
