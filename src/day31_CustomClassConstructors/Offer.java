package day31_CustomClassConstructors;

public class Offer {

    public String location, companyName, jobTitle;
    public int salary;
    public boolean hasBenefit, hasPTo, isWFH, isFullTime;

    public String toString() {
        return "offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTo=" + hasPTo +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void setInfo(String location, String companyName, String jobTitle, int salary, boolean hasBenefit, boolean hasPTo, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTo = hasPTo;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }


}
/*
Attributes:
    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime.

Actions:
    setInfo(): sets all the instance variable.
    toString() : returns the full info of the offer Object
     */