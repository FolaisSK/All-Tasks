package chapterSix;

import java.util.Scanner;
public class StudentGrades{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		String menu = """
		-------------- STUDENTS GRADES --------------
		1. Add Students Grades
		2. Display Results
		3. Exit
		--------------------------------------------- """;

		boolean isOn = true;

		int gradeACounter = 0;
		int gradeBCounter = 0;
		int gradeCCounter = 0;
		int gradeDCounter = 0;

		while(isOn){

			System.out.println(menu);

			System.out.print("Choose an Option: ");
			int option = input.nextInt();
			input.nextLine();

			switch(option){

				case 1 -> {

					System.out.println("------------- ADD STUDENTS GRADES -------------");

					for(int count = 1; count <= 5; count++){

						System.out.print("Enter Student Name: ");
						String studentName = input.nextLine();

						System.out.print("Enter Student Grade: ");
						String studentGrade = input.nextLine();
						studentGrade = studentGrade.toUpperCase();

						switch(studentGrade){

							case "A" -> {gradeACounter++;}
							case "B" -> {gradeBCounter++;}
							case "C" -> {gradeCCounter++;}
							case "D" -> {gradeDCounter++;}
							
						}
					}
				}

				case 2 -> {

					System.out.println("-------------- DISPLAY RESULTS --------------");

					System.out.println("Number of Students for Grade A: " + gradeACounter);
					System.out.println("Number of Students for Grade B: " + gradeBCounter);
					System.out.println("Number of Students for Grade C: " + gradeCCounter);
					System.out.println("Number of Students for Grade D: " + gradeDCounter);


				}

				case 3 -> {
					System.out.println("EXITING->>>>>>>>>>>>");
					isOn = false;
				}

				default -> {System.out.println("Invalid Option");}

			}

		}

	}

}