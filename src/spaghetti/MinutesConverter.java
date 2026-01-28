package spaghetti;

import java.util.Scanner;

public class MinutesConverter {

public static void main (String[]args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the number of minutes: ");
int minutes = input.nextInt();


int minsYear = 60 * 24 * 365;
int years = minutes / minsYear;
int minutesLeft = minutes % minsYear;
int days = minutesLeft / (60 * 24);

System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");

}

}



