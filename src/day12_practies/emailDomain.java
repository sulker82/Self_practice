package day12_practies;

public class emailDomain {
    public static void main(String[] args) {


    }

    /*
        Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
     */

    public static void emailDomain(String email) {

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println(domain);
    }
}
