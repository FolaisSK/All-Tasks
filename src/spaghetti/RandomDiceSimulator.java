package spaghetti;

import java.util.Random;

public class RandomDiceSimulator {

public static void main (String[]args) {

Random random = new Random();

int min = 1;
int max = 6;
int randomDieOne = random.nextInt(max - min + 1) + min;
int randomDieTwo = random.nextInt(max - min + 1) + min;


int totalRoll = randomDieOne + randomDieTwo;

System.out.println("The first die: " + randomDieOne);
System.out.println("The second die: " + randomDieTwo);
System.out.println("The total roll is " + totalRoll);

}

}





