package spaghetti;

import java.util.Scanner;

public class EggCounter {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter amount of eggs: ");
int eggs = input.nextInt();

if (eggs > 500) {

int gross = eggs / 144;

int grossRemainder = eggs % 144;

int dozen = grossRemainder / 12;

int leftOver = grossRemainder % 12;

System.out.println("Your number of eggs is " + gross + " gross, " + dozen + " dozen, and " + leftOver + " left over.");

} else {

System.out.println("Your number of eggs is " + eggs);

}

}

}

