
import java.util.Random;
import java.util.Scanner;

public class SPS {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for paper
        // 2 for scissor
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 0 for Stone, 1 for paper, 2 for scissor :");
        int userInput = sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);
        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0
                || userInput == 2 && computerInput == 1) {
            System.out.println("you win");
        } else {
            System.out.println("Computer Win");
        }
        if (computerInput == 0) {
            System.out.println("computer choice:Stone");
        } else if (computerInput == 1) {
            System.out.println("computer choice:paper");
        } else if (computerInput == 2) {
            System.out.println("computer choice: scissor");
        }

    }
}
