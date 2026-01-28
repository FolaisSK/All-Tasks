package peacefulResolution;

import java.util.Scanner;

public class VotingAge {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);


System.out.print("Enter your Age: ");
int votersAge = input.nextInt();

if (votersAge < 18) {

System.out.println("You are not eligible to vote");

} else {

System.out.println("You are eligible to vote");

}

}

}
