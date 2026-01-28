package chapterTwo;

import java.util.Scanner;

public class LargestAndSmallest {

public static void main (String[]args) { 

Scanner input = new Scanner(System.in);


System.out.print("Enter an integer: ");
int numOne = input.nextInt();

System.out.print("Enter an integer: ");
int numTwo = input.nextInt();

System.out.print("Enter an integer: ");
int numThree = input.nextInt();

System.out.print("Enter an integer: ");
int numFour = input.nextInt();

System.out.print("Enter an integer: ");
int numFive = input.nextInt();




if (numOne > numTwo && numOne > numThree && numOne > numFour && numOne > numFive) {

System.out.println("The Largest number is " + numOne); 

} else if (numTwo > numOne && numTwo > numThree && numTwo > numFour && numTwo > numFive) {

System.out.println("The Largest number is " + numTwo); 

} else if (numThree > numTwo && numThree > numOne && numThree > numFour && numThree > numFive) {

System.out.println("The Largest number is " + numThree); 

} else if (numFour > numTwo && numFour > numThree && numFour > numOne && numFour > numFive) {

System.out.println("The Largest number is " + numFour); 

} else if (numFive > numTwo && numFive > numThree && numFive > numFour && numFive > numOne) {

System.out.println("The Largest number is " + numFive); 

} else {

System.out.println("All the Numbers are EQUAL");

}




if (numOne < numTwo && numOne < numThree && numOne < numFour && numOne < numFive) {

System.out.println("The Smallest number is " + numOne); 

} else if (numTwo < numOne && numTwo < numThree && numTwo < numFour && numTwo < numFive) {

System.out.println("The Smallest number is " + numTwo); 

} else if (numThree < numTwo && numThree < numOne && numThree < numFour && numThree < numFive) {

System.out.println("The Smallest number is " + numThree); 

} else if (numFour < numTwo && numFour < numThree && numFour < numOne && numFour < numFive) {

System.out.println("The Smallest number is " + numFour); 

} else if (numFive < numTwo && numFive < numThree && numFive < numFour && numFive < numOne) {

System.out.println("The Smallest number is " + numFive); 

} else {

System.out.println("All the Numbers are EQUAL");

}







}
}