package chapterSix;

public class DivisibleByThree{

	public static void main(String... args){

		int sum = 0;

		for(int count = 3; count <= 30; count += 3){

			sum += count;

		}

		System.out.println(sum);
	}


}