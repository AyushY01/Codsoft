
/*Create a class to represent the ATM machine.
2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.
3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().
4. Create a class to represent the user's bank account, which stores the account balance.
5. Connect the ATM class with the user's bank account class to access and modify the account
balance.
6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).
7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions*/


///// I have given 1000 as a balance.
import java.util.Scanner;

public class ATM_Machine {
    static int balance = 1000;
    static Scanner sc = new Scanner(System.in);

    static void check_balance() {
        System.out.println("Your Balance is" + balance);

    }

    static void withdraw() {
        System.out.println("Enter the Amount you want to withdraw");
        int amount_w = sc.nextInt();
        if (amount_w <= balance) {

            System.out.println("Successful transcation");
            balance = balance - amount_w;
            System.out.println("Your new Balance is: " + balance);
        } else {
            System.out.println("Insufficient Balance");
            System.out.println("Insuccessful transaction");
        }
    }

    static void deposit() {
        System.out.println("Enter the amount you want to deposit");
        int amount_d = sc.nextInt();
        balance = balance + amount_d;
        System.out.println("Your new Balance is: " + balance);
    }

    public static void main(String[] args) {
       

            
        System.out.println("Welcome To ATM\n" + "Press the respective buttons" + "\nFor Withdrawal press: 1"
                + "\nFor Deposit press: 2"
                + "\nFor Checking Balance press: 3");

        int s = sc.nextInt();
        if (s == 1) {
            withdraw();
        } else if (s == 2) {
            deposit();
        } else if (s == 3) {
            check_balance();
        } else {
            System.out.println("Enter a valid input");
        }

    }

}
