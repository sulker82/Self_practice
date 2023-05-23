package day31_practies.EmployeeTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, String id, String jobTitle, String companyName, double salary) {
        super(name, age, gender, id, jobTitle, companyName, salary);
    }

    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing");
    }
}
