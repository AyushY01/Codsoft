import java.util.Random;
import java.util.Scanner;

public class Task_1_Number_Game {
    static int win = 0;
    static int lose = 0;
    static int round = 1;

    static void method() {
        Random rn = new Random();
        int random_no = rn.nextInt(100);

        Scanner sc = new Scanner(System.in);
        int a;
        //for checking the guess no.
        for ( a = 0; a < 4; a++) {
            System.out.println("Enter your Guess: ");
            int guess = sc.nextInt();
                                              if (random_no == guess) {
                System.out.println("Your guess is correct, Good job.");
                win++;
                break;
            } else {

                if (random_no > guess && a!=3) {
                    System.out.println("Your Guess is too low than random number.Try a higher number");
                    lose++;
                } else if (guess > random_no && a!=3) {
                    System.out.println("Your guess is too high than random number.Try a lower number");
                    lose++;
                }

            }
        }
        //After the no.of trials is over
        if(a==4){
        System.out.println("You have exhausted the no. of trials\nYour Generated Random No Was: " + random_no);
        }


       

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Number Game-----\nYou will get only four Attempts to Guess:");
        method();

        //for multiple rounds:
         int temp = 1;
        for (int i = 0; i< temp; i++) {
            System.out.println("Do you want to play more:\nEnter 1 for Yes and 2 for No:");
            Scanner s = new Scanner(System.in);
            int s1 = s.nextInt();
            if (s1==1) {
                method();
                temp++;
                round++;
            } else {
                break;
            }
        }

        System.out.println("You played total rounds:" + round);
        System.out.println("Your score is: \n" + "Total win= " + win + "\nTotal Lost= " + lose);
    }
}
