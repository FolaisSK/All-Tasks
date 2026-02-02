package chapterSix;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    static void main() {
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();

        boolean isRunning = true;
        int target  = randomNumber.nextInt(1, 1000);



        while(isRunning){
            System.out.println("Enter a number from 1-1000");
            int guessedNumber = input.nextInt();

            if(guessedNumber > target)
                System.out.println("Too High, Try again");
            else if(guessedNumber < target)
                System.out.println("Too Low, Try again!");
            else{
                System.out.println("Congratulations, you're a winner!!!");
                isRunning = false;
            }
    }


   }


}
