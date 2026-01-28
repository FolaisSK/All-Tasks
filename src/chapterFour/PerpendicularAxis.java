package chapterFour;

import java.util.Scanner;
public class PerpendicularAxis{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("x1: ");
		int xOne = input.nextInt();

		System.out.print("y1: ");
		int yOne = input.nextInt();

		System.out.print("x2: ");
		int xTwo = input.nextInt();

		System.out.print("y2: ");
		int yTwo = input.nextInt();

		if(xOne == xTwo || yOne == yTwo){

			System.out.println("Perpendicular");

		}else{

			System.out.println("Not Perpendicular");

		}

	}


}