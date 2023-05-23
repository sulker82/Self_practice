package day27_practies;

import day29_practies.IPhone;

public class Test {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy", 39, 'M', 14, 25, 16, 'C');

        CydeoStudent student2 = new CydeoStudent("Kathy", 29, 'F', 15, 25, 13, 'A');

        System.out.println(student1);
        System.out.println(student2);

        student1.printSchoolName();
        student2.printSchoolName();

        student1.printProgLanguage();
        student2.printProgLanguage();


        System.out.println("------------------------------------------------------------------------");

        Dog dog = new Dog("Lucy", "Husky", "Small", 'F',4, "White" );

        System.out.println(dog);
        dog.eat();
        dog.play();
        dog.sleep();


        System.out.println("------------------------------------------------------------------------");


        Iphone iphone = new Iphone("iphone 12", "Black", 1000, "5.6 inches");

        System.out.println(iphone);

        iphone.faceTime(123456789);
        iphone.faceTime("gmail@yahoo.com");
        iphone.call(123456789);
        iphone.text(123456789);

        System.out.println("------------------------------------------------------------------------");


        Person person1 = new Person("Josh", 28, 'M');
        Person person2 = new Person("Breanna", 32, 'F');

        System.out.println(person1);
        System.out.println(person2);

        System.out.println(person1.numberOfHead);
        System.out.println(person2.numberOfHead);


        System.out.println(person1.numberOfEyes);
        System.out.println(person2.numberOfEyes);





    }
}
