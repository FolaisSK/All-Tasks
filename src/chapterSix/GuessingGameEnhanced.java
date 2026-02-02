package chapterSix;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameEnhanced {
    static void main() {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();

        boolean isRunning = true;
        int target = randomNumber.nextInt(1, 1000);

        int guessCounter = 0;

        while (isRunning) {
            System.out.println("Enter a number from 1-1000");
            int guessedNumber = input.nextInt();

            if (guessedNumber > target) {
                System.out.println("Too High, Try again");
                guessCounter++;
            }else if (guessedNumber < target) {
                System.out.println("Too Low, Try again!");
                guessCounter++;
            }else {
                if(guessCounter < 10)
                    System.out.println("Either you know the secret\n" +
                            "or you got lucky!");
                else if(guessCounter == 10)
                    System.out.println("Aha! You know the secret!");
                else
                    System.out.println("You should be able to do better!");
                System.out.println("Congratulations, you're a winner!!!");
                isRunning = false;
            }
        }
    }
}
