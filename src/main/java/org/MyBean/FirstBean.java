package org.MyBean;

public class FirstBean{
    private String beanTesting;

    public void setbeanTesting(String beanTesting){
        this.beanTesting = beanTesting;
    }
    public void showbeanTesting (String beanTesting){
        System.out.println ("Message to be shown as output: " + beanTesting);
    }

    @Override
    public String toString (){
        return "FirstBean{" +
                "message to be shown as output=' " + beanTesting + '\'' +
                '}';
    }

}