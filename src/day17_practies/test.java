package day17_practies;

public class test {
    public static void main(String[] args) {

    car car1 =new car();

    car1.setInfo("bmw","m5",2020,"black",23000);


    Address Address1 =new Address();
    Address1.setInfo(155,"main","Washington",98773);

    Item item1 =new Item();
    item1.setInfo("phone",2500,25);

    Student student1 = new Student();
    student1.setInfo("ulker",'M',40,"bd",'A',true);

    SalaryCalculator person1 =new SalaryCalculator();
    person1.setInfo(60,7,20,40);

    int weeklyhors =40;






        System.out.println(car1);
        System.out.println(Address1);
        System.out.println(item1);
        System.out.println(student1);
        System.out.println(person1);

    }

}
