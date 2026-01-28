package sofTasksDayTwo;/*
Initialise a Count variable 
Initialise a variable to store the Binary Number
Initialise a variable to store the Remainder after every modulo
Create an array of hexadecimal length for the binary value

While the number after modulo is not equal to zero, divide the number by 2 and assign the remainder to digit
Divide the number by 2 to get the next number for the operation
Store the digit into the array then increment count by 1

Using a for loop, start from the last value of 1, then decrement by 1 for each iteration
Multiply the value at the index by 10 to the power of the count and assign to digit
Add the digit and assign to Binary Variable for each iteration
Return the Binary Value
**/




import java.util.Scanner;
import java.util.Arrays;

public class DecimalToBinary{


	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = input.nextInt();

		//System.out.println(Arrays.toString(getBinaryOf(number)));

		System.out.println(getBinaryOf(number));

	}


	public static int getBinaryOf(int number){

		int count = 0;
		int binaryValue = 0;
		int digit;
		int multiple = 1;

		int[] binaryDigits = new int[32];

		if(number < 0){

			number *= -1;

		}else if(number == 0){

			return number;

		}

		while(number != 0){

			digit = number % 2;
			number = number / 2;
			binaryDigits[count] = digit;
			count++;
		}

		for(int index = count; index >= 0; index--){

			for(int counter = 0; counter < index; counter++){

				multiple *= 10;
			}

			digit = binaryDigits[index] * multiple;
			
			binaryValue += digit;
			multiple = 1;

		}

		return binaryValue;

	}



}