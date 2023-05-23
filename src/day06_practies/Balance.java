package day06_practies;

public class Balance {
    public static void main(String[] args) {

        double balance = 1000;
        double withdrawAmount = 1300;

        // balance = balance - withdrawAmount;
        balance -= withdrawAmount; // same as line 22

        if(balance < 0){ // this if only runs if you took out too much money
            System.out.println("Withdrew more than you in the account. Overdraft applied");
            balance += (balance * 0.2);
        }

        System.out.println("Total balance:" + balance);

    }
}
/*
    Balance [single if, operators, variables]

	Declare and assign the following variables
		amount balance & withdraw amount

    Check the balance after the withdrawal
        if you withdrew more money that you had in the account add a overdraft
         fee to the balance by subtracting 100

    In both cases print the remaining balance after withdrawing

 */
