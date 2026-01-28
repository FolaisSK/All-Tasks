package chapterSix;

import java.util.Scanner;

public class TwelveDaysOfChristmasSong{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		boolean isRunning = true;
		String dayMenu;
		String verse;

		while(isRunning){

			String twelveDaysMenu = """
				==========THE TWELVE DAYS OF CHRISTMAS SONG==========
				1. FIRST DAY
				2. SECOND DAY
				3. THIRD DAY
				4. FOURTH DAY
				5. FIFTH DAY
				6. SIXTH DAY
				7. SEVENTH DAY
				8. EIGTH DAY
				9. NINTH DAY
				10. TENTH DAY
				11. ELEVENTH DAY
				12. TWELFTH DAY
				0. EXIT
				===================================================== """;

			System.out.println(twelveDaysMenu);

			System.out.print("Enter an option: ");
			int option = input.nextInt();
				
			switch(option){

				case 1 -> {

					System.out.println("==== FIRST DAY ====");

					dayMenu = """
					1. VERSE
					2. EXIT """;

					System.out.println(dayMenu);							
					System.out.print("Enter an option: ");
					option = input.nextInt();

					switch(option){
					
						case 1 -> {

							verse = """
							On the first day of Christmas, my true love sent to me
							A partridge in a pear tree """;

							System.out.println(verse);

						}

						case 2 -> {

							break;
						}

					}

				}

				case 2 -> {

					System.out.println("==== SECOND DAY ====");

					dayMenu = """
					1. VERSE
					2. EXIT """;

					System.out.println(dayMenu);							
					System.out.print("Enter an option: ");
					option = input.nextInt();

					switch(option){
					
						case 1 -> {

							verse = """
							On the second day of Christmas, my true love sent to me
							Two turtle doves and
							A partridge in a pear tree """;

							System.out.println(verse);

						}

						case 2 -> {

							break;
						}

					}

				}

				case 3 -> {

					System.out.println("==== THIRD DAY ====");

					dayMenu = """
					1. VERSE
					2. EXIT """;

					System.out.println(dayMenu);							
					System.out.print("Enter an option: ");
					option = input.nextInt();

					switch(option){
					
						case 1 -> {

							verse = """
							On the third day of Christmas, my true love sent to me
							Three french hens
							Two turtle doves and
							A partridge in a pear tree """;

							System.out.println(verse);

						}

						case 2 -> {

							break;
						}

					}
				}

				case 4 -> {

					System.out.println("==== FOURTH DAY ====");

					dayMenu = """
					1. VERSE
					2. EXIT """;

					System.out.println(dayMenu);							
					System.out.print("Enter an option: ");
					option = input.nextInt();

					switch(option){
					
						case 1 -> {

							verse = """
							On the fourth day of Christmas, my true love sent to me
							Four calling birds
							Three french hens
							Two turtle doves and
							A partridge in a pear tree """;

							System.out.println(verse);

						}

						case 2 -> {

							break;
						}

					}
				}

				case 5 -> {

					System.out.println("==== FIFTH DAY ====");

					dayMenu = """
					1. VERSE
					2. EXIT """;

					System.out.println(dayMenu);							
					System.out.print("Enter an option: ");
					option = input.nextInt();

					switch(option){
					
						case 1 -> {

							verse = """
							On the fifth day of Christmas, my true love sent to me
							Five golden rings
							Four calling birds
							Three french hens
							Two turtle doves and
							A partridge in a pear tree """;

							System.out.println(verse);

						}

						case 2 -> {

							break;
						}

					}
				}

				case 6 -> {

					System.out.println("==== SIXTH DAY ====");

					dayMenu = """
					1. VERSE
					2. EXIT """;

					System.out.println(dayMenu);							
					System.out.print("Enter an option: ");
					option = input.nextInt();

					switch(option){
					
						case 1 -> {

							verse = """
							On the sixth day of Christmas, my true love sent to me
							Six geese a-laying
							Five golden rings
							Four calling birds
							Three french hens
							Two turtle doves and
							A partridge in a pear tree """;

							System.out.println(verse);

						}

						case 2 -> {

							break;
						}

					}
				}

				case 7 -> {

					System.out.println("==== SEVENTH DAY ====");

					dayMenu = """
					1. VERSE
					2. EXIT """;

					System.out.println(dayMenu);							
					System.out.print("Enter an option: ");
					option = input.nextInt();

					switch(option){
					
						case 1 -> {

							verse = """
							On the seventh day of Christmas, my true love sent to me
							Seven swans a-swimming
							Six geese a-laying
							Five golden rings
							Four calling birds
							Three french hens
							Two turtle doves and
							A partridge in a pear tree """;

							System.out.println(verse);

						}

						case 2 -> {

							break;
						}

					}
				}

				case 8 -> {

					System.out.println("==== EIGTH DAY ====");

					dayMenu = """
					1. VERSE
					2. EXIT """;

					System.out.println(dayMenu);							
					System.out.print("Enter an option: ");
					option = input.nextInt();

					switch(option){
					
						case 1 -> {

							verse = """
							On the eighth day of Christmas, my true love sent to me
							Eight maids a-milking
							Seven swans a-swimming
							Six geese a-laying
							Five golden rings
							Four calling birds
							Three french hens
							Two turtle doves and
							A partridge in a pear tree """;

							System.out.println(verse);

						}

						case 2 -> {

							break;
						}

					}
				}

				case 9 -> {

					System.out.println("==== NINTH DAY ====");

					dayMenu = """
					1. VERSE
					2. EXIT """;

					System.out.println(dayMenu);							
					System.out.print("Enter an option: ");
					option = input.nextInt();

					switch(option){
					
						case 1 -> {

							verse = """
							On the ninth day of Christmas, my true love sent to me
							Nine ladies dancing
							Eight maids a-milking
							Seven swans a-swimming
							Six geese a-laying
							Five golden rings
							Four calling birds
							Three french hens
							Two turtle doves and
							A partridge in a pear tree """;

							System.out.println(verse);

						}

						case 2 -> {

							break;
						}

					}
				}

				case 10 -> {

					System.out.println("==== TENTH DAY ====");

					dayMenu = """
					1. VERSE
					2. EXIT """;

					System.out.println(dayMenu);							
					System.out.print("Enter an option: ");
					option = input.nextInt();

					switch(option){
					
						case 1 -> {

							verse = """
							On the tenth day of Christmas, my true love sent to me
							Ten lords a-leaping
							Nine ladies dancing
							Eight maids a-milking
							Seven swans a-swimming
							Six geese a-laying
							Five golden rings
							Four calling birds
							Three french hens
							Two turtle doves and
							A partridge in a pear tree """;

							System.out.println(verse);

						}

						case 2 -> {

							break;
						}

					}
				}

				case 11 -> {

					System.out.println("==== ELEVENTH DAY ====");

					dayMenu = """
					1. VERSE
					2. EXIT """;

					System.out.println(dayMenu);							
					System.out.print("Enter an option: ");
					option = input.nextInt();

					switch(option){
					
						case 1 -> {

							verse = """
							On the eleventh day of Christmas, my true love sent to me
							Eleven pipers piping
							Ten lords a-leaping
							Nine ladies dancing
							Eight maids a-milking
							Seven swans a-swimming
							Six geese a-laying
							Five golden rings
							Four calling birds
							Three french hens
							Two turtle doves and
							A partridge in a pear tree """;

							System.out.println(verse);

						}

						case 2 -> {

							break;
						}

					}
				}

				case 12 -> {

					System.out.println("==== TWELFTH DAY ====");

					dayMenu = """
					1. VERSE
					2. EXIT """;

					System.out.println(dayMenu);							
					System.out.print("Enter an option: ");
					option = input.nextInt();

					switch(option){
					
						case 1 -> {

							verse = """
							On the twelfth day of Christmas, my true love sent to me
							Twelve drummers drumming
							Eleven pipers piping
							Ten lords a-leaping
							Nine ladies dancing
							Eight maids a-milking
							Seven swans a-swimming
							Six geese a-laying
							Five golden rings
							Four calling birds
							Three french hens
							Two turtle doves and
							A partridge in a pear tree """;

							System.out.println(verse);

						}

						case 2 -> {

							break;
						}

					}
				}

				case 0 -> {

					System.out.println("==== EXIT ====");
					isRunning = false;

				}
				default -> {System.out.println("Invalid option");}



			}



		}

	}


}