package chapterFour;

public class TabularOutput{

	public static void main(String... args){

		System.out.println("N\t" + "N2\t" + "N3\t" + "N4\t");
		for(int count = 1; count <= 5; count++){

			int square = count * count;
			int cube = square * count;
			int fourthPower = cube * count;

			System.out.println(count + "\t" + square + "\t" + cube + "\t" + fourthPower);


		}

	}


}