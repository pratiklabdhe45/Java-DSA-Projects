import java.util.Scanner;
import java.util.Random;

public class Guessnumber {
    public static void main(String arg[]) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your guess number: ");
        int userguess = sc.nextInt();

        int numberofattempts = 1;

        while (userguess != number) {
            if (userguess > number) {
                System.out.println("Too High");
            } else {
                System.out.println("Too Low");
            }

            System.out.print("Enter your guess number: ");
            userguess = sc.nextInt();
            numberofattempts++;
        }

        System.out.println("Correct! You guessed the number.");
        System.out.println("Number of attempts: " + numberofattempts);
    }
}
