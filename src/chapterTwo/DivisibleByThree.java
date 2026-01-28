package chapterTwo;

import java.util.Scanner;

public class DivisibleByThree {

public static void main (String[]args) { 

Scanner input = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = input.nextInt();

if (number % 3 == 0) {

System.out.print("The number is divisible by 3");

} else {

System.out.print("The number is not divisible by 3");  

}

}
}

