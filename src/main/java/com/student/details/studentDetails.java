package com.student.details;

public class studentDetails {
    private String name;
    private String journeyPlace;
    private int journeyDate;
    private int returnDate;
    private String reason;


    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setJourneyPlace(String journeyPlace){
        this.journeyPlace = journeyPlace;
    }
    public String getJourneyPlace(){
        return journeyPlace;
    }

    public void setReason (String reason){
        this.reason = reason;
    }
    public String getReason(){
        return reason;
    }

    public void setReturnDate(int returnDate){
        this.returnDate = returnDate;
    }
    public int getReturnDate(){
        return returnDate;
    }

    public void setJourneyDate (int journeyDate){
        this.journeyDate = journeyDate;
    }
    public int getJourneyDate(){
        return journeyDate;
    }

    @Override
    public String toString (){
        return "studentDetails{" +
                "name='" + name + '\'' +
                "journeyPlace='" + journeyPlace + '\'' +
                "journeyDate='" + journeyDate + '\'' +
                "returnDate='" + returnDate + '\'' +
                "reason='" + reason + '\'' +
                '}';
    }
}