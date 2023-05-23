package day18_practies;

public class Contact {
    /*
    Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"


     */
    public String name,email;
    public int phoneNumber;

    public Contact(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void Call(){
        System.out.println("Calling " + name + " now");
    }

    public void sendMessage(){
        System.out.println("Sending message to " + phoneNumber + " now");
    }

    public void sendEmail(){
        System.out.println("Sending message to " + email + " now");
    }

    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
