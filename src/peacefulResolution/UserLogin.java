package peacefulResolution;

import java.util.Scanner;

public class UserLogin {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

String sampleUsername = "Fola";
int samplePin = 123456;

System.out.print("Username: ");
String username = input.nextLine();

System.out.print("6-Digit PIN code: ");
int pin = input.nextInt();

if (username.equals(sampleUsername) && pin == samplePin) {

System.out.println("Login successful!");

} else {

System.out.println("Login failed");

}

}

}
  