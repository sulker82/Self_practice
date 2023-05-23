package day18_practies;

public class Offer {
    /*Create a custom class named Offer
            Attributes:
    location
            companyName
    jobTitle
            salary
    hasBenefit
            hasPTO
    isWFH
            isFullTime

     */
    public String lacation,companyname,jobTitle;
    public int salary;
    public boolean hasBenefets,hasPto,isWFT,isFullTime;

    public void setInfo(String lacation, String companyname, String jobTitle, int salary,
                 boolean hasBenefets, boolean hasPto, boolean isWFT, boolean isFullTime) {
        this.lacation = lacation;
        this.companyname = companyname;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefets = hasBenefets;
        this.hasPto = hasPto;
        this.isWFT = isWFT;
        this.isFullTime = isFullTime;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "lacation='" + lacation + '\'' +
                ", companyname='" + companyname + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefets=" + hasBenefets +
                ", hasPto=" + hasPto +
                ", isWFT=" + isWFT +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
